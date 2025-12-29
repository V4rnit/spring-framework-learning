package com.example.learn_spring_framework;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App01Gaming{

	public static void main(String[] args) {
		//Create a Game of Super Contra and contruct a game runner class with Super Contra game
		var PlaySuperContra= new SuperContra();
		var gameRunner = new GameRunner(PlaySuperContra);
		//Now Since i have implemented the interfaces i am able to run multiple games (Loosely coupled)
	
		//Create a Game of mario and construct a game runner class with the mario game 
		var PlayMario = new MarioGame();
		var gameRunnerTwo = new GameRunner(PlayMario);

		//Create a Game of Pacman and creat a game runner class with pacman game
		var PlayPacman = new Pacman();
		var gameRunnerThree = new GameRunner(PlayPacman);

		System.out.println("Playing Super Contra");
		gameRunner.run();
		System.out.println("Playing Mario");
		gameRunnerTwo.run();
		System.out.println("Playing pacman");
		gameRunnerThree.run();
	}

}
