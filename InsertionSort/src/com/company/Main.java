package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

       int [] Array = setIntegers(10);
        System.out.println(Arrays.toString(Array));
        Array = InsertionSort(Array);
        System.out.println(Arrays.toString(Array));
    }


    public static int[] setIntegers(int NumberOfIntegers){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[NumberOfIntegers];

        for(int i = 0; i<array.length; i++){
            System.out.println("Assign a value to ["+i+"]");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }


    public static int[] InsertionSort (int[] Array){
        int[] newArray = Arrays.copyOf(Array, Array.length);
        boolean Sorted = false;
        int SwapCount = 0;

        while(!Sorted){

            Sorted = true;
            //Checks to see if [i+1] is less than [i] if so they get swapped
            for(int i = 0; i<newArray.length-1; i++){
                if(newArray[i] > newArray[i + 1]) {
                    SwapCount++;
                    Sorted = false;
                    int temp = newArray[i + 1];
                    newArray[i+1] = newArray[i];
                    newArray[i] = temp;
                        //Once the values are swapped, it takes the checks [i]'s current position and the values
                        // behind and puts them in order
                        for(int j = i; j>0; j--){
                            if(newArray[j] < newArray[j - 1]){
                                SwapCount++;
                                int temp1 = newArray[j - 1];
                                newArray[j-1] = newArray[j];
                                newArray[j] = temp1;

                            }
                        }




                }

            }
        }
        System.out.println("Count = " + SwapCount);
        return newArray;
    }
}
