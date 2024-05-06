package com.codecool.model.doll.allan;

import com.codecool.model.doll.Doll;
import com.codecool.model.doll.barbie.BarbieHouse;

public class Alan extends Doll {
    public Alan() {
        super("Alan");
    }

    @Override
    public void setBarbieHouse(BarbieHouse barbieHouse) {
        this.barbieHouse = barbieHouse;
    }
}
