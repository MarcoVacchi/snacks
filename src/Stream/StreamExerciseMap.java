package Stream;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExerciseMap {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Luca", 25);
        people.put("Marco", 17);
        people.put("Anna", 30);
        people.put("Lorenzo", 15);
        people.put("Laura", 22);
        people.put("Giorgio", 2);

        ///////// SNACK 1
        // Stampa solo le chiavi Ottieni la lista dei nomi.
        peopleListWithEntrySet(people);
        ///////// SNACK 1
        System.out.println("=======================================");

        ///////// SNACK 2
        // Stampa solo i valori
        // Ottieni la lista delle età.
        peopleAgeWithValueSet(people);
        ///////// SNACK 2
        System.out.println("=======================================");

        ///////// SNACK 3
        // Filtra maggiorenni
        // Tieni solo le persone con età ≥ 18.
        filterPeopleForAge(people);
        ///////// SNACK 3
        System.out.println("=======================================");

        ///////// SNACK 4
        // Nomi che iniziano per L
        filterPeopleForWord(people, "M");
        ///////// SNACK 4
        System.out.println("=======================================");

        ///////// SNACK 5
        // Nomi in maiuscolo
        // Trasforma le chiavi in uppercase.
        mapPeopleToSwitchCase(people, "lower");
        ///////// SNACK 5
        System.out.println("=======================================");

        ///////// SNACK 6
        // Aumenta tutte le età di num scelto
        // Incrementa tutti i valori.
        mapIncrementAge(people, 1);
        ///////// SNACK 6
        System.out.println("=======================================");

        ///////// SNACK 7
        // Filtra maggiorenni e nomi in maiuscolo
        // Fai filter + map insieme.
        filterPeopleUpperCase(people, 15, "lower");
        ///////// SNACK 7
        System.out.println("=======================================");

        ///////// SNACK 8
        // Ottieni solo i nomi dei maggiorenni
        // Prima filtri, poi estrai solo le chiavi.
        filterPeopleBy18(people);
        ///////// SNACK 8
        System.out.println("=======================================");

        ///////// SNACK 9
        // Media delle età
        // Calcola la media dei valori.
        System.out.println(calculateAvg(people));
        ///////// SNACK 9
        System.out.println("=======================================");

        ///////// SNACK 10
        // Trova la persona più grande
        // Entry con età massima.
        maxAge(people);
        ///////// SNACK 10
        System.out.println("=======================================");
    }

    // ///////// SNACK 10
    public static Map<String, Integer> maxAge(Map<String, Integer> param) {
        Map<String, Integer> result = param.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(entry -> Map.of(entry.getKey(), entry.getValue()))
                .orElse(Collections.emptyMap());
        result.forEach((name, age) -> {
            System.out.println("Nome-> " + name + " Con l'età maggiore è-> " + age);
        });
        return result;
    }
    // ///////// SNACK 10

    // ///////// SNACK 9
    // METODO 1
    // public static double calculateAvg(Map<String, Integer> param) {
    // double result = param.values()
    // .stream()
    // .mapToInt(entry -> entry.intValue())
    // .average()
    // .orElse(0.0);
    // return result;
    // }
    // METODO 2
    // public static double calculateAvg(Map<String, Integer> param) {
    // double result = param.entrySet()
    // .stream()
    // .map(Map.Entry::getValue)
    // .collect(Collectors.collectingAndThen(Collectors.toList(),
    // list -> calculateAvgFunction(list)));
    // return result;
    // }
    // METODO 3
    public static double calculateAvg(Map<String, Integer> param) {
        List<Integer> numbers = param.values()
                .stream()
                .collect(Collectors.toList());
        return calculateAvgFunction(numbers);
    }

    // FUNZIONE PER METODO 3
    public static double calculateAvgFunction(List<Integer> key) {
        int count = 0;
        double result = 0;
        for (Integer integer : key) {
            result += integer;
            count++;
        }
        return result / count;
    }
    // ///////// SNACK 9

    // ///////// SNACK 8
    public static List<String> filterPeopleBy18(Map<String, Integer> param) {
        List<String> result = param.entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 18)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        result.forEach(System.out::println);
        return result;
    }
    // ///////// SNACK 8

    // ///////// SNACK 7
    public static Map<String, Integer> filterPeopleUpperCase(Map<String, Integer> param, Integer numberCompare,
            String input) {
        Map<String, Integer> result = param.entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= numberCompare)
                .collect(Collectors.toMap(
                        entry -> switch (input.toLowerCase()) {
                            case "upper" -> entry.getKey().toUpperCase();
                            case "lower" -> entry.getKey().toLowerCase();
                            default -> wordToCamelCase(entry.getKey());
                        }, Map.Entry::getValue));
        result.forEach((key, value) -> {
            System.out.println("Nome-> " + key + " Età-> " + value);
        });

        return result;
    }

    public static String wordToCamelCase(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 0) {
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }
        }
        return result;
    }
    // ///////// SNACK 7

    // ///////// SNACK 6
    public static Map<String, Integer> mapIncrementAge(Map<String, Integer> param, Integer increment) {
        Map<String, Integer> result = param.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue() + increment));
        result.forEach((key, value) -> {
            System.out.println("Nome-> " + key + " Età-> " + value);
        });
        return result;
    }
    // ///////// SNACK 6

    // ///////// SNACK 5
    public static Map<String, Integer> mapPeopleToSwitchCase(Map<String, Integer> param, String input) {
        Map<String, Integer> result = param.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        entry -> switch (input.toLowerCase()) {
                            case "upper" -> entry.getKey().toUpperCase();
                            case "lower" -> entry.getKey().toLowerCase();
                            default -> entry.getKey();
                        }, Map.Entry::getValue));
        result.forEach((key, value) -> {
            System.out.println("Hai scelto: " + input + ": " + key + " " + value); // HO VOLUTO IMPLEMENTARE QUESTA
                                                                                   // LOGICA COME ESERCIZIO
        });
        return result;
    }
    // ///////// SNACK 5

    // ///////// SNACK 5
    public static Map<String, Integer> mapPeopleToUpperCase(Map<String, Integer> param) {
        Map<String, Integer> result = param.entrySet()
                .stream()
                .collect(Collectors.toMap(entry -> entry.getKey().toUpperCase(), Map.Entry::getValue));
        result.forEach((key, value) -> {
            System.out.println(key + value);
        });
        return result;
    }
    // ///////// SNACK 5

    // ///////// SNACK 4
    public static Map<String, Integer> filterPeopleForWord(Map<String, Integer> param, String input) {
        Map<String, Integer> result = param.entrySet()
                .stream()
                .filter(entry -> entry.getKey().startsWith(input))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        result.forEach((key, value) -> {
            System.out.println("Nome che inizia per lettera scelta: " + key + " " + "Età-> " + value); // PER DIDATTICA
                                                                                                       // HO VOLUTAMENTE
                                                                                                       // PASSARE INPUT
                                                                                                       // PER RENDERLO
                                                                                                       // DINAMICO IN
                                                                                                       // BASE ALLA
                                                                                                       // LETTERA SCELTA
        });
        return result;
    }
    // ///////// SNACK 4

    // ///////// SNACK 3
    public static Map<String, Integer> filterPeopleForAge(Map<String, Integer> param) {
        Map<String, Integer> result = param.entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 18)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // UTILIZZO METHOD REFERENCE
        // .collect(Collectors.toMap(entry -> entry.getKey(), entry ->
        // entry.getValue()));
        result.forEach((key, value) -> {
            System.out.println("Nome-> " + key + " Età-> " + value);
        });
        return result;
    }
    // ///////// SNACK 3

    // ///////// SNACK 2
    public static List<Integer> peopleAgeWithValueSet(Map<String, Integer> param) {
        List<Integer> result = param.values()
                .stream()
                .collect(Collectors.toList());
        result.forEach(System.out::println);
        return result;
    }

    public static List<Integer> peopleAgeWithEntrySet(Map<String, Integer> param) {
        List<Integer> result = param.entrySet()
                .stream()
                .map(entry -> entry.getValue())
                .collect(Collectors.toList());
        result.forEach(System.out::println);
        return result;
    }
    // ///////// SNACK 2

    // ///////// SNACK 1
    public static List<String> peopleListWithKeySet(Map<String, Integer> param) {
        List<String> result = param.keySet()
                .stream()
                .collect(Collectors.toList());
        result.forEach(System.out::println);
        return result;
        // QUI PRENDIAMO DIRETTAMENTE LE CHIAVI DELLA MAP
        // keySet() //restituisce un Set<String>, quindi nello stream abbiamo già le
        // String.
        // È la soluzione migliore quando ci servono SOLO le chiavi.
        // STRING, MEGLIO QUANDO NECESSITIAMO DELLE SOLE CHIAVI
    }

    public static List<String> peopleListWithEntrySet(Map<String, Integer> param) {
        List<String> result = param.entrySet()
                .stream()
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        result.forEach(System.out::println);
        return result;
        // QUI CON entrySet() PRENDIAMO OGGETTI Map.Entry<String, Integer>
        // Ogni elemento dello stream è una coppia chiave/valore.
        // Usiamo map() per trasformare Map.Entry in String prendendo solo la chiave.
        // Questo approccio è più flessibile quando ci servono anche i valori (es.
        // filtri sull'età).
    }
    // ///////// SNACK 1
}
//
// Output: Map.Entry<String, Integer>
