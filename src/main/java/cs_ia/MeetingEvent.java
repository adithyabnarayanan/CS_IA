package cs_ia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class MeetingEvent {

    private String StudentName;
    private LocalDate date;
    private int TimeSlotNo;
    private String MeetingNotes;

    public MeetingEvent(String StudentName, LocalDate date, int TimeSlotNo, String MeetingNotes) {
        this.StudentName = StudentName;
        this.date = date;
        this.TimeSlotNo = TimeSlotNo;
        this.MeetingNotes = MeetingNotes;
    }

    public MeetingEvent(String StudentName, LocalDate date, int TimeSlotNo) {
        this.StudentName = StudentName;
        this.date = date;
        this.TimeSlotNo = TimeSlotNo;
        this.MeetingNotes = "";
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTimeSlotNo() {
        return this.TimeSlotNo;
    }

    public void setTimeSlotNo(int TimeSlotNo) {
        this.TimeSlotNo = TimeSlotNo;
    }

    public String getMeetingNotes() {
        return this.MeetingNotes;
    }

    public void setMeetingNotes(String MeetingNotes) {
        this.MeetingNotes = MeetingNotes;
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
        return "\n" + "Student Name: " + this.StudentName + "\n" + "Date: " + this.date + "\n" + "Time Slot: "
                + fromColumnToIndexToTimeSlotString(this.TimeSlotNo) + "\n" + "Meeting Notes: " + this.MeetingNotes;
    }

}
