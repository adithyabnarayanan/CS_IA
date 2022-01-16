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
    private static ArrayList<MeetingEvent> AllMeetingEvents = new ArrayList<MeetingEvent>();

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

    public static ArrayList<MeetingEvent> getAllMeetingEvents() {
        return AllMeetingEvents;
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

    public static void readMeetingEventsFile() {
        try {
            FileReader reader = new FileReader("src\\main\\java\\cs_ia\\MeetingEvents.csv");
            BufferedReader br = new BufferedReader(reader);
            String line = br.readLine();
            while (line != null) {
                String[] row = line.split(",", 4);
                MeetingEvent meetingEvent = new MeetingEvent(row[0], LocalDate.parse(row[1]), Integer.parseInt(row[2]),
                        row[3]);
                AllMeetingEvents.add(meetingEvent);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error in reading files after e.printStackTrace()");
        }
    }

    public static void writeMeetingEventsFile() {
        File file = new File("src\\main\\java\\cs_ia\\MeetingEvents.csv");
        FileWriter fw;
        try {
            fw = new FileWriter(file, true); // append at the end of the file
            PrintWriter pw = new PrintWriter(fw);

            for (int i = 0; i < AllMeetingEvents.size(); i++) {
                pw.println(AllMeetingEvents.get(i).getStudentName() + "," + AllMeetingEvents.get(i).getDate() + ","
                        + AllMeetingEvents.get(i).getTimeSlotNo() + "," + AllMeetingEvents.get(i).getMeetingNotes());
            }

            pw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String toString() {
        return "\n" + "Student Name: " + this.StudentName + "\n" + "Date: " + this.date + "\n" + "Time Slot: "
                + fromColumnToIndexToTimeSlotString(this.TimeSlotNo) + "\n" + "Meeting Notes: " + this.MeetingNotes;
    }

    public static void main(String[] args) {
        readMeetingEventsFile();
        System.out.println(AllMeetingEvents.toString());
        System.out.println("---------------------------------------");
        AllMeetingEvents.add(new MeetingEvent("John", LocalDate.of(2019, 12, 12), 0, ""));
        System.out.println(AllMeetingEvents.toString());
        // System.out.println(AllMeetingEvents);
    }

}
