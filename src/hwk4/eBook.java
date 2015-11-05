package hwk4;

public class eBook extends Readable{
	public eBook(int a,String b,String c,int d,int e,String f){
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
	public int getPrice(){
		return price;
	};
	

}
