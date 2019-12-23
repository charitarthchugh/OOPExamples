package PolymorphismExample;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*
* This class shows that you can interact with objects in a an array, and you ultimately do not have to worry about the objects that much later on
*/

public class Kingdom {
    public static void main(String[] args) throws FileNotFoundException {
        //Reads and prints Mouse.txt
        File a =new File("src/PolymorphismExample/Animal.txt");
        Scanner scan=new Scanner(a);
        while(scan.hasNextLine())
            System.out.println(scan.nextLine());
        System.out.println();
        //array list to store all animal objects
        ArrayList<landMammal> king=new ArrayList();
        //This way
        Dog doggy=new Dog();
        Cat kitty=new Cat();
        doggy.setName("Spot");
        kitty.setName("Billi");
        //who does not appreciate a bear hug?
        Bear hug=new Bear();
        hug.setName("Bear Hug!");

        king.add(doggy);
        king.add(kitty);
        king.add(hug);
        //another way of adding animals
        king.add(new Dog());
        king.add(new Cat());
        king.add(new Bear());
        /* prints out properties of each
        *I know that I could have used the other for loop, but to make it a teensi-bit easier for who is learning
        */
        for (int i=0; i< king.size();i++){
            System.out.println(king.get(i));
        }
    }
}
