CREATE TABLE Logro(
	id_logro INT,
    nombre VARCHAR(15) UNIQUE,
    descripcion VARCHAR(100)
);

CREATE TABLE Jugador_Logro(
	id_jugador INT,
    id_logro INT,
    fecha_logro DATE,
    PRIMARY KEY(id_jugador, id_logro),
    FOREIGN KEY (id_jugador) REFERENCES Jugador(id_jugador),
    FOREIGN KEY (id_logro) REFERENCES Logro(id_logro)
);

INSERT INTO Logro(id_logro, nombre, descripcion) VALUES
(1, "10 kills", "Logro por 10 muertes"),
(2, "50 kills", "Logro por 50 muertes"),
(3, "100 kills", "Logro por 100 muertes"),
(4, "200 kills", "Logro por 200 muertes"),
(5, 'Headshot Master', 'Logro por conseguir 50 disparos a la cabeza'),
(6, 'Survivor', 'Logro por sobrevivir 10 rondas seguidas'),
(7, 'Clutch King', 'Logro por ganar una ronda solo contra 3 o más enemigos'),
(8, 'Bomb Planter', 'Logro por plantar la bomba 25 veces'),
(9, 'Defuse Expert', 'Logro por desactivar la bomba 25 veces'),
(10, 'Ace!', 'Logro por eliminar a todo el equipo enemigo en una sola ronda');

INSERT INTO Jugador_Logro(id_jugador, id_logro, fecha_logro) VALUES
(1, 1, "2025/01/01"),
(1, 2, "2025/02/02"),
(1, 3, "2025/03/15"),
(1, 4, "2025/04/10"),
(5, 5, SYSDATE()),
(20, 10, SYSDATE()),
(15, 9, SYSDATE()),
(12, 8, SYSDATE()),
(14, 7, SYSDATE()),
(21, 6, SYSDATE());

select * from jugador_logro;

ALTER TABLE jugador_logro
DROP FOREIGN KEY id_jugador;

ALTER TABLE jugador_logro
DROP FOREIGN KEY id_logro;

DROP TABLE jugador_logro;

DROP TABLE logro;

