package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {
    private PetrolPurchase activity;

    @BeforeEach
    public void setUp(){
        activity = new PetrolPurchase("Abuja", "PMS",
                5, 56.80, 5.6);
    }

    @Test
    public void testThatTheSetStationLocationMethodWorks(){
        activity.setStationLocation("Lokoja");
        assertEquals("Lokoja", activity.getStationLocation());
    }

    @Test
    public void testThatTheSetTypeOfPetrolMethodWorks(){
        activity.setTypeOfPetrol("PMS");
        assertEquals("PMS", activity.getTypeOfPetrol());
    }

    @Test
    public void testThatTheSetQuantityInLitresMethodWorks(){
        activity.setQuantityInLitres(5);
        assertEquals(5, activity.getQuantityInLitres());
    }

    @Test
    public void testThatTheSetPricePerLitreMethodWorks(){
        activity.setPricePerLitres(56.80);
        assertEquals(56.80, activity.getPricePerLitre());
    }

    @Test
    public void testThatTheSetPercentageDiscountMethodWorks(){
        activity.setPercentageDiscount(5.6);
        assertEquals(5.6, activity.getPercentageDiscount());
    }

    @Test
    public void testTheGetMethods(){
        String location = activity.getStationLocation();
        assertEquals("Abuja", location);
        String type = activity.getTypeOfPetrol();
        assertEquals("PMS", type);
        int quantity = activity.getQuantityInLitres();
        assertEquals(5, quantity);
        double price = activity.getPricePerLitre();
        assertEquals(56.80, price);
        double percentageDiscount = activity.getPercentageDiscount();
        assertEquals(5.6, percentageDiscount);
    }

    @Test
    public void testThatTheGetPurchaseAmountWorks(){
        double amount = activity.getPurchaseAmount();
        assertEquals(278.4, amount);
    }
}
