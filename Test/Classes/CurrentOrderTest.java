package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrentOrderTest {

    @Test
    public void TESTCurrentOrder()
        {
            //Create Item for Testing
            String TESTName = "TESTName";
            int TESTItemCode = 1;
            double TESTPrice = 1.50;
            Item TESTItem = new Item(TESTName, TESTItemCode, TESTPrice);

            //Create Current Order and an item 3 times
            CurrentOrder TESTOrder = new CurrentOrder();
            TESTOrder.AddItem(TESTItem);
            TESTOrder.AddItem(TESTItem);
            TESTOrder.AddItem(TESTItem);

            assertEquals(3 ,TESTOrder.ItemCount);
        }
}