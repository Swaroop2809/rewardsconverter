package main.java;


public class RewardValue {
    private double cashValue;
    private int milesValue;
    public RewardValue(double cashValue) {
        this.cashValue =cashValue;
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return milesValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public void setMilesValue(int milesValue) {
        this.milesValue = milesValue;
    }
    public static void main(String[] args){
        RewardValue reward=new RewardValue(100.00);
        RewardValue reward2 = new RewardValue(500);
        double value= reward.getCashValue();
        System.out.println("Cash Value: $"+ value);
        int value2 = reward2.getMilesValue();
        System.out.println("Miles Value: "+value2 + "Miles");
    }
}
