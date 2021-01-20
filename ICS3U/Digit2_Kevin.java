/* This program asks the user for an integer and a position. The program will
output the number at the position of the reversed integer. The program continues
until the user enters a negative number. */

public class Digit2_Kevin
{

    public static void main (String[] args)
    {

	//variable declarations
	int reversed = 0, digit, position, input1 = 0, hold;
	String input = "0", stringReversed;
	boolean ok = true;


	do
	{ // do while loop for entire program to repeat
	    do
	    { //do while loop for position input
		do
		{ //do while loop for try and catch

		    try
		    { //try to bulletproof string
			System.out.print ("Positive integer, negative number to exit: ");
			input = In.getString ();

			//String to int
			input1 = Integer.parseInt (input);

			//if user enters negative #, exit
			if (input1 < 0)
			{
			    System.exit (0);
			}
			//otherwise, continue
			else
			    ok = false;

			//catch string
		    }
		    catch (NumberFormatException exc)
		    {
			ok = true;
			System.out.println ("Error, string.");
		    }
		    //loop input while user enters string
		}
		while (ok);



		do
		{ //bulletproof position negative

		    //user inputs position
		    System.out.print ("Position (non-negative): ");
		    position = In.getInt ();

		}
		while (position < 0);



		//if position is over length of string
		if (position + 1 > input.length ())
		{
		    //output is 0
		    System.out.println ("Output: 0");
		    System.out.println ();
		}

		//loop back to ask for set of inputs
	    }
	    while (position + 1 > input.length ());

	    //set another variable equal to users input
	    hold = input1;

	    //while loop to reverse digits
	    while (input1 != 0)
	    {


		digit = input1 % 10;
		reversed = reversed * 10 + digit;
		input1 /= 10;

	    }
	    //reset digit value to 0 every time loop

	    //int to string of reversed num
	    stringReversed = String.valueOf (reversed);

	    //reset reversed value to 0 every time loop
	    reversed = 0;

	    //output num using method
	    System.out.println ("Output: " + digit (stringReversed, position));

	    System.out.println ();

	    //loop program while user doesnt input negative
	}
	while (hold >= 0);


    } //main method


    //method for returning num at position
    public static char digit (String n, int position)
    {
	return n.charAt (position);
    } //digit method
}

