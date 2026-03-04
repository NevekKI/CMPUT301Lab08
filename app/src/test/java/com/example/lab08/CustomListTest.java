package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "Ab");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void deleteCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "Ab");
        list.addCity(calgary);
        list.deleteCity(calgary);

        assertFalse(list.hasCity(calgary));
    }
}
