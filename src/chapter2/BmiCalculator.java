package chapter2;

public class BmiCalculator {
    private double bmi;

    public void calculateBmi(double weight, double height) {
        if (weight > 0 && height > 0) {
            double bmi_ = weight * 703 / (height * height);
            bmi = Math.round(bmi_);
        }
    }

    public double getBmi() {
        if (bmi < 18.5){
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal Weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else if (bmi > 30) {
            System.out.println("Obesity");
        }
        return bmi;
    }
}
