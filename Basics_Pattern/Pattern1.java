package Basics_Pattern;
import java.util.Scanner;
public class Pattern1 {
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        // logic if we start from i=1 then it is for j=1 upto 1 element, j=2, 2 elements i.e. 1,2 and so on..
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        // logic: here we are printing the number of rows only
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int num=sc.nextInt();
        pattern1(num);
        System.out.println();
        pattern2(num);
        System.out.println();
        pattern3(num);
        System.out.println();
        pattern4(num);
        System.out.println();
        pattern5(num);
        System.out.println();
        pattern6(num);
        System.out.println();
        sc.close();
    }
}
