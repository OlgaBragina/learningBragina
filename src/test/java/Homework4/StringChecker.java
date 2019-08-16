package Homework4;

import java.util.Scanner;

public class StringChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first string: ");
        String str1 = input.next();
        System.out.print("Please enter your second string: ");
        String str2 = input.next();

        System.out.println("String 1: " +str1);
        System.out.println("String 2: " +str2);

        if(!str1.equals(str2)){
            System.out.println("\"" +str1+ "\" is not equal to \""+str2+"\"");
        }

    }
}
