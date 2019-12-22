package EncapsulationExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankUnlimited {
    public static void main(String[] args) throws FileNotFoundException {
        File a = new File("src/EncapsulationExample/Bank.txt");
        Scanner scan = new Scanner(a);
        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
        System.out.println();

        //initialize Savings


        System.out.print("Enter interest rate:");
        double interest =scan.nextDouble();

    }
}
