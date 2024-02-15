import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        Boolean rispostaquadrata = true;
        int length1 = 0;
        int length2 = 0;
        int[] array1 = new int[length1];
        int[] array2 = new int[length2];


        System.out.println(" ");
        System.out.println("1.caricamento tastiera");
        System.out.println("2.caricamento random");
        System.out.println("3.visualizzazione//NON DISPONIBILE");
        System.out.println("4.aggiungi un elemento//NON DISPONIBILE");
        System.out.println("5.cancella un elemento//NON DISPONIBILE");
        System.out.println("6.Esci");


        int answer = in.nextInt();

        switch (answer) {
            case 1:
                System.out.println("Inserisci la lunghezza dell'array");
                length1 = in.nextInt();
                for (int i = 0; i < length1; i++) {
                    System.out.println("Inserisci il primo numero dell'array");
                    array1[i] = in.nextInt();
                }
                break;

            case 2:
                System.out.println("Questo è l'array con gli elementi randomizzati:");
                System.out.println("Inserisci la lunghezza dell'array");
                length2 = in.nextInt();
                array2 = new int[length2];
                for (int i = 0; i < length2; i++) {
                    array2[i] = rnd.nextInt(length2) + 1;
                }
                break;

            case 3:
            case 4:
            case 5:
            case 6:
                break;

        }

            if (answer == 1) {
                do {
                    System.out.println(" ");
                    System.out.println("//NON DISPONIBILE//");
                    System.out.println("//NON DISPONIBILE//");
                    System.out.println("3.visualizzazione");
                    System.out.println("4.aggiungi un elemento");
                    System.out.println("5.cancella un elemento");
                    System.out.println("6.Esci");

                    int answer2 = in.nextInt();

                    switch (answer2) {
                        case 3:
                            for (int i = 0; i < 10; i++) {
                                System.out.print(array1[i] + " ");
                            }
                            break;

                        case 4:
                            System.out.println("Dove vorresti aggiungere un elemento dell'Array? (Scrivi il numero della posizione)");
                            int posizione = in.nextInt();
                            System.out.println("Inserisci l'elemento che vorresti aggiungere");
                            array1[posizione] = in.nextInt();
                            break;

                        case 5:

                            System.out.println(" ");
                            System.out.println("Quale elemento dell'Array vorresti cancellare? (Scrivi il numero della posizione)");
                            int posizione1 = in.nextInt();

                            System.out.println("Inserisci l'elemento che vorresti cancellare");
                            array1[posizione1] = length1 - 1;
                            break;

                        case 6:
                            rispostaquadrata = false;
                            break;
                    }


                } while (rispostaquadrata);
            } else if (answer == 2) {
                do {
                    System.out.println(" ");
                    System.out.println("//NON DISPONIBILE//");
                    System.out.println("//NON DISPONIBILE//");
                    System.out.println("3.visualizzazione");
                    System.out.println("4.aggiungi un elemento");
                    System.out.println("5.cancella un elemento");
                    System.out.println("6.Esci");

                    int answer2 = in.nextInt();

                    switch (answer2) {
                        case 3:
                            for (int i = 0; i < length2; i++) {
                                System.out.print(array2[i] + " ");
                            }
                            break;

                        case 4:
                            System.out.println("Dove vorresti aggiungere un elemento dell'Array? (Scrivi il numero della posizione)");
                            int posizione = in.nextInt();
                            System.out.println("Inserisci l'elemento che vorresti aggiungere");
                            array2[posizione] = in.nextInt();
                            break;

                        case 5:

                            System.out.println(" ");
                            System.out.println("Quale elemento dell'Array vorresti cancellare? (Scrivi il numero della posizione)");
                            int posizione1 = in.nextInt();
                            System.out.println("Inserisci l'elemento che vorresti cancellare");
                            array2[posizione1] = 0;
                            length2= length2-1;
                            break;

                        case 6:
                            rispostaquadrata = false;
                            break;
                    }
                }while (rispostaquadrata);
            }
    }
}
