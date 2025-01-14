import java.util.*;
public class ArrayCode {
    public static void main (String[] args) {
        /*int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = i*2+2;
        }
        for (int i : array) {
            System.out.print(i + ", ");
        }
            */
        String[] names = {"Levi", "Micah", "Silas", "Jong-In"};
        String input = "y";
        Scanner scan = new Scanner(System.in);
        while (input.equals("y")) {
            System.out.println(names[(int) (Math.random()*names.length)]);
            input = scan.nextLine();
        }
    }
}
