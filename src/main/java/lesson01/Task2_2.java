package lesson01;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        //multiply two numbers which user input in command line.
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter First number: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println(" ");
        System.out.print("Enter Second number: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(" ");
        System.out.println("Output " + (a*b));

    }

}
