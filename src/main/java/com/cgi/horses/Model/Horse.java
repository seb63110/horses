package com.cgi.horses.Model;

public class Horse extends Equidae{
	
	private String name;
	private int weight;
	private Jockey jockey;
	private Saddle saddle;
	private int number;
	private int currentPosition;
	
	
	public Horse(){
		
	}
	public Horse(String name, Integer weight, Jockey jockey, Saddle saddle) {
		super();
		this.name = name;
		this.weight = weight;
		this.jockey = jockey;
		this.saddle = saddle;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Jockey getJockey() {
		return jockey;
	}
	public void setJockey(Jockey jockey) {
		this.jockey = jockey;
	}
	public Saddle getSaddle() {
		return saddle;
	}
	public void setSaddle(Saddle saddle) {
		this.saddle = saddle;
	}
	public int getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getWeight() {
		return weight;
	}
	
	
	
	
	
}
