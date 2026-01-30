package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ExerciseList {
    // SNACK 1
    // Rimuovi duplicati
    // mantenendo l’ordine (ArrayList)
    // Hai:
    // [ "mela", "pera", "mela", "banana", "pera", "kiwi" ]
    // Vuoi ottenere:
    // [ "mela", "pera", "banana", "kiwi" ]

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("mela");
        fruits.add("pera");
        fruits.add("mela");
        fruits.add("banana");
        fruits.add("pera");
        fruits.add("kiwi");
        for (String fruit : fruitssWithoutDuplicate(fruits)) {
            System.out.println(fruit);
        }
    }

    public static List<String> fruitssWithoutDuplicate(List<String> fruitList) {
        List<String> fruitsWithoutDuplicate = new ArrayList<>();
        for (String fruit : fruitList) {
            if (!fruitsWithoutDuplicate.contains(fruit)) {
                fruitsWithoutDuplicate.add(fruit);
            }
        }
        return fruitsWithoutDuplicate;
    }
}