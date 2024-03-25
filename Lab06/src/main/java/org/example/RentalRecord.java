package org.example;

/***
 * Rental record for each rent car.
 */
public class RentalRecord {
    private Vehicle vehicle;
    private int rentalDays;
    private String lessor;

    /***
     *
     * @param vehicle creating vehicle
     * @param rentalDays how many days that car will be rental.
     * @param lessor who lessor that car
     */
    public RentalRecord(Vehicle vehicle, int rentalDays, String lessor) {
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.lessor = lessor;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public String getLessor() {
        return lessor;
    }

    public void setLessor(String lessor) {
        this.lessor = lessor;
    }

    /***
     * calculate rental price
     * @return
     */
    public double getTotalPrice(){
        return vehicle.calculateRentalPrice(rentalDays);
    }
}
