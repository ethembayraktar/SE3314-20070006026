package org.example;

/***
 * information about luxury vehicle and implementation about that.
 */
class LuxuryVehicle extends Vehicle {

    private boolean hasGPS;
    private boolean hasLeatherSeats;
    private static final double GPSpricePerDay=20;
    private static final double LeatherSeatsPerDay = 30;

    /***
     *
     * @param brand brand of car
     * @param model model of car
     * @param licensePlate licenseplate of car
     * @param basePrice base price of car
     * @param hasGPS has gps or not
     * @param hasLeatherSeats has leather seats or not
     */
    public LuxuryVehicle(String brand, String model, String licensePlate, double basePrice, boolean hasGPS, boolean hasLeatherSeats) {
        super(brand, model, licensePlate, basePrice);
        this.hasGPS = hasGPS;
        this.hasLeatherSeats = hasLeatherSeats;
    }

    /***
     * checks hasGPS and hasLeatherSeats.
     * @param rentalDays
     * @return total price of rental car.
     */
    @Override
    public double calculateRentalPrice(int rentalDays) {
        double totalAdditionalPrice = 0 ;
        if (hasGPS){
            totalAdditionalPrice += GPSpricePerDay * rentalDays;
        }
        if (hasLeatherSeats){
            totalAdditionalPrice += LeatherSeatsPerDay * rentalDays;
        }
        return basePrice * rentalDays + totalAdditionalPrice;
    }
}
