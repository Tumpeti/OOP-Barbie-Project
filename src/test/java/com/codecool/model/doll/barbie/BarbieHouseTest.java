package com.codecool.model.doll.barbie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarbieHouseTest {

    private BarbieHouse underTest;

    @BeforeEach
    public void setUnderTest() {
        underTest = new BarbieHouse();
    }

    @Test
    void givenEmptyBarbieHouseKickBarbiesShouldNotThrowException() {
        assertDoesNotThrow(() -> underTest.kickStereotypicalBarbies());
    }

    @Test
    void addDollToBarbieHouseShouldBeSetInDoll() {
        //Arrange
        StereotypicBarbie barbie = new StereotypicBarbie();
        underTest.addDollToHouse(barbie);
        //Act
        boolean expected = true;
        boolean actual = underTest.isContainDoll(barbie);
        //Assert
        assertEquals(expected,actual);
    }


}