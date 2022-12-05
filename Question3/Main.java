package com.week49.Question3;

public class Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Laptop laptop = new Laptop();
		StationaryComputer stationary = new StationaryComputer();
		
		computer.turnOn();
		computer.playVideo();
		computer.playMusic();
		computer.performDownload();
		computer.turnOff();
		
		
		laptop.turnOn();
		laptop.playMusic();
		laptop.playVideo();
		laptop.performDownload();
		laptop.turnOff();
		
		stationary.turnOn();
		stationary.playVideo();
		stationary.performDownload();
		stationary.turnOff();

	}

}
