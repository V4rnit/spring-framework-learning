package com.example.learn_spring_framework;
public class Pacman implements GamingConsole{
	@Override
	public void up(){
		System.out.println("UP");
	}
	@Override
	public void down(){
		System.out.println("DOWN");
	}
	public void left(){
		System.out.println("LEFT");
	}
	public void right(){
		System.out.println("RIGHT");
	}
}

