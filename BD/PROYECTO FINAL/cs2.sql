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
	id_equipo INT PRIMARY KEY,
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
    id_jugador INT,
    id_arma INT NOT NULL,
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

INSERT INTO Jugadores (nickname, nombre, apellido, fecha_nacimiento, pais_nacimiento, ELO) VALUES
('S1mple', 'Oleksandr', 'Kostyliev', '1997-10-02', 'Ukraine', 2800),
('ZywOo', 'Mathieu', 'Herbaut', '2000-11-09', 'France', 2700),
('NiKo', 'Nikola', 'Kovač', '1997-02-16', 'Bosnia and Herzegovina', 2750),
('dev1ce', 'Peter', 'Rasmussen', '1995-05-08', 'Denmark', 2600),
('shox', 'Richard', 'Papillon', '1995-06-27', 'France', 2500),
('Xyp9x', 'Andreas', 'Højsleth', '1996-09-07', 'Denmark', 2600),
('electroNic', 'Denis', 'Sharipov', '1998-02-05', 'Russia', 2650),
('ropz', 'Robin', 'Kool', '2000-12-22', 'Estonia', 2550),
('fallen', 'Gabriel', 'Toledo', '1991-05-30', 'Brazil', 2700),
('KennyS', 'Kenny', 'Schrub', '1995-05-19', 'France', 2550),
('B1ad3', 'Sergey', 'Berezhnoy', '1988-06-04', 'Ukraine', 2500),
('rain', 'Håvard', 'Nygaard', '1994-05-19', 'Norway', 2450),
('dupreeh', 'Emil', 'Møller', '1993-03-26', 'Denmark', 2600),
('device', 'Nicolai', 'Reedtz', '1995-09-05', 'Denmark', 2650),
('magisk', 'Emil', 'Reif', '1998-04-05', 'Denmark', 2550),
('broky', 'Helvijs', 'Pavlovs', '2000-03-14', 'Latvia', 2450),
('JW', 'Jesper', 'Wecksell', '1995-09-27', 'Sweden', 2500),
('flusha', 'Robin', 'Rönnquist', '1993-02-13', 'Sweden', 2400),
('TACO', 'Epitácio', 'De Melo', '1995-11-10', 'Brazil', 2350),
('coldzera', 'Marcelo', 'David', '1994-10-31', 'Brazil', 2650),
('mir', 'Igor', 'Makarov', '1997-05-19', 'Russia', 2600),
('Adren', 'Danylo', 'Dennisov', '1990-06-03', 'Ukraine', 2500),
('Hiko', 'Spencer', 'Martin', '1989-03-06', 'USA', 2400),
('ScreaM', 'Adil', 'Benrlitom', '1994-07-02', 'Belgium', 2350),
('Bubzkji', 'Benjamin', 'Bubzkji', '1998-11-06', 'Denmark', 2450),
('Naf', 'Jonathan', 'Nafany', '2000-10-16', 'Canada', 2550),
('k0nfig', 'Kristian', 'Vang', '1996-11-02', 'Denmark', 2500),
('Jame', 'Arseni', 'Makarov', '1993-10-07', 'Russia', 2400),
('HooXi', 'Benjamin', 'HooXi', '1999-02-15', 'Denmark', 2300),
('Apex', 'Dan', 'Müller', '1997-11-16', 'France', 2450),
('Issa', 'Issa', 'Al-Rahman', '1999-04-25', 'USA', 2300);

INSERT INTO JugadoresProfesionales (id_jugador, rol) VALUES
((SELECT id_jugador FROM Jugadores WHERE nickname = 'S1mple'), 'AWPer'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'ZywOo'), 'AWPer'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'NiKo'), 'Rifler'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'dev1ce'), 'AWPer'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'shox'), 'Rifler'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'Xyp9x'), 'Support'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'electroNic'), 'Rifler'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'ropz'), 'Rifler'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'fallen'), 'IGL'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'KennyS'), 'AWPer'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'rain'), 'Rifler'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'dupreeh'), 'Entry fragger'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'device'), 'AWPer'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'magisk'), 'Rifler'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'broky'), 'AWPer'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'JW'), 'AWPer'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'TACO'), 'Support'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'coldzera'), 'Rifler'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'mir'), 'Rifler'),
((SELECT id_jugador FROM Jugadores WHERE nickname = 'Adren'), 'IGL');

INSERT INTO Entrenadores (id_jugador, jugadorRetirado) VALUES
(5, TRUE),
(8, TRUE),
(17, TRUE),
(19, TRUE),
(10, TRUE),
(13, TRUE),
(14, TRUE),
(20, TRUE),
(12, TRUE);

INSERT INTO Armas (id_arma, nombre, precio, disponible_para) VALUES
(1, 'AK-47', 2700.00, 'T'),
(2, 'M4A4', 3100.00, 'CT'),
(3, 'AWP', 4750.00, 'CT,T'),
(4, 'Desert Eagle', 700.00, 'CT,T'),
(5, 'MP7', 1500.00, 'CT'),
(6, 'MAC-10', 1050.00, 'T'),
(7, 'P90', 2400.00, 'CT,T'),
(8, 'Galil AR', 1800.00, 'T'),
(9, 'FAMAS', 2250.00, 'CT'),
(10, 'UMP-45', 1200.00, 'CT,T'),
(11, 'Negev', 2000.00, 'CT,T'),
(12, 'M249', 2900.00, 'CT,T'),
(13, 'CZ75-Auto', 500.00, 'CT,T'),
(14, 'R8 Revolver', 850.00, 'CT,T'),
(15, 'P250', 300.00, 'CT,T');

INSERT INTO Equipos (id_equipo, nombre, pais, fecha_creacion, id_entrenador) VALUES
(1, 'Natus Vincere', 'Ukraine', '2009-08-01', (SELECT id_jugador FROM Entrenadores WHERE id_jugador = 5)), -- shox (тренер)
(2, 'Vitality', 'France', '2013-01-01', (SELECT id_jugador FROM Entrenadores WHERE id_jugador = 8)), -- fallen (тренер)
(3, 'FaZe Clan', 'International', '2016-05-01', (SELECT id_jugador FROM Entrenadores WHERE id_jugador = 17)), -- JW (тренер)
(4, 'Astralis', 'Denmark', '2000-01-01', (SELECT id_jugador FROM Entrenadores WHERE id_jugador = 19)), -- flusha (тренер)
(5, 'Team Liquid', 'USA', '2000-01-01', (SELECT id_jugador FROM Entrenadores WHERE id_jugador = 22)), -- Adren (тренер)
(6, 'G2 Esports', 'France', '2013-10-01', (SELECT id_jugador FROM Entrenadores WHERE id_jugador = 10)), -- KennyS (тренер)
(7, 'Cloud9', 'USA', '2013-05-01', (SELECT id_jugador FROM Entrenadores WHERE id_jugador = 11)), -- B1ad3 (тренер)
(8, 'MIBR', 'Brazil', '2003-12-01', (SELECT id_jugador FROM Entrenadores WHERE id_jugador = 23)), -- Hiko (тренер)
(9, 'SK Gaming', 'Germany', '1997-02-01', (SELECT id_jugador FROM Entrenadores WHERE id_jugador = 20)), -- TACO (тренер)
(10, 'Ninjas in Pyjamas', 'Sweden', '2000-01-01', (SELECT id_jugador FROM Entrenadores WHERE id_jugador = 12)); -- rain (тренер)


INSERT INTO Mapas (id_mapa, nombre, tipo) VALUES
(1, 'Dust2', 'Bombsite'),
(2, 'Mirage', 'Bombsite'),
(3, 'Inferno', 'Bombsite'),
(4, 'Nuke', 'Bombsite'),
(5, 'Train', 'Bombsite'),
(6, 'Overpass', 'Bombsite'),
(7, 'Cache', 'Bombsite'),
(8, 'Cobblestone', 'Bombsite'),
(9, 'Dust', 'Hostages'),
(10, 'Italy', 'Hostages');

INSERT INTO Partidas (id_partida, resultado, fecha, id_mapa, id_equipo1, id_equipo2) VALUES
(1, '2-0', '2025-04-08 14:00:00', 1, 1, 2),  -- Natus Vincere vs Vitality на Dust2
(2, '1-2', '2025-04-08 16:00:00', 2, 3, 4),  -- FaZe Clan vs Astralis на Mirage
(3, '1-1', '2025-04-08 18:00:00', 3, 5, 6),  -- Team Liquid vs G2 Esports на Inferno
(4, '0-2', '2025-04-09 10:00:00', 4, 7, 8),  -- Cloud9 vs MIBR на Nuke
(5, '2-0', '2025-04-09 12:00:00', 5, 9, 10), -- SK Gaming vs Ninjas in Pyjamas на Train
(6, '2-1', '2025-04-09 14:00:00', 6, 1, 3),  -- Natus Vincere vs FaZe Clan на Overpass
(7, '1-2', '2025-04-09 16:00:00', 7, 2, 4),  -- Vitality vs Astralis на Cache
(8, '2-1', '2025-04-09 18:00:00', 8, 5, 6),  -- Team Liquid vs G2 Esports на Cobblestone
(9, '0-2', '2025-04-10 10:00:00', 9, 7, 9),  -- Cloud9 vs SK Gaming на Dust
(10, '1-2', '2025-04-10 12:00:00', 10, 3, 2); -- FaZe Clan vs Vitality на Italy

INSERT INTO Skins (id_skin, nombre, rareza, precio_mercado, id_jugador, id_arma) VALUES
(1, 'Dragon Lore', 'Legendary', 15000.00, 1, 3),  -- S1mple с AWP
(2, 'Howl', 'Contraband', 3000.00, 2, 1),         -- ZywOo с AK-47
(3, 'Fire Serpent', 'Rare', 2000.00, 3, 2),       -- NiKo с M4A4
(4, 'Mecha Ind', 'Rare', 1200.00, 4, 4),  -- dev1ce с Desert Eagle
(5, 'Water Elemental', 'Common', 50.00, 5, 15), -- shox с Glock-18
(6, 'Bullet Rain', 'Rare', 800.00, 6, 2),   -- Xyp9x с M4A4
(7, 'Asiimov', 'Legendary', 4000.00, 7, 3),  -- electroNic с AWP
(8, 'Trigon', 'Uncommon', 300.00, 8, 7),     -- ropz с P90
(9, 'Cyrex', 'Rare', 600.00, 9, 15),        -- fallen с USP-S
(10, 'Hyper Beast', 'Legendary', 1200.00, 10, 2), -- KennyS с M4A1-S
(11, 'Desert Storm', 'Rare', 2000.00, 11, 11), -- B1ad3 с Negev
(12, 'Magma', 'Uncommon', 2500.00, 12, 12), -- Rain с M249
(13, 'Tigris', 'Common', 350.00, 13, 13), -- JW с CZ75-Auto
(14, 'Fade', 'Rare', 1200.00, 14, 14), -- TACO с R8 Revolver
(15, 'Whiteout', 'Common', 100.00, 15, 15); -- coldzera с P250

INSERT INTO Torneos (id_torneo, nombre, premio, fecha, id_equipo_ganado) VALUES
(1, 'CS:GO Major Championship', 1000000, '2024-08-15 18:00:00', 1),  -- Пример для команды с id 1
(2, 'Blast Premier', 500000, '2024-09-10 18:00:00', 2),  -- Пример для команды с id 2
(3, 'IEM Katowice', 700000, '2024-02-20 19:00:00', 3),  -- Пример для команды с id 3
(4, 'ESL Pro League', 400000, '2024-03-15 16:00:00', 4),  -- Пример для команды с id 4
(5, 'DreamHack Masters', 600000, '2024-06-25 17:00:00', 5),  -- Пример для команды с id 5
(6, 'ELEAGUE Major', 800000, '2024-04-10 20:00:00', 6),  -- Пример для команды с id 6
(7, 'ESL One Cologne', 900000, '2024-07-01 15:00:00', 7),  -- Пример для команды с id 7
(8, 'StarLadder Major', 650000, '2024-05-30 18:30:00', 8),  -- Пример для команды с id 8
(9, 'BLAST Spring Final', 550000, '2024-10-05 14:00:00', 9),  -- Пример для команды с id 9
(10, 'PGL Major Antwerp', 750000, '2024-11-12 19:00:00', 10);  -- Пример для команды с id 10

select * from jugadores;
select * from equipos;

INSERT IGNORE INTO Historia (id_jugador, id_equipo, salario, fechaEntrada, fechaSalida) VALUES
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'S1mple')), 5, 7000.00, '2016-02-12', '2016-12-10'),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'S1mple')), 1, 15000.00, '2016-12-11', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'ZywOo')), 2, 10000.00, '2018-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'NiKo')), 8, 5000.00, '2018-01-01', '2020-12-15'),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'NiKo')), 3, 12000.00, '2023-01-15', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'dev1ce')), 4, 9000.00, '2016-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'shox')), 6, 9000.00, '2015-01-01', '2018-02-03'),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'shox')), 1, 12000.00, '2018-02-04', '2018-12-12'),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'shox')), 6, 15000.00, '2019-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'Xyp9x')), 4, 8000.00, '2016-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'electroNic')), 7, 8500.00, '2019-11-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'ropz')), 8, 7000.00, '2020-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'fallen')), 9, 10000.00, '2016-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'KennyS')), 6, 10000.00, '2014-12-01', '2017-01-15'),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'KennyS')), 1, 12000.00, '2017-01-16', '2018-02-20'),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'KennyS')), 6, 14000.00, '2018-02-21', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'rain')), 6, 8500.00, '2014-05-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'dupreeh')), 4, 9500.00, '2016-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'device')), 4, 9000.00, '2016-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'magisk')), 4, 8000.00, '2017-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'broky')), 10, 8500.00, '2019-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'JW')), 10, 7500.00, '2013-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'TACO')), 9, 8000.00, '2016-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'coldzera')), 9, 12000.00, '2016-01-01', '2019-01-01'),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'coldzera')), 9, 13000.00, '2019-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'mir')), 9, 10000.00, '2019-01-01', NULL),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM jugadores where nickname = 'Adren')), 9, 9000.00, '2015-01-01', '2019-01-01');


select * from historia;

INSERT INTO Estatistica (id_jugador, id_arma, id_partida, kills, death) VALUES
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'S1mple')), 3, 1, 25, 12),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'S1mple')), 4, 1, 8, 5),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'electroNic')), 1, 1, 18, 14),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'ZywOo')), 3, 1, 22, 16),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'ZywOo')), 2, 1, 15, 10),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'NiKo')), 2, 2, 20, 18),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'NiKo')), 4, 2, 5, 3),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'dev1ce')), 3, 2, 24, 15),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'Xyp9x')), 2, 2, 12, 16),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'magisk')), 1, 2, 17, 14),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'shox')), 2, 3, 19, 17),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'KennyS')), 3, 3, 23, 12),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'rain')), 1, 3, 15, 16),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'device')), 3, 3, 20, 14),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'fallen')), 3, 4, 18, 16),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'coldzera')), 1, 4, 22, 14),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'TACO')), 2, 4, 11, 17),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'broky')), 3, 4, 19, 15),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'JW')), 3, 4, 16, 16),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'ropz')), 2, 5, 21, 13),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'mir')), 1, 5, 17, 15),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'Adren')), 4, 5, 8, 10),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'S1mple')), 3, 6, 28, 11),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'electroNic')), 1, 6, 19, 16),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'NiKo')), 2, 6, 23, 14),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'dev1ce')), 3, 6, 21, 15),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'Xyp9x')), 2, 6, 12, 18),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'ZywOo')), 3, 7, 25, 13),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'shox')), 2, 7, 16, 17),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'magisk')), 1, 7, 18, 16),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'dupreeh')), 1, 7, 14, 19),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'device')), 3, 7, 22, 14),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'KennyS')), 3, 8, 26, 12),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'rain')), 1, 8, 17, 15),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'coldzera')), 1, 8, 21, 14),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'TACO')), 2, 8, 13, 17),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'broky')), 3, 8, 18, 16),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'fallen')), 3, 9, 19, 15),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'mir')), 1, 9, 16, 16),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'JW')), 3, 9, 22, 13),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'NiKo')), 2, 10, 23, 14),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'ZywOo')), 3, 10, 24, 13),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'ropz')), 2, 10, 17, 16),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'electroNic')), 1, 10, 18, 15),
((SELECT id_jugador FROM JugadoresProfesionales WHERE id_jugador = (SELECT id_jugador FROM Jugadores WHERE nickname = 'magisk')), 1, 10, 16, 17);

