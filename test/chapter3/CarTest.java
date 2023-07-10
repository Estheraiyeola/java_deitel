package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    private Car activity;

    @BeforeEach
    public void setUp(){
        activity = new Car("Lexus", "2019", 500.00);
    }

    @Test
    public void testSetModelMethod(){
        String modelType = activity.getModel();
        assertEquals("Lexus", modelType);
        activity.setModel("Toyota");
        assertEquals("Toyota", activity.getModel());
    }

    @Test
    public void testSetYearMethod(){
        String yearType = activity.getYear();
        assertEquals("2019", yearType);
        activity.setYear("2054");
        assertEquals("2054", activity.getYear());
    }

    @Test
    public void testSetPriceMethod(){
        double priceType = activity.getPrice();
        assertEquals(500.00, priceType);
        activity.setPrice(550.50);
        assertEquals(550.50, activity.getPrice());
    }

    @Test
    public void testDiscountMethodForFivePercent(){
        Car lexus = new Car("lexus 330", "2015", 2_000_000);
        double price = lexus.getPrice();
        assertEquals(2_000_000, price);
        lexus.applyDiscount(5);
        double newPrice = lexus.getPrice();
        assertEquals(1_900_000, newPrice);

    }

    @Test
    public void testDiscountMethodForSevenPercent(){
        Car toyota = new Car("Toyota camry", "2019", 5_000_000);
        double price_ = toyota.getPrice();
        assertEquals(5_000_000, price_);
        toyota.applyDiscount(7);
        double newPrice_ = toyota.getPrice();
        assertEquals(4650000, newPrice_);
    }

}
