package ejemploarraylist;

import java.util.ArrayList;


public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> miListaNombres = new ArrayList<>();
        
        miListaNombres.add("Luis");
        miListaNombres.add("Rosa");
        System.out.println(miListaNombres.toString());
        
        miListaNombres.add(0, "Clown");
        System.out.println(miListaNombres);

        ArrayList miLista = new ArrayList();
        miLista.add(7);
        miLista.add(4.3);
        miLista.add("efwwf");
        miLista.add(false);
        System.out.println(miLista);
        System.out.println(miLista.size());
       
         
        miListaNombres.forEach(System.out::println);

    }

}
