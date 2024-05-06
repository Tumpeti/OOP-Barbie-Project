package com.codecool.model.doll;

import com.codecool.model.doll.barbie.BarbieHouse;

public abstract class Doll {

    private final String name;

    protected BarbieHouse barbieHouse;

    public Doll(String name) {
        this.name = name;
    }

    public abstract void setBarbieHouse(BarbieHouse barbieHouse);

}
