package com.company;

class Vocals extends Musician {
    Vocals(String name) {
        super(name);
        super.setInstrument("Vocals");
    }

    @Override
    void isSinger() {
    }
}
