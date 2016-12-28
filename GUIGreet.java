  // A stand-alone GUI Java program to display a friendly greeting.
  // Also added code to close the application when the user clicks
  // the mouse in the close box.
  
  // Written by Wayne Pollock, Tampa, FL USA, 1999
  //Modified by Douglas Shirilla for project 1 in COP 2800
 
 //Import needed packages
  import java.awt.*;
  import java.awt.event.*;
  
  
  //Create the class GUIGreet
 public class GUIGreet extends Frame
 {
    private String message = "Doug Inc.";
 // Create the window for the project
    public GUIGreet ()
    {
       setTitle( "Project 1" );
       setSize( 300, 200 );
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
       GUIGreet me = new GUIGreet();
    }
 //use the paint method to create the graphics
    public void paint ( Graphics g )
    {
		//use the methods to invoke the proper display needed
       g.setColor( Color.BLACK );
       g.drawRect( 30, 40, 240, 130 );
	   g.setColor( Color.GREEN);
	   g.fill3DRect(50, 55, 200 , 100, true);
	   g.setColor(Color.BLACK);
	   g.drawLine(30,40,270,170);
	   g.drawLine(270,40,30,170);
	   g.setColor(Color.YELLOW);
	   g.fillOval(230, 130, 40, 40);
       g.setColor( Color.BLUE );
	   g.fillOval(30, 130, 40, 40);
	   g.setColor(Color.BLACK);
	   g.fillOval(30,40,40,40);
	   g.setColor(Color.RED);
	   g.fillOval(230,40,40,40);
	   g.setColor(Color.BLACK);
	   g.fillOval(70,63,160,80);
	   g.setColor(Color.WHITE);
	   g.fillRect(75 , 80, 150, 45);
	   g.setColor(Color.BLUE);
       g.setFont( new Font( "Courier", Font.BOLD, 28 ) );
       g.drawString( message, 85, 110 );  // Position determined
    }                                     // by trial and error!
 }