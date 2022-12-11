package Mort;

public class DynamicArray {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(30);
        numbers.insert(2);
        numbers.insert(5);
        numbers.insert(45);
        numbers.insert(7);
        numbers.insert(8);
        //numbers.removeItem(3);
        System.out.println("index of the item in array is " + numbers.indexOf(8));

        numbers.print();

    }
}
