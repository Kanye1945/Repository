import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.println("Inserisci la stringa n° " + (count + 1));
        String phrase = in.nextLine();
        String minString = phrase;
        String maxString = phrase;
        do {
            if (phrase.equalsIgnoreCase("Fine")) {
                break;
            }
            if (phrase.length() > maxString.length()) {
                maxString = phrase;
            }
            if (phrase.length() < minString.length()) {
                minString = phrase;
            }
            System.out.println("Inserisci la stringa n° " + (count + 1));
            phrase = in.nextLine();
            count++;
        } while (!phrase.equalsIgnoreCase("Fine"));
        if (count > 0) {
            System.out.println("La stringa inserita più lunga è " + maxString);
            System.out.println("La stringa inserita più corta è " + minString);
            System.out.println("Hai inserito " + count + " stringhe");
        } else {
            System.out.println("Non hai inserito nessuna stringa");
        }
    }
}