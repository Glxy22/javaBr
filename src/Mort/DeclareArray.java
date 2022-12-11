package Mort;

import java.util.Arrays;

public class DeclareArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        //or another way to declare the array
        int[] array = { 5,4,3,2,8};
        System.out.println(Arrays.toString(numbers));
        for(int x : array)
        System.out.println(x);
        System.out.println(Arrays.toString(array));
    }
}
