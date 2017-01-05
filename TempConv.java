
// Written by Wayne Pollock, Tampa, FL USA, 1999 
//Modified by Douglas Shirilla to complete project 2 in COP 2800
//Date:10/04/2016
//Purpose: to create a chart that shows Fahrenheit temperatures and their Celsius counterpart



import java.awt.*;
import java.awt.event.*;

public class TempConv extends Frame
{
	private String message = "Temperature Conversion Chart";
	private String messageF = "Fahrenheit";
	private String messageC = "Celsius";
	private String messageName = "By: Douglas Shirilla COP 2800";
	private String celsiusSymbol = "\u2103";//unicode for degree symbol and a C
	private String fahrenheitSymbol = "\u2109";//unicode for degree symbol and a F
	
	
 public TempConv ()
 {
    setTitle( "Temperature Conversion Chart" );
    setSize( 430, 1000 );
    setVisible( true );

    addWindowListener(
       new WindowAdapter()
       {  public void windowClosing( WindowEvent e )
          {  System.exit( 0 );
          }
       }
    );
 }
  public static void main ( String [] args )
 {
    TempConv me = new TempConv();
 }

 public void paint ( Graphics g )
 {	
	 
		int fahrenheit = 0;
		double celsius;
		int yPos = 140;
		
		//Draw boxes around temperature numbers
		g.setColor(Color.BLUE);
		g.drawRect(25, 120, 380, 80);
		g.setColor(Color.BLACK);
		g.drawRect(25, 200, 380, 360);
		g.setColor(Color.RED);
		g.drawRect(25, 560, 380, 80);
		
		
		//Place initial text needed for chart 
		g.setColor(Color.BLACK);
		g.setFont( new Font( "SansSerif", Font.BOLD, 24 ) );
		g.drawString( message, 35, 70 );  
		g.drawString (messageF, 25,120);
		g.drawString(messageC, 310, 120);
		g.drawString(messageName, 45, 700);
		
		//start loop to perform calculations to fill out chart until 250 degrees Fahrenheit is reached
		
		while (fahrenheit <= 250){
			
		   if(fahrenheit < 32)//if statement to change color of temp to blue for freezing temperatures
		   { 
			   celsius = (5.0 / 9.0) * (fahrenheit - 32);
			   g.setColor(Color.BLUE);
			   String f = String.valueOf(fahrenheit);
			   g.drawString(f+fahrenheitSymbol, 55,yPos);
			   String c = String.valueOf(Math.round(celsius));
			   g.drawString(c+celsiusSymbol, 330, yPos);
		   }
		   
		   else if (fahrenheit >= 212)//statement to make color red for boiling temperatures
		   {
		   celsius = (5.0/9.0) * (fahrenheit - 32);
		   g.setColor(Color.RED);
		   String f = String.valueOf(fahrenheit);
		   g.drawString(f+fahrenheitSymbol, 55,yPos);
		   String c = String.valueOf(Math.round(celsius));
		   g.drawString(c+celsiusSymbol, 330, yPos);
		   }
		   
		   else //makes non-boiling, non-freezing temperature numbers black
		   {
			   celsius = (5.0/9.0) * (fahrenheit - 32);
			   g.setColor(Color.BLACK);
			   String f = String.valueOf(fahrenheit);
			   g.drawString(f+fahrenheitSymbol, 55,yPos);
			   String c = String.valueOf(Math.round(celsius));
			   g.drawString(c+celsiusSymbol, 330, yPos);
		   }
		   
		   fahrenheit += 10;
		   yPos += 20;//increment to move next set of temperatures down the y axis
	   }
 }                                     
}