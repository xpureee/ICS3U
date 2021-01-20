/*The necklace problem begins with two single digit and larger than zero
numbers. The next number is obtained by adding the first two numbers together
and saving only the ones-digit. This process is repeated until the
necklace closes by returning to the original two numbers.*/

		import java.text.*;

		public class Necklace_Kevin
		{
		    public static void main (String[] args)
		    {

			//Variable declaration and initialization
			int firstDigit = 0, secondDigit = 0, num1, num2, num3, steps = 0, sum;
			String str1, str2;
			boolean ok = true;

			final int STOP = 99;
			final String STOP1 = "99";


	do //do entire loop


	    {
		// initalize steps
		steps = 0;

		do
		{ //bulletproof 1st negative/zero

		    do
		    { // try and catch #1

			try
			{

			    // ask user for first #
			    System.out.println ("Positive, single, #1 digit: (99 to exit) ");
			    str1 = In.getString ();


			    //if user enter 99
			    if (str1.equals (STOP1))
			    {
				//exit
				System.exit (0);

			    }
			    //continue if not 99
			    else
			    {
				//string to int
				firstDigit = Integer.parseInt (str1);
				ok = false;
			    }
			}
			//catch string
			catch (NumberFormatException exc)
			{
			    ok = true;
			    System.out.println ("ERROR: You entered a string, try again.");

			}
		    }
		    //loop while boolean is true
		    while (ok == true);


		    //error msg if negative/zero
		    if (firstDigit <= 0 || firstDigit > 9)
		    {
			System.out.println ("Error: Number must be between 1 and 9");
			System.out.println ();
		    }
		}
		//loop if user enters negative/zero
		while (firstDigit <= 0 || firstDigit > 9);


		{


		    do
		    { //bulletproof 2nd negative/zero

			do
			{ //do try and catch for #2
			    try
			    {


				// ask user for second # and string to int
				System.out.println ("Positive, single #2 digit: ");
				str2 = In.getString ();
				secondDigit = Integer.parseInt (str2);
				ok = false;
			    }
			    //catch string
			    catch (NumberFormatException exc)
			    {
				ok = true;
				System.out.println ("ERROR: You entered a string, try again.");
			    }
			}
			//loop while boolean is true
			while (ok == true);


			//error msg if negative/zero
			if (secondDigit <= 0 || secondDigit > 9)
			{
			    System.out.println ("Error: Number must be between 1 and 9");
			    System.out.println ();
			}


		    }
		    //loop if user enters negative/zero
		    while (secondDigit <= 0 || firstDigit > 9);


		    //print user digits
		    System.out.print (firstDigit + ", " + secondDigit + " -> ");


		    num1 = firstDigit;
		    num2 = secondDigit;


		    //print first two digits
		    System.out.print (num1 + " " + num2);

		    do //loop for calculation

			{

			    //calculate and print calulations
			    sum = (num1 + num2) % 10;
			    System.out.print (" " + sum);
			    num1 = num2;
			    num2 = sum;

			    //count the steps
			    steps++;

			}

		    // stops when the necklace is complete
		    while (num1 != firstDigit || num2 != secondDigit);


		    //output message to user
		    System.out.println ();
		    System.out.println ("Necklace completed in " + steps + " steps.");
		    System.out.println ();


		}
	    }


	//do loop while user doesnt enter 99
	while (firstDigit != STOP);



    }
}

