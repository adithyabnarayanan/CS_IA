/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cs_ia;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Rony
 */
public class MeetingSchedulePage extends javax.swing.JFrame {
    ArrayList<MeetingEvent> meetings = All_Student_Meetings.getMeetings();
    ArrayList<MeetingEvent> meetingsForSelectedStudent = new ArrayList<MeetingEvent>();

    /**
     * Creates new form MeetingSchedulePage
     */
    public MeetingSchedulePage() {
        initComponents();
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/house-48.png")));
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        for (int i = 0; i <= 6; i++) {
            dcbm.addElement(MeetingEvent.fromColumnToIndexToTimeSlotString(i));
        }

        TimePicker.setModel(dcbm);

        DefaultComboBoxModel dcbm2 = new DefaultComboBoxModel();
        String[] StudentNames = All_Entries.extractNames();
        for (int i = 0; i < StudentNames.length; i++) {
            dcbm2.addElement(StudentNames[i]);
        }

        NameComboBox.setModel(dcbm2);
        NameComboBox.setSelectedIndex(0);
        MeetingComboBox.setSelectedIndex(0);
        System.out.println(meetings.size() + ", " + meetingsForSelectedStudent.size());
        if (checkIfMeetingExists()) {
            updateScreenIfMeetingExists();
        } else {
            updateScreenIfMeetingDoesNotExist();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLoginButton1 = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        NameComboBox = new javax.swing.JComboBox<>();
        jLoginButton3 = new javax.swing.JButton();
        TimePicker = new javax.swing.JComboBox<>();
        MeetingComboBox = new javax.swing.JComboBox<>();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        Home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Schedule a Meeting!");

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Select a student to schedule a meeting or view details");

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Meeting Notes here");
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLoginButton1.setBackground(new java.awt.Color(226, 226, 226));
        jLoginButton1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLoginButton1.setForeground(new java.awt.Color(0, 0, 0));
        jLoginButton1.setText("Copy");
        jLoginButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLoginButton1.setContentAreaFilled(false);
        jLoginButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        UpdateButton.setBackground(new java.awt.Color(226, 226, 226));
        UpdateButton.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(0, 0, 0));
        UpdateButton.setText("Update");
        UpdateButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        UpdateButton.setContentAreaFilled(false);
        UpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        NameComboBox.setBackground(new java.awt.Color(255, 255, 255));
        NameComboBox.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        NameComboBox.setForeground(new java.awt.Color(0, 0, 0));
        NameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name 1", "Name 2", "Name 3", "Name 4" }));
        NameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameComboBoxActionPerformed(evt);
            }
        });

        jLoginButton3.setBackground(new java.awt.Color(226, 226, 226));
        jLoginButton3.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLoginButton3.setForeground(new java.awt.Color(0, 0, 0));
        jLoginButton3.setText("Import Timetable");
        jLoginButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLoginButton3.setContentAreaFilled(false);
        jLoginButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLoginButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButton3ActionPerformed(evt);
            }
        });

        TimePicker.setBackground(new java.awt.Color(255, 255, 255));
        TimePicker.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        TimePicker.setForeground(new java.awt.Color(0, 0, 0));
        TimePicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:10", "10:10" }));

        MeetingComboBox.setBackground(new java.awt.Color(255, 255, 255));
        MeetingComboBox.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        MeetingComboBox.setForeground(new java.awt.Color(0, 0, 0));
        MeetingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meeting 1", "Meeting 2", "Meeting 3", "Meeting  4" }));
        MeetingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeetingComboBoxActionPerformed(evt);
            }
        });

        jFormattedTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jFormattedTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yy"))));
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField1.setToolTipText("");
        jFormattedTextField1.setCaretColor(new java.awt.Color(0, 0, 0));

        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLoginButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MeetingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TimePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(NameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MeetingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLoginButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLoginButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
            HomePage h = new HomePage();
            this.dispose();
            h.setLocationRelativeTo(null);
            h.setVisible(true);
    }//GEN-LAST:event_HomeMouseClicked

    private void MeetingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_MeetingComboBoxActionPerformed
        // Check if meeting number for the selected student exists or not
        if (checkIfMeetingExists()) {
            updateScreenIfMeetingExists();
        } else {
            updateScreenIfMeetingDoesNotExist();
        }
    }// GEN-LAST:event_MeetingComboBoxActionPerformed

    private boolean checkIfMeetingExists() {
        if (MeetingComboBox.getSelectedIndex() + 1 <= meetingsForSelectedStudent.size()) {
            return true;
        } else {
            return false;
        }
    }

    // To set the button text to [update] and also retrieve the date and display in
    // the formatted text field
    private void updateScreenIfMeetingExists() {
        int meetingIndex = MeetingComboBox.getSelectedIndex();
        MeetingEvent me = meetingsForSelectedStudent.get(meetingIndex);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = fmt.format(me.getDate());
        jFormattedTextField1.setText(formattedDate);
        UpdateButton.setText("Update");
    }

    // To set the button text to [add] and also set the date field to be empty
    private void updateScreenIfMeetingDoesNotExist() {
        jFormattedTextField1.setText("");
        UpdateButton.setText("Add");
    }

    private void NameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NameComboBoxActionPerformed
        filterByStudent();
        MeetingComboBox.setSelectedIndex(0);
        // Check if meeting 1 exists for that student
        if (checkIfMeetingExists()) {
            updateScreenIfMeetingExists();
        } else {
            updateScreenIfMeetingDoesNotExist();
        }

    }// GEN-LAST:event_NameComboBoxActionPerformed

    private void jLoginButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jLoginButton3ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jLoginButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField2ActionPerformed

    //
    private void setTextForTheFormattedField() {
        meetings = All_Student_Meetings.getMeetings();
    }

    private void filterByStudent() {

        // filter by student
        String SelectedStudentName = NameComboBox.getSelectedItem().toString();
        for (int i = 0; i < meetings.size(); i++) {
            if (meetings.get(i).getStudentName().equals(SelectedStudentName)) {
                meetingsForSelectedStudent.add(meetings.get(i));
            }
        }
        // sort by the date
        for (int i = 0; i < meetingsForSelectedStudent.size() - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < meetingsForSelectedStudent.size(); j++) {
                if (meetingsForSelectedStudent.get(j).getDate()
                        .compareTo(meetingsForSelectedStudent.get(minindex).getDate()) < 0) {
                    minindex = j;
                }
            }
            MeetingEvent temp = meetingsForSelectedStudent.get(i);
            meetingsForSelectedStudent.set(i, meetingsForSelectedStudent.get(minindex));
            meetingsForSelectedStudent.set(minindex, temp);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MeetingSchedulePage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeetingSchedulePage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeetingSchedulePage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeetingSchedulePage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MeetingSchedulePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JComboBox<String> MeetingComboBox;
    private javax.swing.JComboBox<String> NameComboBox;
    private javax.swing.JComboBox<String> TimePicker;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jLoginButton1;
    private javax.swing.JButton jLoginButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
