IF DB_ID('grocery_inventory') IS NULL CREATE DATABASE grocery_inventory;
GO
USE grocery_inventory;
GO
CREATE TABLE categories (id BIGINT IDENTITY PRIMARY KEY, name NVARCHAR(120) NOT NULL, description NVARCHAR(500), CONSTRAINT uk_categories_name UNIQUE(name));
CREATE TABLE products (id BIGINT IDENTITY PRIMARY KEY, sku NVARCHAR(64) NOT NULL, name NVARCHAR(180) NOT NULL, description NVARCHAR(1000), category_id BIGINT NOT NULL, unit_price DECIMAL(12,2) NOT NULL, current_stock INT NOT NULL CONSTRAINT ck_products_stock CHECK(current_stock>=0), reorder_level INT NOT NULL CONSTRAINT ck_products_reorder CHECK(reorder_level>=0), status NVARCHAR(30) NOT NULL, CONSTRAINT uk_products_sku UNIQUE(sku), CONSTRAINT fk_products_categories FOREIGN KEY(category_id) REFERENCES categories(id));
CREATE TABLE inventory_movements (id BIGINT IDENTITY PRIMARY KEY, product_id BIGINT NOT NULL, movement_type NVARCHAR(30) NOT NULL, quantity INT NOT NULL CONSTRAINT ck_movements_qty CHECK(quantity>0), movement_date DATETIMEOFFSET NOT NULL, created_by NVARCHAR(100) NOT NULL, CONSTRAINT fk_movements_products FOREIGN KEY(product_id) REFERENCES products(id));
CREATE TABLE sales (id BIGINT IDENTITY PRIMARY KEY, sale_date DATETIMEOFFSET NOT NULL, total_amount DECIMAL(12,2) NOT NULL);
CREATE TABLE sale_details (id BIGINT IDENTITY PRIMARY KEY, sale_id BIGINT NOT NULL, product_id BIGINT NOT NULL, quantity INT NOT NULL CONSTRAINT ck_detail_qty CHECK(quantity>0), unit_price DECIMAL(12,2) NOT NULL, subtotal DECIMAL(12,2) NOT NULL, CONSTRAINT fk_details_sales FOREIGN KEY(sale_id) REFERENCES sales(id), CONSTRAINT fk_details_products FOREIGN KEY(product_id) REFERENCES products(id));
CREATE INDEX ix_products_category ON products(category_id); CREATE INDEX ix_movements_product_date ON inventory_movements(product_id, movement_date DESC); CREATE INDEX ix_sales_date ON sales(sale_date); CREATE INDEX ix_sale_details_sale ON sale_details(sale_id);
GO
