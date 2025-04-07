CREATE DATABASE CounterStrike2;

CREATE TABLE Jugadores(
	id_jugador INT AUTO_INCREMENT PRIMARY KEY,
    nickname VARCHAR(20) NOT NULL,
    nombre  VARCHAR(20) NOT NULL,
    apellido  VARCHAR(20) NOT NULL,
    fecha_nacimiento DATE,
    pais_nacimiento VARCHAR(20), 
    ELO INT 
);

CREATE TABLE JugadoresProfesionales(
	id_jugador INT PRIMARY KEY,
    rol VARCHAR(10),
    FOREIGN KEY (id_jugador) REFERENCES Jugadores(id_jugador)
);

CREATE TABLE Entrenadores(
	id_jugador INT PRIMARY KEY,
    jugadorRetirado BOOLEAN,
    FOREIGN KEY (id_jugador) REFERENCES JugadoresProfesionales(id_jugador)
);

CREATE TABLE Armas(
	id_arma INT PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL UNIQUE,
    precio DECIMAL(7,2),
    disponible_para VARCHAR(4)
);

CREATE TABLE Equipos(
	id_equpo INT PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL UNIQUE,
    pais VARCHAR(20) NOT NULL,
    fecha_creacion DATE,
    id_entrenador INT,
    FOREIGN KEY (id_entrenador) REFERENCES Entrenadores(id_jugador)
);

CREATE TABLE Mapas(
	id_mapa INT PRIMARY KEY,
    nombre VARCHAR(20) UNIQUE,
    tipo VARCHAR(20)
);

CREATE TABLE Partidas(
	id_partida INT PRIMARY KEY,
    resultado VARCHAR(10),
    fecha TIMESTAMP,
    id_mapa INT NOT NULL,
    id_equipo1 INT,
    id_equipo2 INT,
    FOREIGN KEY (id_mapa) REFERENCES Mapas(id_mapa),
    FOREIGN KEY (id_equipo1) REFERENCES Equipos(id_equipo),
    FOREIGN KEY (id_equipo2) REFERENCES Equipos(id_equipo),
    CHECK (id_equipo1 <> id_equipo2)
);

CREATE TABLE Skins(
	id_skin INT PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    rareza VARCHAR(20) NOT NULL,
    precio_mercado DECIMAL(8,2),
    id_jugador INT UNIQUE,
    id_arma INT NOT NULL UNIQUE,
    FOREIGN KEY (id_jugador) REFERENCES Jugadores(id_jugador),
    FOREIGN KEY (id_arma) REFERENCES Armas(id_arma)
);

CREATE TABLE Torneos(
	id_torneo INT PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    premio INT,
    fecha TIMESTAMP,
    id_equipo_ganado INT,
    FOREIGN KEY (id_equipo_ganado) REFERENCES Equipos(id_equipo)
);

CREATE TABLE Historia(
    id_jugador INT,
    id_equipo INT,
    salario DECIMAL(10, 2),
    fechaEntrada DATE,
    fechaSalida DATE,
    PRIMARY KEY (id_jugador, id_equipo),
    FOREIGN KEY (id_jugador) REFERENCES JugadoresProfesionales(id_jugador),
    FOREIGN KEY (id_equipo) REFERENCES Equipos(id_equipo)
);

CREATE TABLE Estatistica (
    id_jugador INT,
    id_arma INT,
    id_partida INT,
    death INT CHECK (death >= 0),
    kills INT CHECK (kills >= 0),
    PRIMARY KEY (id_jugador, id_arma, id_partida),
    FOREIGN KEY (id_jugador) REFERENCES JugadoresProfesionales(id_jugador),
    FOREIGN KEY (id_arma) REFERENCES Armas(id_arma),
    FOREIGN KEY (id_partida) REFERENCES Partidas(id_partida)
);

