import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PersonClassThrows {

    public static void main(String[] args) {
        // System.out.println("Sono la classe eccezione");
        PersonClassThrows personClassThrows = new PersonClassThrows();
        personClassThrows.firstPerson();
        System.out.println("Ho chiamato la prima persona?");
    }

    public void fourthPerson() throws FileNotFoundException {
        int a = 10;
        int b = 0;
        int result = a / b;
        FileInputStream fileInputStream = new FileInputStream("");
    }

    public void thirdPerson() throws FileNotFoundException { // QUI DECIDIAMO SE PASSARE DI RESPONSABILITA LA GESTIONE
                                                             // DELL THROWS, LA PROPAGAZIONE, EXCEPTION PROPAGATION
        fourthPerson();
        System.out.println("Chiamo la quarta persona?");
    }

    public void secondPerson() throws FileNotFoundException {
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
        } catch (ArithmeticException | FileNotFoundException arithmeticEx) {
            System.out.println("Non puoi dividere per zero");
        }
    };

}
