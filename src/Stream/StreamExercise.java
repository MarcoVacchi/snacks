package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise {
    public static void main(String[] args) {

        ///////// SNACK 1
        // STAMPA LISTA IN MAIUSCOLO
        // List<String> names = new ArrayList(List.of("luca", "marco", "anna"));
        // List<String> names = new ArrayList<>(); // DELEGO L AGGIUNTA AL METODO SOTTO
        // addedToList(names);
        // upperList(names);
        ///////// SNACK 1

        ///////// SNACK 2
        // names.add("lorenzo");
        // Tieni solo i nomi che iniziano con "L".
        ///////// SNACK 2
        // listWithL(names);
        ///////// SNACK 2

        ///////// SNACK 3
        // Ottieni solo i numeri maggiori di 5.
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 11, 13));
        // numbers.forEach(System.out::println);
        // numberFive(numbers);
        ///////// SNACK 3

        ///////// SNACK 4
        // Stessa lista di snack 3(non filtrato).
        // Ottieni i numeri moltiplicati per 3.
        numberMulti(numbers);
        ///////// SNACK 4

        ///////// SNACK 5
        // Ottieni la lunghezza di ogni parola → List<Integer>.
        List<String> worlds = new ArrayList<>(Arrays.asList("ciao", "sole", "mareeee"));
        worldLength(worlds);

        ///////// SNACK 5

        ///////// SNACK 6
        // Nomi che iniziano con L e in maiuscolo.
        List<String> people = new ArrayList<>(Arrays.asList("Luca", "Marco", "Anna", "lorenzo"));
        peopleUpperWithL(people);
        ///////// SNACK 6

        ///////// SNACK 7
        // Solo pari, moltiplicati per 2.
        List<Integer> numbersRandom = new ArrayList<>(Arrays.asList(3, 7, 10, 2, 15));
        numberOperation(numbersRandom);
        ///////// SNACK 7

        ///////// SNACK 8

        ///////// SNACK 8

    }

    ////// METODI//////

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

///////// SNACK 2

///////// SNACK 2

// Snack 8
// List<String> parole = new ArrayList<>(List.of("ciao", "sole", "mare", "si"));

// 👉 Parole con lunghezza > 3 → in maiuscolo.

// 🥇 LIVELLO 3 — toSet (duplicati)
// Snack 9
// List<String> nomi = new ArrayList<>(List.of("Luca", "Marco", "Luca",
// "Anna"));

// 👉 Ottieni i nomi unici.

// Snack 10

// Stessa lista.

// 👉 Nomi unici in maiuscolo.

// 🏆 LIVELLO 4 — toMap (qui si capisce tutto)
// Snack 11
// List<String> nomi = new ArrayList<>(List.of("Luca", "Marco", "Anna"));

// 👉 Mappa: nome → lunghezza nome.

// Snack 12
// List<Integer> numeri = new ArrayList<>(List.of(3, 7, 10));

// 👉 Mappa: numero → numero * 2.

// Snack 13 (duplicati!)
// List<String> nomi = new ArrayList<>(List.of("Luca", "Anna", "Luca"));

// 👉 Mappa: nome → lunghezza, gestendo il duplicato.

// 🚀 LIVELLO 5 — iniziano a sembrare “stream veri”
// Snack 14
// List<String> nomi = new ArrayList<>(List.of("luca", "marco", "anna",
// "marco"));

// 👉 Maiuscoli, unici, in lista.

// Snack 15
// List<Integer> numeri = new ArrayList<>(List.of(5, 12, 3, 18, 7));

// 👉 Numeri > 6, ordinati, in lista.

// (usa sorted())

// Snack 16
// List<String> parole = new ArrayList<>(List.of("ciao", "mare", "sole"));

// 👉 Mappa: parola → parola in maiuscolo.

// Snack 17
// List<String> parole = new ArrayList<>(List.of("ciao", "mare", "sole", "si"));

// 👉 Solo parole > 3 lettere → mappa parola → lunghezza.

// 🧠 LIVELLO 6 — quelli che ti fanno “scattare”
// Snack 18
// List<Integer> numeri = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

// 👉 Solo dispari → quadrato → lista.

// Snack 19
// List<String> nomi = new ArrayList<>(List.of("Luca", "Marco", "Anna"));

// 👉 Lista di stringhe tipo: "Nome: LUCA"

// Snack 20
// List<String> nomi = new ArrayList<>(List.of("Luca", "Marco", "Luca",
// "Anna"));

// 👉 Mappa: nome → quante volte appare.