package ejercicio3;

import java.util.ArrayList;

public class Ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Votacion> listaVotos = new ArrayList<>();
        
        listaVotos.add(new Votacion("12345678A", "Juan", "Pérez", "Sí"));
        listaVotos.add(new Votacion("87654321B", "Ana", "García", "No"));
        listaVotos.add(new Votacion("23456789C", "Carlos", "López", "Sí"));
        listaVotos.add(new Votacion("34567890D", "María", "Rodríguez", "No"));
        listaVotos.add(new Votacion("45678901E", "Pedro", "Fernández","Sí"));

        
        if (!listaVotos.isEmpty()) {
            System.out.println("Atendiendo al votante: " + listaVotos.remove(0));
        }
        
        if (listaVotos.size() > 1) {
            System.out.println("Atendiendo al votante en posición 2: " + listaVotos.remove(1));
        }
        
        System.out.println("\nVotantes restantes en la cola:");
        for (Votacion votante : listaVotos) {
            System.out.println(votante);
        }
    }

    public static void votantePos(ArrayList<Votacion> listaVotos, int posicion) {
        if (posicion >= 0 && posicion < listaVotos.size()) {
            System.out.println("Eliminando votante en posición " + posicion + ": " + listaVotos.remove(posicion));
        } else {
            System.out.println("Posición inválida, no se puede eliminar.");
        }
    }
}
