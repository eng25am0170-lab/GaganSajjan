import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please Enter any Number: ");
        double number = sc.nextDouble();
        
        double square = number * number;
        
        System.out.println("The Square of " + number + " = " + square);
        
        sc.close();
    }
}
