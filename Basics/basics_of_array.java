package Basics;
import java.util.Scanner;
public class basics_of_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("1D array: \n");
        int [] arr={1,200,3,4,5};
        String [] arr1;                          //declaration 
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        System.out.println("");
        System.out.println("1D array user input: \n"); 
        System.out.println("Enter the number of close friends you have: ");
        int num=sc.nextInt();
        sc.nextLine();
        arr1= new String[num];
        System.out.println("Enter their names: ");
        for(int i=0;i<arr1.length;i++){
            System.out.println("Name of Friend "+i);
            arr1[i]=sc.nextLine();                 //storing input in array (allocation)
        }
        System.out.println("Their names: ");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }


        System.out.println("");
        System.out.println("2D array: \n");
        int [][] arr2={{70,89,90,100},{50,60,70,200}};
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
