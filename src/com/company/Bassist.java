package com.company;

class Bassist extends Musician {
    Bassist(String name) {
        super(name);
        super.setInstrument("Bass");
    }

    @Override
    void isSinger() {
        super.setInstrument(getInstrument() + "/Vocals");
    }
}
