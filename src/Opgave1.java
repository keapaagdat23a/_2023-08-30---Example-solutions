import java.util.Scanner;

public class Opgave1 {
  /*
  Skriv et program, som spørger om brugerens navn. Programmet skal reagere med en personlig hilsen,
  medmindre brugeren ikke har indtastet noget – i dette tilfælde skal det bare skrive ”Hej med dig”.
   */
  public static void main(String[] args) {
    String name;
    Scanner in = new Scanner(System.in);

    System.out.print("What is your name? ");
    name = in.nextLine();

    if (name.equals(""))
      System.out.println("Hey, you!");
    else
      System.out.printf("Hey, %s", name);
  }
}
