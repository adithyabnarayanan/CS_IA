package cs_ia;

import java.time.LocalTime;

public class TimeSlot {

    private int rowIndex; // 0 is monday, 1 is Tuesday... 4 is Friday
    private int colIndex;// 0 is 9:10, 1 is 10:10 ... 6 is 14:25-15:30
    private String StudentName;

    public TimeSlot(int rowIndex, int colIndex, String StudentName) {
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
        this.StudentName = StudentName;
    }

    public TimeSlot(LocalTime startTime, LocalTime endTime) {
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColIndex() {
        return colIndex;
    }

    public void setColIndex(int colIndex) {
        this.colIndex = colIndex;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public static String fromColumnToIndexToTimeSlotString(int columnIndex) {
        String timeSlotString = "";
        switch (columnIndex) {
            case 0:
                timeSlotString = "09:10-10:10";
                break;
            case 1:
                timeSlotString = "10:10-11:05";
                break;
            case 2:
                timeSlotString = "11:05-11:25";
                break;
            case 3:
                timeSlotString = "11:25-12:25";
                break;
            case 4:
                timeSlotString = "12:25-13:25";
                break;
            case 5:
                timeSlotString = "13:25-14:25";
                break;
            case 6:
                timeSlotString = "14:25-15:30";
                break;
        }
        return timeSlotString;
    }

    public static String fromRowToIndexToDayString(int rowIndex) {
        String dayString = "";
        switch (rowIndex) {
            case 0:
                dayString = "Monday";
                break;
            case 1:
                dayString = "Tuesday";
                break;
            case 2:
                dayString = "Wednesday";
                break;
            case 3:
                dayString = "Thursday";
                break;
            case 4:
                dayString = "Friday";
                break;
        }
        return dayString;
    }

    public String toString() {
        return fromRowToIndexToDayString(rowIndex) + " " + fromColumnToIndexToTimeSlotString(colIndex);
    }

}
