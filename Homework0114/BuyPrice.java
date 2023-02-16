package Homework0114;

import java.util.Scanner;

public class BuyPrice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       double totalPrice=0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please enter the item and the price");
            String item=s.next();
            double price=s.nextDouble();
            totalPrice=totalPrice+price;
            System.out.println("This is total amount that you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the items");
        double amount=s.nextDouble();
        if(amount>totalPrice){
            System.out.println("Here is your change"+(amount-totalPrice)+"$");
        }else{
            System.out.println("Thank you for shopping");
        }



    }
}
