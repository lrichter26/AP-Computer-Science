import java.util.Scanner;
public class Test {

  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      // Choose a random number from 0-100
      int goal = (int) (Math.random() * 101);
      int guesses = 0;
      int sum = 0;
      boolean end = false;
      int input;
      for (int i = 0; i < 5; i++) {
        end = false;
        goal = (int) (Math.random() * 101);
        sum += guesses;
        guesses = 0;
      while (!end) {
      // Ask the user to guess a number from 0 to 100
      guesses ++;
      System.out.println("next guess");
      // Get the first guess using scan.nextInt();
      input = scan.nextInt();

      // Loop while the guess does not equal the random number,
        if (input < goal) {
            System.out.println("Too low");
        }
        else if (input > goal) {
            System.out.println("Too high");
        }
          else {
              end = true;
          }
      }
      System.out.println("You got the number in " + guesses + " guesses!");
      System.out.println(" ");
      // If the guess is less than the random number, print out "Too low!"

      // If the guess is greater than the random number, print out "Too high!"

      // Get a new guess (save it into the same variable)


      // Print out something like "You got it!"


  }
  System.out.println("Average guesses is " + (sum / 5.0));
}
}

