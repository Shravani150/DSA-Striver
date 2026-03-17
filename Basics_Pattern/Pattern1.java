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
    /*                 [Space,no.of stars,Space]  for row=0 space=4, row=1 space=3, row=2 space=2..
       0     *         [4,1,4] 
       1    ***        [3,3,3] 
       2   *****       [2,5,2]
       3  *******      [1,7,1]
       4 *********     [0,9,0]
        So, the formula will be: [n-i-1,(2*i+1),n-i-1] and hence 3 inner loops for space,stars,space resp. */
    static void pattern7(int n){
        for(int i=0; i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1;j++){
                System.out.print('*');
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print('*');
            }
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int i=0; i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1;j++){
                System.out.print('*');
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print('*');
            }
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
           for(int j=0;j<=i;j++){
                System.out.print('*');
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
        pattern7(num);
        System.out.println();
        pattern8(num);
        System.out.println();
        pattern9(num);
        System.out.println();
        pattern10(num);
        System.out.println();
        sc.close();
    }
}
