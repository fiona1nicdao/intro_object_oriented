package indexOf;
import java.util.Scanner;

class Main {  

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    boolean askForNumber = true;
    
    while (askForNumber) {
      System.out.print("\nEnter a non negative integer: ");
      int number = keyboard.nextInt();
      askForNumber = (number >= 0 );
      if (askForNumber) {
      if (number%2 == 0) {
        System.out.println("\nThat was an even number.");
      } else {
        System.out.println("\nThat was an odd number.");
      }
      }
    }
    }
}