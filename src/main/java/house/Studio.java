package house;

public class Studio extends Apartment {
    public Studio() {
        this.houseType = HouseType.STUDIO;
        this.numberOfBedrooms = 0;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
    @Override
    public void upgradeBedroomNumber(){

    }
}