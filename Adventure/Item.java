package Adventure;

public class Item {
    private int xPos;
    private int yPos;
    private int zPos;
    private boolean consumable;
    private boolean hasItem;
    public Item(int x, int y, int z, boolean consumableIn) {
        hasItem = false;
        xPos = x;
        yPos = y;
        zPos = z;
        consumable = consumableIn;
        
    }
    public boolean hasItem() {
        return hasItem;
    }
    public boolean setPos(int x, int y, int z) {
        xPos = x;
        yPos = y;
        zPos = z;
        return true;
    }
    public boolean isHere(int x, int y, int z) {
        if (x == xPos && y == yPos && z == zPos) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean useItem() {
        boolean used = hasItem;
        if (consumable && hasItem) {
            hasItem = false;
        }
        return used;
    }
    public boolean takeItem() {
        hasItem = true;
        return true;
    }
    public boolean takeItem(int x, int y, int z) {
        if (x == xPos && y == yPos && z == zPos) {
            xPos = -1;
            yPos = -1;
            zPos = -1;
            hasItem = true;
            return true;
        }
        else {
            return false;
        }
    }
}
