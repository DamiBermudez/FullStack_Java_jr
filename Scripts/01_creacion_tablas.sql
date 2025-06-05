/*Creación de base de datos hospitaldb*/

CREATE DATABASE IF NOT EXISTS hospitaldb;
USE hospitaldb;

/*Creación de tablas*/

CREATE TABLE Provincia (
idProvincia INT auto_increment primary key,
nomProvincia VARCHAR(100) NOT NULL
);

CREATE TABLE Distrito (
idDistrito INT auto_increment primary key,
nomDistrito VARCHAR(100) NOT NULL,
idProvincia INT,
foreign key (idProvincia) references Provincia(idProvincia)  
);

CREATE TABLE Sede(
idSede INT auto_increment primary key,
nomSede VARCHAR(100) NOT NULL
);

CREATE TABLE Condicion(
idCondicion INT auto_increment primary key,
nomCondicion VARCHAR(100) NOT NULL
);

CREATE TABLE Gerente(
idGerente INT auto_increment primary key,
nomGerente VARCHAR(100) NOT NULL
);

CREATE TABLE Hospital(
idHospital INT auto_increment primary key,
nomHospital VARCHAR(100) NOT NULL,
idGerente INT,
idDistrito INT,
idSede INT,
idCondicion INT,
foreign key (idGerente) references Gerente(idGerente),
foreign key (idDistrito) references Distrito(idDistrito),
foreign key (idSede) references Sede(idSede),
foreign key (idCondicion) references Condicion(idCondicion)
);