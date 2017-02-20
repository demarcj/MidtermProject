import java.util.Scanner;

/**
 * Created by
 * DeMarc Johnson
 * Norman Wilson
 * Charlie Woods
 * 2/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //DeMarc's Test Variables
        double price = 2;


        System.out.println("Hello World!");
        //The name of the restaurant is DeNorLi's

        System.out.println("Welcome to the DeNorLi");


        //Create a class for a restaurant with name, category, description, and price
        //For class we need 12 items minimum; they must be stored in the program list array
        //Charlie is doing the class the name, category, description, and price


        //Create menu to be displayed so that the user can pick an item (we need a for loop to display menu)
        //Ask for how many of that item do they want (this is going to need a scanner)
            //Validate to make sure they don't put a string and make sure don't put negative number
        //Method for the item that does price * quantity
        System.out.println(totalPrice(scan, price));

        //Ask if the user is complete or want to see list again (if statement so the user can start the menu again)
            //Validate to make sure they don't use int and use an invalid string


        //Create a method for the subtotal, a method for the sale tax, and a method for the
        //grand-total


        //Make sure we have an array or arraylist to keep track of orders
        //Remember rounding issues: Hint look into the BigDecimal class


        //Ask for payment type Cash, Credit, or Check

            //Validate to make sure that type right for payment type
        pay(scan);
        //Validate to make sure that type right for payment type

        //Use scan for type and use an if statement for the answer
        //Use a method to display a receipt with all items ordered, subtotal, grand-
        //total and payment info

        //Return to the original menu for a new order
        System.out.println("Thank you, and come back, soon!");
    }

    //This method is for the getting the total price of the without tax
    public static double totalPrice(Scanner scan, double price){
        System.out.println("How many do you want?");
        //Need validation for this method
        int quantity = scan.nextInt();
        return price * quantity;
    }

    public static String pay(Scanner scan){
        System.out.println("What way would like to pay, cash, check or credit?");
        //Need validation for this method
        String paymentType = scan.next();
        if(paymentType.equalsIgnoreCase("cash")){

        }else if(paymentType.equalsIgnoreCase("check number")){
            System.out.println("What is the check number?");
            int checkNumber = scan.nextInt();
            //Need validation for this method
            System.out.println("Thank you");
        }else {
            System.out.println("What is your credit card number?");
            int ccNumber = scan.nextInt();
            //Need validation for this method
            System.out.println("What is the expiration date?");
            int expirationDate = scan.nextInt();
            //Need validation for this method
            System.out.println("What is the CVV?");
            int cvv = scan.nextInt();
            //Need validation for this method
            System.out.println("Thank you!");
        }
        return paymentType;
    }

}
