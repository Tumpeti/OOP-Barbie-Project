package com.codecool.logic;

import com.codecool.model.doll.Doll;
import com.codecool.model.doll.barbie.BarbieHouse;

import java.util.Set;

public class BarbieLand {

    private final Set<BarbieHouse> barbieHouses;
    private final Set<Doll> dolls;

    public BarbieLand(Set<BarbieHouse> barbieHouses, Set<Doll> dolls) {
        this.barbieHouses = barbieHouses;
        this.dolls = dolls;
    }

    public boolean addBarbieHouse(BarbieHouse barbieHouse) {
        return barbieHouses.add(barbieHouse);
    }

    public boolean addDoll(Doll doll) {
        return dolls.add(doll);
    }
}
