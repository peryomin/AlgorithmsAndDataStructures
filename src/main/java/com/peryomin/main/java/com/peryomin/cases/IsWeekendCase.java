package main.java.com.peryomin.main.java.com.peryomin.cases;

public class IsWeekendCase {
    public static void printDays() {
        int dayOff = -1, workDay = -1;
        boolean prevDay, curDay = isWeekend(6);

        for (int i = 0; i < 7; i++) {
            prevDay = curDay;
            curDay = isWeekend(i);
            dayOff = curDay && !prevDay ? i : dayOff;
            workDay = !curDay && prevDay ? i : workDay;
        }
        System.out.println("Work day: " + workDay + ", day off: " + dayOff);
    }

    public static boolean isWeekend(int day) {
        int[] week = {1, 0, 0, 0, 0, 0, 1};
        return week[day] == 1;
    }
}
