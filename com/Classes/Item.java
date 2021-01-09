package Classes;

public class Item {
    String Name;
    int ItemCode;
    double Price;

    public Item(String inName, int inItemCode, double inPrice)
    {
        this.Name = inName;
        this.ItemCode = inItemCode;
        this.Price = inPrice;
    }


    String getString()
    {
        return Name;
    }
    int getItemCode()
    {
        return ItemCode;
    }
    double getPrice()
    {
        return Price;
    }
}
