import java.util.Scanner;

public class Opgave4 {
  /*
  Skriv et program, der først spørger hvilken måned vi befinder os i (brugeren indtaster et tal mellem 1 og 12).
  Brugeren skal indtaste en lovlig værdi – i modsat fald skal programmet ikke gøre mere.
  Forudsat at brugerens input er lovligt, skal programmet nu fortælle hvor mange dage der er i
  den pågældende måned. Se tabellen til højre. I første omgang kan du lade februar have 28 dage,
  indtil programmet virker korrekt – dernæst kan du knække nødden med skudår.
   */

  public static void main(String[] args) {
    int month;
    int year = -1;
    int daysOfMonth;
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter month (1-12): ");
    month = in.nextInt();
    in.nextLine(); // Scanner bug

    if (month == 2) {
      System.out.print("Since you entered February, please enter the year: ");
      year = in.nextInt();
      in.nextLine(); // Scanner bug
    }

    switch (month) {
      case 1, 3, 5, 7, 8, 10, 12 -> daysOfMonth = 31;
      case 2 -> {
        if (year % 4 == 0)
          daysOfMonth = 29;
        else
          daysOfMonth = 28;
      }
      default -> daysOfMonth = 30;
    }

    System.out.printf("That month has %d days in it.", daysOfMonth);
  }
}
