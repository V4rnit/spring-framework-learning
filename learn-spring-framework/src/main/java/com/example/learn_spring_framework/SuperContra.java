package com.example.learn_spring_framework;

public class SuperContra implements GamingConsole{
	@Override 
	public void up(){
		System.out.println("up");
	}
	@Override
	public void down(){
		System.out.println("Sit Down");
	}
	@Override
	public void left(){
		System.out.println("Go back");
	}
	@Override
	public void right(){
		System.out.println("Shoot a bullet");
	}
}
