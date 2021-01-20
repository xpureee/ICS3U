public class MethodQuiz_Kevin
{

    public static void main (String[] args)
    {


	int mark;
	do
	{

	    do
	    {
		System.out.println ("Enter mark (999 to terminate)");
		mark = In.getInt ();

		if (mark == 999)
		    System.exit (0);

	    }
	    while (mark < 0);

	    System.out.println ("Your grade: " + convertToGrade (mark));

	}
	while (true);


    }


    public static char convertToGrade (int mark)

    {

	if (mark <= 49)

	    return 'F';

	else if (mark <= 59)

	    return 'D';

	else if (mark <= 69)

	    return 'C';

	else if (mark <= 79)

	    return 'B';

	else if (mark <= 100)

	    return 'A';

	else

	    return 'X';


    }
}
