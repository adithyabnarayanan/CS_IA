package cs_ia;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeTable {
    private TimeSlot[][] table = new TimeSlot[10][7]; // Rows for day and columns for time slot.
    private String[] strNextTwoWeeks = generateDateStringForTheNextTwoWeeks();

    public void loadTimeTable() {

    }

    public void saveTimeTable() {

    }

    public void shiftWeeklyTimeSlot() {

    }

    public int[] getFreeTimeSlots() {
        return null;
    }

    public static String[] generateDateStringForTheNextTwoWeeks() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEE, dd-MMM-yyyy"); // 30-Dec-2021
        LocalDate[] dateArr = generateDateForTheNextTwoWeeks();
        String[] result = new String[dateArr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = fmt.format(dateArr[i]);
        }
        return result;
    }

    public static LocalDate[] generateDateForTheNextTwoWeeks() {
        LocalDate[] result = new LocalDate[10];
        // advance one day at a time from today to 13 days later
        // ignore Sat and Sun, convert the date into proper String format
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEE, dd-MMM-yyyy"); // 30-Dec-2021
        LocalDate today = LocalDate.now();
        int j = 0; // next insertion point in result array
        for (int i = 0; i < 14; i++) {
            LocalDate d = today.plusDays(i);
            // date String won't go into the result array unless the date is a weekday
            if (d.getDayOfWeek().getValue() != 6 && d.getDayOfWeek().getValue() != 7) { // it's a weekday
                result[j] = d;
                j++;
            }
        }
        return result;
    }

    public TimeSlot[][] generateTimeTable() throws FileNotFoundException {
        FileReader reader = new FileReader(TimeTable.class.getResource("TimeTable.csv").getFile());
        String[] lines = reader.toString().split("\n");
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(",");
            for (int j = 0; j < line.length; j++) {
                String[] timeSlot = line[j].split("-");
                LocalTime startTime = LocalTime.parse(timeSlot[0]);
                LocalTime endTime = LocalTime.parse(timeSlot[1]);
                TimeSlot ts = new TimeSlot(startTime, endTime);
                table[i][j] = ts;
            }
        }
        return table;
    }

    public String[] getNextTwoWeeks() {
        return strNextTwoWeeks;
    }

    public boolean isAvailable(int row, int col) {
        if (table[row][col] == null) {
            return true;
        }
        return false;
    }

    public boolean isReserved(int row, int col) {
        return false;
    }

    public boolean isOccupied(int row, int col) {
        return false;
    }

    public String[][] generateTimeTableString(int row, int col) {
        return null;
    }

}
