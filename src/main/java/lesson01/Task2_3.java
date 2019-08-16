package lesson01;

import java.util.Scanner;
public class Task2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int decimal=Integer.parseInt(scanner.nextLine());
        System.out.println(" ");
        System.out.println("Decimal to hexadecimal:" + (Integer.toHexString(decimal)));
    }
}
