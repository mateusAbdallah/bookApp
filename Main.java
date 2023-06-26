import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        int books, copies;
        String bookTitle, bookType = "";
        double bookPrice;

        Scanner input = new Scanner(System.in);
        System.out.print("How many books do you want to enter? ");
        books = input.nextInt();
        input.nextLine();
        //Book[] book = new Book[books];
        for(int i= 0; i < books; i++){
        	
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
            	Fiction[] fiction = new Fiction[books];
            	
            }
            
            else if(bookType.toUpperCase().equals("N")) {
            	NonFiction[] nonFiction = new NonFiction[books];
            	
            }
        }


    }
    
    public static void fictionBook() {
    	
    	
    }
    
    public static void nonFictionBook() {
    	
    }
}
