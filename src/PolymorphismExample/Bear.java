package PolymorphismExample;

public class Bear extends landMammal {
    public Bear() {
        setName("I am a bear");
    }

    //A bear Goes Grr...
    public String growl() {
        return "Grrrr...!";
    }

    public String fish() {
        return "Fished!";
    }

    @Override
    public String toString() {
        //use the super keyword to access the properties in landMammal
        return "Bear " + super.toString();
    }
}
