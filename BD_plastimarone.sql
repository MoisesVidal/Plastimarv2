CREATE DATABASE plastimar;
USE plastimar;

#Datos de la sucursal
CREATE TABLE sucursal(
	id_sucursal VARCHAR(11) NOT NULL,
	nombre_sucursal VARCHAR(40) NOT NULL,
	tipo INT NOT NULL,
	estado VARCHAR(30) NOT NULL,
	direccion VARCHAR(50) NOT NULL,
	telefono INT NOT NULL,
	PRIMARY KEY(id_sucursal)
);

#Datos de los empleados
CREATE TABLE empleados(
	id_empleado VARCHAR(11) NOT NULL,
	id_sucursal VARCHAR(11) NOT NULL,
	nombre VARCHAR(30) NOT NULL,
	apellido_paterno VARCHAR(30) NOT NULL,
	apellido_materno VARCHAR(30) NOT NULL,
	sexo CHAR(1) NOT NULL DEFAULT 'I',
	fecha_nacimiento DATE NOT NULL,
	curp VARCHAR(18) NOT NULL UNIQUE,
	telefono_contacto VARCHAR(100),
	tipo_empleado INT NOT NULL,
	correo VARCHAR(100) NOT NULL UNIQUE,
	password VARCHAR(300) NOT NULL,
	fecha_alta timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY(id_empleado),
	FOREIGN KEY(id_sucursal) REFERENCES sucursal (id_sucursal)
);

#Matriz principal de la empresa
CREATE TABLE matriz(
	id_matriz VARCHAR(11) NOT NULL,
	id_sucursal VARCHAR(11) NOT NULL,
	id_empleado VARCHAR(11) NOT NULL UNIQUE,
	nombre_matriz VARCHAR(100) NOT NULL,
	ubicacion VARCHAR(500) NOT NULL,
	telefono VARCHAR(15) NOT NULL UNIQUE,
	correo VARCHAR(100) NOT NULL UNIQUE,
	PRIMARY KEY(id_matriz),
	FOREIGN KEY(id_sucursal) REFERENCES sucursal (id_sucursal),
	FOREIGN KEY(id_empleado) REFERENCES empleados (id_empleado)
);

#Almacen de la matriz de la empresa
CREATE TABLE almacen_matriz(
	id_almacenmatriz VARCHAR(11) NOT NULL,
	id_matriz VARCHAR(11) NOT NULL,
	nombre_almacen VARCHAR(100) NOT NULL,
	descripcion VARCHAR(500) DEFAULT NULL,
	PRIMARY KEY(id_almacenmatriz),
	FOREIGN KEY(id_matriz) REFERENCES matriz (id_matriz)
);

#Categorias de productos
CREATE TABLE categorias(
	id_categoria VARCHAR(11) NOT NULL,
	nombre_categoria VARCHAR(100) NOT NULL,
	descripcion VARCHAR(500) DEFAULT NULL,
	PRIMARY KEY(id_categoria)
);

#Productos que se encuentran en el almacen de la matriz
CREATE TABLE productos_almacenmatriz(
	id_productomatriz VARCHAR(11) NOT NULL,
	id_almacenmatriz VARCHAR(11) NOT NULL,
	id_categoria VARCHAR(11) NOT NULL,
	nombre_producto VARCHAR(100) NOT NULL,
	descripcion VARCHAR(500) DEFAULT NULL,
	stok_matriz INT NOT NULL DEFAULT 0,#existencias en el almacen de la matriz
	precio_fabricacion FLOAT NOT NULL,
	precio_venta FLOAT NOT NULL,
	PRIMARY KEY(id_productomatriz),
	FOREIGN KEY(id_almacenmatriz) REFERENCES almacen_matriz (id_almacenmatriz),
	FOREIGN KEY(id_categoria) REFERENCES categorias (id_categoria)
);

#Proveedores de productos
CREATE TABLE proveedores(
	id_proveedor VARCHAR(11) NOT NULL,
	nombre_proveedor VARCHAR(100) NOT NULL,
	descripcion VARCHAR(500) DEFAULT NULL,
	telefono VARCHAR(15) NOT NULL UNIQUE,
	correo VARCHAR(100) NOT NULL UNIQUE,
	web VARCHAR(300) DEFAULT NULL,
	PRIMARY KEY(id_proveedor)
);

#Pedidos que puede realizar la matriz y el encargado
CREATE TABLE pedidos(
	id_pedido VARCHAR(11) NOT NULL,
	id_matriz VARCHAR(11) NOT NULL,
	id_empleado VARCHAR(11) NOT NULL,
	descripcion_pedido VARCHAR(300) NOT NULL,
	fecha_pedido DATE NOT NULL,
	estado_pedido CHAR(1) NOT NULL DEFAULT '0',#0=pedido,#1=recibido
	fecha_recibido DATE DEFAULT NULL,
	PRIMARY KEY(id_pedido),
	FOREIGN KEY(id_matriz) REFERENCES matriz (id_matriz),
	FOREIGN KEY(id_empleado) REFERENCES empleados (id_empleado)
);

#Cada pedido puede tener varios productos de diferentes proveedores
CREATE TABLE pedidos_matriz(
	id_pedidomatriz VARCHAR(11) NOT NULL,
	id_pedido VARCHAR(11) NOT NULL,
	id_productomatriz VARCHAR(11) NOT NULL,
	id_proveedor VARCHAR(11) NOT NULL,
	cantidad_solicitada INT NOT NULL,
	precio_unitario FLOAT NOT NULL,
	PRIMARY KEY(id_pedidomatriz),
	FOREIGN KEY(id_pedido) REFERENCES pedidos (id_pedido),
	FOREIGN KEY(id_productomatriz) REFERENCES productos_almacenmatriz (id_productomatriz),
	FOREIGN KEY(id_proveedor) REFERENCES proveedores (id_proveedor)
);

#Clientes
CREATE TABLE clientes(
	id_cliente VARCHAR(11) NOT NULL,
	nombre VARCHAR(30) NOT NULL,
	apellido_paterno VARCHAR(30) NOT NULL,
	apellido_materno VARCHAR(30) NOT NULL,
	correo_contacto VARCHAR(100) NOT NULL UNIQUE,
	PRIMARY KEY(id_cliente)
);

#Las sucursales pueden realizar ventas
CREATE TABLE ventas(
	id_venta VARCHAR(11) NOT NULL,
	id_sucursal VARCHAR(11) NOT NULL,
	id_empleado VARCHAR(11) NOT NULL,
	cantidad_vendida INT NOT NULL DEFAULT 1,
	fecha_venta timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY(id_venta),
	FOREIGN KEY(id_sucursal) REFERENCES sucursal (id_sucursal),
	FOREIGN KEY(id_empleado) REFERENCES empleados (id_empleado)
);

#cada venta puede tener muchos productos
CREATE TABLE venta_productos(
	id_ventaproductos VARCHAR(11) NOT NULL,
	id_venta VARCHAR(11) NOT NULL,
	id_productosucursal INT NOT NULL,
	id_categoria VARCHAR(11) NOT NULL,
	cantidad_vendida INT NOT NULL DEFAULT 1,
	descripcion VARCHAR(300) NOT NULL,
	PRIMARY KEY(id_ventaproductos),
	FOREIGN KEY(id_venta) REFERENCES ventas (id_venta)
);

#fin