package EncapsulationExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*This class shows the better way to allow the modifying of values
 * This also employs more abstraction
 * more abstraction== generally better
 *  */
public class Bank {
    public static void main(String[] args) throws FileNotFoundException {
        //output Bank.txt
        File a = new File("src/EncapsulationExample/Bank.txt");
        Scanner scan = new Scanner(a);
        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
        System.out.println();
        //reset scanner obj
        scan = new Scanner(System.in);
        //initialize Savings
        Savings save = new Savings();

        System.out.print("Enter dollar amount:");
        try {
            save.setDollars(scan.nextInt());
        } catch (Exception e) {
            //this will use default values when one of the values typed above is not valid
            System.out.println("5 year projection with " + (1 + save.getInterestRatePercent()) + "& " + save.getDollars() + " % interest--> $" +
                    save.get5YearProjection());
            //make sure that the system exits so that it does not conflict with line 34-35
            System.exit(0);
        }
        //same as above but occurs only with input values
        System.out.println("5 year projection with " + (1 + save.getInterestRatePercent()) + "& " + save.getDollars() + " % interest--> $" +
                save.get5YearProjection());


    }
}
