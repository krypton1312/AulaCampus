public class Activ19T1 {
    public static void main(String[] args) {
        System.out.println("Escribeme una fecha (Ejemplo: 1 8 2004): ");
        String[] parts = System.console().readLine().split(" ");
        int[] fecha = new int[3];
        for (int i = 0; i < 3; i++) {
            fecha[i] = Integer.parseInt(parts[i]);
        }
        if(fecha[2] >0 && fecha[1] == 1 || fecha[1] == 3 || fecha[1] == 5 || fecha[1] == 7 || fecha[1] == 8 || fecha[1] == 10 || fecha[1] == 12 && fecha[0] <= 31)
        {
            System.out.println(fecha[0] + " de " + getMonthString(fecha[1]) + " del " + fecha[2]);
        }
        else if(fecha[2] >0 && fecha[1] == 4 || fecha[1] == 6 || fecha[1] == 9 || fecha[1] ==11 && fecha[0] <= 30)
        {
            System.out.println(fecha[0] + " de " + getMonthString(fecha[1]) + " del " + fecha[2]);
        }
        else if(fecha[2] > 0 && fecha[1] == 2 && fecha[0] <=29)
        {
            if (isLeapYear(fecha[2]) && fecha[0] <=29)
            {
                System.out.println(fecha[0] + " de " + getMonthString(fecha[1]) + " del " + fecha[2]);
            }
            else if (!isLeapYear(fecha[2]) && fecha[0] <=28)
            {
                System.out.println(fecha[0] + " de " + getMonthString(fecha[1]) + " del " + fecha[2]);
            }
            else
            {
                System.out.println("La fecha introducida no es valida.");    
            }
            
        }
        else
        {
            System.out.println("La fecha introducida no es valida.");
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100!= 0) && (year % 400 == 0);
    }
    public static String getMonthString(int month) {
        switch (month) {
            case 1: return "enero";
            case 2: return "febrero";
            case 3: return "marzo";
            case 4: return "abril";
            case 5: return "mayo";
            case 6: return "junio";
            case 7: return "julio";
            case 8: return "agosto";
            case 9: return "septiembre";
            case 10: return "octubre";
            case 11: return "noviembre";
            case 12: return "diciembre";
            default:
                return "Mes inválido";                
        }
    }
}