package randomNumberGame;

import java.util.Scanner;

public class randomNumberGame
	{
		public static void main(String[] args)
			{
				boolean userPlaying = true;
				while (userPlaying)
				{
					Scanner userInput = new Scanner (System.in);
					
					System.out.println("What's your name?");
					String userName = userInput.nextLine();
					System.out.println("Hello " + userName);
					
						System.out.println("What difficulty would you like?");
						System.out.println("1) Easy (1-5)");
						System.out.println("2) Medium (1-10)");
						System.out.println("3) Hard (1-100)");
						
						int userDifficulty = userInput.nextInt();
						int numberGuesses = 0;
						boolean userGuessing;
						
							int numberRange;
							if (userDifficulty == 1)
							{
								numberRange = 5;
							}	
							else if (userDifficulty == 2) 
							{
								numberRange = 10;
							}
							else 
							{
							numberRange = 100;
							}
						int secretNumber = (int)(Math.random() * numberRange) + 1;
						System.out.println(secretNumber);
						System.out.println("Now try to guess the number.");
							while (userGuessing = true) 
							{
								int userGuess = userInput.nextInt();
								
								if (userGuess > secretNumber) 
								{
										System.out.println("Too high, try again!");
										numberGuesses ++;
								}
								else if (userGuess < secretNumber) 
								{
										System.out.println("Too low, try again!");
										numberGuesses ++;
								}
								else if (userGuess == secretNumber) 
								{
										numberGuesses ++;
										System.out.println("Congradulations! It only took you " + numberGuesses +  " tries. " + "Would you like to play again? Press 1 for yes or press 2 for no.");
										userGuessing = false;
								}
								else 
								{
										System.out.println("Please follow the intructions.");
								}
								
									
								int userPlayAgain = userInput.nextInt();
								if (userPlayAgain == 2) 
								{
										System.out.println("Thanks for playing! Hope you come back again.");
										userPlaying = false;
								}
								else 
								{
										userPlaying = true;
								}
								
							}
					}	
				}
			}
	