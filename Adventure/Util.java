package Adventure;

public class Util {

    static boolean banditLoot = false;
    static int banditLootGold = 100;

    static boolean castleKey = false;
    static boolean sword = false;


    public static void createItem(int x, int y, int z, String item, boolean consumable) {
        
    }
    public static boolean takeItem(int x, int y, int z, String item) {
        if () {
            
        }

        else {
            return false;
        }
    }
    public static boolean getItem(String item) {
        if (item.equalsIgnoreCase("castle key") && castleKey) {
            return true;
        }
        else if (item.equalsIgnoreCase("sword") && sword)

        else {
            return false;
        }
    }

    public static int takeLoot(int x, int y, int z) {
        if (x == 3 && y == 0 && z == 0) {
            banditLoot = true;
            return banditLootGold;
        }

        else {
            return -1;
        }
    }

    public static int getLootAmount(int x, int y, int z) {
        if (x == 3 && y == 0 && z == 0) {
            return banditLootGold;
        }

        else {
            return -1;
        }
    }
    public static boolean getLooted(int x, int y, int z) {
        if (x == 3 && y == 0 && z == 0) {
            return banditLoot;
        }

        else {
            return true;
        }
    }
    public static boolean getLooted(int x, int y, int z) {
        if (x == 3 && y == 0 && z == 0) {
            return banditLoot;
        }

        else {
            return true;
        }
    }
}
