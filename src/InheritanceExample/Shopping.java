package InheritanceExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//A helpful and cheery employee of the store tells you the difference
public class Shopping {
    public static void main(String[] args) throws FileNotFoundException {
        //Reads and prints Mouse.txt
        File a = new File("src/InheritanceExample/Mouse.txt");
        Scanner scan = new Scanner(a);
        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
        System.out.println();
        //declare all mouse objects(basically declaring all mice types
        //I know GAMING is not final(not standard naming scheme), but is is there as a joke ☺
        GamingMouse GAMING = new GamingMouse();
        ErgonomicMouse ErgonomicPlus = new ErgonomicMouse();
        WirelessMouse easyWireless = new WirelessMouse();
        //Printing out all properties
        System.out.println("\t\t\tProperties");
        System.out.println("\t\tGAMING\tErgonomicPlus\teasyWireless");
        System.out.println("Have feet: \t" + GAMING.getFeet() + "\t" + ErgonomicPlus.getFeet() + "\t\t" + easyWireless.getFeet());
        System.out.println("Has RGB: \t" + GAMING.getColor());
        System.out.println("Is wireless: \t\t" + ErgonomicPlus.getIsWireless() + "\t\t" + easyWireless.getIsWireless());
        System.out.println("Is ergonomic: \t\t" + ErgonomicPlus.getIsErgonomic());
        System.out.println("Latency,in ms:\t " + GAMING.getLatencyMS() + "\t" + ErgonomicPlus.getLatencyMS() +
                "\t\t" + easyWireless.getLatencyMS());


    }
}
