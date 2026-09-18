# REST API Guide
Base path: `/api/v1`. All endpoints except health and Swagger require HTTP Basic Auth. Standard errors return `{timestamp,status,error,message,details}`.

## Product
`POST /products` creates a product. Required: sku, name, categoryId, unitPrice >= 0, stock >= 0, reorder >= 0, status. `GET /products?q=milk` searches by SKU/name. `PUT /products/{id}` replaces editable fields. `DELETE /products/{id}` performs logical inactive status.

## Inventory
`POST /inventory/replenishment` body `{productId,quantity,user}` increases stock. `POST /inventory/adjustment` body `{productId,quantity,type,user}` supports ADJUSTMENT_IN and ADJUSTMENT_OUT.

## Sales
`POST /sales` body `{items:[{productId,quantity}]}` validates active products and stock, reduces inventory, creates sale details, and writes SALE movements transactionally.

## Reports
`GET /reports/low-stock`, `GET /reports/inventory`, `GET /reports/daily-sales?date=2026-09-04`.
