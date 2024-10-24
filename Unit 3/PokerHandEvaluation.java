public class PokerHandEvaluation {
    public static void main(String[] args) {


        int[] hand = {5,5,10,10,10};


        if (hand[0] == hand[1] && hand[1] == hand[2] && hand[2] == hand[3] || hand[1] == hand[2] && hand[2] == hand[3] && hand[3] == hand[4]) {
            System.out.println("Four of a kind");
        }
        else if (hand[0] == hand[1] && hand[1] == hand[2] && hand[3] == hand[4] || hand[0] == hand[1] && hand[2] == hand[3] && hand[3] == hand[4]) {
            System.out.println("Full house");
        }
        else if (hand[0] + 1 == hand[1] && hand[1] + 1 == hand[2] && hand[2] + 1 == hand[3] && hand[3] + 1 == hand[4]) {
            System.out.println("Straight");
        }
        else if (hand[0] == hand[1] && hand[1] == hand[2] || hand[1] == hand[2] && hand[2] == hand[3] || hand[2] == hand[3] && hand[3] == hand[4]) {
            System.out.println("Three of a kind");
        }
        else if (hand[0] == hand[1] && hand[2] == hand[3] || hand[0] == hand[1] && hand[3] == hand[4] || hand[1] == hand[2] && hand[3] == hand[4]) {
            System.out.println("Two pair");
        }
        else if (hand[0] == hand[1] || hand[1] == hand[2] || hand[2] == hand[3] || hand[3] == hand[4]) {
            System.out.print("Pair");
        }
        else {
            System.out.println("High card");
        }
    }
}
