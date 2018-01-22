package com.cgi.horses.services;

import java.util.List;

import com.cgi.horses.Model.Horse;

public interface RaceService {
	
	public void initRace();
	
	public void startRace();
	
	public int computeNewPosition(Horse horse);
	
	public Horse playOneTurn(List<Horse> horseList);
	
	public int maxPosition(List<Horse> horseList);
	
	public void displayHorsePosition(Horse horse);

}
