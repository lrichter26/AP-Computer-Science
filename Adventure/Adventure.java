package Adventure;
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

      int gold = 0;
      boolean castleKey = false;
      boolean castle = false;
      boolean sword = false;
			boolean skipLocation = false;

      String command;
      Scanner scan = new Scanner(System.in);
      System.out.println("");
      System.out.println("");
      System.out.println("You wake up in a field. A dark forest is in the north, and a road runs east and west. To the south there is a large pit.");
      while (end == false) {
        invalid = false;
        command = scan.nextLine();
        command = command.toLowerCase();
					skipLocation = false;
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
					else if (command.equals("u") && uMove == true || command.equals("up") && uMove == true || command.equals("climb up") && uMove == true) {
          	playerZ += 1;
          	System.out.println("");
        	}
					else if (command.equals("g") || command.equals("gold") || command.equals("check gold")) {
          	System.out.println("You have " + gold + " gold.");
						skipLocation = true;
        	}
					else if (command.equals("take gold") || command.equals("l") || command.equals("loot") || command.equals("take coins") || command.equals("take loot")) {
            skipLocation = true;
          	if (!Loot.getLooted(playerX, playerY, playerZ)) {
              System.out.println("You take " + Loot.getLootAmount(playerX, playerY, playerZ) + " gold. You now have " + gold + " gold.");
              gold += Loot.takeLoot(playerX, playerY, playerZ);
            }
            else {
              System.out.println("There is nothing to loot!");
            }
        	}
          else {
            invalid = true;
          }

          nMove = false;
          sMove = false;
          eMove = false;
          wMove = false;
          dMove = false;
          uMove = false;

          if (invalid == true) {
            System.out.println("You cannot do that!");
          }
					else if (skipLocation) {
						System.out.println("");
					}
          else {
            if (playerX == 0 && playerY == 0) {
                System.out.println("You are in the field where you woke up. A dark forest is in the north, and a road runs east and west. To the south there is a large pit.");

                nMove = true;
                sMove = true;
                eMove = true;
                wMove = true;
            }
            else if (playerX == 0 && playerY == 1) {
                System.out.println("You are at the border of a dark forest. A path runs into the forest, and tall trees block east and west.");

                nMove = true;
                sMove = true;
            }
            else if (playerX == 0 && playerY == 2) {
                System.out.println("You continue. The trees are looming over you.");

                nMove = true;
                sMove = true;
            }
            else if (playerX == 0 && playerY == 3) {
                System.out.println("The path ends. The forest is too dense to keep going.");

                sMove = true;
            }
            else if (playerX == 1 && playerY == 0) {
                System.out.println("You walk down the road.");

                eMove = true;
                wMove = true;
            }
            else if (playerX == -1 && playerY == 0) {
                System.out.println("You walk down the road.");

                eMove = true;
                wMove = true;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == 0) {
                System.out.println("The large pit seems to have no bottom. A ladder goes down into the pit");

                nMove = true;
                sMove = true;
								dMove = true;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == -1) {
                System.out.println("You climb the ladder.");

								dMove = true;
								uMove = true;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == -2) {
                System.out.println("You climb the ladder. It is dim");

								dMove = true;
								uMove = true;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == -3) {
                System.out.println("You climb the ladder. It is dark");

								dMove = true;
								uMove = true;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == -4) {
                System.out.println("You climb the ladder. It is pitch black. You cannot see anything");

								dMove = true;
								uMove = true;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == -5) {
                System.out.println("The ladder ends. You can jump down, or climb back up.");


				        dMove = true;
				        uMove = true;
            }
            else if (playerX == 0 && playerY == -1 && playerZ == -6) {
                System.out.println("You fall for what seems like a long time. Eventually, you see a light below you. You have just enough time to see the bottom before you hit it.");
                System.out.println("What did you think was going to happen? Try for the real ending.");

                end = true;
            }
            else if (playerX == -2 && playerY == 0 && !castleKey) {
                System.out.println("A large castle is at the end of the road. There is a small door in the wall that is locked.");

                eMove = true;

                castle = true;
            }
            else if (playerX == -2 && playerY == 0 && castleKey) {
                System.out.println("A large castle is at the end of the road. There is a small door in the wall that you open with the key.");

                eMove = true;
                wMove = true;
            }
            else if (playerX == -3 && playerY == 0) {
                System.out.println("You enter the castle. There is a suit of armor with a sword. You take the sword.");
                
                eMove = true;

								sword = true;

            }
            else if (playerX == 2 && playerY == 0 && !sword) {
                System.out.println("A man stops you and tells you that there are bandits ahead. You cannot go further east on the road, but you notice a small footpath to the north");

                nMove = true;
                wMove = true;
            }
						else if (playerX == 2 && playerY == 0 && sword) {
							System.out.println("You continue on the road. There is a small footpath to the north. There is a bandit camp to the east.");

							nMove = true;
							eMove = true;
							wMove = true;
            }
            else if (playerX == 3 && playerY == 0 && !Loot.getLooted(playerX, playerY, playerZ)) {
              System.out.println("There is no one in the badit camp. There are various gold coins lying around.");

              eMove = true;
              wMove = true;

            }
            else if (playerX == 3 && playerY == 0) {
              System.out.println("There is no one in the badit camp.");

              eMove = true;
              wMove = true;
            }
            else if (playerX == 2 && playerY == 1) {
                System.out.println("There is a small hut in front of you. Nobody is inside");

                nMove = true;
                sMove = true;
            }
            else if (playerX == 2 && playerY == 2 && !castleKey && castle) {
                System.out.println("Inside the hut, you notice a key of the same shape as the lock on the door in the castle. You take the key.");

                sMove = true;

                castleKey = true;
            }

            else if (playerX == 2 && playerY == 2) {
              System.out.println("There are various keys inside the hut. Nothing catches your eye.");

              sMove = true;
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