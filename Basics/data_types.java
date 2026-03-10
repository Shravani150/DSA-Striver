/*
JAVA DATA TYPES QUICK REVISION

boolean → true or false

char → stores a single character
       (sc.next().charAt(0) takes the first character of a string)

byte → 1 byte (8 bits), very small integers (~3 digits)

short → 2 bytes (16 bits), small integers (~5 digits)

int → 4 bytes (32 bits), normal integers (~10 digits)

long → 8 bytes (64 bits), very large integers (~19 digits, use L)

float → decimal numbers, 4 bytes (~6–7 digits precision, use f)

double → decimal numbers, 8 bytes (~15 digits precision, default)
*/

package Basics;
import java.util.Scanner;
public class data_types {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a boolean value for if java is easy or not ");
        boolean boolVal=sc.nextBoolean();

        System.out.println("Enter your grade in oopcg(char) ");
        char charVal=sc.next().charAt(0);

        System.out.println("Enter an integer value ");
        int intVal=sc.nextInt();

        System.out.println("Enter a byte value ");
        byte byteVal=sc.nextByte();

        System.out.println("Enetr a short value ");
        short shortVal=sc.nextShort();

        System.out.println("Enter a long value ");
        long longVal=sc.nextLong();

        System.out.println("ENter a float value ");
        float floatVal=sc.nextFloat();

        System.out.println("Enter a double value ");
        double doubleVal=sc.nextDouble();

        System.out.println("\n--- Values Entered ---");
        System.out.println("Boolean: " + boolVal);
        System.out.println("Character: " + charVal);
        System.out.println("Byte: " + byteVal);
        System.out.println("Short: " + shortVal);
        System.out.println("Int: " + intVal);
        System.out.println("Long: " + longVal);
        System.out.println("Float: " + floatVal);
        System.out.println("Double: " + doubleVal);

        sc.close();
    }
}
