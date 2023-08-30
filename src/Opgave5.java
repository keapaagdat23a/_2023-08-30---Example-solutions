import java.util.Scanner;

public class Opgave5 {
  /*
  Skriv et program, der spørger om et tal og dernæst oplyser om tallet er lige eller ulige.
   */

  public static void main(String[] args) {
    int number;
    Scanner in = new Scanner(System.in);
    String oddOrEvenText;

    System.out.print("Please enter an integer: ");
    number = in.nextInt();
    in.nextLine(); // Scanner bug


    if (number % 2 == 0)
      oddOrEvenText = "even";
    else
      oddOrEvenText = "odd";

    System.out.printf("The number %d is %s.", number, oddOrEvenText);
  }
}
