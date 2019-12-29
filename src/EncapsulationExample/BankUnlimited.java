package EncapsulationExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 *This class shows that it is best if you do not allow the user to modify any value, or otherwise, pe prepared for some wacky numbers
 */
public class BankUnlimited {
    public static void main(String[] args) throws FileNotFoundException {
        File a = new File("src/EncapsulationExample/Bank.txt");
        Scanner scan = new Scanner(a);
        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
        System.out.println();

        //initialize Savings
        SavingsUnlimited save = new SavingsUnlimited();
        scan = new Scanner(System.in);

        try {
            System.out.print("Enter dollar amount:");
            save.dollars = scan.nextInt();
            System.out.print("Enter interest rate:");
            save.interestRatePercent = scan.nextDouble();

        } catch (Exception e) {
            //this will use default values when one of the values typed above is not valid
            System.out.println("5 year projection with " + (1 + save.interestRatePercent) + "& " + save.dollars + " % interest--> $" +
                    save.get5YearProjection());
            //make sure that the system exits so that it does not conflict with line 34-35
            System.exit(0);
        }
        //same as above but occurs only with input values
        System.out.println("5 year projection with " + (1 + save.interestRatePercent) + "% & " + save.dollars + " % interest--> $" +
                save.get5YearProjection());

    }
}
