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
	//	System.out.println(books.toString());
/*----------------------------------Page Navigation----------------------------------*/
		
		UserInterface ui = new UserInterface();
		Scanner sc;
		ui.changeCurrentPage(1);
		while (true) {
			int currentPage = ui.getCurrentPage();
			switch (currentPage) {
			case 1: // Login page
				Scanner sc1 = new Scanner(System.in);
				int option = sc1.nextInt();
				if (option == 1) {
					ui.changeCurrentPage(3); // Choose 1.Sign in --> Page 3: Sign In page
				}else if (option ==2 ){
					ui.changeCurrentPage(2); // Choose 2.Sign up --> Page 2: Sign up page
				}
				break;
			case 2: // New user sign up page
				// Just record the name of the user and return to login page(case 1)
				Scanner sc2 = new Scanner(System.in);
				String newUserName = sc2.next();
				User newUser = new User();
				newUser.getUsername(newUserName); // stores the user name
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Users.txt", true)));
				out.println(newUserName);
			    out.close();
			    System.out.println("Username Successfully Added!");
				System.out.println();

				ui.changeCurrentPage(1); // After name is added back to login page
				break;
			case 3: // Sign in page
				System.out.println("Enter Your Username:");
				Scanner sc3 = new Scanner(System.in);
				String userName = sc3.next(); 
				Scanner scanner=new Scanner("Users.txt");
				List<String> list=new ArrayList<>();
				while(scanner.hasNextLine()){
					list.add(scanner.nextLine());
					}
				if(list.contains(userName)){ // If the userName is legal(user name exists) / illegal(user name does not exist)
					System.out.println("Hello" + userName);
					User current = new User();
					current.getUsername(userName);
					
					
					  // found.
					}else{
						System.out.println("No Access");
						ui.changeCurrentPage(1);
						break;
					 // not found
					}
				
				
				
				
				
				break;
		/*	case 5: // Main menu page
				System.out.println("1. View Items By Category");
				System.out.println("2. View Shooping Cart");
				System.out.println("3. Sign Out");
				System.out.println();
				System.out.println("Choose Your Option:");
				break;
			case 6: // View by categories
				System.out.println("1. Readables");
				System.out.println("2. Aduio");
				System.out.println();
				System.out.println("Choose Your Option:");
				System.out.println();
				System.out.println("Press -1 to Return to Previous Menu");
				break;
			case 7: // Shopping cart
				break;
			case 8: // Readables page
				System.out.println("Readables:");
				System.out.println();
				String s1 = String.format("%-7s%-20s%-7s%-7s%-10s%s\n","sNo","name","authorName","price","quantity","type");
				System.out.println(s1);
				//TODO: Objects of Readable
				break;
			case 9: // Aduio page
				System.out.println("Audios:");
				System.out.println();
				String s2 = String.format("%-7s%-20s%-7s%-7s%-10s%s\n","sNo","name","authorName","price","quantity","type");
				System.out.println(s2);
				//TODO: Objects of Audio
				break;
			case 10: // checkout
				//TODO: shopping cart
				break; */
			}
			
		}
                


	}

}
