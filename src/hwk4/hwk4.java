package hwk4;
import java.io.*;
import java.util.*;

public class hwk4 {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Book> books = new ArrayList<Book>();
		ArrayList<eBook> eBooks = new ArrayList<eBook>();
		ArrayList<MP3> MP3 = new ArrayList<MP3>();
		ArrayList<CD> CDs = new ArrayList<CD>();
		
		File bookTxt = new File ("Books.txt");
		File eBookTxt = new File ("EBooks.txt");
		File MP3Txt = new File ("MP3.txt");
		File CDTxt = new File ("CDs.txt");
		
		BufferedReader brBook = new BufferedReader(new FileReader(bookTxt));
		BufferedReader breBook = new BufferedReader(new FileReader(eBookTxt));
		BufferedReader brMP3 = new BufferedReader(new FileReader(MP3Txt));
		BufferedReader brCD = new BufferedReader(new FileReader(CDTxt));
		
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
		
	
		brBook.close();
		breBook.close();
		brMP3.close();
		String a = books.get(0).getInfo();
		System.out.println(books.toString());
                


	}

}
