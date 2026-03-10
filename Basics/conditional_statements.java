package Basics;
import java.util.Scanner;
public class conditional_statements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("/nIf-Else");
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are not an adult");
        }
        System.out.println("/nIF-ElseIF-Else");
        System.out.println("Enter your marks for maths(0-100) to determine your grade: ");
        int marks=sc.nextInt();
        if(marks<25){
            System.out.println("F");
        }
        else if(marks>=25&&marks<=44){
            System.out.println("E");
        }
        else if(marks>=45&&marks<=49){
            System.out.println("D");
        }
        else if(marks>=50&&marks<=59){
            System.out.println("C");
        }
        else if(marks>=60&&marks<=79){
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }
        sc.close();
    }
}
