package EncapsulationExample;

public class Savings {

    private int dollars;
    private double interestRatePercent;

    public Savings(){
    dollars=10000;
    interestRatePercent =.03;
    }

    public int getDollars() {
        return dollars;
    }

    public double getInterestRatePercent() {
        return interestRatePercent;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public double get5YearProjection(){
        return (dollars*(Math.pow(1+ interestRatePercent,5)));
    }
}
