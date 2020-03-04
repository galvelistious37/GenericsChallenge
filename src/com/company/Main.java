package com.company;


public class Main {

    public static void main(String[] args) {
	    // ArrayList<Team> teams;
        // Collections.sort(teams);
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        FootballPlayer player1 = new FootballPlayer("Jekk Baerr");
        FootballPlayer player2 = new FootballPlayer("Jimmy Beam");
        FootballPlayer player3 = new FootballPlayer("Jack Daniels");
        FootballPlayer player4 = new FootballPlayer("Jose Cuervo");

        adelaideCrows.addPlayer(player1);
        adelaideCrows.addPlayer(player2);
        melbourne.addPlayer(player3);
        melbourne.addPlayer(player4);

        League<Team<BaseballPlayer>> baseballLeague = new League<>("AL");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);


        baseballLeague.add(baseballTeam);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.showLeagueTable();
        baseballLeague.showLeagueTable();
        // Just adding another line to check pushing stuff
        // Pulled changes pushed from laptop, now pushing from desktop again

        }
}
