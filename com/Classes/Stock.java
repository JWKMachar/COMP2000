package Classes;

public class Stock {
    int totalProducts = 10;
    Item[] Products = new Item[totalProducts];
    int[] Amount = new int[totalProducts];

    public Stock()
    {
    }
    //stores information about an item so as to be used as a stock value
    public void addStock(Item inProduct, int inAmount, int Position)
    {
        Products[Position] = inProduct;
        Amount[Position] = inAmount;
    }

    //takes an item code and returns the item itself
    public Classes.Item getItem(int ItemCode)
    {
        if (ItemCode < Products.length)
        {
            return Products[ItemCode];
        }
        return null;
    }
    //takes an item code and returns the amount in stock
    public int getAmount(int ItemCode)
    {
        int i = 0;
        while(ItemCode != Products[i].getItemCode()) {
            i = i + 1;
            if (i >= Products.length) {
                return -1;
            }
        }
        return Amount[i];
    }
    //takes an item code and returns true if the item exists in the database
    public boolean checkItem(int ItemCode)
    {
        int i = 0;
        while(ItemCode != Products[i].getItemCode()) {
            i = i + 1;
            if (i >= Products.length) {
                return false;
            }
        }
        return true;
    }
}
