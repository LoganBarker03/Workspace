import java.util.*;

public class Main {
  public static Scanner input = new Scanner(System.in);
  public static HashMap<Integer, String> map = new HashMap<>();

  public static void fillMap() {
    System.out.println("What is your favorate food? ");
    map.put(0, input.nextLine());
    System.out.println("What is your second favorate dessert? ");
    map.put(1, input.nextLine());
    System.out.println("What is your third favorate drink? ");
    map.put(2, input.nextLine());
    System.out.print("Press enter to continue...");
    input.nextLine();
  }

  public static void printMap() {
    System.out.print("\033\143");
    System.out.println(map);
    System.out.print("Press enter to continue...");
    input.nextLine();
  }

  public static void main(String[] args) {
    while (1 == 1) {
      System.out.print("\033\143");
      fillMap();
      printMap();

    }
  }
}
