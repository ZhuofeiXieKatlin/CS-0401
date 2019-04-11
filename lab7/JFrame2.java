import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  // ACTIONLISTENER INTERFACE 

public class JFrame2
{
	public static void main(String [] args)
	{
		JFrame window = new JFrame("Events");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // CLICKING THE X WILL KILL THE APP NOW 
		
		// JBUTTON IS AN -ACTIVE- CONTROL. CAN PRE PROGRAMMED TO REACT TO BEING CLICKED VIA ACTIONLISTENER
		
		JButton button = new JButton("Click Me to change my color");
		button.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 60));
		
		ActionListener listener = new MyListener();
		button.addActionListener(listener);
	
		Container content = window.getContentPane();
		content.setLayout(new FlowLayout());
		content.add(button);

		window.setSize(640,480);
		window.setVisible(true);
	}
}// END CLASS JFRAME2