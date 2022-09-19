package com.epam.homework.first;

import java.util.Random;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of random numbers");
        int n= scanner.nextInt();
        int [] arrNumb=new int[n];
        for (int i = 0; i < arrNumb.length ; i++) {
            arrNumb[i]=(int)(Math.random()*100);
        }
        System.out.println("Output with a transition to a new line");
        for (int i = 0; i < arrNumb.length ; i++) {
            System.out.println(arrNumb[i]);
        }
        System.out.println("Output without switching to a new line to a new line");
        for (int i = 0; i < arrNumb.length ; i++) {
            System.out.print(arrNumb[i]+" ");
        }
    }
}
