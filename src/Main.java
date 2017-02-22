import java.text.DecimalFormat;
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
        //private static DecimalFormat df2 = new DecimalFormat(".##");
        Scanner scan = new Scanner(System.in);
        double price = 2;
        String answer = "";
        double cost = 0;
        double total = 0;

        Validation valid = new Validation();


        System.out.println("Welcome to the DeNorLi");
        ArrayList<Menu> foodList = new ArrayList<Menu>();
        ArrayList<Menu> orderList = new ArrayList<Menu>();


        Menu food1 = new Menu("surfTurf", "Entree", "Dry aged 16oz. PorterHouse W/Veggies Grilled Shrimp", 54.00);
        Menu food2 = new Menu("deMarcsLambCo", "Entree", "Lamb Chops, Baked Potato & Veggies", 45.00);
        Menu food3 = new Menu("charlieSouthernSoul", "Entree", "Signature Greens, Baked Chicken", 48.00);
        Menu food4 = new Menu("westernPeel", "Entree", "Barbecue Brisket, Broasted Potatoes W/Garlic Sauce & Cole Slaw", 42.00);
        Menu food5 = new Menu("asianWok", "Entree", "Asian Inspired Duck Breasts With Ginger Chili Glaze, Noodles & Mixed Veggies", 47.00);
        Menu food6 = new Menu("normsCajunSkillet", "Entree", "Alligator Tenders, Dirty Rice & Gumbo", 54.00);
        Menu food7 = new Menu("mexicanBowl", "Entree", "Steak, Chicken, Lime/Cilantro Rice, Refried Beans", 54.00);
        Menu food8 = new Menu("deNorLiVeganSoul", "Entree", "Meatloaf W/Cauliflower & Grilled Asparagus", 30.00);
        Menu food9 = new Menu("seaFoodJack", "Entree", "Shrimp & Grits, Crawfish Boil W/Veggies", 60.00);
        Menu food10 = new Menu("WinBuckDepo", "Entree", "Bucket Of Wings, Potato Wedges, Cole Slaw", 30.50);
        Menu food11 = new Menu("roastBeefParle", "Entree", "Roast Beef W/Roasted Potatoes & Carrots, Haricots Verts", 40.00);
        Menu food12 = new Menu("burger360", "Entree", "5 All Beef Patties Atop Onion Roll With Onion Fry, Side Order Of Truffle Fries", 40.00);

        foodList.add(food1);
        foodList.add(food2);
        foodList.add(food3);
        foodList.add(food4);
        foodList.add(food5);
        foodList.add(food6);
        foodList.add(food7);
        foodList.add(food8);
        foodList.add(food9);
        foodList.add(food10);
        foodList.add(food11);
        foodList.add(food12);
        while (true) {
            do {
                int order = showMenu(scan, foodList);


                cost = foodList.get(order).getPrice();
                orderList.add(foodList.get(order));

                System.out.println("It cost " + cost);
                    total += getTotalPrice(scan, cost);
                    answer = valid.getYesOrNo(scan, "Would you like anything else?");
                } while (answer.equalsIgnoreCase("yes"));

                double saleTax = getSaleTax(total);
                System.out.println(saleTax);
                double grandTotal = getGrandTotal(total, saleTax);

                System.out.println(pay(scan, total));

                getReceipt(orderList, total, grandTotal);
                System.out.println("Thank you, and come back, soon!");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }



    public static double getGrandTotal(double x, double y){
    	return x + y;
    }


    //This method is for the getting the total price of the without tax
    public static double getTotalPrice(Scanner scan, double price){
        Validation valid = new Validation(); 
        int quantity = valid.getInt(scan, "How many do you want?");
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
    
   public static int showMenu(Scanner scan, ArrayList<Menu> foodList){
       int choice = 0;
    	for(int i = 0; i < foodList.size(); i++){
            System.out.println((i + 1) + " " + foodList.get(i));
    	    if(i == foodList.size() - 1){
                Validation valid = new Validation();
                choice = valid.getIntFood(scan, "What food would you like?");
                System.out.println(foodList.get(choice));
            }
        }
        return choice;
    }
    
    public static double amountOfChange(double total, double cashAmount, String prompt){
        double change = cashAmount - total;
        System.out.println(prompt + change);
        return change;
    }
    
    public static void getReceipt(ArrayList<Menu> orderList, double subtotal, double grandTotal){
        System.out.println("You've ordered:");
        for(int i = 0; i < orderList.size(); i++){
            System.out.println(orderList.get(i));
        }
        System.out.println("Your subtotal is " + subtotal);
        System.out.println("Your grand total is " + grandTotal);
    }
    public static double getSaleTax(double totalPrice){
    	return totalPrice * .1;
    }
}
