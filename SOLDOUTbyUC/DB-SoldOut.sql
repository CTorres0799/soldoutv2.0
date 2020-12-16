CREATE database soldoutv2
use soldoutv2;

/*1°|Administrador|Cajero|Piso|*/
create table roles (
idRol int auto_increment NOT NULL,
nombreRol char(100),
constraint pk_roles primary key (idRol)
);
drop table roles;
drop table usuarios;
drop table menu;
/*2°|Administrador|Cajero|Piso|*/
create table usuarios (
idUsuario int auto_increment NOT NULL,
nombreUsuario char(100) NOT NULL,
contraseña varchar(100) NOT NULL,
idRol int NOT NULL,
constraint pk_usuarios primary key (idUsuario)
);
/*3°|Administrador|Cajero|Piso|*/
create table menu (
idAlimento int auto_increment not null,
nombre varchar(100) NOT NULL,
descripcion varchar (150) NOT NULL,
precio int NOT NULL,
constraint pk_menu primary key (idAlimento)
)

/*CHECK'S|ROLES*/

select * from roles;
select * from usuarios;
select * from menu;



insert into roles (idRol,nombreRol) VALUES (1,'Administrador');
insert into roles (idRol,nombreRol) VALUES (0,'Piso');
insert into usuarios (idUsuario,nombreUsuario,contraseña,idRol) VALUES ('1','Cris0709','@cf1415','1');
insert into usuarios (idUsuario,nombreUsuario,contraseña,idRol) VALUES ('0','PH0499','puyi5','2');
insert into menu (idAlimento,nombre,descripcion,precio) VALUES ('1','Alitas 6pzs','BBQ',65);
insert into menu (idAlimento,nombre,descripcion,precio) VALUES ('2','Alitas 6pzs','Bufalo Red Hot',65);
insert into menu (idAlimento,nombre,descripcion,precio) VALUES (003,'Alitas 6pzs','BBQ Hot',65);
insert into menu (idAlimento,nombre,descripcion,precio) VALUES (004,'Alitas 6pzs','Mango Habanero',65);
insert into menu (idAlimento,nombre,descripcion,precio) VALUES (005,'Alitas 6pzs','Bufalo Red Hot',65);
insert into menu (idAlimento,nombre,descripcion,precio) VALUES (006,'Alitas 6pzs','Pimitienta-Limon',65);
insert into menu (idAlimento,nombre,descripcion,precio) VALUES (007,'Tequila Copeado','San Matias Reposado',45);
insert into menu (idAlimento,nombre,descripcion,precio) VALUES (008,'Tequila Copeado','Centenario Reposado',55);
insert into menu (idAlimento,nombre,descripcion,precio) VALUES (009,'Tequila Copeado','Tradicional Reposado',55);
insert into menu (idAlimento,nombre,descripcion,precio) VALUES (010,'Tequila Copeado','Don Julio Reposado',75);



