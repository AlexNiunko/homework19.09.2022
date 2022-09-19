package com.epam.homework.first;
import java.util.Arrays;
import java.util.Scanner;
public class TaskB8 {
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
        for (int i = 0; i < numbersInt.length; i++) {
            if (numbersInt[i]>maxNumbers) {
                maxNumbers = numbersInt[i];
            }
        }
        int [] countNumbersInt=new int[maxNumbers+1];
        for (int i = 0; i < numbersInt.length; i++) {
            countNumbersInt[numbersInt[i]]++;
        }
        String rezult="";
        int length=0;
         while (length< countNumbersInt.length-1){
            int max=Integer.MIN_VALUE;
            int indexMax=0;
            for (int i = 0; i < countNumbersInt.length; i++) {
                if (countNumbersInt[i]>max){
                    max=countNumbersInt[i];
                    indexMax=i;
                }
            }
             if ( max!=0) {
                 rezult+=String.valueOf(indexMax)+" ";
             }
             for (int i = 0; i < countNumbersInt.length; i++) {
                if (countNumbersInt[i]==max ){
                    countNumbersInt[i]=0;
                    break;
                }
            }
            length++;
        }

        System.out.println(rezult);
    }
}
