package com.codecool.model.doll.ken;

import com.codecool.model.doll.barbie.BarbieHouse;
import com.codecool.model.doll.barbie.SpecialBarbie;
import com.codecool.model.doll.barbie.StereotypicBarbie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KenTest {

    private BarbieHouse barbieHouse;

    private Ken underTest;

    @BeforeEach
    public void setUnderTest() {
        underTest = new Ken();
    }

    @Test
    void afterChangingThreeTimesBarbieHouseShouldKickStereotypicBarbies() {
        //Arrange
        barbieHouse = new BarbieHouse();
        StereotypicBarbie stereotypicBarbie = new StereotypicBarbie();
        SpecialBarbie specialBarbie = new SpecialBarbie("Doctor");
        barbieHouse.addDollToHouse(specialBarbie);
        barbieHouse.addDollToHouse(stereotypicBarbie);
        underTest.setBarbieHouse(barbieHouse);
        underTest.setBarbieHouse(barbieHouse);
        underTest.setBarbieHouse(barbieHouse);
        underTest.setBarbieHouse(barbieHouse);
        System.out.println(underTest);
        //Act
        boolean containStereotypicBarbie = barbieHouse.isContainDoll(stereotypicBarbie);
        boolean containSpecialBarbie = barbieHouse.isContainDoll(specialBarbie);
        boolean containsRightBarbie = !containStereotypicBarbie && containSpecialBarbie;
        //Assert
        assertTrue(containsRightBarbie);
    }
}