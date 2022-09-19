package com.epam.homework.first;
import java.util.Scanner;
public class TaskB5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers");
        String numbers= scanner.nextLine();
        String  [] arrNumbers=numbers.split("\\s+");
        String threeDigitNumbersWithoutIdenticalDigits="";
        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i].length()==3 && (arrNumbers[i].charAt(0)!=arrNumbers[i].charAt(1)) && (arrNumbers[i].charAt(1)!=arrNumbers[i].charAt(2)) )
                threeDigitNumbersWithoutIdenticalDigits+=arrNumbers[i]+" ";
        }
        System.out.println(threeDigitNumbersWithoutIdenticalDigits);

    }
}
