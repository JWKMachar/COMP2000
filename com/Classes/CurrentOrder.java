package Classes;

import java.awt.*;

import Classes.CheckOut;

public class CurrentOrder {
    List Reciept = new List();

    public CurrentOrder()
    {

    }

    public void AddItem(Item newItem)
    {
        Reciept.add(String.valueOf(newItem.ItemCode));

       CheckOut.updateReciept();
    }

}
