package cs_ia;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeTable {
    private MeetingEvent[][] table = new MeetingEvent[10][7]; // Rows for day and columns for time slot.
    private String[] strNextTwoWeeks = generateDateStringForTheNextTwoWeeks();

    public void loadTimeTable() {
        try {
            FileReader fr = new FileReader("src/main/java/cs_ia/TimeTable.csv");
            int c;
            String str = "";
            while ((c = fr.read()) != -1) {
                str += (char) c;
            }
            String[] strRows = str.split("\n");
            for (int i = 0; i < strRows.length; i++) {
                String[] strCols = strRows[i].split("\t");
                for (int j = 0; j < strCols.length; j++) {
                    if (strCols[j].equals("")) {
                        continue;
                    }
                    String[] strTimeSlot = strCols[j].split("-");
                    LocalTime startTime = LocalTime.parse(strTimeSlot[0], DateTimeFormatter.ofPattern("HH:mm"));
                    LocalTime endTime = LocalTime.parse(strTimeSlot[1], DateTimeFormatter.ofPattern("HH:mm"));
                    table[i][j] = new MeetingEvent(startTime, endTime);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveTimeTable() {

    }

    public void shiftWeeklyTimeSlot() {

    }

    public int[] getFreeTimeSlots() {
        int[] freeTimeSlots = new int[7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                if (table[j][i] == null) {
                    freeTimeSlots[i]++;
                }
            }
        }
        return freeTimeSlots;
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

    public MeetingEvent[][] generateTimeTable() throws FileNotFoundException {
        FileReader reader = new FileReader(TimeTable.class.getResource("TimeTable.csv").getFile());
        String[] lines = reader.toString().split("\n");
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(",");
            for (int j = 0; j < line.length; j++) {
                String[] timeSlot = line[j].split("-");
                LocalTime startTime = LocalTime.parse(timeSlot[0]);
                LocalTime endTime = LocalTime.parse(timeSlot[1]);
                MeetingEvent ts = new MeetingEvent(startTime, endTime);
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
        if (table[row][col] != null) {
            return true;
        }
        return false;
    }

    public boolean isOccupied(int row, int col) {
        if (table[row][col] != null && table[row][col].getStudentName() != null) {
            return true;
        }
        return false;
    }

    public String[][] generateTimeTableString(int row, int col) {
        String[][] result = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (table[i][j] != null) {
                    result[i][j] = table[i][j].toString();
                }
            }
        }
        return result;
    }

}
