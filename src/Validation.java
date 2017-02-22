import java.util.Scanner;

/**
 * Created by wilsonnorman on 2/20/2017.
 */
public class Validation {
    //long creditCardNumber;


    public static int getIntFood(Scanner sc, String prompt) {

        int i = 0;

        boolean isValid = false;

        while (isValid == false) {
            System.out.println(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                i -= 1;
                isValid = true;

            } else {
                System.out.println("Error! Invalid integer value. Try again.");
                sc.nextLine();
            }
        }
        sc.nextLine();
        return i;
    }

    public static int getInt(Scanner sc, String prompt) {

        int i = 0;

        boolean isValid = false;

        while (isValid == false) {
            System.out.println(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;

            } else {
                System.out.println("Error! Invalid integer value. Try again.");
                sc.nextLine();
            }
        }
        sc.nextLine();
        return i;
    }

    public static String getString(Scanner sc, String prompt) {
        System.out.println(prompt);

        String s = sc.next();// read user entry

        while (!(s.equalsIgnoreCase("cash") || s.equalsIgnoreCase("check") || s.equalsIgnoreCase("credit"))) {
            System.out.println("Invalid choice, please choose cash, check or credit");
            s = sc.next();
            sc.nextLine();  // discard any other data entered on the line
        }

        return s;
    }

    public static long creditCardNumber(Scanner sc, String prompt) {
        System.out.println(prompt);
        long creditCardNumber = sc.nextLong();

        while (!isValid(creditCardNumber)){
            System.out.println("Error! invalid card number ");
            System.out.println(prompt);
            creditCardNumber = sc.nextLong();
        }

        System.out.println();
        return creditCardNumber;

    }


    public static boolean isValid(long creditCardNumber) {
        int sum = 0;
        int count = 0;

        while (creditCardNumber > 0) {
            count++;
            int digit = (int) (creditCardNumber % 10);
            if (count % 2 == 1) {
                sum = sum + digit;

            } else if (digit < 5) {
                sum = sum + 2 * digit;
            } else {

                sum = sum + 2 * digit - 9;
            }
            creditCardNumber = creditCardNumber / 10;
        }
        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double getDouble(Scanner sc, String prompt, double total) {
        double d = 0;
        boolean isValid = false;
        System.out.println(prompt);
        while (isValid == false) {
            d = sc.nextDouble();
            if (d < total) {
                System.out.println("Error! Number must be " + total + " or greater.");
            } else {
                isValid = true;
            }
        }
        return d;
    }


    public static String getYesOrNo(Scanner sc, String prompt) {
        System.out.println("Would you like anything else yes or no?");

        String s = sc.next();// read user entry

        while (!(s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("no"))) {
            System.out.println("Error! Invalid entry, please type yes or no ");
            s = sc.next();
            sc.nextLine();

        }
        return s;
    }

    public static int getNoZero(Scanner sc, String prompt) {

        int i = 0;

        boolean isValid = false;

        while (isValid == false) {
            System.out.println(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                if (i == 0) {
                    i = 1;

                }
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value. Try again.");
                sc.nextLine();
            }
        }
        sc.nextLine();  // discard any other data entered on the line
        return i;
    }
}

