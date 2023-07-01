
public class Fiction extends Book implements Compute{

	public Fiction(String title, double price, int copies) {
		super(title);
		this.copies = copies;
		this.price = price;
		
		
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
		return title + "\t\t" + price + "   " +copies + "     " + compute(price, copies);
	}
	
	public String toString() {
		return getDescription();
	}

	@Override
	public double compute(double price, int copies) {
		
		return price * copies;
	}
	
	

	
}
