/* ###################################################################################################
	FOR THE FIRST TIME YOU ARE USING A JAVA FILE THAT CONTAINS MORE THAN ONE CLASS DEFINITION.
	WE NEED THIS CLASS BECUASE WE WANT TO WRITE SOME CODE THAT GETS TRIGGERED EVERY TIME A JBUTTON
	OUT IN MAIN GETS CLICKED. WE NEED TO IMPLEMENT AN INTERFACE THAT ALLOWS US TO CONTROL WHAT HAPPENS
	WHEN OUR JBUTTON IS CLICKED. THIS CLASS IS/MUST BE PRIVATE SINCE YOU ARE ONLY ALLOWED TO HAVE ONE 
	PUBLIC CLASS AT THE TOP LEVEL IN A SOURCE FILE.
*/
class MyListener implements ActionListener // MyListener is JUST THE NAME WE MAKE UP FOR OUR CLASS
{
	// COULD HAVE INITIALIZED IN C'TOR BUT WE DID IT QIK n DIRTY
	int index = 0;
	Color[] myColors = {Color.RED, Color.BLUE, Color.CYAN, Color.YELLOW, Color.ORANGE, Color.MAGENTA, Color.GREEN};
	
/* 	EACH TIME A JBUTTON IS CLICKED OUT ON THE JFRAME, THIS METHOD IS AUTOMATICALLY CALLED BY THE GUI INTERFACE. 
	SINCE THERE COULD BE MANY JBUTTON OBJECTS ON OUR JFRAME, THE REF TO THE SPECIFIC BUTTON	THAT WAS CLICKED IS 
	AUTOMATICALLY PASSED IN WHEN THIS METHOD IS TRIGGERED BY THE CLICK. THIS IS WHERE WE WRITE OUR CODE THAT WE 
	WANT TO BE EXECUTED EVERY TIME A JBUTTON IS CLICKED
*/
	public void actionPerformed(ActionEvent e)
	{
		Component refToJButtonThatWasClicked = (Component) e.getSource();
		refToJButtonThatWasClicked.setForeground(myColors[index]);
		index = (index + 1) % myColors.length;
		refToJButtonThatWasClicked.setBackground(myColors[index]);
	}
}