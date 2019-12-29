import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Reads and prints Mouse.txt
        File a = new File("src/Happy.txt");
        Scanner scan = new Scanner(a);
        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
        System.out.println();
    }
}
