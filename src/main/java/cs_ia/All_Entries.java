/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs_ia;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;

/**
 *
 * @author Rony
 */

public class All_Entries {
    private static ArrayList<Entry> entries = new ArrayList<>();

    public static void extractDetailsFromDatabaseCSV() {
        entries = new ArrayList<Entry>();
        BufferedReader br = null;
        int count = 0;
        try {
            FileReader reader = new FileReader(
                    "src\\main\\java\\cs_ia\\Database.csv");
            br = new BufferedReader(reader);
            String line = br.readLine();
            while (line != null) {
                count++;
                if (count != 1) {
                    String[] row = line.split(",", 6); // total 6 elements and avoid punctuation errors in the
                                                       // description
                    Entry entry = new Entry(row[0], row[1], row[2], row[3],
                            Integer.parseInt(row[4]), row[5]);
                    entries.add(entry);
                }

                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error in reading files after e.printStackTrace()");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter " + ex);
            }
        }
    }

    public static String[] extractNames() {
        extractDetailsFromDatabaseCSV();
        String[] ALL_NAMES = new String[entries.size()];
        for (int i = 0; i < entries.size(); i++) {
            ALL_NAMES[i] = entries.get(i).getName();
        }
        return ALL_NAMES;
    }

    public static ArrayList<Entry> getAllEntries() {
        // extractDetailsFromDatabaseCSV();
        return entries;
    }

    // To save all the rows of entries to the file.
    public static void saveToCSV() {
        File file = new File("src\\main\\java\\cs_ia\\Database.csv");
        FileWriter fw;
        try {
            fw = new FileWriter(file, false); // append at the end of the file
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Name,Subject,RQ,Topic,Priority,Desc");
            for (Entry entry : entries) {
                String line = entry.getName() + "," + entry.getSubject() + "," + entry.getRq() + "," + entry.getTopic()
                        + ","
                        + entry.getPriority() + "," + entry.getDescription();
                pw.println(line);
            }

            pw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // To add new entries to the file.
    public static void addEntry(Entry entry) {
        String line = entry.getName() + "," + entry.getSubject() + "," + entry.getRq() + "," + entry.getTopic() + ","
                + entry.getPriority() + "," + entry.getDescription();
        File file = new File("src\\main\\java\\cs_ia\\Database.csv");
        FileWriter fw;
        try {
            fw = new FileWriter(file, true); // append at the end of the file
            PrintWriter pw = new PrintWriter(fw);

            pw.println(line);

            pw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    // To delete an entry from the file.
    public static void deleteEntry(String name) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getName().equals(name)) {
                entries.remove(i);
            }
        }
        saveToCSV();
    }

    // Java program for implementation of Selection Sort
    void sortString() {
        String[] ALL_NAMES = extractNames();
        Arrays.sort(ALL_NAMES);
        for (int i = 0; i < ALL_NAMES.length; i++) {
            System.out.println(ALL_NAMES[i]);
        }
    }

    public static void SortByNameAsc() {
        if (entries.size() == 0) {
            extractDetailsFromDatabaseCSV();
        }

        System.out.println(entries.size());
        for (int i = 0; i < entries.size() - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < entries.size(); j++) {
                if (entries.get(j).getName().toUpperCase()
                        .compareTo(entries.get(minindex).getName().toUpperCase()) < 0) {
                    minindex = j;
                }
            }

            Entry temp = entries.get(i);
            entries.set(i, entries.get(minindex));
            entries.set(minindex, temp);
        }
    }

    public static void SortByNameDesc() {
        if (entries.size() == 0) {
            extractDetailsFromDatabaseCSV();
        }

        System.out.println(entries.size());
        for (int i = 0; i < entries.size() - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < entries.size(); j++) {
                if (entries.get(j).getName().toUpperCase()
                        .compareTo(entries.get(minindex).getName().toUpperCase()) > 0) {
                    minindex = j;
                }
            }

            Entry temp = entries.get(i);
            entries.set(i, entries.get(minindex));
            entries.set(minindex, temp);
        }
    }

    public static void SortByTopic() {
        if (entries.size() == 0) {
            extractDetailsFromDatabaseCSV();
        }

        System.out.println("Inside SortByTopic " + entries.size());
        for (int i = 0; i < entries.size() - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < entries.size(); j++) {
                if (entries.get(j).getTopic().compareTo(entries.get(minindex).getTopic()) < 0) {
                    minindex = j;
                }
            }
            System.out.println(i + ", " + minindex);
            Entry temp = entries.get(i);
            entries.set(i, entries.get(minindex));
            entries.set(minindex, temp);
        }
    }

    public static void SortByPriorityAsc() {
        if (entries.size() == 0) {
            extractDetailsFromDatabaseCSV();
        }
        for (int i = 0; i < entries.size() - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < entries.size(); j++) {
                if (entries.get(j).getPriority() < entries.get(minindex).getPriority()) {
                    minindex = j;
                }
            }
            Entry temp = entries.get(i);
            entries.set(i, entries.get(minindex));
            entries.set(minindex, temp);
        }
    }

    public static void SortByPriorityDesc() {
        if (entries.size() == 0) {
            extractDetailsFromDatabaseCSV();
        }
        for (int i = 0; i < entries.size() - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < entries.size(); j++) {
                if (entries.get(j).getPriority() > entries.get(minindex).getPriority()) {
                    minindex = j;
                }
            }
            Entry temp = entries.get(i);
            entries.set(i, entries.get(minindex));
            entries.set(minindex, temp);
        }
    }

    public static String linsearchString() {
        String[] ALL_NAMES = extractNames();
        String name = "";
        boolean found = false;
        for (int i = 0; i < ALL_NAMES.length; i++) {
            if (ALL_NAMES[i].equals(name)) {
                found = true;
                break;
            }
        }
        if (found) {
            return "Found";
        } else {
            return "Not Found";
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(extractNames()));
    }
}
