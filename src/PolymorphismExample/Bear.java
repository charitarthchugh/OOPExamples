package PolymorphismExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bear {
    public static void main(String[] args) throws FileNotFoundException {
        //Reads and prints Mouse.txt
        File a =new File("src/PolymorphismExample/Animal.txt");
        Scanner scan=new Scanner(a);
        while(scan.hasNextLine())
            System.out.println(scan.nextLine());
        System.out.println();
    }
}
