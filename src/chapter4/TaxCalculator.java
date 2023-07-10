package chapter4;


public class TaxCalculator {

    private String firstName;
    private String lastName;

    private double earning;

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + lastName;
    }

    public void setEarning(int earning) {
        this.earning = earning;
    }

    public double getEarning() {
        return earning;
    }

    public void totalTax() {
        double taxPayed = 0.00;
        if (earning > 0 && earning <= 30000){
            taxPayed = (double) 15 / 100 * earning;
        }
        else if (earning > 30000) {
            taxPayed = (double) 20 / 100 * earning;
        }
        System.out.println(taxPayed);
    }
}
