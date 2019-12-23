package PolymorphismExample;

public class landMammal {
    private int eyes;
    private boolean mouth;
    private int feet;
    private String name="";
    public landMammal(){
        eyes=2;
        mouth=true;
        feet=4;
        name="I am a land mammal!";
    }
    public String poop(){
        //Now tell me, what animal does not poop?
        return "pooped!";
    }
    public String eat(){
        return "Ate!";
    }
    public String sleep(){
        return "Sleeping!";
    }

    public boolean isMouth() {
        return mouth;
    }

    public int getEyes() {
        return eyes;
    }

    public int getFeet() {
        return feet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "landMammal{" +
                "eyes=" + eyes +
                ", mouth=" + mouth +
                ", feet=" + feet +
                ", name='" + name + '\'' +
                '}';
    }
}
