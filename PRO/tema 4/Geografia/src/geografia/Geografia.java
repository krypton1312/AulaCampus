package geografia;
import mapa.fisico.Montaña;
import mapa.fisico.Rio;
import mapa.politico.Pais;


public class Geografia {
    public static void main(String[] args) {
        Montaña mont1 = new Montaña("nMont", 3000, "Georgia");
        Rio rio1 = new Rio("nRio", 8234, 123);
        Pais pais1 = new Pais("España", "Madrid", "cent/euro", 49232347);
        
        System.out.println(mont1.toString());
        System.out.println(rio1.toString());
        System.out.println(pais1.toString());
    }
}
