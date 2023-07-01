import java.util.Scanner;

public class Main {
	public static void main (String[]args){

		Book books[] = null;
		int booksQuantity, copies;
		String bookTitle, bookType = "";
		double bookPrice;


		Scanner input = new Scanner(System.in);
		System.out.print("How many books do you want to enter? ");
		booksQuantity = input.nextInt();
		input.nextLine();
		books = new Book[booksQuantity];
		//Book[] book = new Book[books];
		for(int i= 0; i < booksQuantity; i++){

			System.out.print("Enter the title of the book: ");
			bookTitle = input.nextLine();
			System.out.print("Enter the price of the book? ");
			bookPrice = input.nextDouble();
			input.nextLine();
			System.out.print("Enter F for fiction or N for non fiction: ");
			bookType = input.nextLine();
			System.out.print("Enter the number of copies: ");
			copies = input.nextInt();
			input.nextLine();

			if(bookType.toUpperCase().equals("F")) {
				Fiction fiction = new Fiction(bookTitle, bookPrice, copies);
				books[i] = fiction;
				
				//books[i] = new Fiction(bookTitle, bookPrice, copies);
				
				//books[i] = fiction;
			}
			
			
			if(bookType.toUpperCase().equals("N")) {
				books[i] = new NonFiction(bookTitle, bookPrice, copies);
			}

		}
		
		//if(bookType.toUpperCase().equals("N")) {
		//NonFiction nonFiction = new NonFiction(bookTitle, bookPrice, copies);


	}
	
	public static void displayFiction() {
		System.out.println("-------------------------------");
		System.out.println("FICTION BOOK TITLE" + "\t\t" + "PRICE" + " " + "COPIES" + " " + "TOTAL");
		System.out.println("-------------------------------");
	}
	

	public static void displayNonFiction() {
		System.out.println("-------------------------------");
		System.out.println("NON-FICTION BOOK TITLE" + "\t\t" + "PRICE" + " " + "COPIES" + " " + "TOTAL");
		System.out.println("-------------------------------");
	}
	
	/*
            if(bookType.toUpperCase().equals("F")) {
            	Fiction[] fiction = new Fiction[books];
            	fiction[i] = new Fiction(bookTitle, bookPrice, copies);
            	fiction[i].displayContent();


            }

            else if(bookType.toUpperCase().equals("N")) {
            	NonFiction[] nonFiction = new NonFiction[books];
            	nonFiction[i] = new NonFiction(bookTitle, bookPrice, copies);
            	nonFiction[i].displayContent();

            }
	 */
}

        


    
    
    //public static Fiction[] fictionBook() 
    	
    	
    	
    


    
    //public static NonFiction[] nonFictionBook() 
    	
    

