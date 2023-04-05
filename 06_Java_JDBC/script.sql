CREATE DATABASE control_de_stock;

USE control_de_stock;

CREATE TABLE producto(
id INT AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
descripcion VARCHAR(255),
cantidad INT NOT NULL DEFAULT 0,
PRIMARY KEY(id)
) Engine=InnoDB;

INSERT INTO producto(nombre, descripcion, cantidad)
VALUES ('Mesa', 'Mesa de 4 lugares', 10);

INSERT INTO producto(nombre, descripcion, cantidad)
VALUES ('Celular', 'Celular Samsung', 50);

INSERT INTO producto(nombre, descripcion, cantidad)
VALUES ('Vaso', 'Vaso de Cristal', 10);

INSERT INTO producto(nombre, descripcion, cantidad)
VALUES ('Cuchara', 'Cuchara de metal', 100);

INSERT INTO producto(nombre, descripcion, cantidad)
VALUES ('Mouse', 'Mouse inalámbrico', 20);

INSERT INTO producto(nombre, descripcion, cantidad)
VALUES ('Linternas', 'Linternas con pilas recargables', 50);

INSERT INTO producto(nombre, descripcion, cantidad)
VALUES ('Linternas', 'Linternas con pilas recargables', 50);

INSERT INTO producto(nombre, descripcion, cantidad)
VALUES ('Zapatillas', 'Zapatillas de fútbol', 40);

INSERT INTO producto(nombre, descripcion, cantidad)
VALUES ('Botellas', 'Botellas de vidrio', 50);

INSERT INTO producto(nombre, descripcion, cantidad)
VALUES ('Botellas', 'Botellas de vidrio', 24);

INSERT INTO producto(nombre, descripcion, cantidad)
VALUES ('Platos', 'Platos de plástico', 50);

INSERT INTO producto(nombre, descripcion, cantidad)
VALUES ('Teclado', 'Teclado inalámbrico', 10);

CREATE TABLE categoria (
id INT AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
PRIMARY KEY(id)
) Engine=InnodB;

INSERT INTO categoria (nombre)
VALUES('Muebles'), ('Tecnología'), ('Cocina'), ('Zapatillas');

SELECT * FROM categoria;

ALTER TABLE producto
ADD COLUMN categoria_id INT;

ALTER TABLE producto
ADD FOREIGN KEY (categoria_id) REFERENCES categoria (id);

# Productos de categoría 'Muebles': Mesa
UPDATE producto
SET categoria_id = 1
WHERE id = 1;

# Productos de Categoría 'Tecnología': Celular, Mouse, Linternas, Teclado
UPDATE producto
SET categoria_id = 2
WHERE id IN (2, 5, 6, 7, 12);

# Productos de Categoría 'Cocina': Vaso, Cuchara, Botellas, Platos
UPDATE producto
SET categoria_id = 3
WHERE id IN (3, 4, 9, 10, 11);

# Productos de Categoría 'Zapatillas': Zapatillas
UPDATE producto
SET categoria_id = 4
WHERE id IN (8);

SELECT * FROM producto;