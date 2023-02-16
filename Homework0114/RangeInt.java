package Homework0114;

import java.util.Scanner;

public class RangeInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the start and end point");
        int start= s.nextInt();
        int end=s.nextInt();

        System.out.println("start "+start+" end "+end);
        int evenSum=0;
        int oddSum=0;

        for (int i = start; i <= end; i++) {
            if(i%2==0){
                evenSum+=i;
            } else {
              oddSum+=i;
            }
        }
        System.out.println("The sum of even numbers is "+evenSum);
        System.out.println("The sum of odd numbers is "+oddSum);

    }
}
