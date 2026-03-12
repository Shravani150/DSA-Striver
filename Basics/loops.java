/*pre test loops --> First test the condition and then execute --> for and while
post test loops --> First execute the 1st iteration and then test(Will run atleast once) --> do while
for loop --> best when number of iterations are known
while loop --> best when no. of iterations are not known
do while loop --> When you want to execute the command at least once even if condition is false*/

package Basics;
public class loops {
    public static void main(String[] args) {
        for(int i=1;i<1;i++){
            System.out.println("Executed!");
        }
        System.out.println("No output as condition is false");
        int i=10;
        while(i>12){
            System.out.println("OH Hi");
            i++;
        }
        System.out.println("Didnt execute again");
        do{
            System.out.println("I will execute at least one");
            i++;
        }while(i>12);
    }
}
