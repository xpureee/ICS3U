public class Divisible_Kevin
{
    public static void main (String[] args)
    {
	int original = 0, num = 0;
	String str1;
	boolean ok = true;



	do  //Do while for entire try and catch
	{

	    do //Do while for negative number
	    {
		try //String to number
		{

		    System.out.print ("Number: ");
		    str1 = In.getString ();

		    original = Integer.parseInt (str1);

		    //Catch negative number
		    if (original < 0)
		    {
			System.out.println ("ERROR: You entered a negative number, try again.");
		    }





		    ok = false;

		}

		//Catch string
		catch (NumberFormatException exc)
		{
		    ok = true;
		    System.out.println ("ERROR: You entered a string, try again.");
		}

	    }

	    while (original < 0);
	}

	while (ok == true);

	
	System.out.println();
	
	//Set another variable for users number
	num = original;


	System.out.println (original);


	// While number is equal or greater than 11
	while (num >= 11)
	{

	    //Perform and output calculations
	    System.out.println ((num / 10) - num % 10);

	    num = (num / 10) - num % 10;

	}

	//If 0, output to user number is divisible, if not 0, output not divisible
	if (num == 0)
	{
	    System.out.println (original + " is divisible by 11");
	}

	else

	    {
		System.out.println (original + " is not divisible by 11");
	    }



    }
} 



