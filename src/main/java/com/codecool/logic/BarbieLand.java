package com.codecool.logic;

import com.codecool.model.doll.Doll;
import com.codecool.model.doll.barbie.BarbieHouse;
import com.codecool.model.doll.barbie.StereotypicBarbie;
import com.codecool.model.doll.ken.Ken;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class BarbieLand {

    private final Set<BarbieHouse> barbieHouses;
    private final Set<Doll> dolls;

    public BarbieLand() {
        this.barbieHouses = new HashSet<>();
        this.dolls = new HashSet<>();
    }

    public boolean addBarbieHouse(BarbieHouse barbieHouse) {
        return barbieHouses.add(barbieHouse);
    }

    public boolean addDoll(Doll doll) {
        return dolls.add(doll);
    }

    public boolean isBarbieLandDoomed() {
        return dolls.stream().filter(doll -> (doll instanceof Ken) && ((Ken) doll).isPatriarchal()).count() >
                dolls.stream().filter(doll -> (doll instanceof StereotypicBarbie) && ((StereotypicBarbie) doll).isKnowsTheKnowledgeOfStruggle()).count();
    }

    public BarbieHouse findBiggestDojoMojoCasaHouse() {
        return barbieHouses.stream().filter(BarbieHouse::isMojoDojoCasaHouse).max(Comparator.comparing(BarbieHouse::getDollCount)).orElse(null);
    }

}
