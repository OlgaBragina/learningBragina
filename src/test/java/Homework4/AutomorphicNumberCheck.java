package Homework4;

import java.util.Scanner;

public class AutomorphicNumberCheck {
    static Scanner in = new Scanner(System.in);

    static int automorfic;

    public static void main(String[] args) {
        System.out.print("Input a number : ");
        automorfic = in.nextInt();

        char lastNumOrigin = Integer.toString(automorfic).charAt(Integer.toString(automorfic).length() - 1);
        char lastSqrNum = Integer.toString(automorfic*automorfic).charAt(Integer.toString(automorfic*automorfic).length() - 1);

        if(lastNumOrigin == lastSqrNum)
            System.out.println("Automorphic Number.");
        else
            System.out.println("This is not a Automorphic Number.");

    }

}
