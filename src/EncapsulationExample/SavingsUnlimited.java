package EncapsulationExample;

public class SavingsUnlimited {

    /*public variables- anyone can come in and access them and change them, they also are not final
    should avoid as much as possible*/
    int dollars;
    double interestRatePercent;

    //method that gets a 5 year projection given dollars and interestRatePercent
    public double get5YearProjection() {
        return (dollars * (Math.pow(1 + interestRatePercent, 5)));
    }

}
