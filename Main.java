import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        int enterBook, copies;
        String bookTitle, bookType;
        double bookPrice;

        Scanner input = new Scanner(System.in);
        System.out.print("How many books do you want to enter? ");
        enterBook = input.nextInt();
        input.nextLine();
        for(int i= 0; i < enterBook; i++){
        	
            System.out.print("Enter the title of the book: ");
            bookTitle = input.nextLine();
            System.out.print("Enter the price of the book? ");
            bookPrice = input.nextDouble();
            input.nextLine();
            System.out.print("Enter F for fiction or N for non fiction: ");
            bookTitle = input.nextLine();
            System.out.print("Enter the number of copies: ");
            copies = input.nextInt();
            input.nextLine();
           
        }


    }
}
