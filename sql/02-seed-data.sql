USE grocery_inventory;
INSERT INTO categories(name,description) VALUES('Produce','Fresh fruits and vegetables'),('Dairy','Milk, yogurt, cheese'),('Bakery','Bread and pastries'),('Pantry','Packaged goods');
INSERT INTO products(sku,name,description,category_id,unit_price,current_stock,reorder_level,status) VALUES
('APL-001','Red Apples','1kg bag',1,2.99,120,25,'ACTIVE'),('MLK-001','Whole Milk','1 liter carton',2,1.79,80,20,'ACTIVE'),('BRD-001','Sourdough Bread','500g loaf',3,3.49,30,10,'ACTIVE'),('RCE-001','Rice','1kg bag',4,2.29,12,15,'ACTIVE');
GO
