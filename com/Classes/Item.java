package Classes;

public class Item {
    String Name;
    int ItemCode;
    double Price;

    // Initializer
    public Item(String inName, int inItemCode, double inPrice)
    {
        this.Name = inName;
        this.ItemCode = inItemCode;
        this.Price = inPrice;
    }

    //returns the name of a given item
    String getString()
    {
        return Name;
    }

    //returns the ItemCode of a given item
    int getItemCode()
    {
        return ItemCode;
    }
    //returns the price of a given item
    double getPrice()
    {
        return Price;
    }
}
