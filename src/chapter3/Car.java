package chapter3;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        if (price > 0.00) this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        System.out.println("The price of the car is " + price);
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double applyDiscount(double discount) {
        double discountedPrice = 0.00;
        if (price > 0.00){
            discountedPrice = discount / 100 * price;
            price -= discountedPrice;
        }
        System.out.println("You have a discount of " + discount + "%");
        System.out.printf("%.2f amount has been deducted from the price\n", discountedPrice);
        return price;
    }
}
