package Mort;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        //int x= 30;
        Scanner number = new Scanner(System.in);
        System.out.print("enter the number : ");
        int x = number.nextInt();
        String result = x > 30 ? "weather is hot" : " weather is cold" ;
        System.out.println(result);
//        if (x > 30){
//            System.out.println("weather is warm");
//        } else if(x< 30 && x>5){
//            System.out.println("weather is cold");
//        }else{
//            System.out.println("can't say anyhitng about weather");
//        }


    }
}
