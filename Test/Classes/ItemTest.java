package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest
{

    @Test
    public void TESTItem()
    {
        //Create Item for Testing
        String TESTName = "TESTName";
        int TESTItemCode = 1;
        double TESTPrice = 1.50;
        Item TESTItem = new Item(TESTName, TESTItemCode, TESTPrice);

        assertEquals(TESTItem.getString(), TESTName);
        assertEquals(TESTItem.getItemCode(), TESTItemCode);
        assertEquals(TESTItem.getPrice(), TESTPrice);
    }

}