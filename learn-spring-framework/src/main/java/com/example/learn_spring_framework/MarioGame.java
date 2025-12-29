package com.example.learn_spring_framework;

public class MarioGame implements GamingConsole{
	@Override
	public void up(){
		System.out.println("Mario Jump");
	}
	@Override
	public void down(){
		System.out.println("Mario Duck");
	}
	@Override
	public void left(){
		System.out.println("Mario moving right");
	}
	@Override
	public void right(){
		System.out.println("Mario moving left");
	}
}
