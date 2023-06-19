
public class Fiction extends Book {

	public Fiction(String title) {
		super(title);
		
	}
	
	double bookPrice;
	int copies;
	
	public double getBookPrice() {
		return bookPrice;
	}
	
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public int getCopies() {
		return copies;
	}
	
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	

	
}
