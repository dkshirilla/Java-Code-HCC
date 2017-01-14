//Program the purpose of this is to pull in methods from the package utils to demonstrate
//the use of packages.
//Programmer: Douglas Shirilla
//Date: 11/22/2016
//Professor Pollock

import utils.TextKit;

public class TextKitApp{
	public static void main(String [] args){
		
		//demonstrate use of lineOfStars method from utils package
		System.out.print("There should be three stars here ");
		TextKit.lineOfStars(3);
		
		//new line for buffer
		System.out.printf("\n");
		
		//demonstrate use of pad method from utils package
		System.out.println("Below is the result of TextKit.pad(4444,4)");
		TextKit.pad(4444,4);
	}
	}