package lesson01;

import java.util.Scanner;

public class Task2_6 {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(" ");
        System.out.print("Fibonachi numbers: ");
        int firstValue=1;
        int secondValue=0;
        int sumFib;
        for (int i=0; i <n; i++ ){
            sumFib=firstValue+secondValue;
            firstValue=secondValue;
            secondValue=sumFib;

            System.out.print(" "+ sumFib );
        }

    }
}
