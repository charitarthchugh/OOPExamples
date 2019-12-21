package InheritanceExample;

public class Zipper {
    //variable that describes the zipper's current state
    private static boolean state;
    public Zipper(){
        //sets initial state to open
        state=true;
    }
    public void Zip(){
        /*
        change the state to opposite
        if open, set to close
        if closed, set to open
        */
        state= !state;

    }
}
