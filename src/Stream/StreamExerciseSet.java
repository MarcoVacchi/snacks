package Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExerciseSet {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>(List.of(
                "Luca", "Marco", "Anna", "Luca", "Lorenzo", "Anna"));

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

    }

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

    // ///////// SNACK 3

    // ///////// SNACK 4
    // public static Set<String>

    // ///////// SNACK 4

    // ///////// SNACK 5
    // public static Set<String>

    // ///////// SNACK 5

    // ///////// SNACK 6
    // public static Set<String>

    // ///////// SNACK 6

    // ///////// SNACK 7
    // public static Set<String>

    // ///////// SNACK 7

    // ///////// SNACK 8
    // public static Set<String>

    // ///////// SNACK 8

    // ///////// SNACK 9
    // public static Set<String>

    // ///////// SNACK 9

    // ///////// SNACK 10
    // public static Set<String>

    ///////// SNACK 10
}

// 🔹 SNACK SET 3 — Lunghezza delle parole

// Output: Set<Integer>

// 🔹 SNACK SET 4 — Nomi con lunghezza > 4

// Output: Set<String>

// 🔹 SNACK SET 5 — Ordina alfabeticamente

// (Qui devi usare stream().sorted())

// Output: List<String>

// 🔹 SNACK SET 6 — Nomi in minuscolo

// Output: Set<String>

// 🔹 SNACK SET 7 — Conta quanti nomi iniziano con L

// Output: long

// 🔹 SNACK SET 8 — Trasforma in mappa

// Chiave = nome, Valore = lunghezza

// Output: Map<String, Integer>

// 🔹 SNACK SET 9 — Nome più lungo

// Output: Optional<String>

// 🔹 SNACK SET 10 — Raggruppa per lunghezza

// Lunghezza → Set di parole

// Output: Map<Integer, Set<String>>