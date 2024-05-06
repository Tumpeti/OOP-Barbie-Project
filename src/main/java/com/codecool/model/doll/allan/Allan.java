package com.codecool.model.doll.allan;

import com.codecool.model.doll.Doll;
import com.codecool.model.doll.barbie.BarbieHouse;

public class Allan extends Doll {
    public Allan() {
        super("Allan");
    }

    @Override
    public void setBarbieHouse(BarbieHouse barbieHouse) {
        this.barbieHouse = barbieHouse;
    }
}
