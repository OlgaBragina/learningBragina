package Homework4;

public class HappyNumbers {
    public static void main(String[] args) {
        System.out.println("First 10 Happy numbers: ");

        int slow, fast;
        int num = 1;
        int happyDetector = 0;

        while (happyDetector < 10) {

            slow = fast = num;
            do {
                slow = stepResult(slow);
                fast = stepResult(stepResult(fast));
            }
            while (slow != fast);
            if (slow == fast) {
                System.out.print(num + " ");
                happyDetector++;
            }
            num++;
        }
    }

    static int stepResult(int n) {
        int sqrSum = 0;
        while (n != 0) {
            sqrSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sqrSum;
    }
}
