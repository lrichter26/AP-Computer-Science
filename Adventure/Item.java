package Adventure;

public class Item {
    private int xPos;
    private int yPos;
    private int zPos;
    private boolean consumable;
    private String name;
    private boolean hasItem;
    public Item(int x, int y, int z, String itemName, boolean consumableIn) {
        hasItem = false;
        xPos = x;
        yPos = y;
        zPos = z;
        name = itemName;
        consumable = consumableIn;
        
    }
    public boolean hasItem(String itemName) {
        if (consumable) {
            hasItem = false;
        }
        return hasItem;
    }
    public boolean takeItem(String itemName) {
        hasItem = true;
        return true;
    }
    public boolean takeItem(String itemName, int x, int y, int z) {
        if (x == xPos && y == yPos && z == zPos) {
            hasItem = true;
            return true;
        }
        else {
            return false;
        }
    }
}
