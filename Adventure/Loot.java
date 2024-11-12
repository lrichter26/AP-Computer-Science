package Adventure;

public class Loot {

    static boolean banditLoot = false;
    static int banditLootGold = 100;

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
}
