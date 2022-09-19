package com.epam.homework.first;

import java.util.Arrays;
import java.util.Scanner;

public class TaskB7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers");
        String numbers= scanner.nextLine();
        String  [] arrNumbers=numbers.split("\\s+");
        int [] numbersInt=new int[arrNumbers.length];
        for (int i = 0; i < numbersInt.length; i++) {
            numbersInt[i]= Integer.parseInt(arrNumbers[i]);
        }
        for (int i = 0; i < numbersInt.length; i++) {
            for (int j = i+1; j < numbersInt.length ; j++) {
                if (numbersInt[i]>numbersInt[j]) {
                    int temp = numbersInt[j];
                    numbersInt[j]=numbersInt[i];
                    numbersInt[i]=temp;
                }
            }
        }
        System.out.println("In ascending order");
        System.out.println(Arrays.toString(numbersInt));
        for (int i = 0; i < numbersInt.length; i++) {
            for (int j = i+1; j < numbersInt.length ; j++) {
                if (numbersInt[i]<numbersInt[j]) {
                    int temp = numbersInt[j];
                    numbersInt[j]=numbersInt[i];
                    numbersInt[i]=temp;
                }
            }
        }
        System.out.println("In descending order");
        System.out.println(Arrays.toString(numbersInt));





    }
}
