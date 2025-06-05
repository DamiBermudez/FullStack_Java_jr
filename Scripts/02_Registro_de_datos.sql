/*Inserción de datos*/
USE hospitaldb;

/*Gerentes*/
INSERT INTO Gerente (nomGerente) VALUES ('Dr. Emilio Cárdenas'), ('Dra. Juliana Echevery');

/*Sedes*/
INSERT INTO Sede (nomSede) VALUES ('Norte'), ('Sur');

/*Provincias*/
INSERT INTO Provincia (nomProvincia) VALUES ('Lima'), ('Callao');

/*Distritos*/
INSERT INTO Distrito (nomDistrito,idProvincia) VALUES ('Miraflores',1), ('La Perla',2);

/*Condicion*/
INSERT INTO Condicion (nomCondicion) VALUES ('Activo'),('Mantenimiento');