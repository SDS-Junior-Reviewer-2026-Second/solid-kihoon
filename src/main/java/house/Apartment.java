package house;

abstract class Apartment {
    int squareFootage;
    int numberOfBedrooms;
    HouseType houseType;
    abstract void setSquareFootage(int sqft);
    abstract public void upgradeBedroomNumber();
}