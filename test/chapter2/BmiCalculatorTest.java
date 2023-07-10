package chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BmiCalculatorTest {

    @Test
    public void testThatCalculatorExists(){
        BmiCalculator activity = new BmiCalculator();
        assertNotNull(activity);
    }

    @Test
    public void testThatCalculateBmiMethodWorks(){
        BmiCalculator activity = new BmiCalculator();
        activity.calculateBmi(143, 15);

        assertEquals(251.0, activity.getBmi());
    }

    @Test
    public void testThatCalculateBmiMethodDoesNotTakeNegativeNumbers(){
        BmiCalculator activity = new BmiCalculator();
        activity.calculateBmi(-143, -20);

        assertEquals(0.0, activity.getBmi());
    }
}
