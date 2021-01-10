package Classes;

import java.awt.*;

public class CurrentOrder {
    List Receipt = new List();

    public CurrentOrder()
    {

    }

    public void AddItem(Item newItem)
    {
        Receipt.add(String.valueOf(newItem.Name));
    }


}
