package Homework4;

public class ReverseString {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps";
        String reverse = "";


        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("The string in reverse order is: ");
        System.out.println(reverse);
    }
    }

