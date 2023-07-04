
public class NonFiction extends Book implements Compute {

	public NonFiction(String title, double price, int copies) {
		super(title);
		this.price =price;
		this.copies = copies;
		
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
	
	public String getDescription() {
		return title + "\t\t\t" + price + "\s\s\s" + copies + "\s\s\s\s\s" + compute(price, copies);
		
	}
	
	public String toString() {
		return getDescription();
	}

	@Override
	public double compute(double price, int copies) {
		
		return price * copies;
		
	}
	

	
}
