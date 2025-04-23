package day7;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Random random = new Random();
		//int targetNumber = random.nextInt(10)+1;
		int targetNumber = (int) (Math.random()*11);
		boolean guessCorrectly = false;
		
		int attempts =3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("Guess a number between 1 and 10");
		System.out.println("You have "+attempts+ " attempts.Good Luck!");
		
		for(int i=1;i<=attempts;i++)
		{
			System.out.println("Attempt" +i+ ": Enter your Guess: ");
			int userGuess = scanner.nextInt();
			if(userGuess == targetNumber)
			{
				System.out.println("Congratulation! You guessed the correct number");
				guessCorrectly = true;
				break;
			}
			else
				System.out.println("Wrong Guess");
			if(i<attempts)
				System.out.println("Try Again!");
		}
		
		if(!guessCorrectly)
		{
			System.out.println("You've used all attempts.The correct number was: "+targetNumber);
		}
		
		scanner.close();
	}
}
