package com.example.learn_spring_framework;
//This essentially is a software that runs a game
public class GameRunner{
	private  GamingConsole game;
	public GameRunner(GamingConsole game){
		this.game = game;
	}
	public void run(){
		System.out.println("Running Mario Game" + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
