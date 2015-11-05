package hwk4;

public class CD extends Audio{
	public CD(int a,String b,String c,int d,int e,String f){
		sNo = a;
		name = b;
		artistName = c;
		price = d;
		quantity = e;
		type = f;
		}
	public String getInfo(){
		String s = String.format("%-7s%-20s%-7s%-7s%-10s%s\n",sNo,name,artistName,price,quantity,type);
		return s;
	}

}
