package InheritanceExample;
//this class contains the generic properties of a mouse
public class Mouse {
    //variable says if the mouse has any feet
    private boolean feet;
    //mouse constructor
    public Mouse(){
        //sets initial state to true
        feet=true;
    }
    public String rightClick (){
        /*
        *
        * return right click to simulate a right click
        */
        return "Right click!";

    }
    public String leftClick (){

        return "Left click!";
    }
    public String scrollUp(){

        return "Scrolled up!";
    }
    public String scrollDown (){

        return "Scrolled Down!";
    }
    public boolean getFeet(){
        return feet;
    }
}
