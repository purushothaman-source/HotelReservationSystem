package com.workshop;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
    @Test
    public void givenhotel_WhenAdded_ShouldReturnTrue() {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood",110);
        hotelReservation.addHotel("Bridgewood",160);
        boolean result =hotelReservation.addHotel("Ridgewood",220);
        Assert.assertTrue(result);
     }
}
