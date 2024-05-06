package com.codecool.logic;

import com.codecool.model.doll.barbie.BarbieHouse;
import com.codecool.model.doll.barbie.SpecialBarbie;
import com.codecool.model.doll.barbie.StereotypicBarbie;
import com.codecool.model.doll.ken.Ken;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarbieLandTest {

    private BarbieLand underTest;

    @BeforeEach
    public void setUnderTest() {
        underTest = new BarbieLand();
    }

    @Test
    void givenNoDollsShouldReturnFalseForIsBarbieLandDoomed() {
        //Arrange
        //Act
        boolean actual = underTest.isBarbieLandDoomed();
        //Assert
        assertFalse(actual);
    }

    @Test
    void givenMoreKenShouldReturnTrueForIsBarbieLandDoomed() {
        //Arrange
        StereotypicBarbie barbie = new StereotypicBarbie();
        barbie.goToRealWorld();

        Ken beachKen = new Ken();
        Ken solidKen = new Ken();
        beachKen.goToRealWorld();
        solidKen.goToRealWorld();

        underTest.addDoll(barbie);
        underTest.addDoll(beachKen);
        underTest.addDoll(solidKen);
        //Act
        boolean actual = underTest.isBarbieLandDoomed();
        //Assert
        assertTrue(actual);
    }

    @Test
    void givenMoreBarbieShouldReturnFalseForIsBarbieLandDoomed() {
        //Arrange
        StereotypicBarbie solidBarbie = new StereotypicBarbie();
        StereotypicBarbie doctorBarbie = new StereotypicBarbie();
        StereotypicBarbie beachBarbie = new StereotypicBarbie();
        solidBarbie.goToRealWorld();
        doctorBarbie.goToRealWorld();
        beachBarbie.goToRealWorld();

        Ken beachKen = new Ken();
        Ken solidKen = new Ken();
        beachKen.goToRealWorld();
        solidKen.goToRealWorld();

        underTest.addDoll(solidBarbie);
        underTest.addDoll(beachBarbie);
        underTest.addDoll(doctorBarbie);
        underTest.addDoll(beachKen);
        underTest.addDoll(solidKen);
        //Act
        boolean actual = underTest.isBarbieLandDoomed();
        //Assert
        assertFalse(actual);
    }

    @Test
    void givenNoDollHousesFindBiggestDojoMojoCasaHouseShouldReturnNull() {
        assertNull(underTest.findBiggestDojoMojoCasaHouse());
    }

    @Test
    void givenTwoDollHousesFindBiggestDojoMojoCasaHouseShouldReturnBiggest() {
        //Arrange
        SpecialBarbie doctorBarbie = new SpecialBarbie("Doctor");
        Ken beachKen = new Ken();
        Ken solidKen = new Ken();
        BarbieHouse biggestDojoMojoHouse = new BarbieHouse();
        BarbieHouse smallestDojoMojoHouse = new BarbieHouse();

        biggestDojoMojoHouse.addDollToHouse(beachKen);
        biggestDojoMojoHouse.addDollToHouse(doctorBarbie);
        smallestDojoMojoHouse.addDollToHouse(solidKen);

        beachKen.goToRealWorld();

        underTest.addBarbieHouse(biggestDojoMojoHouse);
        underTest.addBarbieHouse(smallestDojoMojoHouse);

        //Act
        BarbieHouse actual = underTest.findBiggestDojoMojoCasaHouse();
        BarbieHouse expected = biggestDojoMojoHouse;
        //Assert
        assertEquals(expected, actual);
    }
}