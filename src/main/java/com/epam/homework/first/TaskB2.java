package com.epam.homework.first;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers");
        String numbers= scanner.nextLine();
        String  [] arrNumbers=numbers.split("\\s+");
        int [] numbersInt=new int[arrNumbers.length];
        for (int i = 0; i < numbersInt.length; i++) {
            numbersInt[i]= Integer.parseInt(arrNumbers[i]);
        }
        int maxNumbers=Integer.MIN_VALUE;
        int minNumbers=Integer.MAX_VALUE;
        for (int i = 0; i < numbersInt.length; i++) {
            if (numbersInt[i]>maxNumbers)
                maxNumbers=numbersInt[i];
            else if (numbersInt[i]<minNumbers)
                minNumbers=numbersInt[i];
        }
        System.out.printf("Maksimum number - %d , minimum number - %d",maxNumbers,minNumbers);
    }
}
