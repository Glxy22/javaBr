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

    }
}
