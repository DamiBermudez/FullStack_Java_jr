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

DELIMITER //

CREATE PROCEDURE SP_HOSPITAL_ACTUALIZAR (
    IN p_id_hospital INT,
    IN p_nom_hospital VARCHAR(100),
    IN p_nom_condicion VARCHAR(100),
    IN p_nom_gerente VARCHAR(100),
    IN p_nom_sede VARCHAR(100),
    IN p_nom_distrito VARCHAR(100)
)
BEGIN
    UPDATE hospital h
    JOIN gerente g ON h.id_gerente = g.id_gerente
    JOIN condicion c ON h.id_condicion = c.id_condicion
    JOIN sede s ON h.id_sede = s.id_sede
    JOIN distrito d ON h.id_distrito = d.id_distrito
    SET
        h.nom_hospital = p_nom_hospital,
        c.nom_condicion = p_nom_condicion,
        g.nom_gerente = p_nom_gerente,
        s.nom_sede = p_nom_sede,
        d.nom_distrito = p_nom_distrito
    WHERE h.id_hospital = p_id_hospital;
END //

DELIMITER ;

//

/*Eliminar Hospital*/

CREATE PROCEDURE SP_HOSPITAL_ELIMINAR(
	IN P_idHospital INT 
)
	BEGIN 
		DELETE FROM Hospital WHERE id_hospital = P_idHospital;
	END;
//


CREATE PROCEDURE obtenerHospitalPorId(IN P_idHospital INT)
BEGIN
  SELECT 
  h.id_hospital , 
  c.nom_condicion as Condición , 
  g.nom_gerente as Gerente, 
  s.nom_sede as Sede , 
  d.nom_distrito as Distrito
  FROM hospital h
  inner join 
  condicion c on c.id_condicion = h.id_condicion 
  inner join 
  gerente g on g.id_gerente = h.id_gerente 
  inner join sede s on s.id_sede = h.id_sede 
  inner join distrito d on d.id_distrito = h.id_distrito  
  where 
  h.id_hospital = P_idHospital;
END //

DELIMITER ;

