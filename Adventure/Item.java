package Adventure;
import java.util.*;

public class Item {
    private Integer xPos;
    private Integer yPos;
    private Integer zPos;
    private boolean consumable;
    private boolean hasItem;
    private String name;
    public static List<Item> items = new ArrayList();
    public Item(String itemName, int x, int y, int z, boolean consumableIn) {
        hasItem = false;
        name = itemName;
        xPos = x;
        yPos = y;
        zPos = z;
        consumable = consumableIn;
        items.add(Item.this);  
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
        xPos = null;
        yPos = null;
        zPos = null;
        hasItem = true;
        return true;
    }
    public boolean takeItem(int x, int y, int z) {
        if (x == xPos && y == yPos && z == zPos) {
            xPos = null;
            yPos = null;
            zPos = null;
            hasItem = true;
            return true;
        }
        else {
            return false;
        }
    }
    public static Item isAnyHere(int x, int y, int z) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).xPos == x && items.get(i).yPos == y && items.get(i).zPos == z) {
                return items.get(i);
            }
        }
        return null;
    }
    public static Item isAnyName(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).name == itemName) {
                return items.get(i);
            }
        }
        return null;
    }
}
