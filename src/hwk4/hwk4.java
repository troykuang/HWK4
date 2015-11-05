package hwk4;
import java.io.*;
import java.util.*;

public class hwk4 {

	public static void main(String[] args) throws IOException {
		ArrayList<Book> books = new ArrayList<Book>();
		File bookTxt = new File ("Books.txt");
		BufferedReader br = new BufferedReader(new FileReader(bookTxt));
		try{
			String thisLine = null;
			while ((thisLine = br.readLine()) != null) {
				String [] bookDetails = thisLine.split(",");
				int sNo = Integer.parseInt(bookDetails[0]);
				String bookName = bookDetails[1];
				String authorName = bookDetails[2];
				int price = Integer.parseInt(bookDetails[3]);
				int quantity = Integer.parseInt(bookDetails[4]);
				String type = bookDetails[5];
				Book current = new Book(sNo,bookName,authorName,price,quantity,type);
				books.add(current);
				}
			br.close();
		}finally{}
                
                System.out.println(books.toString());
                
	

	}

}
