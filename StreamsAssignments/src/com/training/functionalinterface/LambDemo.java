package com.training.functionalinterface;

public class LambDemo {

	public static void main(String[] args) {

		IGames igames=(games)->{
			for(String lotofgamesL:games) {
				System.out.println(lotofgamesL);
			}
		};

		String[]games= {"cricket","football","vollyball","tennis","hacky"};
		igames.printGames(games);
		

	}

}