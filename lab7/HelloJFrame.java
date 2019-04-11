// CS 401 FIRST DEMO OF JFRAME (adapted from a John Ramirez example)

import java.awt.*; 		// needed for the Component and Font classes
import javax.swing.*; 	// needed for the JFrame and JLabel classes

public class HelloJFrame
{
	public static void main(String [] args)
	{
		// THE MAIN APPLICATION WINDOW IS ALWAYS A JFRAME

		JFrame window = new JFrame("my First JFrame");

		// CAUSES ATTEMPTS TO KILL PROGRAM BY CLICK X AT TOP RIGHT OF WINDOW TO BE IGNORED
		// (GOTTA HIT ^C ON COMMAND LINE TO KILL IT - OR KILL THE ENTIRE COMMAND WINDOW)

		window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// JLABEL IS A RECTANGULAR NON-ACTIVE CONTROL THAT JUST DISPLAYS TEXT  

		JLabel message = new JLabel("Hello GUI World");
		message.setFont(new Font("TimesRoman", Font.ITALIC + Font.BOLD, 32));
		message.setForeground(Color.RED);

		// CONTENT PANE IS LIKE THAT PLASTIC SHEET OVER YOUR CELL PHONE SCREEN
		// WE NEVER ADD COMPONENTS OR DRAW GRAPICS DIRECTLY TO OUR JFRAME
		// INSTEAD, WE ALWAYS ADD COMPONENTS AND DRAW ON THE CONTENT PANE
		
		Container content = window.getContentPane();
		content.add(message);

		// HARDCODE THE PHYSICAL PIXEL DIMENTIIONS OF OUR JFRAME WINDOW

		window.setSize(640,480);

		// EVERYTHING UNTIL NOW WAS LIKE SETTING A STAGE BEFORE THE CURTAIN IS OPENEND

		window.setVisible(true);// OPEN THE CURTAIN
	}
}