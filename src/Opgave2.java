import java.util.Scanner;

public class Opgave2 {
  /*
  Skriv et program, som beder om brugerens navn og alder. Programmet skal svare ”Hej Patrick på 23” e.lign.
  Nogle gange kommer en bruger dog til at skrive et ciffer for meget foran sin alder, fx 123,
  så når alderen er på tre cifre, skal det ignorere det første ciffer.
   */

  public static void main(String[] args) {
    String name;
    int age;
    Scanner in = new Scanner(System.in);

    System.out.print("What is your name? ");
    name = in.nextLine();
    System.out.print("What is your age? ");
    age = in.nextInt();
    in.nextLine(); // Scanner bug

    if (age > 99) {
      age = age % 100;
      System.out.printf("%s, I assume you are %d years old.", name, age);
    } else {
      System.out.printf("%s, you are %d years old.", name, age);
    }
  }
}
