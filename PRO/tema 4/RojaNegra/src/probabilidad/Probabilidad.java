package probabilidad;

public class Probabilidad {
    
    public String azar(){
        int red = 0;
        int black = 0;
        for (int i = 0; i < 15; i++) {
            int randomValue = (int) (Math.random() * 2) + 1;
            if(randomValue ==1){
                red++;
            }else{
                black++;
            }
        }
        double blackproc = ((double)black/15)*100;
        double redproc = ((double)red/15)*100;
        return "blackproc = " + blackproc + " redproc = " + redproc;
    }
}
