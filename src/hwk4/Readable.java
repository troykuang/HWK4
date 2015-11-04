package hwk4;

public class Readable extends Item {
	protected String authorName;
	public String getInfo(){
		return sNo+", "/*+Name+", "+Authorname+", etc"*/;//Returns sNo, Name, Author
		                                             //name, etc in a string
	}
	@Override public int getPrice(){
		return price;
		
	}
	
}
