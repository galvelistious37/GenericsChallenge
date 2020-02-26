package com.company;

public abstract class Musician {
    private String name;
    private String instrument;

    Musician(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String getInstrument(){
        return instrument;
    }

    void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    abstract void isSinger();
}
