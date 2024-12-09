package actadd5t5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ActAdd5T5 {

    public static void main(String[] args) {
        new Concierto("Coldplay", 4, "Rock", "C001", "Concierto de Coldplay", "50000", "Estadio Nacional", "15/12/2024", "20:00", 150.00);
        new Concierto("Beyoncé", 1, "Pop", "C002", "Concierto de Beyoncé", "30000", "Madison Square Garden", "20/12/2024", "19:30", 200.00);
        new Concierto("Metallica", 5, "Heavy Metal", "C003", "Concierto de Metallica", "40000", "Wembley Stadium", "18/12/2024", "21:00", 180.00);
        new Concierto("Adele", 1, "Soul", "C004", "Concierto de Adele", "20000", "O2 Arena", "22/12/2024", "20:00", 250.00);
        new Concierto("Imagine Dragons", 4, "Alternative Rock", "C005", "Concierto de Imagine Dragons", "35000", "Rose Bowl Stadium", "25/12/2024", "18:30", 170.00);
        new Evento("E001", "Evento de Tecnología", "2000", "Centro de Convenciones", "10/12/2024", "10:00", 50.00);
        new Evento("E002", "Feria de Libros", "1500", "Auditorio Central", "12/12/2024", "09:00", 25.00);
        new Evento("E003", "Conferencia de Salud", "1000", "Sala de Conferencias", "15/12/2024", "11:30", 75.00);
        new Evento("E004", "Exposición de Arte", "500", "Galería Nacional", "18/12/2024", "16:00", 40.00);
        new Evento("E005", "Festival de Cine", "3000", "Cineplex", "20/12/2024", "19:00", 60.00);
        
        Concierto concierto1 = new Concierto("test", 25, "sin estilo", "testcod", "test", "test", "test", "01/01/2001", "12:12", 0);
        concierto1.setEstilo("new style");
        
        System.out.println("Todos los eventos con sus precios: ");
        for(Evento instance : Evento.getInstances()){
            System.out.println("Evento: " + instance.getDescripcion() + "\nPrecio: "  + instance.getPrecio() + "€");
        }
        
        System.out.println("\nEventos con fecha anterior de 20/12/2024: ");
        listaEventosFecha("20/12/2024");
        
        System.out.println("\nConciertos de estilo: 'Rock':");
        listaConcierto("Rock");
        
        System.out.println("\nEventos debajo de 100€: ");
        listaEventosPrecio(100);
    }
    public static void listaEventosFecha(String fecha){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaParam  = LocalDate.parse(fecha, format);
        for(Evento instance : Evento.getInstances()){
            if(fechaParam.isAfter(instance.getLocalDateFecha())){
                System.out.println(instance);
            }
        }
    }
    public static void listaEventosLugar(String lugar){
        for(Evento instance : Evento.getInstances()){
            if(lugar.equals(instance.getLugar())){
                System.out.println(instance);
            }
        }
    }
    public static void listaEventosPrecio(double precio){
        for(Evento instance : Evento.getInstances()){
            if(precio >= instance.getPrecio()){
                System.out.println(instance);
            }
        }
    }
    
    public static void listaConcierto(String estilo){
        for(Evento instance : Evento.getInstances()){
            if(instance instanceof Concierto){
                if(estilo.equals(((Concierto) instance).getEstilo())){
                    System.out.println(instance);
                }
            }
        }
    }
    
    public static void listaConcierto(String estilo, int numComponentes){
        for(Evento instance : Evento.getInstances()){
            if(instance instanceof Concierto){
                if(estilo.equals(((Concierto) instance).getEstilo()) || numComponentes >= ((Concierto) instance).getNumComponentes()){
                    System.out.println(instance);
                }
            }
        }
    }
    public static void listaConcierto(){
        for(Evento instance : Evento.getInstances()){
            if(instance instanceof Concierto){
                System.out.println(instance);
            }
        }
    }
}
