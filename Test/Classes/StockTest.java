package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest
{

    @Test
    public void TESTgetItem()
    {
        //Create Item for Testing
        String TESTName = "TESTName";
        int TESTItemCode = 1;
        double TESTPrice = 1.50;
        Item TESTItem = new Item(TESTName, TESTItemCode, TESTPrice);

        //Create Stock for Testing (Add Item)
        Stock TESTStock = new Stock();
        int TESTAmount = 1;
        int TESTPosition = 1;
        TESTStock.addStock(TESTItem, TESTAmount, TESTPosition);

        assertSame(TESTStock.getItem(TESTItemCode), TESTItem);
    }

}