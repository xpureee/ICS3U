/* This pgm fills an array of 10 elements with random integers between 1 and 50,
reverses the array, sorts the array, and shifts the array based on user input. */

import java.util.Random;

public class Array_Kevin
{

    public static void main (String[] args)
    {

        Random rand = new Random ();

        //variable declaration
        int i, j, shift, count;
        final int LEN = 10;

        //new arrays with 10 elements
        int[] randomNum = new int [LEN];
        int[] randomNum2 = new int [LEN];

        //make a new array of random numbers 1 to 50
        for (i = 0 ; i < LEN ; i++)
        {
            randomNum [i] = rand.nextInt (49) + 1;
        }

        //get rid of duplicates
        //loop through all elements
        for (i = 0 ; i < LEN ; i++)
        {
            //loop as long as there are duplicates
            do
            {
                //set count to 0 after every loop
                count = 0;

                //new loop to compare array elements

                for (j = 0 ; j < LEN ; j++)
                {
                    //if both loops gets to same number, skip
                    if (i == j)
                        continue;

                    //if duplicate, replace and count it
                    else if (randomNum [i] == randomNum [j])
                    {
                        randomNum [i] = rand.nextInt (49) + 1;
                        count++;
                    }


                }
                //loop while there are duplicates
            }
            while (count > 0);
        }


        //call method and prints array of 10 random #'s
        System.out.print ("10 random numbers (1 to 50): ");
        printAr (randomNum);

        //line breaks
        System.out.println ();
        System.out.println ();

        //reverses array order and assign new array its values
        for (i = 0 ; i < LEN ; i++)
        {
            randomNum2 [i] = randomNum [(LEN - 1) - i];
        }

        //call method and output reversed array
        System.out.print ("Reversed array: ");
        printAr (randomNum2);

        System.out.println ();
        System.out.println ();

        //call method and output  sorted array

        System.out.print ("Array sorted (low to high): ");
        printAr (sorted (randomNum2));


        System.out.println ();
        System.out.println ();

        //call method output original array and read shift value from  user
        System.out.print ("Your orginal array: ");
        printAr (randomNum);

        System.out.println ();

        do
        { //do loop to repeat
            System.out.print ("Enter shift value: (999 to stop) ");
            shift = In.getInt ();

            //exit program if user enters 999
            if (shift == 999)
                System.exit (0);

            System.out.println ();


            //if shift value is negative, call method to  shift array left
            if (shift < 0)
            {
                shift = Math.abs (shift);
                System.out.print ("Shifted array: ");
                printAr (shiftArLeft (randomNum, shift));
            }

            //if positive, call method to shift and print shift array right
            else
            {
                System.out.print ("Shifted array: ");
                printAr (shiftArRight (randomNum, shift));
            }
            System.out.println ();
            System.out.println ();
            //while user doesnt enter sentinel
        }
        while (shift != 999);

    } //main method


    //method to sort array by swapping elements until in order
    public static int[] sorted (int[] arr)
    {
        int i, j;

        for (i = 0 ; i < arr.length ; i++)
        {
            for (j = i + 1 ; j < arr.length ; j++)
            {
                int temp;
                if (arr [i] > arr [j])
                {
                    temp = arr [i];
                    arr [i] = arr [j];
                    arr [j] = temp;
                }
            }

        }
        //return array
        return arr;

    } //sorted method


    //method to print all elements of an array
    public static void printAr (int[] a)
    {
        for (int i = 0 ; i < 10 ; i++)
            System.out.print (a [i] + " ");

    } //printAr method


    //method to shift array left
    public static int[] shiftArLeft (int[] a, int shift)
    {
        //for loop user input times
        for (int i = 0 ; i < shift ; i++)
        {
            int j, num1;
            //store first element
            num1 = a [0];
            //shift element array left
            for (j = 0 ; j < a.length - 1 ; j++)
            {
                a [j] = a [j + 1];
            }
            //1st element moved to the end
            a [j] = num1;
        }
        //return array
        return a;
    } //shiftArLeft method


    //method to shift array right
    public static int[] shiftArRight (int[] a, int shift)
    {
        int i;
        //rotate array right user input times
        for (i = 0 ; i < shift ; i++)
        {
            int j, numLast;
            //stores last element of array
            numLast = a [a.length - 1];
            //for loop to shift array right
            for (j = a.length - 1 ; j > 0 ; j--)
            {
                a [j] = a [j - 1];
            }
            //last element of array moved to front
            a [0] = numLast;
        }
        //return array
        return a;
    } //shiftArRight method
}
