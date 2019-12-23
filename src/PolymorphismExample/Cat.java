package PolymorphismExample;

public class Cat extends landMammal {
    public Cat(){
        setName("I am cat");
    }
    //cat says meow
    public String meow(){
        return "Meow!";
    }

    @Override
    public String toString() {
        //use the super keyword to access the properties in landMammal
        return "Cat "+ super.toString();
    }
}
