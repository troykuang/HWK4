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
		File eBooksTxt = new File ("EBooks.txt");
		File MP3Txt = new File ("MP3.txt");
		File CDTxt = new File ("CDs.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(bookTxt));
		try{
			String thisLine = null;
			while ((thisLine = br.readLine()) != null) {
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
			br.close();

		}
		finally{}
		String a = books.get(0).getInfo();
		System.out.println(books.toString());
                


	}

}
