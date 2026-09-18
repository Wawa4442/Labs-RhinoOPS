#!/usr/bin/env bash
set -euo pipefail

/opt/mssql/bin/sqlservr &
sqlservr_pid=$!
trap 'kill "$sqlservr_pid" 2>/dev/null || true' EXIT

echo "Waiting for SQL Server to become ready..."
ready=0
for i in $(seq 1 60); do
  if /opt/mssql-tools18/bin/sqlcmd -S localhost -U sa -P "$MSSQL_SA_PASSWORD" -C -Q "SELECT 1" > /dev/null 2>&1; then
    ready=1
    break
  fi
  sleep 1
done

if [ "$ready" -ne 1 ]; then
  echo "SQL Server did not become ready in time" >&2
  exit 1
fi

echo "SQL Server is ready. Checking whether the database has been initialized..."
if ! /opt/mssql-tools18/bin/sqlcmd -S localhost -U sa -P "$MSSQL_SA_PASSWORD" -C -h -1 -b -Q "SET NOCOUNT ON; SELECT 1 FROM sys.databases WHERE name = 'grocery_inventory'" | grep -q '^1'; then
  echo "Running initialization scripts..."
  for script in /docker-entrypoint-initdb.d/03-init.sh; do
    if [ -f "$script" ]; then
      echo "Executing $script"
      bash "$script"
    fi
  done
else
  echo "Database already initialized; skipping seed scripts."
fi

echo "Init scripts finished. Keeping container alive."
wait "$sqlservr_pid"