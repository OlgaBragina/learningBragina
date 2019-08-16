package lesson03.BraginaHW3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonusTask {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();

    System.out.println("Please enter your first value: ");
    list.add(input.nextInt());
    int a = 0;

    while (true) {
        System.out.println("Please, enter next value " + (a + 1) + " or enter 0 to stop");
        a++;
        list.add(input.nextInt());
        try {

            if (list.contains(0)) {
                break;
            }
        } catch (NumberFormatException e) {
        }
    }

    list.remove(new Integer(0));
    System.out.print("Your sequence: ");
    for (int value : list) {
        System.out.print(value + " ");
    }

    int result = 0;
    for (int i = 0; i < list.size(); i++) {
        result = result + list.get(i);
    }
    System.out.println("");
    System.out.println("Sum of all elements: " + result);

    result = 1;
    for (Integer value : list) {
        result = result * value;
    }
    System.out.println("Multiplaytion of all elements: " + result);

    float result_f = 0;
    for (Integer value : list) {
        result_f = result_f + value;
    }
    System.out.println("Average of all elements: " + result_f / list.size());

    int max = list.get(0);
    for (Integer integer : list) {
        if (max < integer)
            max = integer;
    }
    System.out.println("Max value found: " + max);

    int min = list.get(0);
    for (Integer integer : list) {
        if (min > integer)
            min = integer;
    }
    System.out.println("Min value found: " + min);
}
}


