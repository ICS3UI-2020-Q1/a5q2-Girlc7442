import java.util.Scanner;

/**
 * Counts up to the users number with commas inbetween
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user for a positive integer
    System.out.println("Please enter a positive integer");
    int userNumber = input.nextInt();

    //loop will run until it is 1 less than the users number
    for(int i = 1; i < userNumber; i++){
      //loop action: prints i and then a comma to the screen
      System.out.print(i + ","); 
    }

    //prints the users number to the screen without a comma
    System.out.print(userNumber);
    
  }
}
