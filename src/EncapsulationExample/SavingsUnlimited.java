package EncapsulationExample;

public class SavingsUnlimited {
    //NC== No Change
    //public variables- anyone can come in and access them
    int dollars;
    double interestRatePercent;


    public double get5YearProjection(){
        return (dollars*(Math.pow(1+ interestRatePercent,5)));
    }

}
