-- top 5 jugadores con mejor ratio de kill por partida
SELECT j.nickname, 
       SUM(e.kills) AS total_kills,
       COUNT(DISTINCT e.id_partida) AS total_partidas,
       ROUND(COUNT(e.kills) * 1.0 / COUNT(DISTINCT e.id_partida), 2) AS ratio_kills
FROM Jugadores j
JOIN Estatistica e ON j.id_jugador = e.id_jugador
JOIN Partidas p ON e.id_partida = p.id_partida
GROUP BY j.id_jugador
ORDER BY ratio_kills DESC
LIMIT 5;


-- Jugadores que han usado más de 5 armas distintas en sus partidas
SELECT j.nombre, COUNT(DISTINCT e.id_arma) AS armas_usadas
FROM Jugadores j
JOIN Estatistica e ON j.id_jugador = e.id_jugador
GROUP BY j.id_jugador
HAVING COUNT(DISTINCT e.id_arma) > 5;

-- Obtener el jugador con mas skins legendarias
SELECT j.nickname, COUNT(s.id_skin) AS total_skins_legendarias
FROM Skins s
JOIN jugadores j ON s.id_jugador = j.id_jugador
WHERE s.rareza = 'Legendary'
GROUP BY j.id_jugador
ORDER BY total_skins_legendarias DESC
LIMIT 1;

-- obtener equipo cuyos jugadores tienen en promedio mas de 10 kill por partida
SELECT eq.nombre AS equipo,
       ROUND(AVG(e.kills), 2) AS promedio_kills
FROM Equipos eq
JOIN Historia h ON eq.id_equipo = h.id_equipo
JOIN Estatistica e ON h.id_jugador = e.id_jugador
WHERE h.fechaSalida IS NOT NULL
GROUP BY eq.id_equipo
HAVING AVG(e.kills) > 10
ORDER BY promedio_kills DESC;

-- Top 3 armas con más kills totales en partidas
SELECT a.nombre AS arma,
       SUM(e.kills) AS total_kills,
       ROUND(AVG(e.kills), 2) AS promedio_kills_por_partida
FROM Armas a
JOIN Estatistica e ON a.id_arma = e.id_arma
JOIN Partidas p ON e.id_partida = p.id_partida
GROUP BY a.id_arma
ORDER BY total_kills DESC
LIMIT 3;

select * from estatistica;


select * from historia;
select * from equipos;