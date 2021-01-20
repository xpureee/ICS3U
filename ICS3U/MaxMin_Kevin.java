/*  This program  will ask the user for two integers, identify which one is 
largerand which one is smaller, and output the results until user inputs
0 0. */

public class MaxMin_Kevin
{

    public static void main (String[] args)
    {

	//variable declaration
	int num1, num2;

	do //do loop as long as user doesnt enter 0 0
	{
	    //get user input
	    System.out.println ("Please enter two integers - 0 0 to terminate.");
	    num1 = In.getInt ();
	    num2 = In.getInt ();

	    //if user enters 0 0, terminate
	    if (isFinished (num1, num2))
	    {
		System.out.println ("Terminated.");
		System.exit (0);

	    }

	    //call method to display max and min
	    displayValues (num1, num2);
	}
	while (!isFinished (num1, num2)); // isFinished method, loop if user doesnt input 0 0

    } //main method


    // min method
    public static int min (int num1, int num2)
    {
	//return smallest value
	return Math.min (num1, num2);
    } //min method


    //max method
    public static int max (int num1, int num2)
    {

	//returns bigger number
	return Math.max (num1, num2);
    } //max method


    //isFinished method
    public static boolean isFinished (int num1, int num2)
    {

	//return true if user enters 0 0, false if not
	return num1 == 0 && num2 == 0;
    } //isFinished method


    //displayValues method
    public static void displayValues (int num1, int num2)
    {
	//output inputs back to user
	System.out.print ("Input values: " + num1 + " " + num2 + " ");
	//max method to output max value
	System.out.print ("Max value: " + max (num1, num2) + " ");
	//min method to output min value
	System.out.println ("Min value: " + min (num1, num2));
	System.out.println ();
    } //displayValues method
}




