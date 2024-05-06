package com.codecool.model.doll.barbie;

import com.codecool.model.doll.CanGoToRealWorld;

public class StereotypicBarbie extends Barbie implements CanGoToRealWorld {

    private static final String NAME = "Barbie";
    private boolean knowsTheKnowledgeOfStruggle;
    public StereotypicBarbie() {
        super(NAME);
        knowsTheKnowledgeOfStruggle = false;
    }

    @Override
    public void setBarbieHouse(BarbieHouse barbieHouse) {
        if (barbieHouse == null) {
            goToRealWorld();
        }
        this.barbieHouse = barbieHouse;
    }

    @Override
    public void goToRealWorld() {
        knowsTheKnowledgeOfStruggle = true;
    }
}
