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
        BufferedReader br = null;
        int count = 0;
        try {
            FileReader reader = new FileReader(
                    "D:\\Code\\CS_IA\\src\\main\\java\\cs_ia\\Database.csv");
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
        extractDetailsFromDatabaseCSV();
        return entries;
    }

    // To save all the rows of entries to the file.
    public void saveToCSV() {

    }

    // To add new entries to the file.
    public static void addEntry(Entry entry) {
        String line = entry.getName() + "," + entry.getSubject() + "," + entry.getRq() + "," + entry.getTopic() + ","
                + entry.getPriority() + "," + entry.getDescription();
        File file = new File("D:\\Code\\CS_IA\\src\\main\\java\\cs_ia\\Database.csv");
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
    public void deleteEntry(String name) {

    }

    // Java program for implementation of Selection Sort
    void sortString() {

    }

    public static int linsearchString() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(extractNames()));
    }
}
