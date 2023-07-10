package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TaxCalculatorTest {
    private TaxCalculator activity;
    @BeforeEach
    public void setUp(){
        activity = new TaxCalculator();
    }
    @Test
    public void testThatSetNameMethodWorks(){
        activity.setName("Sultan", "BigHead");
        String name = activity.getName();
        String expected = "Sultan" + "BigHead";
        assertEquals(expected, name);
    }

    @Test
    public void testThatSetEarningMethodWorks(){
        activity.setEarning(20000);
        double earning = activity.getEarning();
        assertEquals(20000, earning);
    }

    @Test
    public void testThatTotalTaxMethodWorks(){
        activity.setName("Esther", "Aiyeola");
        activity.setEarning(50000);
        activity.totalTax();
        activity.setName("Sultan", "BigHead");
        activity.setEarning(29000);
        activity.totalTax();
    }
}
