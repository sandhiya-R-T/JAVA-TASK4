package ExceptionandCollection;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day position (0-6): ");
        int dayPosition = scanner.nextInt();

        try {
            String dayName = getDayName(weekdays, dayPosition);
            System.out.println("Day name: " + dayName);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter a day index within the range (0-6).");
        }
    }

    public static String getDayName(String[] weekdays, int dayPosition) {
        return weekdays[dayPosition];
    }
}
