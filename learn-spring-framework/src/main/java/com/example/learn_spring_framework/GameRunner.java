package com.example.learn_spring_framework;

public class GameRunner{
	public MarioGame game;
	public GameRunner(MarioGame game){
		this.game = game;
	}
	public void run(){
		System.out.println("Running Mario Game" + game);
		game.jump();
		game.duck();
		game.right();
		game.left();
	}
}
