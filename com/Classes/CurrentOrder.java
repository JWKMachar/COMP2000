package Classes;

import java.awt.*;

public class CurrentOrder {
    List Receipt = new List();
    List ReceiptCode = new List();
    int ItemCount = 0;
    String PaymentType = "";
    public CurrentOrder()
    {

    }
    //stores information about item given
    public void AddItem(Item newItem)
    {
        Receipt.add(String.valueOf(newItem.Name));
        ReceiptCode.add(String.valueOf(newItem.ItemCode));
        ItemCount = ItemCount + 1;
    }

    //returns the itemcount
    public int Length()
    {
        return ItemCount;
    }


}
