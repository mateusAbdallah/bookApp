
public class NonFiction extends Book implements Compute {

	public NonFiction(String title, double price, int copies) {
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
	
	public void displayContent() {
		System.out.printf(title + "\t\t" + getPrice() + getCopies() + compute(price, copies));
	}

	@Override
	public double compute(double price, int copies) {
		
		return price * copies;
		
	}
	

	
}
