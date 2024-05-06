package com.codecool.model.doll.barbie;

import com.codecool.model.doll.Doll;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class BarbieHouse {
    private String name;
    private Set<Doll> dolls;

    private static final String MOJO_DOJO_CASA_HOUSE_NAME = "Ken's Mojo Dojo Casa House";


    public BarbieHouse() {
        this("Barbie's Dream House");
    }

    public BarbieHouse(String name) {
        this.name = name;
        dolls = new HashSet<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void addDollToHouse(Doll doll) {
        doll.setBarbieHouse(this);
        dolls.add(doll);
    }

    public void kickStereotypicalBarbies() {
        dolls.stream().filter(doll -> doll instanceof Barbie).forEach(doll -> ((Barbie) doll).kickFromHouse());
        dolls = dolls
                .stream()
                .filter(Predicate.not(doll -> doll instanceof StereotypicBarbie))
                .collect(Collectors.toSet());
    }

    public boolean isContainDoll(Doll doll) {
        return dolls.stream().anyMatch(doll1 -> doll1.equals(doll));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (BarbieHouse) obj;
        return Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public boolean isMojoDojoCasaHouse() {
        return name.equals(MOJO_DOJO_CASA_HOUSE_NAME);
    }

    public int getDollCount() {
        return dolls.size();
    }

}
