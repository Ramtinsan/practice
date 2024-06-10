public class Book wxtends TangibleAsset{
	private String isbn;
	public Book (Strikng name,int price,String color,String isbn){
		super (name,price,color);
		this.isbn = isbn;
	}
	public String getIsbn(){return this.isbn;}

}
