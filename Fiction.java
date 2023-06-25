
public class Fiction extends Book implements Compute{

	public Fiction(String title) {
		super(title);
		
	}
	
	double price;
	int copies;
	
	public double getPrice() {
		return price;
	}
	
	public void setBookPrice(double price) {
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
