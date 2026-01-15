public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(isPalindrome("ciao"));
        // int[] num = { 1, 2, 3, 4, 5, -1 };
        // for (int i : minMax(num)) {
        // System.out.println(i);
        // }
        // System.out.println(oddOrEven(2));

        System.out.println(isPalindrome("abba"));
    }

    // Uso di array e cicli for classici

    // Scrivere un metodo che verifichi se una parola è palindroma.
    public static boolean isPalindrome(String parola) {
        char[] parolaInvertita = parola.toCharArray();
        char[] result = new char[parolaInvertita.length];
        char[] parolaDritta = parola.toCharArray();
        int j = 0;
        boolean isPal = true;

        for (int i = parolaInvertita.length - 1; i >= 0; i--) {
            result[j++] = parolaInvertita[i];
        }

        for (int i = 0; i < parolaDritta.length; i++) {
            if (result[i] != parolaDritta[i]) {
                isPal = false;
            }
        }

        return isPal;
    }
}

// // Scrivi un metodo che conta quante volte compare un carattere in una
// stringa.

// public static int countTime(String parola, char character) {
// int count = 0;
// char[] array = parola.toCharArray();
// for (int i = 0; i < array.length; i++) {
// if (array[i] == character) {
// count++;
// }
// }

// return count;
// }

// // public static boolean isPalindrome(String parola) {
// // char[] parolaInvertita = parola.toCharArray();
// // char[] result = new char[parolaInvertita.length];
// // char[] parolaDritta = parola.toCharArray();
// // int j = 0;
// // boolean isPal = true;

// // for (int i = parolaInvertita.length - 1; i >= 0; i--) {
// // result[j++] = parolaInvertita[i];
// // }

// // for (int i = 0; i < parolaDritta.length; i++) {
// // if (result[i] != parolaDritta[i]) {
// // isPal = false;
// // }
// // }

// // return isPal;
// // }

// // public static String oddOrEven(int number) {
// // String odd = "Pari";
// // String even = "Dispari";
// // String result = number % 2 == 0 ? odd : even;

// // return result;
// // }

// // public static int[] minMax(int[] number) {

// // int max = number[0];
// // int min = number[0];

// // for (int i = 0; i < number.length; i++) {
// // if (number[i] > max) {
// // max = number[i];
// // } else if (number[i] < min) {
// // min = number[i];
// // }
// // }

// // int[] arrayResult = new int[] { max, min };
// // return arrayResult;
// // }

// // public static String invertiStringa(String parola) {

// // char[] parolaInvertita = parola.toCharArray();
// // String result = "";

// // for (int i = parolaInvertita.length - 1; i >= 0; i--) {
// // result += parolaInvertita[i];
// // }

// // return result;
// // }

// }

// // Scrivi un metodo che inverte una stringa. ok

// // Scrivi un metodo che verifica se una parola è palindroma. ok

// // Dato un array di interi, trova il valore massimo e il minimo. ok

// // Dato un numero intero, verifica se è pari o dispari. ok

// // Scrivi un metodo che calcola la somma dei primi N numeri naturali.

// // ☕ Java Core

// // Scrivi un metodo che conta quante volte compare un carattere in una
// stringa.

// // Spiega e mostra con codice la differenza tra == ed equals().

// // Scrivi un metodo che rimuove i duplicati da una lista di interi.

// // Dato un array di stringhe, restituisci la stringa più lunga.

// // Scrivi un metodo che converte una stringa in int gestendo eventuali errori