package com.epam.homework.first;

import java.util.Scanner;

public class TaskB3and4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers");
        String numbers= scanner.nextLine();
        String  [] arrNumbers=numbers.split("\\s+");
        int [] numbersInt=new int[arrNumbers.length];
        for (int i = 0; i < numbersInt.length; i++) {
            numbersInt[i]= Integer.parseInt(arrNumbers[i]);
        }

        String divisibleThreeNine="";
        String divisibleFiveSeven="";
        for (int i = 0; i < numbersInt.length; i++) {
            if (numbersInt[i]%3==0 || numbersInt[i]%9==0)
                divisibleThreeNine+=String.valueOf(numbersInt[i])+" ";
            if (numbersInt[i]%5==0 && numbersInt[i]%7==0)
                divisibleFiveSeven+=String.valueOf(numbersInt[i])+" ";
        }
        System.out.printf("Numbers that are divisible by three or nine - %s, " +
                "Numbers that are divisible by five and seven - %s",
                divisibleThreeNine,divisibleFiveSeven);
    }
}
