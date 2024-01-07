package test.java;

import main.java.RewardValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), 0.01);
    }

    @Test
    void create_with_miles_value() {
        double milesValue = 10000;
        var rewardValue = new RewardValue(0, 0, milesValue); // assuming default cashValue and conversionRate
        assertEquals(milesValue, rewardValue.getMilesValue(), 0.01);
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        double conversionRate = 0.1;
        var rewardValue = new RewardValue(cashValue, conversionRate, 0);
        double expectedMilesValue = cashValue * conversionRate;
        assertEquals(expectedMilesValue, rewardValue.convertCashToMiles(), 0.01);
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 1000;
        double conversionRate = 0.2;
        var rewardValue = new RewardValue(0, conversionRate, milesValue);
        double expectedCashValue = milesValue * conversionRate;
        assertEquals(expectedCashValue, rewardValue.convertMilesToCash(), 0.01);
    }
}
