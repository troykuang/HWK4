package hwk4;
import java.util.*;

public class UserInterface {
	private ArrayList readables;
	private ArrayList audioProducts;
	private int currentPage;
	public int getCurrentPage(){
		return currentPage;
	}
	public void changeCurrentPage(int a){
		currentPage = a;
		switch (currentPage) {
			case 1: // Login page
				System.out.println("1. Sign In");
				System.out.println("2. Sign Up");
				System.out.println();
				System.out.println("Choose Your Option:");
				break;
			case 2: // New user sign up page
				System.out.println("Choose Your Username:");
				break;
			case 3: // Sign in page
				System.out.println("Enter Your Username:");
				break;
			case 5: // Main menu page
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
				break;
		}	
		
	}
	public void getReadables(){
		
	}
	public void getAudioProducts(){
		
	}
	public void showReadables(){
		
	}
	public void showAudioProducts(){};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
