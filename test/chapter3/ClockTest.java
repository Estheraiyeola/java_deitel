package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    private Clock activity;
    @BeforeEach
    public void setUp(){
        activity = new Clock(0, 0, 0);
    }

    @Test
    public void testSetHourMethod(){
        activity.setHour(23);
        assertEquals(23, activity.getHour());
    }

    @Test
    public  void testSetMinuteMethod(){
        activity.setMinute(108);
        assertEquals(48, activity.getMinute());
    }

    @Test
    public void testSetSecondsMethod(){
        activity.setSeconds(3600);
        assertEquals(0, activity.getSeconds());
    }
    @Test
    public void testTheWHoleMethods(){
        activity.setSeconds(3600);
        activity.getHour();
        activity.getMinute();
        activity.getSeconds();

    }
}
