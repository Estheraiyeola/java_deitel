package chapter3;

public class PetrolPurchase {
    private String stationsLocation;
    private String typeOfPetrol;
    private int quantityInLitres;
    private double pricePerLitre;
    private double percentageDiscount;


    public PetrolPurchase(String stationsLocation, String typeOfPetrol, int quantityInLitres,
                          double pricePerLitre, double percentageDiscount){
        this.stationsLocation = stationsLocation;
        this.typeOfPetrol = typeOfPetrol;
        if (quantityInLitres > 0) this.quantityInLitres = quantityInLitres;
        if (pricePerLitre > 0) this.pricePerLitre = pricePerLitre;
        if (percentageDiscount > 0) this.percentageDiscount = percentageDiscount;
    }
    public void setStationLocation(String stationsLocation) {
        this.stationsLocation = stationsLocation;
    }

    public String getStationLocation() {
        return stationsLocation;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setQuantityInLitres(int quantityInLitres) {
        this.quantityInLitres = quantityInLitres;
    }

    public int getQuantityInLitres() {
        return quantityInLitres;
    }

    public void setPricePerLitres(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public double getPurchaseAmount() {

        return quantityInLitres * pricePerLitre - percentageDiscount;
    }
}
