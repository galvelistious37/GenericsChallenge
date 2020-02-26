package com.company;

class Drummer extends Musician {
    Drummer(String name) {
        super(name);
        super.setInstrument("Drums");
    }

    @Override
    void isSinger() {
        super.setInstrument(getInstrument() + "/Vocals");
    }
}
