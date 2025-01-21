package actividadstring;

public class ActividadString {
    public static void main(String[] args) {
        String[] dirs = {"Calle Olta, 45 Pta 10 - 46026 (valencia)",
            "gran vía, 131 Pta 14 - 28080 (madrid)",
            "avenida DEL PUERTO, 78 Pta 43 - 46004 (VALENCIA)"};
        showData(dirs);
    }
    
    
    public static void showData(String[] dirs){
        for(String dir: dirs){
            String[] direccion = dir.split(",");
            System.out.println("Direccion: " + direccion[0].toUpperCase());
            direccion = direccion[1].split("Pta");
            System.out.println("Patio: " + direccion[0].trim());
            direccion = direccion[1].split("-");
            System.out.println("Puerta: " + direccion[0].trim());
            direccion = direccion[1].trim().split(" ");
            System.out.println("Codigo postal: " + direccion[0].trim());
            String ciudad = direccion[1].replace("(", " ").replace(")", "").trim();
            System.out.println("Ciudad: " + ciudad.toUpperCase() + "\n");
            
        }
    }
}
