/**************************************************************************************************************************************

CREACIÓN DE STORED PROCEDURES UTILIZADOS POR EL PROGRAMA:

**************************************************************************************************************************************/
--SP para insertar usuario
CREATE PROCEDURE sp_insert_usuario
@nombre varchar(45),
@apellido varchar(45),
@usuario varchar(30),
@correo varchar(60),
@clave varchar(24),
@direccion varchar(100),
@distrito varchar(30),
@numeroTelefonico varchar(19),
@estado bit
AS
INSERT INTO USUARIO VALUES(@nombre, @apellido, @usuario, @correo, @clave, @direccion, @distrito, @numeroTelefonico, @estado);

--SP para Actualizar usuario

CREATE PROCEDURE sp_update_usuario
@id integer,
@nombre varchar(45),
@apellido varchar(45),
@usuario varchar(30),
@correo varchar(60),
@clave varchar(24),
@direccion varchar(100),
@distrito varchar(30),
@numeroTelefonico varchar(19),
@estado bit
AS
UPDATE USUARIO SET nombre = @nombre,
apellido = @apellido,
usuario = @usuario,
correo = @correo,
clave = @clave,
direccion = @direccion,
numeroTelefonico = @numeroTelefonico,
estado = @estado
WHERE id = @id;



--SP para "eliminar" usuario, cambia el estado de acuerdo a si está en 1 o 0

CREATE PROCEDURE sp_delete_usuario
@id integer
AS
UPDATE usuario
SET estado = CASE WHEN estado = 1 THEN 0 ELSE 1 END
WHERE id = @id;



--SP para buscar un usuario

CREATE PROCEDURE sp_find_usuario
@id integer
AS
SELECT * FROM usuario WHERE id = @id;


--SP para buscar todos los usuarios

CREATE PROCEDURE sp_findAll_usuario
AS
SELECT * FROM usuario;



--SP para validar a los usuarios

CREATE PROCEDURE sp_validar_usuario
@usuario varchar(30),
@clave varchar(24)
AS
SELECT * FROM usuario WHERE usuario = @usuario and clave = @clave;
