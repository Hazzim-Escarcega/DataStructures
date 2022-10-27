import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> personas = new LinkedList<String>();

        personas.add("Jose");
        personas.add("Luis");
        personas.add("Andres");
        personas.add("Carlos");
        personas.add("Miguel");
        personas.add("Ramon");
        ListIterator<String>it = personas.listIterator();
        it.next();
        it.add("Pedro");
        for (String persona:personas){
            System.out.println(persona);
        }
             {

        }
    }
}
