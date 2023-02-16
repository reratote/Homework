package Homework0115;

public class ArraysCountries {
    public static void main(String[] args) {
        String [] countries={"Kazakhstan","Ukraine","USA","Spain","France"};
        String [] capitals={"Astana","Kiev","Washington","Madrid","Paris"};
        for (int i = 0; i < capitals.length; i++) {
            System.out.println("The capital of "+countries[i]+" is "+capitals[i]+". ");
            
        }
        
    }
}
