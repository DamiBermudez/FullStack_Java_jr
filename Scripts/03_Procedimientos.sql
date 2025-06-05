USE hospitaldb;


DELIMITER //

/* Registrar Hospital */

CREATE PROCEDURE SP_HOSPITAL_REGISTRAR(
	IN P_nomHospital VARCHAR(100),
    IN P_idGerente INT,
    IN P_idCondicion INT,
    IN P_idSede INT,
    IN P_idDistrito INT
)
	BEGIN
		INSERT INTO Hospital (nom_hospital,id_gerente,id_condicion, id_sede, id_distrito) 
        VALUES (P_nomHospital, P_idGerente, P_idCondicion, P_idSsede, P_idDistrito);
	END;
//

/*Actualizar Hospital*/

CREATE PROCEDURE SP_HOSPITAL_ACTUALIZAR(
	IN P_idHospital INT,
    IN P_nomHospital VARCHAR(100),
    IN P_idGerente INT,
    IN P_idCondicion INT,
    IN P_idSede INT,
    IN P_idDistrito INT   
)
BEGIN 
	UPDATE Hospital 
    SET nom_hospital =  P_nomHospital,
		id_gerente = P_idGerente,
        id_condicion = P_idCondicion,
        id_sede = P_idSede,
        id_distrito = P_idDistrito
	WHERE id_hospital= P_idHospital;
END; 
//

/*Eliminar Hospital*/

CREATE PROCEDURE SP_HOSPITAL_ELIMINAR(
	IN P_idHospital INT 
)
	BEGIN 
		DELETE FROM Hospital WHERE id_hospital = P_idHospital;
	END;
//

/*Listar Hospitales Dinámicamente*/

CREATE PROCEDURE SP_HOSPITAL_LISTAR()
BEGIN 
/*variables*/
	DECLARE done INT DEFAULT false;
    DECLARE nomHospital VARCHAR(100);
    DECLARE cur cursor for select nom_hospital FROM Hospital;
    DECLARE CONTINUE handler for NOT found set done = true;
    
/*se crea una tabla temporal si ya existe se elimina*/
	DROP TEMPORARY TABLE IF EXISTS tmp_hospitales;
		CREATE TEMPORARY TABLE tmp_hospitales (
			nomHospital VARCHAR(100)
    );
/*Abrir el cursor*/
OPEN cur;

/*Bucle de lectura*/
listar_loop:loop
fetch cur into nomHospital;
if done THEN 
	leave Listar_loop;
end if;

/*Insertar la tabla temporal*/
INSERT INTO tmp_hospitales (nomHospital) VALUES (nomHospital);
end loop;

/*Cierro cur*/
CLOSE cur;

/*Devuelve el resultado acumulado*/
SELECT * FROM tmp_Hospitales;
END;

DELIMITER;
