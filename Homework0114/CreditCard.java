package Homework0114;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i<10; i++) {
            System.out.println("Apply for credit card");
            String response = scan.next();
            if (response.equalsIgnoreCase("yes")){
                break;
            }
        }
    }
}
