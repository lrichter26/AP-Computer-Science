package Adventure;

public class Loot {
    boolean banditLoot = false;
    int banditLootGold = 100;
    public static int takeLoot(x, y, z) {
        if (x == 3 && y == 0 && z == 0) {
            banditLoot = true;
            return banditLootGold;
        }
    }
    public static int getLootAmount(x, y, z) {
        if (x == 3 && y == 0 && z == 0) {
            return banditLootGold;
        }
    }
    public static boolean getLooted(x, y, z) {
        if (x == 3 && y == 0 && z == 0) {
            return banditLoot;
        }
    }
}
