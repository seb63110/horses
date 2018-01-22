package com.cgi.horses;

import java.util.ArrayList;
import java.util.List;

import com.cgi.horses.Model.Horse;
import com.cgi.horses.Model.Race;
import com.cgi.horses.services.HorseService;
import com.cgi.horses.services.HorseServiceImpl;
import com.cgi.horses.services.RaceService;
import com.cgi.horses.services.RaceServiceImpl;

public class Main {
	
	private HorseService horseService;
	
	private RaceService raceService;
	
	public static void main(String[] args){
		Main main = new Main();
		main.startRace();
	}
	
	public void startRace(){
		System.out.println("Starting race");
		//create horses
		/*
		 * generate a number of horses with horseService
		 */
		int number = 5;
		int finishLine = 100;
		List<Horse> horseList = new ArrayList<Horse>();
		for(int i = 0; i < number; i++){
			Horse h = new Horse();
			h.setNumber(i+1);
			horseList.add(h);
		}
		//create race and affect horses
		/**
		 * generate with raceService
		 */
		Race race = new Race();
		race.setHorseList(horseList);
		/**
		 * for each horse
		 * calculate each horse position
		 * check if it is the end of the race
		 * 
		 */
		Horse leadingHorse = null;
		int turn = 1;
		while(true){
			System.out.println("Playing turn " + turn);
			leadingHorse = getRaceService().playOneTurn(horseList);
			race.setMaxPosition(getRaceService().maxPosition(horseList));
			race.setTurn(turn);
			System.out.println("After turn " + race.getTurn() + " , leading horse == " + leadingHorse.getNumber());
			if(race.getMaxPosition() >= finishLine){
				break;
			}
			turn++;
		}
		System.out.println("race is finished after " + race.turn);
		System.out.println("winner is number " + leadingHorse.getNumber());
		
	}

	public HorseService getHorseService() {
		if(horseService == null){
			horseService = new HorseServiceImpl();
		}
		return horseService;
		
	}
	
	public RaceService getRaceService(){
		if(raceService == null){
			raceService = new RaceServiceImpl();
		}
		return raceService;
	}
	

}
