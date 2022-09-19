package com.epam.homework.first;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers");
        String numbers= scanner.nextLine();
        String  [] arrNumbers=numbers.split("\\s+");
        int [] numbersInt=new int[arrNumbers.length];
        for (int i = 0; i < numbersInt.length; i++) {
            numbersInt[i]= Integer.parseInt(arrNumbers[i]);
        }
        String evenNumbers="";
        String oddNumbers="";
        for (int i = 0; i < numbersInt.length; i++) {
            if (numbersInt[i]%2==0) {
                evenNumbers += String.valueOf(numbersInt[i])+" ";
            }
            if (numbersInt[i]%2!=0) {
                oddNumbers += String.valueOf(numbersInt[i])+" ";
            }
        }
        System.out.printf("Even numbers - %s, odd numbers - %s",evenNumbers,oddNumbers);
    }
}
