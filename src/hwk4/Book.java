package hwk4;

public class Book extends Readable{
	protected int sNo;
	protected String bookName;
	protected String authorName;
	protected int price;
	public int quantity;
	protected String type;
	
	public Book(int a,String b,String c,int d,int e,String f){
		sNo = a;
		bookName = b;
		authorName = c;
		price = d;
		quantity = e;
		type = f;
		}
}
	/*public int getPrice(){
	}
	
	public int intgetListInfo(){
		//Based on the value of Type(Book
		//or eBook) print the list of Items
	}

}*/
