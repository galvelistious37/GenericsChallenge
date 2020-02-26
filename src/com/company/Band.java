package com.company;

import java.util.ArrayList;

class Band<T extends Musician> {
    private String name;
//    int albums;
//    int songs;
//    String homeTown;

    private ArrayList<T> members;

    Band(String name) {
        this.name = name;
        members = new ArrayList<>();
    }

    void addMember(T musician){
        if(members.contains(musician)){
            System.out.println(musician.getName() + " is already part of the band, dude");
        } else {
            members.add(musician);
            System.out.println(musician.getName() + " has joined " + this.name);
        }
    }

    void showMembers(){
        getSpacer();
        getNumberOfMembers();
        for (T t : members){
            System.out.println("\t" + t.getName() + " - " + t.getInstrument());
        }
        getSpacer();
    }

    private void getSpacer() {
        System.out.println("****************************************");
    }

    private void getNumberOfMembers() {
        System.out.println(this.name + " consists of "
                + members.size() + " members:");
    }
}
