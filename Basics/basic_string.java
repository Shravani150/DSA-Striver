package Basics;

public class basic_string {
    public static void main(String[] args) {
        String str="Shravani";
        System.out.println("The string length is: "+str.length());
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
