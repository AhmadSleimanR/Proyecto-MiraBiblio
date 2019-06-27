use master
go

CREATE DATABASE BIBLIOTECA_BD
go

USE BIBLIOTECA_BD
go

CREATE TABLE usuario(
	id INT NOT NULL IDENTITY,
	nombre VARCHAR(45) NOT NULL,
	apellido VARCHAR(45) NOT NULL,
	usuario VARCHAR(30) NOT NULL UNIQUE,
	correo VARCHAR(60) NOT NULL,
	clave VARCHAR(24) NOT NULL,
	direccion VARCHAR(100) NULL,
	distrito VARCHAR(30) NOT NULL,
	numeroTelefonico VARCHAR(19) NOT NULL,
	estado BIT NOT NULL,
	PRIMARY KEY(id)
)
go

CREATE TABLE descripcion_libro(
	id INT NOT NULL IDENTITY,
	titulo VARCHAR(80) NOT NULL,
	autor NVARCHAR(80) NULL,
	genero VARCHAR(80) NOT NULL,
	anio_publicacion SMALLINT NOT NULL,
	numero_paginas SMALLINT NOT NULL,
	idioma VARCHAR(80) NOT NULL,
	ISBN VARCHAR(25) NOT NULL,
	PRIMARY KEY(id)
)
go

CREATE TABLE libro(
	id INT NOT NULL IDENTITY,
	id_descripcion_libros INT NOT NULL,
	fecha_adquisicion DATE NOT NULL,
	cantidad_ejemplares SMALLINT NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (id_descripcion_libros) REFERENCES descripcion_libro (id)
)
go

CREATE TABLE administrador(
	id INT NOT NULL IDENTITY,
	nombre VARCHAR(45) NOT NULL,
	apellido VARCHAR(45) NOT NULL,
	usuario VARCHAR(30) NOT NULL UNIQUE,
	clave VARCHAR (24) NOT NULL,
	tipo BIT NOT NULL,
	PRIMARY KEY(id)
)
go

CREATE TABLE prestamo(
	id INT NOT NULL IDENTITY,
	id_libros INT NOT NULL,
	id_lector INT NOT NULL,
	id_administrador INT NOT NULL,
	fecha_peticion DATE NOT NULL,
	fecha_cancelacion DATE NULL,
	fecha_entrega DATE NULL,
	fecha_devolucion DATE NULL,
	prorroga_prestamo DATE NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (id_libros) REFERENCES libro (id),
	FOREIGN KEY (id_lector) REFERENCES usuario (id),
	FOREIGN KEY (id_administrador) REFERENCES administrador (id)
)
go


insert into descripcion_libro(titulo, autor, genero, anio_publicacion, numero_paginas, idioma, ISBN) values(
'El principito',
'Antoine de Saint-Exupéry',
'Fábula',
 1943,
 109,
'Frances',
'9780141185620'
)
insert into descripcion_libro(titulo, autor, genero, anio_publicacion, numero_paginas, idioma, ISBN) values(
'Harry Potter',
'J. K. Rowling',
'Fantasía',
 1997,
 223,
'Inglés',
'9789604533084'
)
insert into descripcion_libro(titulo, autor, genero, anio_publicacion, numero_paginas, idioma, ISBN) values(
'Neuromancer',
'William Gibson',
'Ciencia Ficción',
 1984,
 271,
'Frances',
'9780307969958'
)

insert into descripcion_libro(titulo, autor, genero, anio_publicacion, numero_paginas, idioma, ISBN) values(
'La llamada de Cthulhu',
'H. P. Lovecraft',
'Ciencia Ficción',
 1928,
 37,
'Inglés',
'9781545135969'
)

insert into descripcion_libro(titulo, autor, genero, anio_publicacion, numero_paginas, idioma, ISBN) values(
'Dune',
'Frank Herbert',
'Ciencia Ficción',
 1965,
 412,
'Inglés',
'9783641173081'
)
go

select * from descripcion_libro;

insert libro(id_descripcion_libros, fecha_adquisicion, cantidad_ejemplares) values(
1,
'11-26-2018',
10)

insert libro(id_descripcion_libros, fecha_adquisicion, cantidad_ejemplares) values(
2,
'11-26-2018',
30)

insert libro(id_descripcion_libros, fecha_adquisicion, cantidad_ejemplares) values(
3,
'11-26-2018',
5)

insert libro(id_descripcion_libros, fecha_adquisicion, cantidad_ejemplares) values(
4,
'11-26-2018',
5)

insert libro(id_descripcion_libros, fecha_adquisicion, cantidad_ejemplares) values(
5,
'11-26-2018',
15)

go

select * from libro;



insert usuario(nombre, apellido, usuario, correo, clave, direccion, distrito, numeroTelefonico, estado) values(
'Andres',
'Arellano Mendoza',
'andres11',
'andresam@gmail.com',
'password123',
'Av. Paseo de la Republica 4213',
'Miraflores',
'993234231',
 1)

insert usuario(nombre, apellido, usuario, correo, clave, direccion, distrito, numeroTelefonico, estado) values(
'Armando',
'Torres Del Castillo',
'armandolatorre',
'armandotorres@aol.com',
'bloquesderoca',
'Las Aguilas 143',
'Surquillo',
'992485231',
 1)

insert usuario(nombre, apellido, usuario, correo, clave, direccion, distrito, numeroTelefonico, estado) values(
'Rosa',
'Lopez Leon',
'hellokitty123',
'rosakitty@hotmail.com',
'hellokitty',
'Av. Arequipa 1250',
'Miraflores',
'998743832',
 1)

insert usuario(nombre, apellido, usuario, correo, clave, direccion, distrito, numeroTelefonico, estado) values(
'Marco',
'Rengifo Vasquez',
'marcodota11',
'marcoSM@gmail.com',
'nevermore444',
'Av. La Marina 4037',
'San Miguel',
'998894923',
 1)

insert usuario(nombre, apellido, usuario, correo, clave, direccion, distrito, numeroTelefonico, estado) values(
'Tania',
'Marquez Abugatás',
'tmarquez333',
'taniaabugatas@hotmail.com',
'mimamamemima',
'Av. Salaverry 1027',
'Jesus Maria',
'997888323',
 1)
go

select * from usuario;


insert into administrador(nombre, apellido, usuario, clave, tipo) values(
'Lorenzo',
'Farfan',
'lfarfan',
'adminadmin',
 1
)
go

select * from administrador;
go