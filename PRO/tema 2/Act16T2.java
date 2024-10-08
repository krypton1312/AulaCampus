public class Act16T2 {
    public static void main(String[] args) {
        int finalint = 1;
        for(int i = 1; i <= 10; i+=2) {
            System.out.println(finalint);
            finalint*=i;
        }
        System.out.println("Final:"+finalint);
    }
}
