public class Looping {
    public static void printStars(int n, int m) {
        for (int x = 0; x < n; x ++) {
            for (int i = 0; i < m; i ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void printDice(int n) {
        for (int x = 0; x < n; x++) {
            for (int i = 1; i < n; i++) {
                System.out.println("(" + n + ", " + i + ")");
            }
        }
    }
    public static void printTriangle(int n) {
        for (int x = 0; x < n; x ++) {
            for (int i = 1; i < n - x; i ++) {
                System.out.print(" ");
            }
            for (int i = 1; i < 2 * x + 1; i ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void jumble(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.substring(i, i + 1));
            for (int j = 0; j < world.length() - 1; j++) {
                System.out.print(word.substring(j, j + 1);
            }
            for (int k = 0; j < world.length() - 1; k++) {
                if
                System.out.print(word.substring(k, k + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        printDice(6);
    }
}
