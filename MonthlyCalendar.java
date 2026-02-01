import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class MonthlyCalendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get year and month from user
        System.out.print("Enter year (e.g., 2025): ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        // Adjust because Calendar months are 0-based (0 = January, 11 = December)
        month = month - 1;

        // Create a calendar instance
        Calendar calendar = new GregorianCalendar(year, month, 1);

        // Get the starting day of the week for the month
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);

        // Get the number of days in the month
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print calendar header
        System.out.println("\nCalendar for " + (month + 1) + "/" + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces
        for (int i = Calendar.SUNDAY; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Line break after Saturday
            if ((day + startDay - 1) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        scanner.close();
    }
}
