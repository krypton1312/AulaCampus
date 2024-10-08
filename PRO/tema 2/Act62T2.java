public class Act62T2 {
    public static void main(String[] args) {
        System.out.print("Celsius: ");
        int cel = Integer.parseInt(System.console().readLine());
        System.out.println("Fahrenheit: " + celToFah(cel) + "\n");

        System.out.print("Fahrenheit: ");
        int fah = Integer.parseInt(System.console().readLine());
        System.out.println("Celsius: " + fahToCel(fah) + "\n");
    }
     public static int celToFah(int cel){
        return (int)((cel*1.8) + 32);
    }
     public static int fahToCel(int fah){
        return (int)((fah-32)/1.8);
    }
}