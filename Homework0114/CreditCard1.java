package Homework0114;

import java.util.Scanner;

public class CreditCard1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Would you like to apply for a credit card?");
            String answer=s.next();
            if(answer.equalsIgnoreCase("yes")){
                break;
            }

        }



    }
}
