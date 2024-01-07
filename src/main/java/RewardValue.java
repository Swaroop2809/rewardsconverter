package main.java;

public class RewardValue {
    private double cashValue;
    private double conversionRate;
    private double milesValue;

    public RewardValue(double cashValue, double conversionRate, double milesValue) {
        this.cashValue = cashValue;
        this.conversionRate = conversionRate;
        this.milesValue = milesValue;
    }

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // You might want to initialize conversionRate and milesValue based on some default values here.
        // For now, assuming some default values of 1.0 for conversionRate and milesValue.
        this.conversionRate = 1.0;
        this.milesValue = 1.0;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public double convertCashToMiles() {
        return cashValue * conversionRate;
    }

    public double convertMilesToCash() {
        return milesValue * conversionRate;
    }

    public double convertMilesToCash(double milesValue) {
        return milesValue / conversionRate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        RewardValue reward = new RewardValue(100.0);

        // Getting cash Value
        double cashValue = reward.getCashValue();
        System.out.println("Cash Value: $" + cashValue);

        // Converting cash to miles
        double milesFromCash = reward.convertCashToMiles();
        System.out.println("Miles Value from Cash: " + milesFromCash + " Miles");

        // Converting miles to cash
        double milesInput = 50.0;
        double convertedCash = reward.convertMilesToCash(milesInput);
        System.out.println("Converted Cash Value: $" + convertedCash);
    }
}
