package Homework4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");

        switch (simpleDateformat.format(now)) {
            case "понедельник":
                DaysOfWeek day = DaysOfWeek.MONDAY;
                System.out.println("Today is " + day);
                break;
            case "вторник":
                day = DaysOfWeek.THUESDAY;
                System.out.println("Today is " + day);
                break;
            case "среда":
                day = DaysOfWeek.WEDNESDAY;
                System.out.println("Today is " + day);
                break;
            case "четверг":
                day = DaysOfWeek.THURSDAY;
                System.out.println("Today is " + day);
                break;
            case "пятница":
                day = DaysOfWeek.FRIDAY;
                System.out.println("Today is " + day);
                break;
            case "суббота":
                day = DaysOfWeek.SATURDAY;
                System.out.println("Today is " + day);
                break;
            case "воскресенье":
                day = DaysOfWeek.SUNDAY;
                System.out.println("Today is " + day);
                break;
        }

        System.out.println("Random number " + RandomValues.randomNumber());

    }
}
