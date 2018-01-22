package com.cgi.horses.services;

import com.cgi.horses.Model.Horse;

public class HorseServiceImpl implements HorseService{
	
	public Horse createHorse(){
		return new Horse();
	}

}
