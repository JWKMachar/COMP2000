package Classes;

public class Stock {
    int totalProducts = 10;
    Item[] Products = new Item[totalProducts];
    int[] Amount = new int[totalProducts];

    public Stock()
    {
    }

    public void addStock(Item inProduct, int inAmount, int Position)
    {
        Products[Position] = inProduct;
        Amount[Position] = inAmount;
    }

    public Classes.Item getItem(int ItemCode) {
        if (ItemCode < Products.length)
        {
            return Products[ItemCode];
        }
        return null;
    }
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
