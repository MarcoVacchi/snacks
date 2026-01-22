package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListeArray {

    public static void main(String[] args) {
        final List<String> frutta = new ArrayList<>();
        final List<String> verdura = new ArrayList<>();

        frutta.add("mela");
        frutta.add("pera");
        frutta.add("banana");

        verdura.add("insalata");
        verdura.add("pomodoro");
        verdura.add("cipolla");

        final List<List<String>> fruttaVerdura = new ArrayList<>();

        fruttaVerdura.add(frutta);
        fruttaVerdura.add(verdura);

        for (List<String> ortaggi : fruttaVerdura) {
            for (String ortaggio : ortaggi) {
                System.out.println(ortaggio);
            }
        }

        for (String frutti : frutta) {
            System.out.println(frutti);
        }

        String[] persone = { "Marco", "Ciccio", "Mario", "Cri" };
        for (String string : persone) {
            System.out.println(string);
        }

        // Uso di ArrayList (Java Collections Framework)

        final List<String> personeString = new ArrayList<>();
        personeString.add("Marco");
        personeString.add("Cri");
        personeString.add("Lalo");

        System.out.println(personeString);

        for (String arrayList : personeString) {
            System.out.println(arrayList);
        }
        final String findIndex = personeString.get(personeString.size() - 1);
        System.out.println(findIndex);

        final String newValue = personeString.set(0, "giovanni");

        personeString.forEach(System.out::println); // method reference

        for (String personee : personeString) {
            System.out.println(personee);
        }
        personeString.remove("Lalo");

        for (String personee : personeString) {
            System.out.println(personee);
        }
        personeString.clear();
        personeString.forEach(System.out::println);
    }

    public static String stampaNomi(String[] array) {
        String result = "";
        for (String string : array) {
            System.out.println(string);
        }

        return result;
    }
}

/////////////////////// ARRAYLIST  ///////////////////////////////////////

/////////////////////// ARRAYLIST  ///////////////////////////////////////