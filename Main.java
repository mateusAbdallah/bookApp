import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main (String[]args){

		List<Book> bookFictions = new ArrayList<>(); 
		List<Book> bookNonFictions = new ArrayList<>(); 
		int booksQuantity, copies;
		String bookTitle;
		String bookType = " ";
		double bookPrice = 0.0;


		Scanner input = new Scanner(System.in);
		System.out.print("How many books do you want to enter? ");
		while(!input.hasNextInt()) {
			System.out.println("Enter a numeric value. How many books?");
			input.next();
		}
		
		booksQuantity = input.nextInt();
		input.nextLine();
		for(int i= 0; i < booksQuantity; i++){

			System.out.print("Enter the title of the book: ");			
			bookTitle = input.nextLine();
			
			System.out.print("Enter the price of the book? ");
			while(!input.hasNextDouble()) {
				System.out.println("Enter a numeric value. What is the book's price?");
				input.next();
			}
			bookPrice = input.nextDouble();
			input.nextLine();
			
			System.out.print("Enter F for fiction or N for non fiction: ");
			bookType = input.nextLine();
			
			System.out.print("Enter the number of copies: ");
			while(!input.hasNextInt()) {
				System.out.println("Enter a numeric value. How many copies?");
				input.next();
			}
			copies = input.nextInt();
			input.nextLine();

			if(bookType.toUpperCase().equals("F")) {
				
				Fiction fiction = new Fiction(bookTitle, bookPrice, copies);
				bookFictions.add(fiction);

			}
			
			if(bookType.toUpperCase().equals("N")) {
				
				NonFiction nonFiction = new NonFiction(bookTitle, bookPrice, copies);
				bookNonFictions.add(nonFiction);
				
			}
			
		}
		displayFiction();
		for(Object item : bookFictions) {
			System.out.println(item);
		}
		displayNonFiction();
		for(Object item : bookNonFictions) {
			System.out.println(item);
		}

	}
	
	public static void displayFiction() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("FICTION BOOK TITLE" + "\t\t" + "PRICE" + "\s" + "COPIES" + "\s" + "TOTAL");
		System.out.println("---------------------------------------------------------------");
	}
	

	public static void displayNonFiction() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("NON-FICTION BOOK TITLE" + "\t\t" + "PRICE" + "\s" + "COPIES" + "\s" + "TOTAL");
		System.out.println("-------------------------------------------------------------------");
	}
	
}
