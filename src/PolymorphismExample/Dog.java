package PolymorphismExample;

public class Dog extends landMammal {
    public Dog(){
        setName("I am a dog!");
    }
    //Dog says woof
    public String bark(){
        return "Woof!";
    }
    public String fetch(){
        return "Fetched!";
    }
    public String sit(){
        return "Sat!";
    }

    @Override
    public String toString() {
        //use the super keyword to access the properties in landMammal
        return "Dog "+ super.toString();
    }
}
