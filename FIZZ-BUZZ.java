package com.IdeaProjects.codingwM;

import java.text.NumberFormat;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Enter the no: ");
       Scanner number = new Scanner(System.in);
       int num = number.nextInt();
        if( num % 3 == 0)
            System.out.println("BUZZ");
        else if(num % 5 == 0)
            System.out.println("FIZZ ");
        else  if ((num % 3 == 0 ) && (num % 5 == 0))
            System.out.println("FIZZ BUZZ");
        else
            System.out.println("Number entered is :" + num);
        
        //FOR-EACH loop
         String [] names = {"Huzaifa" , "Talha" , "Mayeda"};
        for(String newarr : names)
            System.out.print(newarr + "\t");
    }
}
