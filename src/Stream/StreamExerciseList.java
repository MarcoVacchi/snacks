package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExerciseList {
    public static void main(String[] args) {

        ///////// SNACK 1
        // STAMPA LISTA IN MAIUSCOLO
        // List<String> names = new ArrayList(List.of("luca", "marco", "anna"));
        // List<String> names = new ArrayList<>(); // DELEGO L AGGIUNTA AL METODO SOTTO
        // addedToList(names);
        // upperList(names);
        ///////// SNACK 1

        System.out.println("=======================================");

        ///////// SNACK 2
        // names.add("lorenzo");
        // Tieni solo i nomi che iniziano con "L".
        ///////// SNACK 2
        // listWithL(names);
        ///////// SNACK 2

        System.out.println("=======================================");

        ///////// SNACK 3
        // Ottieni solo i numeri maggiori di 5.
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 11, 13));
        // numbers.forEach(System.out::println);
        // numberFive(numbers);
        ///////// SNACK 3

        System.out.println("=======================================");

        ///////// SNACK 4
        // Stessa lista di snack 3(non filtrato).
        // Ottieni i numeri moltiplicati per 3.
        numberMulti(numbers);
        ///////// SNACK 4

        System.out.println("=======================================");

        ///////// SNACK 5
        // Ottieni la lunghezza di ogni parola → List<Integer>.
        List<String> worlds = new ArrayList<>(Arrays.asList("ciao", "sole", "mareeee"));
        worlds.add("cao");
        worldLength(worlds);
        ///////// SNACK 5

        System.out.println("=======================================");

        ///////// SNACK 6
        // Nomi che iniziano con L e in maiuscolo.
        List<String> people = new ArrayList<>(Arrays.asList("Luca", "Marco", "Anna", "lorenzo"));
        peopleUpperWithL(people);
        ///////// SNACK 6

        System.out.println("=======================================");

        ///////// SNACK 7
        // Solo pari, moltiplicati per 2.
        List<Integer> numbersRandom = new ArrayList<>(Arrays.asList(3, 7, 10, 2, 15));
        numberOperation(numbersRandom);
        ///////// SNACK 7

        System.out.println("=======================================");

        ///////// SNACK 8
        // Parole con lunghezza > 3 → in maiuscolo.
        // List<String> worlds = new ArrayList<>(Arrays.asList("ciao", "sole", "mare",
        // "si")); VARIABILE GIA USATA, UTILIZZO QUELLA VECCHIA(SNACK 5)
        // AGGIUNGENDO/MODIFICANDO
        worlds.set(2, "Mare");
        worlds.add("Si");
        // worlds.forEach(System.out::println);
        peopleUpperWithLength(worlds);
        ///////// SNACK 8

        System.out.println("=======================================");

        ///////// SNACK 9
        // togli i duplicati
        List<String> peopleDuplicate = new ArrayList<>(
                Arrays.asList("Luca", "Marco", "Anna", "lorenzo", "lorenzo", "lorenzo"));
        // uniqueNames(peopleDuplicate);
        ///////// SNACK 9

        System.out.println("=======================================");

        ///////// SNACK 10
        // Stessa lista. Nomi unici in maiuscolo.
        uniqueNamesUpperList(peopleDuplicate);
        uniqueNamesUpperSet(peopleDuplicate);

        ///////// SNACK 10

    }
    ////// METODI//////

    ///////// SNACK 10
    public static List<String> uniqueNamesUpperList(List<String> peopleSet) {
        List<String> resultPeople = peopleSet.stream()
                .collect(Collectors.toSet())
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        for (String resultPeople2 : resultPeople) {
            System.out.println(resultPeople2);
        }

        return resultPeople;
    }

    public static Set<String> uniqueNamesUpperSet(List<String> peopleSet) {
        Set<String> resultPeople = peopleSet.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        for (String resultPeople2 : resultPeople) {
            System.out.println(resultPeople2);
        }

        return resultPeople;
    }
    ///////// SNACK 10

    //////// SNACK 9
    public static List<String> uniqueNames(List<String> peopleSet) {
        // Set<String> resultPeople = peopleSet.stream()
        // .collect(Collectors.toSet()); // SE RITORNO UN SET
        List<String> resultPeople = peopleSet.stream()
                .collect(Collectors.toSet())
                .stream()
                .collect(Collectors.toList());
        resultPeople.forEach(System.out::println); // NO ORDINATA
        // List<String> resultPeople = peopleSet.stream()
        // .collect(Collectors.toCollection(LinkedHashSet::new)) MANTIENE L ORDINE,
        // METHOD REFERENCE
        // .stream()
        // .collect(Collectors.toList());
        // List<String> resultPeople = peopleSet.stream()
        // .collect(Collectors.toCollection(() -> new LinkedHashSet<>())) MANTIENE L
        // ORDINE,
        // LAMBDA VERSION
        // .stream()
        // .collect(Collectors.toList());
        return resultPeople;
    }
    ///////// SNACK 9

    ///////// SNACK 8
    public static List<String> peopleUpperWithLength(List<String> peopleList) {
        List<String> resultPeople = peopleList.stream()
                .filter(person -> person.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        resultPeople.forEach(System.out::println);
        return resultPeople;
    }
    ///////// SNACK 8

    ///////// SNACK 7
    public static List<Integer> numberOperation(List<Integer> numbersList) {
        List<Integer> numbersResult = numbersList.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .collect(Collectors.toList());
        numbersResult.forEach(System.out::println);

        return numbersResult;
    }
    ///////// SNACK 7

    ///////// SNACK 6
    public static List<String> peopleUpperWithL(List<String> peopleList) {
        List<String> resultPeople = peopleList.stream()
                .filter(c -> c.startsWith("L"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        resultPeople.forEach(System.out::println);
        return resultPeople;
    }
    ///////// SNACK 6

    ///////// SNACK 5
    public static List<Integer> worldLength(List<String> listWorlds) {
        List<Integer> lengthCount = listWorlds.stream()
                // .map(world -> world.length()) // LAMBDA
                .map(String::length) // METHOD REFERENCE
                .collect(Collectors.toList());
        lengthCount.forEach(System.out::println);

        return lengthCount;
    }
    ///////// SNACK 5

    ///////// SNACK 4
    public static List<Integer> numberMulti(List<Integer> numbersList) {

        List<Integer> numbersResult = numbersList.stream()
                .map(num -> num * 3)
                .collect(Collectors.toList());

        numbersResult.forEach(System.out::println);

        return numbersResult;
    }
    ///////// SNACK 4

    ///////// SNACK 3
    public static List<Integer> numberFive(List<Integer> numbersList) {
        List<Integer> resultNumbers = numbersList.stream()
                .filter(num -> num > 5)
                .collect(Collectors.toList());
        resultNumbers.forEach(number -> {
            System.out.println(number);
        });
        return resultNumbers;
    }
    ///////// SNACK 3

    ///////// SNACK 2
    public static List<String> listWithL(List<String> listPeopleWithL) {
        List<String> namesWithL = listPeopleWithL.stream()
                .filter(c -> c.startsWith("l"))
                .collect(Collectors.toList());
        namesWithL.forEach(System.out::println);
        return namesWithL;
    }
    ///////// SNACK 2

    ////// SNACK 1
    public static List<String> upperList(List<String> listPeople) {

        // POSSO OMETTERE LAMBDA EXPRESSION -> E UTILIZZARE METHOD REFERENCE
        List<String> namesUpper = listPeople.stream()
                // .map(person -> person.toUpperCase()) //LAMBDA
                .map(String::toUpperCase) // RISULTATO MEDESIMO
                .collect(Collectors.toList());
        // namesUpper.forEach(System.out::println); // METHOD REFERENCE ANCHE NEL
        // PRINTLN
        namesUpper.forEach(person -> {
            System.out.println(person);
        });
        return namesUpper;
    }

    public static List<String> addedToList(List<String> listPeopleWithAdd) {
        listPeopleWithAdd.add("luca");
        listPeopleWithAdd.add("marco");
        listPeopleWithAdd.add("anna");
        return listPeopleWithAdd;
    }
    ///////// SNACK 1
}
