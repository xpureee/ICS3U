/* This program asks the user to input triangle side lengths. The program then
determines whether a triangle can be formed. If it can, it will output the type
of triangle it is. The program continues until the user enters 0 0 0. */

public class Triangle_Kevin
{

    public static void main (String[] args)
    {


	//Variable declaration
	int input1 = 0, input2 = 0, input3 = 0;

	do
	{ //do while loop for entire program

	    do
	    { //do while loop for input


		//user input 3 sides
		input1 = userInput1 ();
		input2 = userInput2 ();
		input3 = userInput3 ();

		//if triangle cannot be formed
		if (isTriangle (input1, input2, input3) == false)
		{
		    //if user enters 3 zeros, exit
		    if (terminate (input1, input2, input3) == true)
		    {
			System.out.println ("Program terminated.");
			System.exit (0);

		    }
		    //if not a exit, triangle impossible
		    else
			System.out.println ("Triangle impossible");
		}

		//ask input while impossible triangle
	    }
	    while (isTriangle (input1, input2, input3) != true);


	    //method call and output triangle type
	    displayValues (input1, input2, input3);

	    //do loop while user doesn't enter 3 zeros
	}
	//loop while user doesn't enter 0 0 0
	while (terminate (input1, input2, input3) != true);

    } //main method


    //method to recieve 1st #
    public static int userInput1 ()
    {
	System.out.println ("Enter side 1, enter three 0s to exit");

	//return #1
	return In.getInt ();
    } //userInput1 method


    //method to recieve 2nd #
    public static int userInput2 ()
    {
	System.out.println ("Enter side 2");

	//return #2
	return In.getInt ();

    } //userInput2 method


    //method to recieve 3rd #
    public static int userInput3 ()
    {
	System.out.println ("Enter side 3");

	//return #3
	return In.getInt ();
    } //userInput3 method


    //method to determine whether triangle can be formed given side lengths
    public static boolean isTriangle (int a, int b, int c)

    {
	//boolean declaration
	boolean ok;

	//sum of any two sides must be greater than the 3rd
	if (a + b > c && a + c > b && b + c > a)
	{
	    //if true
	    ok = true;

	    //if any of the numbers are 0, it must be impossible
	    if (a < 0 || b < 0 || c < 0)
	    {

		ok = false;
	    }
	}
	//if not, false
	else
	    ok = false;

	//return true or false whether triangle can be formed
	return ok;
    }


    //method to determine and return triangle side type
    public static String triangleSide (int a, int b, int c)
    {
	//if all sides equal, it is equalaterial
	if (a == b && a == c)
	    return "Equilateral";

	//if any two sides are equal, it is Isosceles
	else if (a == b || a == c || b == c)
	    return "Isosceles ";

	//last and remaining case scalene
	else
	    return "Scalene";

    } //triangleSide method


    //method to determine triangle angle type

    //rule: square of longest side compared to sum of other two squares
    //if sq(long) less sq(a) + sq(b), acute
    //if sq(long) eq sq(a) + sq(b), right
    //if sq(long) more sq(a) + sq(b), obtuse

    public static String triangleAngle (int a, int b, int c)
    {
	//declare a string to be assigned
	String s;

	//if a largest side
	if (a >= b && a >= c)
	{ //if sq(a) less sq(b) + sq(c), acute
	    if (Math.pow (a, 2) < Math.pow (b, 2) + Math.pow (c, 2))
		s = "Acute";

	    //if sq(a) eq sq(b) + sq(c), right
	    else if (Math.pow (a, 2) == Math.pow (b, 2) + Math.pow (c, 2))
		s = "Right";

	    //remaining case: obtuse
	    else
		s = "Obtuse";
	}

	//if b largest side
	else if (b >= a && b >= c)
	{
	    if (Math.pow (b, 2) < Math.pow (a, 2) + Math.pow (c, 2))
		s = "Acute";

	    else if (Math.pow (b, 2) == Math.pow (a, 2) + Math.pow (c, 2))
		s = "Right";

	    else
		s = "Obtuse";
	}

	//if c longest side, only remaining case
	else
	{
	    //if sq(c) less sq(a) + sq(b), acute
	    if (Math.pow (c, 2) < Math.pow (a, 2) + Math.pow (b, 2))
		s = "Acute";
	    //if sq(c) eq sq(a) + sq(b), right
	    else if (Math.pow (c, 2) == Math.pow (a, 2) + Math.pow (b, 2))
		s = "Right";
	    //if sq(c) more sq(a) + sq(b), obtuse
	    else
		s = "Obtuse";
	}
	//return string that contains triangle type to main method
	return s;

    } //triangleAngle method


    //method that determines whether user enters 0 0 0 to exit
    public static boolean terminate (int a, int b, int c)
    {
	//declare a boolean
	boolean ok;
	//if user enters 0 0 0, boolean is true
	if (a == 0 && b == 0 && c == 0)
	    ok = true;
	//if user doesnt enter 0 0 0, boolean is false
	else
	    ok = false;

	//return boolean to main method
	return ok;

    } //terminate method


    //method to print message to user
    public static void displayValues (int a, int b, int c)
    {
	System.out.println ("Triangle possible: " + triangleSide (a, b, c) + " " +
		triangleAngle (a, b, c));

	System.out.println ();
    } //displayValues method
}



