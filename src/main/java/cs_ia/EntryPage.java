/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cs_ia;

/**
 *
 * @author Rony
 */
public class EntryPage extends javax.swing.JFrame {

    /**
     * Creates new form EntryPage
     */
    public EntryPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        SubjectField = new javax.swing.JTextField();
        TopicField = new javax.swing.JTextField();
        RQField = new javax.swing.JTextField();
        DescField = new javax.swing.JTextField();
        jLoginButton = new javax.swing.JButton();
        jLoginButton1 = new javax.swing.JButton();
        jLoginButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Create a new entry");

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fill in the student's extended essay details below");

        NameField.setBackground(new java.awt.Color(255, 255, 255));
        NameField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        NameField.setForeground(new java.awt.Color(0, 0, 0));
        NameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NameField.setText("Student Name");
        NameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        SubjectField.setBackground(new java.awt.Color(255, 255, 255));
        SubjectField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        SubjectField.setForeground(new java.awt.Color(0, 0, 0));
        SubjectField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SubjectField.setText("Subject");
        SubjectField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        TopicField.setBackground(new java.awt.Color(255, 255, 255));
        TopicField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        TopicField.setForeground(new java.awt.Color(0, 0, 0));
        TopicField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TopicField.setText("Topic");
        TopicField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        RQField.setBackground(new java.awt.Color(255, 255, 255));
        RQField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        RQField.setForeground(new java.awt.Color(0, 0, 0));
        RQField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RQField.setText("Research Question");
        RQField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        DescField.setBackground(new java.awt.Color(255, 255, 255));
        DescField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        DescField.setForeground(new java.awt.Color(0, 0, 0));
        DescField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DescField.setText("Description / Notes");
        DescField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLoginButton.setBackground(new java.awt.Color(226, 226, 226));
        jLoginButton.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLoginButton.setForeground(new java.awt.Color(0, 0, 0));
        jLoginButton.setText("Create");
        jLoginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLoginButton.setContentAreaFilled(false);
        jLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButtonActionPerformed(evt);
            }
        });

        jLoginButton1.setBackground(new java.awt.Color(226, 226, 226));
        jLoginButton1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLoginButton1.setForeground(new java.awt.Color(0, 0, 0));
        jLoginButton1.setText("Button3");
        jLoginButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLoginButton1.setContentAreaFilled(false);
        jLoginButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLoginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButton1ActionPerformed(evt);
            }
        });

        jLoginButton2.setBackground(new java.awt.Color(226, 226, 226));
        jLoginButton2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLoginButton2.setForeground(new java.awt.Color(0, 0, 0));
        jLoginButton2.setText("Button2");
        jLoginButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLoginButton2.setContentAreaFilled(false);
        jLoginButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLoginButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TopicField)
                                    .addComponent(SubjectField)
                                    .addComponent(NameField)
                                    .addComponent(RQField, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addComponent(DescField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SubjectField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TopicField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RQField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DescField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void jLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginButtonActionPerformed
        String Name = NameField.getText();
        String RQ = RQField.getText();
        String Subject = SubjectField.getText();
        String Topic = TopicField.getText();
        String Desc = DescField.getText();
        int DefaultPriority = 1;
        
        Entry e = new Entry(Name, Subject, RQ, Topic, DefaultPriority, Desc);
        
        All_Entries.addEntry(e);
        
    }//GEN-LAST:event_jLoginButtonActionPerformed

    private void jLoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLoginButton1ActionPerformed

    private void jLoginButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLoginButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EntryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntryPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DescField;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField RQField;
    private javax.swing.JTextField SubjectField;
    private javax.swing.JTextField TopicField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jLoginButton;
    private javax.swing.JButton jLoginButton1;
    private javax.swing.JButton jLoginButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
