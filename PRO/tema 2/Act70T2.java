public class Act70T2 {
    public static void main(String[] args) {
        System.out.print("DNI sin letra: ");
        String dni = System.console().readLine();
        System.out.println("DNI completo: " + dni + letra(dni));
    }
    public static String letra(String a){
        int b = Integer.parseInt(a);
        switch (b%23) {
            case 0: return "T";
            case 1: return "R";
            case 2: return "W";
            case 3: return "A";
            case 4: return "G";
            case 5: return "M";
            case 6: return "Y";
            case 7: return "F";
            case 8: return "P";
            case 9: return "D";
            case 10: return "X";
            case 11: return "B";
            case 12: return "N";
            case 13: return "J";
            case 14: return "Z";
            case 15: return "S";
            case 16: return "Q";
            case 17: return "V";
            case 18: return "H";
            case 19: return "L";
            case 20: return "C";
            case 21: return "K";
            case 22: return "E";
            default: return "Error";
        }
    }
}
