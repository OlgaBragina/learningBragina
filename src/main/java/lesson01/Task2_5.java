package lesson01;
//find factorial using loop.
public class Task2_5 {
    public static void main(String[] args) {
        int number = 5;
        int factorial=1;
        for (int i=1; i<= number; i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+number+" is: "+factorial);
    }
}
