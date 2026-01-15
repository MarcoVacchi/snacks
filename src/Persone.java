import java.util.ArrayList;

public class Persone {

    public static void main(String[] args) {

        String[] persone = { "Marco", "Ciccio", "Mario", "Cri" };
        for (String string : persone) {
            System.out.println(string);
        }
        // Uso di ArrayList (Java Collections Framework)
        final ArrayList<String> personeString = new ArrayList<>();
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

        // personeString.forEach(System.out::println); // method reference

        // for (String persone : personeString) {
        // System.out.println(persone);
        // }
        personeString.remove("Lalo");

        // for (String persone : personeString) {
        // System.out.println(persone);
        // }
        personeString.clear();
        personeString.forEach(System.out::println);
    }

    // public static String stampaNomi(String[] array) {
    // String result = "";
    // for (String string : array) {
    // System.out.println(string);
    // }

    // return result;
    // }

}
