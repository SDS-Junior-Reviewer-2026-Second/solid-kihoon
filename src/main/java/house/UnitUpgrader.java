package house;

public class UnitUpgrader {
    public void upgrade(Apartment apartment) {
        upgradeFootage(apartment);

        apartment.upgradeBedroomNumber();
    }


    private static void upgradeFootage(Apartment apartment) {
        apartment.squareFootage += 40;
    }
}