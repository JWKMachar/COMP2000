package Classes;

import Classes.Item;
import Classes.Stock;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String ARGS[])
    {
        Stock ShopStock = new Stock();
        LoadItems(ShopStock);

    }

    public static void LoadItems(Stock ShopStock)
    {
        File Stock = new File("Stock.txt");
        try {
            Scanner Reader = new Scanner(Stock);
            int i = 0;
            while (i <= 10)
            {
                String TEMPName = Reader.nextLine();
                int TEMPItemCode = Integer.parseInt(Reader.nextLine());
                double TEMPPrice = Double.parseDouble(Reader.nextLine());
                int TEMPAMOUNT = Integer.parseInt(Reader.nextLine());
                Item newItem = new Item(TEMPName, TEMPItemCode, TEMPPrice);
                ShopStock.addStock(newItem, TEMPAMOUNT, i);
                i++;
            }
        } catch (FileNotFoundException e) { e.printStackTrace(); }
    }
}
