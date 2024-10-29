package multiplicray;
public class MultiplicRay {
    public static void main(String[] args) {        
        int[] num = {3,4,9};
        
        System.out.println(multi(num));
    }
    public static int multi(int[] n){
        return multi(n, 0);
    }
    private static int multi(int[] n, int index){
        if(index == n.length){
            return 1;
        }else{
            return n[index] * multi(n, index + 1);
        }
    }
}
