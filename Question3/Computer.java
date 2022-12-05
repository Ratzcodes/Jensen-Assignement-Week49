package com.week49.Question3;

public class Computer implements ComputerOperations{

	private String className;
	
	public Computer() {
		this.className = "Computer";
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getClassName() {
		return this.className;
	}

	@Override
	public void turnOn() {
		System.out.println(getClassName()+" is turned on.");
	}

	@Override
	public void turnOff() {
		System.out.println(getClassName()+" is turned off.");
	}

	@Override
	public void performDownload() {
		System.out.println(getClassName()+" performs download.");
	}

	@Override
	public void performUpload() {
		System.out.println(getClassName()+" performs upload.");
	}

	@Override
	public void playVideo() {
		System.out.println(getClassName()+" plays video.");
	}

	@Override
	public void playMusic() {
		System.out.println(getClassName()+" plays music.");
	}
	
	
	
}
