package cs_ia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class All_Student_Meetings {
    private static ArrayList<MeetingEvent> meetings = new ArrayList<>();

    public static ArrayList<MeetingEvent> getMeetings() {
        return meetings;
    }

    public static void setMeetings(ArrayList<MeetingEvent> m) {
        meetings = m;
    }

    public static boolean checkIfBusy(LocalDate date, int TimeSlotNo) {
        for (MeetingEvent m : meetings) {
            if (m.getDate().equals(date) && m.getTimeSlotNo() == TimeSlotNo) {
                return true;
            }
        }
        return false;
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
                meetings.add(meetingEvent);
                line = br.readLine();
            }
            br.close();

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

            for (int i = 0; i < meetings.size(); i++) {
                pw.println(meetings.get(i).getStudentName() + "," + meetings.get(i).getDate() + ","
                        + meetings.get(i).getTimeSlotNo() + "," + meetings.get(i).getMeetingNotes());
            }

            pw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
