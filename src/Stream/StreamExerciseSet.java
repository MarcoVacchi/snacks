package Stream;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExerciseSet {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>(List.of(
                "Luca", "Marco", "Anna", "Luca", "Lorenzo", "Anna"));
        names.add("Valerio");

        ///////// SNACK 1
        // STAMPA LISTA IN MAIUSCOLO
        setUpperCase(names);
        ///////// SNACK 1
        System.out.println("=======================================");

        ///////// SNACK 2
        // Solo nomi che iniziano con L
        // setWithL(names);
        ///////// SNACK 2
        System.out.println("=======================================");

        ///////// SNACK 3
        // SNACK SET 3 — Lunghezza delle parole
        countWords(names);
        ///////// SNACK 3
        System.out.println("=======================================");

        ///////// SNACK 4
        // Nomi con lunghezza > 4
        namesLongerThan(names);

        ///////// SNACK 4
        System.out.println("=======================================");

        ///////// SNACK 5
        // Ordina alfabeticamente
        orderAlph(names);
        ///////// SNACK 5
        System.out.println("=======================================");

        ///////// SNACK 7
        // — Conta quanti nomi iniziano con L
        countNamesWithL(names);
        ///////// SNACK 7
        System.out.println("=======================================");

        ///////// SNACK 8
        // — trasforma in mappa
        switchToMap(names);
        ///////// SNACK 8
        System.out.println("=======================================");

    }

    // ///////// SNACK 10
    // public static Set<String>

    // ///////// SNACK 10

    // ///////// SNACK 9
    // public static Set<String>

    // ///////// SNACK 9

    // ///////// SNACK 8
    public static Map<String, Integer> switchToMap(Set<String> param) {
        Map<String, Integer> result = param.stream()
                .collect(Collectors.toMap(name -> name, name -> name.length()));
        // result.forEach((k, v) -> System.out.println("chiave: " + k + " con valore: "
        // + v));
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue()); // METODO PIU UTILIZZATO DI SOLITO PER
                                                                            // ITERARE IL MAP
        }
        // result.entrySet().stream()
        // .forEach(entry -> System.out.println(entry.getKey() + " -> " +
        // entry.getValue()));

        return result;

    }
    // ///////// SNACK 8

    // ///////// SNACK 7
    public static long countNamesWithL(Set<String> param) {
        long count = param.stream()
                .filter(str -> str.startsWith("L"))
                .count();
        System.out.println(count);
        return count;
    }
    // ///////// SNACK 7

    // ///////// SNACK 6
    // public static Set<String>

    // ///////// SNACK 6

    // ///////// SNACK 5
    public static Set<String> orderAlph(Set<String> param) {
        Set<String> result = param.stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new)); // QUI SORTED SE RESTITUISCO TOSET() NON
                                                                       // FUNZIONA,
                                                                       // PERCHE SET NON RITORNA UNA LISTA ORDINATA
        result.forEach(System.out::println);
        return result;
    }
    // ///////// SNACK 5

    // ///////// SNACK 4
    public static Set<String> namesLongerThan(Set<String> param) {
        Set<String> result = param.stream()
                // .filter(s -> s.length() > 5) // QUI JAVA NON OFFRE UN METODO PER POTER
                // UTILIZZARE METHOD REFERENCE, LO CREO IO.
                .filter(StreamExerciseSet::isLongerThan4)// PASSO IL NOME CLASSE MAIN ESSENDO METODO STATIC, NON FA
                                                         // PARTE DI STRING
                .collect(Collectors.toSet());
        result.forEach(System.out::println);
        return result;
    }

    // MI CREO IL METODO PER UTILIZZARE METHOD REFERENCE A SNACK 4
    public static boolean isLongerThan4(String s) {
        return s.length() > 4;
    }
    // ///////// SNACK 4

    // ///////// SNACK 3
    public static Set<Integer> countWords(Set<String> param) {
        Set<Integer> result = param.stream()
                .map(String::length)
                .collect(Collectors.toSet());
        result.forEach(System.out::println);
        return result;
    }
    // ///////// SNACK 3

    // ///////// SNACK 2
    public static Set<String> setWithL(Set<String> param) {
        Set<String> result = param.stream()
                .filter(s -> s.toUpperCase().startsWith("L"))
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        result.forEach(System.out::println);

        return result;
    }
    // ///////// SNACK 2

    ///////// SNACK 1
    public static Set<String> setUpperCase(Set<String> param) {
        Set<String> result = param.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        // result.forEach(System.out::println);
        for (String string : result) {
            System.out.println(string);
        }
        return result;
    }
    ///////// SNACK 1

}

// 🔹 SNACK SET 6 — Nomi in minuscolo

// Output: Set<String>

// 🔹 SNACK SET 8 — Trasforma in mappa

// Chiave = nome, Valore = lunghezza

// Output: Map<String, Integer>

// 🔹 SNACK SET 9 — Nome più lungo

// Output: Optional<String>

// 🔹 SNACK SET 10 — Raggruppa per lunghezza

// Lunghezza → Set di parole

// Output: Map<Integer, Set<String>>