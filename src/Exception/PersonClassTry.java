
public class PersonClassTry {

    public static void main(String[] args) {
        // System.out.println("Sono la classe eccezione");
        PersonClassTry personClassTry = new PersonClassTry();
        personClassTry.firstPerson();
        System.out.println("Ho chiamato la prima persona?");
    }

    public void fourthPerson() {
        int a = 10;
        int b = 0;
        int result = a / b;
    }

    public void thirdPerson() {
        fourthPerson();
        System.out.println("Chiamo la quarta persona?");
    }

    public void secondPerson() {
        thirdPerson();
        System.out.println("Chiamo la terza persona?");
    }

    public void firstPerson() {
        // secondPerson();
        // System.out.println("Chiamo la seconda persona?"); // DECIDO DI GESTIRE LA TRY
        // CATCH ARITHMETICS QUI;
        try {
            secondPerson();
            System.out.println("Chiamo la seconda persona?");
        } catch (ArithmeticException arithmeticEx) {
            System.out.println("Non puoi dividere per zero");
        }
    };

}