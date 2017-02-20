import java.util.Scanner;

/**
 * Created by wilsonnorman on 2/20/2017.
 */
public class Validation {
    public static int getInt(Scanner sc, String prompt) {

        int i = 0;

        boolean isValid = false;

        while (isValid == false) {

            System.out.print(prompt);
                if (sc.hasNextInt())

                {
                    i = sc.nextInt();
                    isValid = true;

                } else {
                    System.out.println("Error! Invalid integer value. Try again.");
                }

                sc.nextLine();  // discard any other data entered on the line
        }
             return i;
        }

}