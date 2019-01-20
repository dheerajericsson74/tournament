package com.star.tournament.club;

public class MainTest {

	public static void main(String[] args) {
		
		
	
        CricketPlayer   doni = new CricketPlayer("Doni");
        CricketPlayer   raina = new CricketPlayer("Raina");
        
        Team<CricketPlayer> CSK = new Team<>("CSK");
        CSK.addPlayer(doni);
        CSK.addPlayer(raina);
        
        System.out.println(CSK.getName()+" players "+CSK.NumPlayer());
        
        
        Team<FootballPlayer> RealMadrid = new Team<>("RealMadrid");
    	FootballPlayer joe = new FootballPlayer("Joe");
        RealMadrid.addPlayer(joe);
        
        Team<FootballPlayer> ManchesterUnited = new Team<>("ManchesterUnited");
        FootballPlayer beckham = new FootballPlayer("beckham");
        
        ManchesterUnited.addPlayer(beckham);
        
        System.out.println(ManchesterUnited.getName()+" players "+ManchesterUnited.NumPlayer());
        
        ManchesterUnited.matchResult(RealMadrid, 4, 2);
        
        System.out.println(ManchesterUnited.getName()+" played "+ManchesterUnited.played+" won :"+ManchesterUnited.won +" lost :"+ManchesterUnited.lost+" tied :"+ManchesterUnited.tied+" ranking :"+ManchesterUnited.ranking());
	}

}
