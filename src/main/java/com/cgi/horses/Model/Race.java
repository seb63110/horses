package com.cgi.horses.Model;

import java.util.List;

public class Race {
	
	private List<Horse> horseList;	
	public int turn;
	private int maxPosition;
	private Horse winner;
	private Horse leadingHorse;

	public Race() {
	}
	

	public List<Horse> getHorseList() {
		return horseList;
	}

	public void setHorseList(List<Horse> horseList) {
		this.horseList = horseList;
	}


	public int getMaxPosition() {
		return maxPosition;
	}


	public void setMaxPosition(int maxPosition) {
		this.maxPosition = maxPosition;
	}


	public Horse getWinner() {
		return winner;
	}


	public void setWinner(Horse winner) {
		this.winner = winner;
	}


	public Horse getLeadingHorse() {
		return leadingHorse;
	}


	public void setLeadingHorse(Horse leadingHorse) {
		this.leadingHorse = leadingHorse;
	}


	public int getTurn() {
		return turn;
	}


	public void setTurn(int turn) {
		this.turn = turn;
	}
	
	
	
	
	
	
	

}
