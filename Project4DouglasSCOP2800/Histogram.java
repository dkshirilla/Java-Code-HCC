//Program:Project 5 COP 2800
//Programmer:Douglas Shirilla
//Date:11/29/2016
//Instructor: Professor Pollock
//Purpose: Use the previously made TextKit package in the previous project to create a historgram
//of integers that have been read in from console input from user and then display the results
//of what was entered in a proper format


import utils.TextKit;  //needed to use methods from TextKit package
import java.util.Scanner; //needed to read in use input

public class Histogram{
	
	private static final int MAX_NUM_OF_VALUES = 26;//max size of array
	
	public static void main(String [] args){
			
			int newInt = 0; //variable to hold user input value
			int numOfValue = 0; //variable to located correct array index
			
			int[] grades = new int[MAX_NUM_OF_VALUES]; //create int array to fill with user input
			Scanner in = new Scanner(System.in); //initialize scanner for input
			
			System.out.println("Enter an integer 1-25 or ^Z to quit"); //instruct user what to do 
			
			while (in.hasNextLine()){
				try
				{
				numOfValue = Integer.parseInt( in.nextLine());
				grades[numOfValue] += 1;
				}
				catch(Exception e){
					System.out.println("Value must be between 1-25 or ^Z");
				}
			}
			
			for(int i = 1; i < grades.length;i++)//loop to create histogram with previously entered input
			{
				int lineNum = i; //variable for line number in final output
				TextKit.pad(lineNum, 3); //format line number for nice output
				System.out.print(":");
				TextKit.lineOfStars(grades[i]); //get the value from index in array and display as stars
				System.out.printf("\n");//new line for display to become more vertical
				
			}
	}
}