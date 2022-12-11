package Mort;

import java.util.Scanner;

public class whileloopwithQuitCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit;
        String [] fruits= { "apple", "banana", " grape"};
//        for(int i = 0; i < fruits.length; i++) {
//            System.out.println(fruits[i]);
//        }
        //another way to ittrate on array items with for each loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }
//        String number ="";
//        while( !number.equals("quit")){
//            System.out.println("enter the number or Quit : ");
//            number = scanner.next().toLowerCase();
//            if(number.equals("pass"))
//                continue;
//            if(number.equals("quit"))
//                break;
//            System.out.println(number);
//        }
    }
}
