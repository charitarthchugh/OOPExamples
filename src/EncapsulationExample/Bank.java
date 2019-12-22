package EncapsulationExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) throws FileNotFoundException {
        //output Bank.txt
        File a = new File("src/EncapsulationExample/Bank.txt");
        Scanner scan = new Scanner(a);
        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
        System.out.println();
        //reset scanner obj
        scan= new Scanner(System.in);
        //initialize Savings
        Savings save=new Savings();

        System.out.print("Enter dollar amount:");
        try {
            save.setDollars(scan.nextInt());
        }catch (Exception e){
            System.out.println("5 year projection with "+(1+save.getInterestRatePercent()) +"& "+save.getDollars()+" % interest--> $"+
                                save.get5YearProjection());
            System.exit(0);
        }
        System.out.println("5 year projection with "+(1+save.getInterestRatePercent())+"& "+save.getDollars()+" % interest--> $"+
                save.get5YearProjection());





    }
}
