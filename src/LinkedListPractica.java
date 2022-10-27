import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractica {
    public static void main(String[] args) {
        LinkedList<String> paises = new LinkedList<String>();
        paises.add("Spain");
        paises.add("Mexico");
        paises.add("Colombia");
        paises.add("Peru");

        LinkedList<String> capitales = new LinkedList<String>();
        capitales.add("Madrid");
        capitales.add("CDMX");
        capitales.add("Bogota");
        capitales.add("Lima");

        ListIterator<String> itPaises = paises.listIterator();
        ListIterator<String> itCapitales = capitales.listIterator();

        while(itCapitales.hasNext()){
            if (itPaises.hasNext()){
                itPaises.next();
                itPaises.add(itCapitales.next());
            }
        }
        System.out.println(paises);
        itCapitales = capitales.listIterator();

        while (itCapitales.hasNext()){
            itCapitales.next();

            if(itCapitales.hasNext()){
                itCapitales.next();
                itCapitales.remove();
            }
        }
        System.out.println(capitales);

        paises.removeAll(capitales);
        System.out.println(paises);
    }
}
