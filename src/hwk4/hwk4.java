package hwk4;
import java.io.*;
import java.util.*;

public class hwk4 {

	public static void main(String[] args) throws IOException { // main function 
/*-----------------Create ArrayList for each type of items-----------------*/		
		ArrayList<Book> books = new ArrayList<Book>(); // For books
		ArrayList<eBook> eBooks = new ArrayList<eBook>(); // For eBooks
		ArrayList<MP3> MP3 = new ArrayList<MP3>(); // For MP3
		ArrayList<CD> CDs = new ArrayList<CD>(); // For CD
		
		BufferedReader brBook = new BufferedReader(new FileReader("Books.txt"));
		BufferedReader breBook = new BufferedReader(new FileReader("EBooks.txt"));
		BufferedReader brMP3 = new BufferedReader(new FileReader("MP3.txt"));
		BufferedReader brCD = new BufferedReader(new FileReader("CDs.txt"));
		
		String thisLine = null;
		while ((thisLine = brBook.readLine()) != null) {
			String [] bookDetails = thisLine.split(",");
			int sNo = Integer.parseInt(bookDetails[0]);
			String name = bookDetails[1];
			String authorName = bookDetails[2];
			int price = Integer.parseInt(bookDetails[3]);
			int quantity = Integer.parseInt(bookDetails[4]);
			String type = bookDetails[5];
			Book current = new Book(sNo,name,authorName,price,quantity,type);
			books.add(current);
			}
		while ((thisLine = breBook.readLine()) != null) {
			String [] eBookDetails = thisLine.split(",");
			int sNo = Integer.parseInt(eBookDetails[0]);
			String name = eBookDetails[1];
			String authorName = eBookDetails[2];
			int price = Integer.parseInt(eBookDetails[3]);
			int quantity = Integer.parseInt(eBookDetails[4]);
			String type = eBookDetails[5];
			eBook current = new eBook(sNo,name,authorName,price,quantity,type);
			eBooks.add(current);
			}
		while ((thisLine = brMP3.readLine()) != null) {
			String [] MP3Details = thisLine.split(",");
			int sNo = Integer.parseInt(MP3Details[0]);
			String name = MP3Details[1];
			String artistName = MP3Details[2];
			int price = Integer.parseInt(MP3Details[3]);
			int quantity = Integer.parseInt(MP3Details[4]);
			String type = MP3Details[5];
			MP3 current = new MP3(sNo,name,artistName,price,quantity,type);
			MP3.add(current);
			}
		while ((thisLine = brCD.readLine()) != null) {
			String [] CDDetails = thisLine.split(",");
			int sNo = Integer.parseInt(CDDetails[0]);
			String name = CDDetails[1];
			String artistName = CDDetails[2];
			int price = Integer.parseInt(CDDetails[3]);
			int quantity = Integer.parseInt(CDDetails[4]);
			String type = CDDetails[5];
			CD current = new CD(sNo,name,artistName,price,quantity,type);
			CDs.add(current);
			}
		
	
		brBook.close();
		breBook.close();
		brMP3.close();
		brCD.close();
		System.out.println(books.toString());
                


	}

}
