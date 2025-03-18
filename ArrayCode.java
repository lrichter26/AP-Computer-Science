import java.util.*;
public class ArrayCode {
    public static void main (String[] args) {
        ArrayList<String> favorites = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String input = "";
        System.out.print("\033[H\033[2J");
        while (!input.equals("q")) {
            System.out.println();
            System.out.println("What is your favorite class?");
            input = scan.nextLine();
            favorites.add(input);
        }
        favorites.remove(favorites.size() - 1);
        System.out.println();
        System.out.println(favorites);
        for (String val : favorites) {
            System.out.println(val);
        }
    }
}
