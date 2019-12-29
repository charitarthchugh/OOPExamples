package EncapsulationExample;

public class Savings {

    private int dollars;
    //this variable is declared final so that it cannot change
    private final double interestRatePercent;

    public Savings() {
        dollars = 10000;
        interestRatePercent = .03;
    }

    //this a classic example of a getter method
    //it is simply a method that gets the current value of a variable, in this case it is dollars
    public int getDollars() {
        return dollars;
    }

    //this allows the user to access and use the interest rate, but not modify it
    public double getInterestRatePercent() {
        return interestRatePercent;
    }

    /* this is a classic setter method
     *
     *  */
    public void setDollars(int dollars) {
        /*this keyword- so that the two dollar variables do not conflict--
         *Java, when finding variables takes a nearest approach-
         * in this case the input var dollars and will make it set equal to itself
         */
        this.dollars = dollars;
    }

    public double get5YearProjection() {
        return (dollars * (Math.pow(1 + interestRatePercent, 5)));
    }
}
