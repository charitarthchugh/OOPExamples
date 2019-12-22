package InheritanceExample;
/*
*This example
*/
public class GamingMouse extends Mouse {
    //for that good ol' performance boosting RGB, y'all ☺
    private String color;
    //it is a gaming mouse after all, "GAMING" means clicky, right?
    private boolean clicky;
    //latency of the mouse
    private int latencyMS;
    public GamingMouse(){

        color="Rainbow";
        clicky=true;
        latencyMS=100;

    }
    //sets the color value- look at Encapsulation for more of why these methods are used
    public void setColor(String color){
        color=this.color;
    }
    //gets the color value- look at Encapsulation for more of why these methods are used
    public String getColor() {
        return color;
    }
    public boolean getClicky(){
        return clicky;
    }
    public int getLatencyMS(){
        return latencyMS;
    }
}
