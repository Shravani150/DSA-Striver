package Basics;
import java.util.Scanner;
public class input_output {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello, Striver!");
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println("The number you have entered is "+num);

        sc.close();
    }
}
