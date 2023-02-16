package Homework0114;

public class Stars {
    public static void main(String[] args) {
        for (int i = 1; i < 10 ; i++) {
            if (i<=5){
                if (i%2!=0){
                    System.out.println("*");
                }else{
                    System.out.println();
                }
            } if (i>5){
                if(i%2==0){
                    System.out.println("**");
                }else{
                    System.out.println("*");
                }
            }
        }
    }
}
