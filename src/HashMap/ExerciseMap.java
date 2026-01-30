package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExerciseMap {

    public static void main(String[] args) {
        // Map<Integer, String> words = new HashMap<>();
        // words.put(1, "ciao");
        // words.put(2, "mela");
        // words.put(3, "ciao");
        // words.put(4, "banana");
        // words.put(5, "mela");
        // words.put(6, "ciao");
        // Map<String, Integer> wordsCount = new HashMap<>();
        // words.values().forEach(key -> {
        // int count = wordsCount.getOrDefault(key, 0);
        // count++;
        // wordsCount.put(key, count);
        // });
        // wordsCount.forEach((word, count) -> System.out.println(word + " " + count));
        // String topWord = null;
        // Integer maxCount = 0;
        // for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
        // String word = entry.getKey();
        // Integer count = entry.getValue();
        // if (count > maxCount) {
        // maxCount = count;
        // topWord = word;
        // }
        // }
        // System.out.println("Parola più frequente: " + topWord);

        Map<Integer, List<String>> people = new HashMap<>();
        people.putIfAbsent(28, new ArrayList<>()); // creo lista solo se non esiste
        people.get(28).add("Mario");
        people.get(28).add("Anna");
        people.put(30, new ArrayList<>());
        people.get(30).add("Luca");

        Map<Integer, List<String>> invertedPeople = new HashMap<>();

        for (Map.Entry<Integer, List<String>> entry : people.entrySet()) {
            int key = entry.getKey();
            List<String> listOfPeople = entry.getValue();

            for (String person : listOfPeople) {
                if (!invertedPeople.containsKey(key)) {
                    invertedPeople.put(key, new ArrayList<>());

                }
                invertedPeople.get(key).add(person);
            }

        }

        for (Map.Entry<Integer, List<String>> entry : invertedPeople.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // for (Map.Entry<Integer, String> entry : people) {
        // System.out.println(entry);
        // }

    }

    // Qui usi Map + ArrayList insieme (molto importante)
    // nome -> voto
    // Mario -> 28
    // Luca -> 30
    // Anna -> 28

    // Ottieni:
    // 28 -> [Mario, Anna]
    // 30 -> [Luca]

    // 🥪 Snack 3 — Trova l’elemento più frequente (Map + logica)
    // Dalla mappa dello snack 2, trova la parola più frequente.
    // Output:
    // Parola più frequente: ciao
    // 👉 Ti alleni su:
    // iterazione su entrySet
    // confronto valori

    // Snack 2 — Conta quante volte appare ogni parola (Map)
    // Input:
    // ["ciao", "mela", "ciao", "banana", "mela", "ciao"]
    // Output:
    // ciao -> 3
    // mela -> 2
    // banana -> 1

}
