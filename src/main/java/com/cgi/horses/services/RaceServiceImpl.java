package com.cgi.horses.services;

import java.util.List;
import java.util.Random;

import com.cgi.horses.Model.Horse;

public class RaceServiceImpl implements RaceService {
	
	public void initRace(){
		
	}
	
	public void startRace(){
		
	}
	
	public int computeNewPosition(Horse horse){
		Random r = new Random();
		int number = r.nextInt(10) + 1;
		return number;
	}
	
	public Horse playOneTurn(List<Horse> horseList){
		Horse leadingHorse = null;
		int move = 0;
		int newPosition = 0;
		for(Horse horse: horseList){
			//System.out.println("FOR HORSE = " + horse.getNumber());
			move = this.computeNewPosition(horse);
			newPosition = horse.getCurrentPosition() + move;
			//System.out.println("new position = " + horse.getCurrentPosition() +  " + " + move + " === " + newPosition);
			horse.setCurrentPosition(newPosition);
			displayHorsePosition(horse);
			if(leadingHorse == null || leadingHorse.getCurrentPosition() < horse.getCurrentPosition()){
				leadingHorse = horse;
			}
		}
		return leadingHorse;
	}
	
	public int maxPosition(List<Horse> horseList){
		int maxPosition = 0;
		for(Horse horse: horseList){
			if(horse.getCurrentPosition() > maxPosition){
				maxPosition = horse.getCurrentPosition();
			}
		}
		return maxPosition;		
	}
	
	public void displayHorsePosition(Horse horse){
		int finalPostion = 100;
		int currentPostion = horse.getCurrentPosition();
		String str = "";
		for(int i = 1; i <= finalPostion; i++){
			if(i <= currentPostion){
				str += "*";
			}else if(i < finalPostion){
				str += " ";
			}else{
				str += "||";
			}			
		}
		System.out.println("Horse " + horse.getNumber() + " " + str);
	}

}
