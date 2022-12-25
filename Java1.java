package com.IdeaProjects.codingwM;

import java.text.NumberFormat;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(12345.5895);
        System.out.println(result);

        String  prcnt= NumberFormat.getPercentInstance().format(0.258);
        System.out.println(prcnt);
        // get input from user
        System.out.println("Age: ");
        Scanner input = new Scanner(System.in);
        int age= input.nextInt();
        System.out.println("Age is :" + age);
     Scanner output =  new Scanner(System.out);
     int number = output.nextInt();
        System.out.println("My output is :" + number);
/// end of top code

    }
}
