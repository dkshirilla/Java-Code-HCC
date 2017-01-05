//Program: Project 3 for COP 2800 to generate a random number and give the user 4 guesses to correct it. 
//The program implements the JOptionPane to provide a GUI for users to use to interact with the program.
//Programmer: Douglas Shirilla
//Date: 10/20/2016

//Answer to question on website: To implement the feature of cancel button to allow the user to quit the game before they have made four guesses
//I would make the program check to see if the cancel button is hit and to send a termination signal to the computer to end the program.


import javax.swing.JOptionPane;//importede for GUI box
import java.util.Random;//imported to generate random numbers

//declare class for game
public class GuessingGame {
	
	//main function
	public static void main(String [] args){
		
	//declare boolean variable for loop to run
	boolean playAgain;
	
	
	//do-while loop to keep game going while the user wants to continue playing
	do{
		
		//generate random integer between 0 and 10 for user to try to guess within 4 tries
		Random randomGenerator = new Random();
		int correctGuess = randomGenerator.nextInt(11);
		
		if (playGame(correctGuess) == true){//invoke the playGame method to run the game logic
			JOptionPane.showMessageDialog(null, "YOU WON!!");}//tell user they got the correct guess in the allowable amount of guesses
		else
			JOptionPane.showMessageDialog(null, "You lost. The correct number was " + correctGuess + ". Stay away from Vegas.");//infor user they lost
		int dialogButton = JOptionPane.showConfirmDialog(null,"Play Again?");//ask user if they want to play again
		if(dialogButton == JOptionPane.YES_OPTION){//get input from user to set the loop variable to true or false
				playAgain = true;}
			else{
				playAgain = false;
			}
	}while(playAgain == true);//checks playAgain variable to continue or finish loop
}
	
	//method that performs main game functions and providing the GUI for the user
	//returns true if user makes correct guess and false if user doesn't make the correct guess
	static boolean playGame (int x){
		String userGuess = null;
		userGuess = JOptionPane.showInputDialog("You have 4 guesses...What is your first guess?");
		int guess = Integer.parseInt(userGuess);
		if (compareTo(guess, x) == 0){//if first guess is correct exit method, otherwise work down the tree until the game is over 
			return true;
		}
		else if (compareTo(guess,x) == 1){
			userGuess = JOptionPane.showInputDialog("Too High! What is your second guess?");
			guess = Integer.parseInt(userGuess);
			if (compareTo(guess, x) == 0){
				return true;
			}
			else if (compareTo(guess,x) == 1){
				userGuess = JOptionPane.showInputDialog("Too High! What is your third guess?");
				guess = Integer.parseInt(userGuess);}
				else
					userGuess = JOptionPane.showInputDialog("Too Low! What is your third guess?");
					guess = Integer.parseInt(userGuess);
				if (compareTo(guess,x) == 0){
					return true;}
				else if(compareTo(guess,x) == 1){
					userGuess = JOptionPane.showInputDialog("Too High! What is your final guess?");
					guess = Integer.parseInt(userGuess);
					if (compareTo(guess,x)==0){
						return true;}
					else 
						return false;
					}
				}
		else 
			userGuess = JOptionPane.showInputDialog("Too low! What is your second guess?");
			guess = Integer.parseInt(userGuess);
			if (compareTo(guess,x)==0){
				return true;}
			else if(compareTo(guess,x)==1){
				userGuess = JOptionPane.showInputDialog("Too High! What is your third guess?");
				if(compareTo(guess,x)==0){
					return true;
				}
				else if(compareTo(guess,x)==1){
					userGuess = JOptionPane.showInputDialog("Too High! What is your final guess?");
					guess = Integer.parseInt(userGuess);
					if(compareTo(guess,x)==0){
						return true;}
					else
						return false;
					}
				}
			else
				userGuess = JOptionPane.showInputDialog("Too Low! What is your third guess?");
				guess = Integer.parseInt(userGuess);
					if(compareTo(guess,x)==0)
						return true;
					else if(compareTo(guess,x)==1){
						userGuess = JOptionPane.showInputDialog("Too High! What is your final guess?");
						guess = Integer.parseInt(userGuess);
						if(compareTo(guess,x)==0){
							return true;
						}
						else
							return false;
					}
					else
						userGuess = JOptionPane.showInputDialog("Too Low! What is your final guess?");
						guess = Integer.parseInt(userGuess);
						if(compareTo(guess,x)==0){
							return true;
						}
						else
							return false;
		}
	
	
	//method to compare the correct answer with the users guess and return the appropriate return value
	static int compareTo(int x, int y){
		if (x > y)
			return 1;//returns positive integer if the users guess was too high
		else if (x < y)
			return -1;//returns negative integer if the users guess was too low
		else
			return 0;//returns 0 if the user guesses the correct number
	}
}//end of GuessingGame class