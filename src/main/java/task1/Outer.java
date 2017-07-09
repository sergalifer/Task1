package task1;

import java.util.Scanner;

import static task1.PeopleService.*;

/**
 * Created by Sergey on 09.07.2017.
 */
public class Outer {
    private static final String SORT_BY_WEIGHT_UP = "weight+";
    private static final String SORT_BY_WEIGHT_DOWN = "weight-";
    private static final String SORT_BY_AGE_UP = "age+";
    private static final String SORT_BY_AGE_DOWN = "age-";
    private static final String SORT_BY_NAME = "name";

    public static void out() {
        Scanner scanner = new Scanner(System.in);
        String scanLine = scanner.next();
        if (scanLine.equals(SORT_BY_WEIGHT_DOWN)) {
            outByWeightDown();
        } else if (scanLine.equals(SORT_BY_WEIGHT_UP)) {
            outByWeightUp();
        } else if (scanLine.equals(SORT_BY_AGE_DOWN)) {
            outByAgeDown();
        } else if (scanLine.equals(SORT_BY_AGE_UP)) {
            outByAgeUp();
        } else if (scanLine.equals(SORT_BY_NAME)) {
            outByName();
        }
    }
}
