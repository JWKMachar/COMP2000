package Classes;

public class Stock {
    Item[] Products = new Item[10];
    int[] Amount = new int[10];

    public Stock()
    {
    }

    public void addStock(Item inProduct, int inAmount, int Position)
    {
        Products[Position] = inProduct;
        Amount[Position] = inAmount;
    }

    Item getItem(int ItemCode)
    {
        int i = 0;
        while(ItemCode != Products[i].getItemCode()) {
            i = i++;
            if (i > 10) {
                return null;
            }
        }
        return Products[i];
    }
    int getAmount(int ItemCode)
    {
        int i = 0;
        while(ItemCode != Products[i].getItemCode()) {
            i = i++;
            if (i > 10) {
                return -1;
            }
        }
        return Amount[i];
    }
}
