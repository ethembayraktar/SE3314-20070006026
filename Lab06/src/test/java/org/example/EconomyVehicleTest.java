package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EconomyVehicleTest {

    @org.junit.jupiter.api.Test
    void calculateRentalPrice() {
        EconomyVehicle economyVehicle = new EconomyVehicle("Renault","Kangoo","XYZ123",50,true);
        int rentalDays = 5;
        assertEquals(300,economyVehicle.calculateRentalPrice(rentalDays));
    }
}