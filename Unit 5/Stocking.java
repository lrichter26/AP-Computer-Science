public class Stocking {
    private String name;
    private int itemCount;
    private int ID;
    private static int stockingNum = 0;
    public Stocking() {
        name = "unknown";
        itemCount = 0;
        ID = stockingNum;
        stockingNum++;
    }
    public Stocking(String nameIn, int itemCountIn) {
        name = nameIn;
        itemCount = itemCountIn;
        ID = stockingNum;
        stockingNum++;
    }
}