package com.cg;

public class Match {
private String Country;
private String captain;
private int Matches;
public Match(String country, String captain, int matches) {
	Country = country;
	this.captain = captain;
	Matches = matches;
	
}
@Override
public String toString() {
	return "Match [Country=" + Country + ", captain=" + captain + ", Matches=" + Matches + "]";
}
}



