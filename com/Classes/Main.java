package Classes;

import Classes.Item;
import Classes.Stock;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String ARGS[])
    {

    }

    public static void LoadItems(Stock ShopStock)
    {
        File Stock = new File("Resources/Stock");
        try {
            Scanner Reader = new Scanner(Stock);
            int i = 0;
            while (i < ShopStock.totalProducts)
            {
                String TEMPName = Reader.nextLine();
                int TEMPItemCode = Integer.parseInt(Reader.nextLine());
                double TEMPPrice = Double.parseDouble(Reader.nextLine());
                int TEMPAMOUNT = Integer.parseInt(Reader.nextLine());
                Item newItem = new Item(TEMPName, TEMPItemCode, TEMPPrice);
                ShopStock.addStock(newItem, TEMPAMOUNT, i);
                i = i + 1;
            }
        } catch (FileNotFoundException e) { e.printStackTrace(); }
    }
    public static void pushData(Stock ShopStock)
    {
        File Stock = new File("Resources/Stock");
        try {
            FileWriter Writer = new FileWriter(Stock);
            int i = 0;
            while (i < ShopStock.totalProducts)
            {
                Writer.write(ShopStock.Products[i].Name);
                Writer.write("\n");
                Writer.write(String.valueOf(ShopStock.Products[i].ItemCode));
                Writer.write("\n");
                Writer.write(String.valueOf(ShopStock.Products[i].Price));
                Writer.write("\n");
                Writer.write(String.valueOf(ShopStock.Amount[i]));
                Writer.write("\n");
                i = i + 1;
            }
            Writer.close();
        } catch (IOException e) { e.printStackTrace(); }
    }
}
