import java.util.Scanner;

public class Opgave7 {
  /*
  Skriv et program, der spørger om et tal. Programmet skal skrive kvadratroden af brugerens indtastning
  (brug Math-klassen til dette).
  Programmet skal fortsætte, indtil brugeren taster 0.
   */

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double number = -1;

    while (number != 0) {
      System.out.print("Please enter a number: ");
      number = in.nextDouble();
      in.nextLine(); // Scanner bug
      System.out.printf("The square root is %f.%n%n", Math.sqrt(number));
    }
  }
}
