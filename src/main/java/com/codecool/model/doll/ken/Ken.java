package com.codecool.model.doll.ken;

import com.codecool.model.doll.Doll;
import com.codecool.model.doll.barbie.BarbieHouse;
import com.codecool.model.doll.CanGoToRealWorld;

public class Ken extends Doll implements CanGoToRealWorld {

    private static final String HOUSE_NAME = "Ken's Mojo Dojo Casa House";
    private static final String NAME = "Ken";
    private static final String PATRIARCHY = "Patriarchy";

    private String job;
    private int visitingCounter;

    public Ken() {
        super(NAME);
        this.job = "Beach";
        this.visitingCounter = 0;
    }

    @Override
    public void setBarbieHouse(BarbieHouse barbieHouse) {
        if (visitingCounter >= 3) {
            goToRealWorld();
        }
        this.barbieHouse = barbieHouse;
        visitingCounter++;
    }

    @Override
    public void goToRealWorld() {
        job = PATRIARCHY;
        if (barbieHouse != null) {
            barbieHouse.setName(HOUSE_NAME);
            barbieHouse.kickStereotypicalBarbies();
        }
    }

    public boolean isPatriarchal() {
        return job.equals(PATRIARCHY);
    }

    @Override
    public String toString() {
        return "Ken{" +
                "job='" + job + '\'' +
                ", visitingCounter=" + visitingCounter +
                "} " + super.toString();
    }
}
