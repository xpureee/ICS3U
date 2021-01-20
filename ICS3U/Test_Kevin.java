import java.text.*;
public class Test_Kevin {

    public static void main(String[] args) {


	final double CONSTANT = 0.06;
	final double DIVIDE = 3.28;
	final double SQUARE = 2;

	double brakingDistance; 

	int minimumSpeed, maximumSpeed;

	DecimalFormat x = new DecimalFormat("##.##");


	do {



	System.out.println("Minimum speed (enter amount between 10 and 50)");
	minimumSpeed = In.getInt();

    } while (minimumSpeed < 10 || minimumSpeed > 50);

    do {



	System.out.println("Maximum speed (enter amount between 10 and 100)");
	maximumSpeed = In.getInt();

    } while (maximumSpeed < 10 || maximumSpeed > 100);




	
	System.out.println("Braking distance chart:");
	System.out.println();
	System.out.println("Speed" + "  " + "Braking distance (in metres)");

	for (int i = minimumSpeed; i <= maximumSpeed; i +=10)
	{

		brakingDistance = (CONSTANT*Math.pow(i,SQUARE)/DIVIDE);

		System.out.println(i + "        "  + x.format(brakingDistance));


	}


   




      
    }
}


