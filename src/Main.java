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
    	DecimalFormat df1 = new DecimalFormat("#.00");
        Scanner scan = new Scanner(System.in);
        String answer = "";
        double cost = 0;


        Validation valid = new Validation();



        ArrayList<Menu> foodList = new ArrayList<Menu>();
        ArrayList<String> orderList = new ArrayList<String>();
        ArrayList<Integer> quantityList = new ArrayList<Integer>();
        ArrayList<Double> costList = new ArrayList<Double>();


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
            double total = 0;
            double overallTotal = 0;
            System.out.println("Welcome to the DeNorLi");
            do {
                int order = showMenu(scan, foodList);


                cost = foodList.get(order).getPrice();
                orderList.add(foodList.get(order).getName());

                System.out.println("It cost $" + df1.format(cost));
                
                int quantity = getQuantity(scan);
                total = getTotalAmount(quantity, cost);
                quantityList.add(quantity);
                costList.add(total);

                if(total > cost) {
                    System.out.println("The cost of the " + quantity +" " + foodList.get(order).getName() + " is $"
                            + df1.format(total) + ".");
                }

                overallTotal += total;
                if(overallTotal > total){
                    System.out.println("Your over all total cost is $" + overallTotal);
                }

                answer = valid.getYesOrNo(scan, "Would you like anything else?");
                } while (answer.equalsIgnoreCase("yes"));

                double saleTax = getSaleTax(overallTotal);
                double grandTotal = getGrandTotal(overallTotal, saleTax);
            System.out.println("Your total is " + overallTotal);
            System.out.println("With taxes it's " + grandTotal);
            double change = pay(scan, grandTotal);

            System.out.println("Press any key + [Enter] to see your receipt:");
            scan.next();
            getReceipt(orderList, quantityList, costList, saleTax, grandTotal, change, df1);
            System.out.println("");
            System.out.println("");
            System.out.println("Press any key + [Enter] to start the menu again.");
            scan.nextLine();
            scan.nextLine();
        }
    }



    public static double getGrandTotal(double x, double y){
    	return x + y;
    }


    //This method is for the getting the total price of the without tax
    public static double getTotalAmount(int quantity, double price){

        return quantity * price;
    }

    public static int getQuantity(Scanner scan){
        Validation valid = new Validation(); 
        int quantity = valid.getNoZero(scan, "How many do you want?");
        return quantity;
    }

    public static double pay(Scanner scan, double total){
        Validation valid = new Validation();
        String paymentType = valid.getString(scan, "How would like to pay cash, check or credit?");
        if(paymentType.equalsIgnoreCase("cash")){
            double cashAmount = valid.getDouble(scan, "Please, put in your dollar amount:", total);
            double change = amountOfChange(total, cashAmount);
            System.out.println("Your change is " + change);
            return change;
        }else if(paymentType.equalsIgnoreCase("check")){
            valid.getInt(scan, "What is the check number?");
            System.out.println("Thank you!");
            return 0;
        }else {
            valid.creditCardNumber(scan, "What is your credit card number?");
            valid.getInt(scan, "What is the expiration date?");
            valid.getInt(scan, "What is the CVV?");
            System.out.println("Thank you!");
            return 0;
        }

    }
    
   public static int showMenu(Scanner scan, ArrayList<Menu> foodList){
       int choice = 0;
    	for(int i = 0; i < foodList.size(); i++){
            System.out.println((i + 1) + ". " + foodList.get(i));
            System.out.println(foodList.get(i).getDescription());
            System.out.println("");
    	    if(i == foodList.size() - 1){
                Validation valid = new Validation();
                choice = valid.getIntFood(scan, "What food would you like?");
                System.out.println(foodList.get(choice));
            }
        }
        return choice;
    }
    
    public static double amountOfChange(double total, double cashAmount){
        double change = cashAmount - total;
        return change;
    }
    
    public static void getReceipt(ArrayList<String> orderList, ArrayList<Integer> quantity, ArrayList<Double> costList,
                                   double saleTax ,double grandTotal, double change, DecimalFormat df1){
        System.out.println("You've ordered:");
        for(int i = 0; i < orderList.size(); i++){
            System.out.println(quantity.get(i) + "\t" + orderList.get(i) + "\t$" + df1.format(costList.get(i)));
        }
        System.out.println("Your sale tax is $" + df1.format(saleTax));
        System.out.println("Your grand total is $" + df1.format(grandTotal));
        if(change > 0.01) {
            System.out.println("Your change is $" + df1.format(change));
        }
        System.out.println("Thank you, and come back, soon!");
    }

    public static double getSaleTax(double totalPrice){

        return totalPrice * .1;
    }
}
