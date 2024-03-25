package org.example;

import static org.junit.jupiter.api.Assertions.*;

class LuxuryVehicleTest {

    @org.junit.jupiter.api.Test
    void calculateRentalPrice() {
        LuxuryVehicle luxuryVehicle = new LuxuryVehicle("Mercedes","E220","ABCDE",100,true,true);
        int rentalDays = 7;
        assertEquals(1050,luxuryVehicle.calculateRentalPrice(rentalDays));
    }
}