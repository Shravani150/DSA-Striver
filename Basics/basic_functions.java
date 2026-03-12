/*Java does not allow methods inside methods, i.e inside main method, the flow always is:
                       Class --> Methods --> Main */
package Basics;

public class basic_functions {
    static int add (int a, int b){
        return a+b;
    }
    // pass by value
    static int random(int num){
        return num +10;
    }
    public static void main(String[] args) {
        int a=10, b=13;
        System.out.println(add(a,b));

        int number=90;
        System.out.println("The function returns: "+random(number)); // passes a copy to the function
        System.out.println("The original value stays same: "+number); // so the main value of number does not get changed
    }
}
