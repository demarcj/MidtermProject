import java.util.ArrayList;
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
        String answer = "";
        double total = 5;

        Validation valid = new Validation();

        //The name of the restaurant is DeNorLi's

        System.out.println("Welcome to the DeNorLi");
        //ArrayList<Restuarant> foodList = new ArrayList<Resturant>();
        //ArrayList<Restuarant> billList = new ArrayList<Resturant>();
        //ArrayList<Restuarant> billTotalList = new ArrayList<Resturant>();
        do{

        //Create a class for a restaurant with name, category, description, and price
        //For class we need 12 items minimum; they must be stored in the program list array
        //Charlie is doing the class the name, category, description, and price
        
        //foodList = setFood();
        //int orderedFood = getFood(scan, foodList);
        
        //Create menu to be displayed so that the user can pick an item (we need a for loop to display menu)
        //Ask for how many of that item do they want (this is going to need a scanner)
            //Validate to make sure they don't put a string and make sure don't put negative number
        //Method for the item that does price * quantity
        /*double getPrice = getTotalPrice(scan, billList.get(orderedFood));
        System.out.println("You've ordered:");
        System.out.println(getOrder(foodList));
        System.out.println("Your total is " + getPrice);
        billTotalList.add(getPrice);*/

        //Ask if the user is complete or want to see list again (if statement so the user can start the menu again)
        	//Validate to make sure they don't use int and use an invalid string
        //Menu food = new Menu();

        answer = valid.getYesOrNo(scan, "Would you like anything else?");
        }while(answer.equalsIgnoreCase("yes"));
        
        
        //Create a method for the subtotal, a method for the sale tax, and a method for the
        //grand-total
       /* double finalTotal = getFinalTotal(billTotalList);
        double saleTax = getSaleTax(totalPrice);
        getGrandTotal(finalTotal, saleTax);

        //Make sure we have an array or arraylist to keep track of orders
        //Remember rounding issues: Hint look into the BigDecimal class
*/

        System.out.println(pay(scan, total));

    /*
        //Use scan for type and use an if statement for the answer
        //Use a method to display a receipt with all items ordered, subtotal, grand-
        //total and payment info
        getReceipt();
        //Return to the original menu for a new order
        System.out.println("Thank you, and come back, soon!");
    */}
    
    /*public static double getGrandTotal(double x, double y){
    	return x + y;
    }
    
    public static double getFinalTotal(ArrayList<Restuarant> billTotalList){
    	double total = 0;
    	for(int i = 0; i < billTotalList.size(); i++){
    		total += billTotalList.get(i);
    	}
    	return total;
    }
    
    public static void getOrder(ArrayList<Restaurant> foodList){
    	for(int i = 0; i < foodList.size(); i++){
    		System.out.println(foodList.get(i));
    	}
    }*/

    //This method is for the getting the total price of the without tax
    public static double getTotalPrice(Scanner scan, double price){
        //System.out.println("How many do you want?");
        //Need validation for this method
        Validation valid = new Validation(); 
        int quantity = valid.getInt(scan, "How many do you want?");
        //int quantity = scan.nextInt();
        return price * quantity;
    }

    public static String pay(Scanner scan, double total){
        Validation valid = new Validation();
        String paymentType = valid.getString(scan, "What way would like to pay, cash, check or credit?");
        if(paymentType.equalsIgnoreCase("cash")){
            double cashAmount = valid.getDouble(scan, "Put in your amount.", total);
            amountOfChange(total, cashAmount, "Your change is ");
            return "Thank you!";
        }else if(paymentType.equalsIgnoreCase("check number")){
            valid.getInt(scan, "What is the check number?");
            return "Thank you!";
        }else {
            valid.getInt(scan, "What is your credit card number?");
            valid.getInt(scan, "What is the expiration date?");
            valid.getInt(scan, "What is the CVV?");
            return "Thank you!";
        }
    }
    
   /* public static ArrayList<Restuarant> setfood(){
    	ArrayList<Restuarant> foodList = new ArrayList<Restuarant>();
    	foodList.add();
    	return foodList;
    }*/
    
    public static double amountOfChange(double total, double cashAmount, String prompt){
        double change = cashAmount - total;
        System.out.println(prompt + change);
        return change;
    }
    
    public static String getReceipt(){
    	String receipt = "";
    	return receipt;
    }
    public static double getSaleTax(double totalPrice){
    	return totalPrice * .1;
    }
}
