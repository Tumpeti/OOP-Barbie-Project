package com.codecool.model.doll.barbie;

import com.codecool.model.doll.Doll;


public abstract class Barbie extends Doll  {

    public Barbie(String name) {
        super(name);
    }


    public void kickFromHouse() {
        setBarbieHouse(null);
    }

}
