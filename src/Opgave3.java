import java.util.Scanner;

public class Opgave3 {
  /*
  Skriv et program, der beder om brugerens navn. Programmet skal dernæst oplyse
  hvorvidt navnet starter med en konsonant eller en vokal.
   */

  public static void main(String[] args) {
    char firstLetter;
    Scanner in = new Scanner(System.in);

    System.out.print("What is your name? ");
    firstLetter = in.nextLine().toLowerCase().charAt(0);

    switch (firstLetter) {
      case 'a', 'e', 'i', 'o', 'u', 'y', 'æ', 'ø', 'å' -> System.out.println("VOWEL!");
      default -> System.out.println("CONSONANT!");
    }
  }
}
