package org.example;

/***
 * information about economy vehicle and implementation about that.
 */
class EconomyVehicle extends Vehicle {
    private boolean isHybrid;
    private static final double hybridPrice = 10;

    /***
     *
     * @param brand
     * @param model
     * @param licensePlate
     * @param basePrice
     * @param isHybrid
     */
    public EconomyVehicle(String brand, String model, String licensePlate, double basePrice, boolean isHybrid) {
        super(brand, model, licensePlate, basePrice);
        this.isHybrid = isHybrid;
    }

    /***
     * Checks is that car Hybrid or not.
     * @param rentalDays
     * @return
     */
    @Override
    public double calculateRentalPrice(int rentalDays) {
        double totalAdditionalPrice = 0;
        if (isHybrid){
            totalAdditionalPrice += hybridPrice * rentalDays;
        }
        return basePrice * rentalDays + totalAdditionalPrice;
    }
}
