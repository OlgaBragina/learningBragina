package Homework4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum RandomValues {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);


    private static final List<RandomValues> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static RandomValues randomNumber()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    private final int value;

    RandomValues(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }

}
