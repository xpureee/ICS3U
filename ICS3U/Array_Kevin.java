import java.util.ArrayList;
import java.text.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class Array_Kevin{

    public static void main(String[] args) {


        //new arrays with 10 elements
        Integer[] randomNum = new Integer[10];
        Integer[] randomNum2 = new Integer[10];
        Integer[] reversed = new Integer[10];

        //new array list
        ArrayList<Integer> arList = new ArrayList<Integer>();
        //add #'s 1 to 50 in arraylist
        for (int i = 1; i <= 50; i++)
            arList.add(i);

        //mixes up numbers
        Collections.shuffle(arList);

        //fill array with the first 10 numbers from randomized arraylist elements
        for (int i = 0; i < 10; i++)
            randomNum[i] = arList.get(i);

        //prints array of 10 random #'s
        System.out.print("10 random numbers (1 to 50): ");
        printAr(randomNum);

        System.out.println();

        //reverses array order and assign new array its values
        for (int i = 0; i <  10; i++)
        {
            randomNum2[i] = randomNum[9-i];
        }
        //output reversed array 
        System.out.print("Reversed array: ");
        printAr(randomNum2);

        //a)


        System.out.println();
        System.out.println();

        //output sorted array
        System.out.print("Array sorted (low to high): ");
        printAr(sort(randomNum));


    }

    //method to sort array
    public static Integer[] sort(Integer[] a)
    {
        Arrays.sort(a);
        return a;


    }
    //method to print all elements of an array
    public static void printAr(Integer[] a)
    {
        for (int counter: a)
            System.out.print(counter + " ");

    }
}