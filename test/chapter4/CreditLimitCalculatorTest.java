package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditLimitCalculatorTest {
    private CreditLimitCalculator activity;
    @BeforeEach
    public void setUp(){
        activity = new CreditLimitCalculator();
    }

    @Test
    public void testThatSetAccountNumberWorks(){
        activity.setAccountNumber(100);
        int accNo = activity.getAccountNumber();
        assertEquals(100, accNo);
    }

    @Test
    public void testThatBalanceMethodWorks(){
        activity.setBalance(-5000);
        int balance = activity.getBalance();
        assertEquals(0, balance);
    }

    @Test
    public void testThatItemsChargedMethodWorks(){
        activity.setItemsCharged(-1000);
        int itemsCharged = activity.getItemsCharged();
        assertEquals(0, itemsCharged);
    }

    @Test
    public void testThatTotalCreditsMethodWorks(){
        activity.setTotalCredits(500);
        int totalCredits = activity.getCredits();
        assertEquals(500, totalCredits);
    }

    @Test
    public void testThatTheSetCreditLimitWorks(){
        activity.setCreditLimit(-5500);
        int creditLimit = activity.getCreditLimit();
        assertEquals(0, creditLimit);
    }

    @Test
    public void testThatCalculateNewBalanceWorks(){
        activity.setAccountNumber(100);
        activity.setBalance(6000);
        assertEquals(6000, activity.getBalance());
        activity.setItemsCharged(1000);
        activity.setTotalCredits(500);
        activity.setCreditLimit(5500);
        activity.calculateBalance();
        int newBalance = activity.getBalance();
        assertEquals(6500, newBalance);

    }
}