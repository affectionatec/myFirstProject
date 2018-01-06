package gongju;

import java.io.*;  
 
import java.util.*;  
  
import model.book;  
import model.booklist;  
import zhuyao.Main;  
  
public class InputOutput {  
      
    public void load()  
    {  
        try {  
            String filename = "D:\\Users\\alext\\workspace\\first\\book.txt";  
            File file = new File(filename);  
            BufferedReader reader = new BufferedReader(new FileReader(file));  
            String temp;  
            while((temp = reader.readLine()) != null)  
            {  
                String bookname = temp.split(",")[0];  
                String author = temp.split(",")[1];  
                String pricestr = temp.split(",")[2];  
                float price = Float.parseFloat(pricestr);  
                book book = new book(bookname,author,price);  
                booklist.booklist.add(book);  
            }  
            reader.close();  
        } catch (FileNotFoundException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (NumberFormatException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  
      
    public void save()  
    {  
        String fileName = "D:\\Users\\alext\\workspace\\first\\book.txt";  
        String allbook="";  
        for(int i = 0; i < booklist.booklist.size(); i++)  
        {  
            book book = (book)booklist.booklist.get(i);  
            String temp = book.getBookname() + "," + book.getAuthor() + "," + book.getPrice() + "\r\n";  
            allbook += temp;  
        }  
        try {  
            File file1 = new File(fileName);  
            FileWriter fileWriter;  
            fileWriter = new FileWriter(file1);  
            fileWriter.write(allbook);  
            fileWriter.close();  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
          
    }  
}