import java.util.Random;
import java.util.Scanner;

public class Opgave6 {
  /*
  Skriv et program, der vælger bogstavet A eller B. Brugeren har én mulighed for at gætte det.
  Programmet skal oplyse om gættet var korrekt.
  */

  public static void main(String[] args) {
    char letter;
    char guess;
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    letter = (char)(random.nextInt(2) + 'A');

    System.out.println("Try to guess whether I'm thinking of A or B: ");
    guess = in.nextLine().toUpperCase().charAt(0);

    System.out.println("That's " + (letter == guess ? "correct." : "not correct."));
    System.out.printf("I was thinking of %s", letter);
  }
}
