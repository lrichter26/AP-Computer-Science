import java.util.Scanner;
public class AnimalGuessingGame {
	public static void main(String[] args) {
		System.out.println("Think of an animal and I will guess it");
		Scanner scan = new Scanner(System.in);
		System.out.println("Is it big?");
		String input = scan.nextLine();

		if (input.equals("y")) {
			System.out.println("Is it a mammal?");
			input = scan.nextLine();

			if (input.equals("y")) {
			 System.out.println("Is it aquatic?");
			 input = scan.nextLine();

			   if (input.equals("y")) {
					System.out.println("Is it a whale?");
				 }

				 else {
					System.out.println("Is it an elephant?");
				 }
			}

			else {
			  System.out.println("Is it aquatic?");
			  input = scan.nextLine();

			  if (input.equals("y")) {
				  System.out.println("Is it a shark?");
			  }
				else {
					System.out.println("Is it a reptile?");
					input = scan.nextLine();

					if (input.equals("y")) {
						System.out.println("Is it a crocodile?");
					}

					else {
						System.out.println("Is it an ostrich?");
					}
				}

			}
		}

		else {
			System.out.println("Is it a mammal?");
			input = scan.nextLine();

			if (input.equals("y")) {
				System.out.println("Is it aquatic?");
				input = scan.nextLine();

				if (input.equals("y")) {
					System.out.println("Is it a dolphin?");
				}
				else {
					System.out.println("Is it a bird?");
				}
			}

			else {
				System.out.println("Is it aquatic?");
				input = scan.nextLine();
				if (input.equals("y")) {
					System.out.println("Is it a fish?");
				}

				else {
					System.out.println("Is it a reptile?");
					input = scan.nextLine();

					if (input.equals("y")) {
						System.out.println("Is it a snake?");
					}

					else {
						System.out.println("Is it a chicken?");
					}
				}
			}
		}
		scan.close();
	}
}