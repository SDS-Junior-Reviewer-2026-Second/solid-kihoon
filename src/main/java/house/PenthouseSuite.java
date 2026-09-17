package house;

public class PenthouseSuite extends Apartment {
    public PenthouseSuite() {
        this.houseType = HouseType.PENTHOUSESUIT;
        this.numberOfBedrooms = 4;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }

    @Override
    public void upgradeBedroomNumber(){

        numberOfBedrooms += 1;
    }
}