package InheritanceExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IdealBackpack {
    public static void main(String[] args) throws FileNotFoundException {
        //Reads and prints ASCII Text File
        File a =new File("src/InheritanceExample/ASCII.txt");
        Scanner scan=new Scanner(a);
        while(scan.hasNextLine())
        System.out.println(scan.nextLine());

        System.out.println("Lets build an ideal backpack ");

        /* Bagpack bag=new Bagpack();
        System.out.println(bag);*/
    }
}
