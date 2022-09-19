package com.epam.first.demo;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] numbers = str.split("\\s+");
        System.out.println(Arrays.toString(numbers));
        int count=0;
        for (int i = 0; i < numbers.length; i++) {
            if(  (numbers[i].matches("\\d+"))  ){
                count++;
            }
            }
        System.out.println(count);
        }
//        String [] filterNumber=new String[numbers.length-count];
//        for (int i = 0,j=0; i < numbers.length; i++) {
//            if (!(numbers[i].matches("\\D"))){
//                filterNumber[j]=numbers[i];
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(filterNumber));


//        String longer = "";
//        String shorter = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i].length()>longer.length())
//                longer=numbers[i];
//            else if (numbers[i].length()<shorter.length())
//                shorter=numbers[i];
//        }
//        System.out.println("longer--->"+longer);
//        System.out.println("shorter---->"+shorter);
    }

