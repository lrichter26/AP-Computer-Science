import java.util.Scanner;

public class Adventure
{
  public static void main(String[] args)
  {
      int playerY = 0;
      int playerX = 0;
	  	int playerZ = 0;
      boolean invalid = false;
      boolean end = false;
      boolean nMove = true;
      boolean sMove = true;
      boolean eMove = true;
      boolean wMove = true;
      boolean dMove = false;
      boolean uMove = false;
      boolean key = false;
			boolean banditKill = false;
      boolean castle = false;
      boolean sword = false;

      Scanner scan = new Scanner(System.in);
      System.out.println("");
      System.out.println("");
      System.out.println("You wake up in a field. A dark forest is in the north, and a road runs east and west. To the south there is a large pit.");
      while (end == false) {
        invalid = false;
        String command = scan.nextLine();

          if (command.equals("n") && nMove == true || command.equals("north") && nMove == true) {
              playerY += 1;
              System.out.println("");
          }
          else if (command.equals("s") && sMove == true || command.equals("south") && sMove == true) {
              playerY -= 1;
              System.out.println("");
          }
          else if (command.equals("e") && eMove == true || command.equals("east") && eMove == true) {
            playerX += 1;
            System.out.println("");
          }
          else if (command.equals("w") && wMove == true || command.equals("west") && wMove == true) {
            playerX -= 1;
            System.out.println("");
          }
        	else if (command.equals("d") && dMove == true || command.equals("down") && dMove == true || command.equals("climb down") && dMove == true) {
          	playerZ -= 1;
          	System.out.println("");
        	}
					else if (command.equals("u") && uMove == true || command.equals("up") && uMove == true || command.equals("climb up") && uMove == true) {
          	playerZ += 1;
          	System.out.println("");
        	}
          else {
            invalid = true;
          }

          if (invalid == true) {
            System.out.println("You cannot do that!");
          }
          else {
            if (playerX == 0 && playerY == 0) {
                System.out.println("You are in the field where you woke up. A dark forest is in the north, and a road runs east and west. To the south there is a large pit.");

                nMove = true;
                sMove = true;
                eMove = true;
                wMove = true;
								dMove = false;
								uMove = false;
            }
            else if (playerX == 0 && playerY == 1) {
                System.out.println("You are at the border of a dark forest. A path runs into the forest, and tall trees block east and west.");

                nMove = true;
                sMove = true;
                eMove = false;
                wMove = false;
								dMove = false;
								uMove = false;
            }
            else if (playerX == 0 && playerY == 2) {
                System.out.println("You continue. The trees are looming over you.");

                nMove = true;
                sMove = true;
                eMove = false;
                wMove = false;
								dMove = false;
								uMove = false;
            }
            else if (playerX == 0 && playerY == 3) {
                System.out.println("The path ends. The forest is too dense to keep going.");

                nMove = false;
                sMove = true;
                eMove = false;
                wMove = false;
								dMove = false;
								uMove = false;
            }
            else if (playerX == 1 && playerY == 0) {
                System.out.println("You walk down the road.");

                nMove = false;
                sMove = false;
                eMove = true;
                wMove = true;
								dMove = false;
								uMove = false;
            }
            else if (playerX == -1 && playerY == 0) {
                System.out.println("You walk down the road.");

                nMove = false;
                sMove = false;
                eMove = true;
                wMove = true;
								dMove = false;
								uMove = false;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == 0) {
                System.out.println("The large pit seems to have no bottom. A ladder goes down into the pit");

                nMove = true;
                sMove = true;
                eMove = false;
                wMove = false;
								dMove = true;
								uMove = false;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == -1) {
                System.out.println("You climb the ladder.");

                nMove = true;
                sMove = true;
                eMove = false;
                wMove = false;
								dMove = true;
								uMove = true;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == -2) {
                System.out.println("You climb the ladder. It is dim");

                nMove = false;
                sMove = false;
                eMove = false;
                wMove = false;
								dMove = true;
								uMove = true;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == -3) {
                System.out.println("You climb the ladder. It is dark");

                nMove = false;
                sMove = false;
                eMove = false;
                wMove = false;
								dMove = true;
								uMove = true;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == -4) {
                System.out.println("You climb the ladder. It is pitch black. You cannot see anything");

                nMove = false;
                sMove = false;
                eMove = false;
                wMove = false;
								dMove = true;
								uMove = true;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == -5) {
                System.out.println("The ladder ends. You can jump down, or climb back up.");

                nMove = false;
                sMove = false;
                eMove = false;
                wMove = false;
								dMove = true;
								uMove = true;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == -6) {
                System.out.println("You fall for what seems like a long time. Eventually, you see a light below you. You have just enough time to see the bottom before you hit it.");
                System.out.println("What did you think was going to happen? Try for the real ending.");

                end = true;
            }
            else if (playerX == -2 && playerY == 0 && key == false) {
                System.out.println("A large castle is at the end of the road. There is a small door in the wall that is locked.");

                nMove = false;
                sMove = false;
                eMove = true;
                wMove = false;
								dMove = false;
								uMove = false;

                castle = true;
            }
            else if (playerX == -2 && playerY == 0 && key == true) {
                System.out.println("A large castle is at the end of the road. There is a small door in the wall that you open with the key.");

                nMove = false;
                sMove = false;
                eMove = true;
                wMove = true;
								dMove = false;
								uMove = false;
            }
            else if (playerX == -3 && playerY == 0) {
                System.out.println("You enter the castle. There is a suit of armor with a sword. You take the sword.");
                
                nMove = false;
                sMove = false;
                eMove = true;
                wMove = false;
								dMove = false;
								uMove = false;

								sword = true;

            }
            else if (playerX == 2 && playerY == 0 && sword == false) {
                System.out.println("A man stops you and tells you that there are bandits ahead. You cannot go further east on the road, but you notice a small footpath to the north");

                nMove = true;
                sMove = false;
                eMove = false;
                wMove = true;
								dMove = false;
								uMove = false;
            }
						else if (playerX == 2 && playerY == 0 && sword == true) {
							System.out.println("You continue on the road. There is a small footpath to the north.");

							nMove = true;
							sMove = false;
							eMove = true;
							wMove = true;
							dMove = false;
							uMove = false;
					}
					else if (playerX == 3 && playerY == 0 && banditKill == false) {
						System.out.println("T");

						nMove = false;
						sMove = false;
						eMove = true;
						wMove = true;
						dMove = false;
						uMove = false;
				}
            else if (playerX == 2 && playerY == 1) {
                System.out.println("There is a small hut in front of you. Nobody is inside");

                nMove = true;
                sMove = true;
                eMove = false;
                wMove = false;
								dMove = false;
								uMove = false;
            }
            else if (playerX == 2 && playerY == 2 && key == false && castle == true) {
                System.out.println("Inside the hut, you notice a key of the same shape as the lock on the door in the castle. You take the key.");

                nMove = false;
                sMove = true;
                eMove = false;
                wMove = false;
								dMove = false;
								uMove = false;

                key = true;
            }
            else if (playerX == 2 && playerY == 2 && castle == false) {
                System.out.println("There are various keys inside the hut. Nothing catches your eye.");

                nMove = false;
                sMove = true;
                eMove = false;
                wMove = false;
								dMove = false;
								uMove = false;
            }
            else if (playerX == 2 && playerY == 2 && key == true) {
                System.out.println("You have already taken the key.");

                nMove = false;
                sMove = true;
                eMove = false;
                wMove = false;
								dMove = false;
								uMove = false;
            }
            else {
                System.out.println("Out of bounds! Returning player to start.");

                playerX = 0;
                playerY = 0;

                nMove = true;
                sMove = true;
                eMove = true;
                wMove = true;
								dMove = false;
								uMove = false;

                System.out.println("You wake up in a field. A dark forest is in the north, and paths lead east and west. To the south there is a large pit.");
            }
          }

        }
				System.out.println("");
      scan.close();
    }
}