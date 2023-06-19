
public class NonFiction extends Book {

	public NonFiction(String title) {
		super(title);
		
	}
	
	double price;
	int copies;
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getCopies() {
		return copies;
	}
	
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	

	
}
