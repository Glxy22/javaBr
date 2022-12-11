package Mort;

import java.sql.SQLOutput;
import java.util.Scanner;

public class mortgage {
    public static void main(String[] args) {

        byte monthInYear = 12;
        byte percent = 100;
        Scanner scanner = new Scanner(System.in);
        int principle;
        System.out.print("principle : ");
        principle = scanner.nextInt();
        while(true) {
            if (!(principle >= 10000 && principle <= 10000000)) {
                System.out.println(" Enter the amount between 10,000 and 10,000,000");
                System.out.print("principle : ");
                principle = scanner.nextInt();
            }

            else
                break;

        }
        System.out.print(" annual Interest Rate : ");
        float annulInterestRate = scanner.nextFloat();
        while (true){
            if (!(annulInterestRate > 0 && annulInterestRate <=30)){
                System.out.println(" Enter the value between 0 to 30");
                System.out.print(" annual Interest Rate : ");
                annulInterestRate = scanner.nextFloat();
            } else break;
        }

        float monthlyRate = annulInterestRate / percent /monthInYear;

        System.out.print("Years : ");
        byte year = scanner.nextByte();
        int numberOfPayments = year * monthInYear;
        double mortgage = principle * (( monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments))/(Math.pow(1+ monthlyRate,numberOfPayments)-1));
        System.out.println("Mortgage rate is : "+ mortgage);

    }
}
