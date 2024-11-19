package Adventure;
import java.util.*;

public class Item {
    private Integer xPos;
    private Integer yPos;
    private Integer zPos;
    private Integer[] xUsePos;
    private Integer[] yUsePos;
    private Integer[] zUsePos;
    private boolean consumable;
    private boolean hasItem;
    private String name;
    private String altName;
    private boolean hidden;
    public static List<Item> items = new ArrayList();
    public Item(String itemName, Integer x, Integer y, Integer z, Integer[] useX, Integer[] useY, Integer[] useZ, boolean consumableIn, boolean hiddenIn) {
        hasItem = false;
        altName = null;
        hidden = hiddenIn;
        name = itemName;
        xUsePos = useX;
        yUsePos = useY;
        zUsePos = useZ;
        xPos = x;
        yPos = y;
        zPos = z;
        consumable = consumableIn;
        items.add(Item.this);  
    }
    public Item(String itemName, String altItemName, Integer x, Integer y, Integer z, Integer[] useX, Integer[] useY, Integer[] useZ, boolean consumableIn, boolean hiddenIn) {
        hasItem = false;
        altName = altItemName;
        name = itemName;
        hidden = hiddenIn;
        xUsePos = useX;
        yUsePos = useY;
        zUsePos = useZ;
        xPos = x;
        yPos = y;
        zPos = z;
        consumable = consumableIn;
        items.add(Item.this);  
    }
    public boolean hasItem() {
        return hasItem;
    }
    public boolean isHidden() {
        return hidden;
    }
    public String getName() {
        return name;
    }
    public String getAltName() {
        return altName;
    }
    public boolean setHasItem(boolean has) {
        hasItem = has;
        return true;
    }
    public boolean setPos(int x, int y, int z) {
        xPos = x;
        yPos = y;
        zPos = z;
        return true;
    }
    public boolean isHere(int x, int y, int z) {
        if (x == xPos && y == yPos && z == zPos && !hidden) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean useItem(int x, int y, int z) {
        if (xUsePos == null && yUsePos == null && zUsePos == null) {
            boolean has = hasItem;
            if (consumable && hasItem) {
                hasItem = false;
            }
            return has;
        }
        for (int i = 0; i < xUsePos.length; i++) {
            if (xUsePos[i] == x && yUsePos[i] == y && zUsePos[i] == z) {
                boolean has = hasItem;
                if (consumable && hasItem) {
                    hasItem = false;
                }
                return has;
            }
        }
        return false;
    }
    public boolean setHidden(boolean hiddenIn) {
        hidden = hiddenIn;
        return true;
    }
    public boolean takeItem() {
        xPos = null;
        yPos = null;
        zPos = null;
        hasItem = true;
        return true;
    }
    public boolean takeItem(int x, int y, int z) {
        if (x == xPos && y == yPos && z == zPos && hidden == false) {
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
            if (items.get(i).xPos == x && items.get(i).yPos == y && items.get(i).zPos == z && !items.get(i).hidden) {
                return items.get(i);
            }
        }
        return null;
    }
    public static Item isAnyNameHere(String itemName, int x, int y, int z) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).xPos == x && items.get(i).yPos == y && items.get(i).zPos == z && items.get(i).name == itemName && !items.get(i).hidden || items.get(i).xPos == x && items.get(i).yPos == y && items.get(i).zPos == z && items.get(i).altName == itemName && !items.get(i).hidden) {
                return items.get(i);
            }
        }
        return null;
    }
    public static Item isAnyName(String itemName) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).name == itemName && !items.get(i).hidden || items.get(i).altName == itemName && !items.get(i).hidden) {
                return items.get(i);
            }
        }
        return null;
    }
    public static String displayItemHere(int x, int y, int z) {
        Item temp = isAnyHere(x, y, z);
        if (temp != null) {
            return (temp.name)
        }
        else {
            return null;
        }
    }
    public static List<Item> itemInventory() {
        List<Item> inventoryReturn = new ArrayList();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).hasItem) {
                inventoryReturn.add(items.get(i));
            }
        }
        return inventoryReturn;
    }
}
