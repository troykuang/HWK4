package hwk4;

public class Book extends Readable{
	public Book(int a,String b,String c,int d,int e,String f){
		sNo = a;
		name = b;
		authorName = c;
		price = d;
		quantity = e;
		type = f;
		}
	public String getInfo(){
		String s = String.format("%-7s%-20s%-7s%-7s%-10s%s\n",sNo,name,authorName,price,quantity,type);

		return s;
	}
}