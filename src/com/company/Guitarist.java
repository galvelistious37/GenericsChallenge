package com.company;

class Guitarist extends Musician {

    Guitarist(String name) {
        super(name);
        super.setInstrument("Guitar");
    }

    @Override
    void isSinger() {
        super.setInstrument(getInstrument() + "/Vocals");
    }
}
