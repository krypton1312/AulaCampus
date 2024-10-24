package cines;

import emisiones.Pelicula;

public class Cines {

    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("El Viaje de Chihiro", "Aventura", "Hayao Miyazaki", false, "2h 5m", 500, 10.0);
        Pelicula pelicula2 = new Pelicula("La La Land", "Comedia", "Damien Chazelle", false, "2h 8m", 400, 12.0);
        Pelicula pelicula3 = new Pelicula("El Laberinto del Fauno", "Drama", "Guillermo del Toro", true, "1h 58m", 300, 8.0);
        Pelicula pelicula4 = new Pelicula("Coco", "Aventura", "Lee Unkrich", false, "1h 49m", 600, 11.0);
        Pelicula pelicula5 = new Pelicula("Los Increíbles", "Comedia", "Brad Bird", false, "1h 55m", 700, 9.0);
        pelicula2.setNacional(true);
        pelicula4.setEspectadores(800);
        System.out.println(pelicula1);
        System.out.println(pelicula2);
        System.out.println(pelicula3);
        System.out.println(pelicula4);
        System.out.println(pelicula5);
        System.out.println(pelicula1.toStringTotal());
    }
}
