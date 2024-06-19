import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeVowelWords());;
    }

    public static Set<String> removeVowelWords () {

        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lynx");
        fruits.add("grape");

        Iterator<String> it = fruits.iterator();

        while (it.hasNext()) {

            if (it.next().matches("[a-u,A-U]*")) {
                it.remove();
            }

        }

        return fruits;

    }

}