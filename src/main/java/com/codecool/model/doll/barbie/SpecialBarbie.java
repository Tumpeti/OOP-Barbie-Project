package com.codecool.model.doll.barbie;

public class SpecialBarbie extends Barbie {

    private String job;
    public SpecialBarbie(String job) {
        super(job + " Barbie" );
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void setBarbieHouse(BarbieHouse barbieHouse) {
        if (barbieHouse == null) {
            return;
        }
        this.barbieHouse = barbieHouse;
    }

}
