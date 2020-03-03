package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    // ArrayList<Team> teams;
        // Collections.sort(teams);
//        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
//        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
//        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
//        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
//        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
//
//        FootballPlayer player1 = new FootballPlayer("Jekk Baerr");
//        FootballPlayer player2 = new FootballPlayer("Jimmy Beam");
//        FootballPlayer player3 = new FootballPlayer("Jack Daniels");
//        FootballPlayer player4 = new FootballPlayer("Jose Cuervo");
//
//        adelaideCrows.addPlayer(player1);
//        adelaideCrows.addPlayer(player2);
//        melbourne.addPlayer(player3);
//        melbourne.addPlayer(player4);
//
//        League<Team<BaseballPlayer>> baseballLeague = new League<>("AL");
//        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
//
//        footballLeague.add(adelaideCrows);
//        footballLeague.add(melbourne);
//        footballLeague.add(hawthorn);
//        footballLeague.add(fremantle);
//
//
//        baseballLeague.add(baseballTeam);
//
//        hawthorn.matchResult(fremantle, 1, 0);
//        hawthorn.matchResult(adelaideCrows, 3, 8);
//
//        adelaideCrows.matchResult(fremantle, 2, 1);
//
//        footballLeague.showLeagueTable();
//        baseballLeague.showLeagueTable();
//        doBandStuff();
        // Just adding another line to check pushing stuff
        // Pulled changes pushed from laptop, now pushing from desktop again
        boolean quit = false;
        Musician selection;


        getGreeting();
        getInquiry();
        getMenu();

        while(!quit){
            if(scanner.hasNextInt()){
                int enteredValue = scanner.nextInt();
                scanner.nextLine();
                if(checkIfQuit(enteredValue)){
                    quit = true;
                }
                if(checkIfBand(enteredValue)){
                    System.out.println("You chose to start a garage band!");
                }

                selection = makeSelection(scanner.nextInt());



            } else {
                System.out.println("Enter a valid number!");
            }
            scanner.nextLine();
        }

    }

    private static boolean checkIfBand(int enteredValue) {
        return enteredValue == 1;
    }

    private static boolean checkIfQuit(int enteredValue) {
        return enteredValue == 0;
    }

    private static Musician makeSelection(int nextInt) {
        String name = "";
        scanner.nextLine();
        switch(nextInt){
            case 2:
                System.out.println("What is the Guitarist's name?");
                return new Guitarist(name);
//            case 3:
//                System.out.println("Selected to build a Vocalist:");
//                return 3;
//            case 4:
//                System.out.println("Selected to build a Bassist:");
//                return 4;
//            case 5:
//                System.out.println("Selected to build a Drummer:");
//                return 5;
//            case 0:
//                System.out.println("Shutting down ...");
//                return 0;
        }
        return null;
    }

    private static void getGreeting() {
        System.out.println("Hello, welcome to build-a-band");
    }

    private static void getInquiry() {
        System.out.println("What would you like to do?");
    }

    private static void getMenu() {
        System.out.println("1 - Create a Band");
        System.out.println("2 - Create a Guitarist");
        System.out.println("3 - Create a Vocalist");
        System.out.println("4 - Create a Bassist");
        System.out.println("5 - Create a Drummer");
        System.out.println("0 - QUit");
    }

    private static void doBandStuff() {
        Guitarist kirkHammett = new Guitarist("Kirk Hammett");
        Guitarist jamesHetfield = new Guitarist("James Hetfield");
        Guitarist kerryKing = new Guitarist("Kerry King");
        Guitarist jeffHanneman = new Guitarist("Jeff Hanneman");
        Guitarist kurtCobain = new Guitarist("Kurt Cobain");
        Guitarist larryLalonde = new Guitarist("Larry Lalonde");
        Guitarist adamJones = new Guitarist("Adam Jones");

        Bassist lesClaypool = new Bassist("Les Claypool");
        Bassist jasonNewstead = new Bassist("Jason Newstead");
        Bassist tomArraya = new Bassist("Tom Arraya");
        Bassist chrisNovoselic = new Bassist("Chris Novoselic");
        Bassist justinChancellor = new Bassist("Just Chancellor");

        Drummer dannyCarrey = new Drummer("Danny Carrey");
        Drummer larsUlrich = new Drummer("Lars Ulrich");
        Drummer daveLombardo = new Drummer("Dave Lombardo");
        Drummer timAlexander = new Drummer("Tim Alexander");
        Drummer daveGrohl = new Drummer("Dave Grohl");

        Vocals maynardJamesKeenan = new Vocals("Maynard James Keenan");

        jamesHetfield.isSinger();
        kurtCobain.isSinger();
        lesClaypool.isSinger();
        tomArraya.isSinger();
        maynardJamesKeenan.isSinger();

        Band<Musician> nirvana = new Band<>("Nirvana");
        nirvana.addMember(kurtCobain);
        nirvana.addMember(chrisNovoselic);
        nirvana.addMember(daveGrohl);

        Band<Musician> metallica = new Band<>("Metallica");
        metallica.addMember(jamesHetfield);
        metallica.addMember(kirkHammett);
        metallica.addMember(jasonNewstead);
        metallica.addMember(larsUlrich);

        Band<Musician> slayer = new Band<>("Slayer");
        slayer.addMember(kerryKing);
        slayer.addMember(jeffHanneman);
        slayer.addMember(tomArraya);
        slayer.addMember(daveLombardo);

        Band<Musician> tool  = new Band<>("Tool");
        tool.addMember(adamJones);
        tool.addMember(justinChancellor);
        tool.addMember(dannyCarrey);
        tool.addMember(maynardJamesKeenan);

        Band<Musician> primus = new Band<>("Primus");
        primus.addMember(lesClaypool);
        primus.addMember(larryLalonde);
        primus.addMember(timAlexander);

        nirvana.showMembers();
        metallica.showMembers();
        slayer.showMembers();
        tool.showMembers();
        primus.showMembers();

        Band<Guitarist> guitarsOnly = new Band<>("Geetars only");
//        guitarsOnly.addMember(lesClaypool);
        guitarsOnly.addMember(kirkHammett);
        guitarsOnly.addMember(kurtCobain);

    }
}
