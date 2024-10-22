package gimnasio;
import objetos.Socio;
public class Gimnasio {
    public static void main(String[] args) {
        Socio s1 = new Socio();
        Socio s2 = new Socio("123", "juan", "juan", 54.3, 175, "3");
        Socio s3 = new Socio("123", "lola", "san");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
