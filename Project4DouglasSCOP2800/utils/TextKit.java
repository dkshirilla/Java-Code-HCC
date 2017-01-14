//Class TextKit in package utils to demonstrate the use of packages in COP 2800
//Date: 11/22/2016
//Programmer: Douglas Shirilla
//Professor Pollock


package utils;

public class TextKit {

//method for lineOfStars to print out a given number of stars
	public static void lineOfStars(int x){
		
		int numOfStars = x;
		if(numOfStars >= 0){
			// loop to add stars if necessary
		for (int i = 0; i < numOfStars; i++){
			System.out.print("*");
		}
		}
	}
	
//method for taking in an integer and determining its length and padding it to make sure it is  at least 
//the desired minimum length
	public static void pad(int x, int y){
		int formatNum = x;
		String formattedNum = String.format("%d", formatNum);
		//control statement to determine the amount of padding needed
		if(formattedNum.length() >= y){
			System.out.println(formattedNum);}
		else
			System.out.printf("%1$" + ((y - formattedNum.length()) + formattedNum.length()) + "s", formattedNum);
			
	}
}
