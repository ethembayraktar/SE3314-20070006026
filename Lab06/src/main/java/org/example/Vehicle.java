package org.example;

/***
 * parent clas of vehicles and implementation about that.
 */
abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String licensePlate;
    protected double basePrice;

    /***
     *
     * @param brand brand of car
     * @param model model of car
     * @param licensePlate licenseplate of car
     * @param basePrice base price of car
     */
    public Vehicle(String brand, String model, String licensePlate, double basePrice) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.basePrice = basePrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    /***
     *
     * @param rentalDays
     * @return
     */
    public abstract double calculateRentalPrice(int rentalDays);
}
