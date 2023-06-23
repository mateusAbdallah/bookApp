import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        int enterBook, copies;
        String bookTitle, bookType;
        double bookPrice;

        Scanner sc = new Scanner(System.in);
        System.out.print("How many books do you want to enter? ");
        enterBook = sc.nextInt();

        for(int i= 0; i < enterBook; i++){
            bookTitle = sc.nextLine();
            System.out.println("Enter the title of the book: ");



           /* System.out.println("Enter the price of the book: ");
            bookPrice = sc.nextDouble();
            System.out.println("Enter F for fiction and N for non-fiction: ");
            bookType = sc.nextLine();
            System.out.println("Enter the number of copies: ");
            copies = sc.nextInt();*/
        }


    }
}
