package com.IdeaProjects.codingwM;

import java.text.NumberFormat;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String input = " ";
        Scanner str = new Scanner(System.in);

        while(!input.equals("quit")){
            System.out.println("Entered: "+  input +" \n if you want to quit enter \"quit\" " );
            input = str.next();
        }
    }
}
