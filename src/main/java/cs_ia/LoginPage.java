package cs_ia;

import java.awt.Component;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rony
 */
public class LoginPage extends javax.swing.JFrame {

    private Component frame;

    /** Creates new form LoginPage */
    public LoginPage() {
        initComponents();

        String[] arr = extractNameAndPasswordFromFile();

        if (arr[0] != null && arr[1] != null) {
            jUsernameField.setText(arr[0]);
            jPasswordField.setText(arr[1]);
        } else {
            jUsernameField.setText("Username");
            jPasswordField.setText("jPasswordField");
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
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jUsernameField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField = new javax.swing.JPasswordField();
        jLoginButton = new javax.swing.JButton();
        jUsernameFieldS = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPasswordFieldS = new javax.swing.JPasswordField();
        jSignUpButton = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jEmailField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Welcome Back!");

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Please log-in or create a new account ");

        jUsernameField.setBackground(new java.awt.Color(255, 255, 255));
        jUsernameField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jUsernameField.setForeground(new java.awt.Color(0, 0, 0));
        jUsernameField.setText("Username");
        jUsernameField.setToolTipText("");
        jUsernameField.setBorder(null);
        jUsernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUsernameFieldMouseClicked(evt);
            }
        });
        jUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsernameFieldActionPerformed(evt);
            }
        });

        jPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField.setText("jPasswordField1");
        jPasswordField.setBorder(null);
        jPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldMouseClicked(evt);
            }
        });

        jLoginButton.setBackground(new java.awt.Color(255, 255, 255));
        jLoginButton.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLoginButton.setForeground(new java.awt.Color(0, 0, 0));
        jLoginButton.setText("Login");
        jLoginButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLoginButton.setContentAreaFilled(false);
        jLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButtonActionPerformed(evt);
            }
        });

        jUsernameFieldS.setBackground(new java.awt.Color(255, 255, 255));
        jUsernameFieldS.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jUsernameFieldS.setForeground(new java.awt.Color(0, 0, 0));
        jUsernameFieldS.setText("Username");
        jUsernameFieldS.setToolTipText("");
        jUsernameFieldS.setBorder(null);
        jUsernameFieldS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsernameFieldSActionPerformed(evt);
            }
        });

        jPasswordFieldS.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldS.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jPasswordFieldS.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordFieldS.setText("jPasswordField1");
        jPasswordFieldS.setBorder(null);

        jSignUpButton.setBackground(new java.awt.Color(255, 255, 255));
        jSignUpButton.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jSignUpButton.setForeground(new java.awt.Color(0, 0, 0));
        jSignUpButton.setText("SignUP");
        jSignUpButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jSignUpButton.setContentAreaFilled(false);
        jSignUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignUpButtonActionPerformed(evt);
            }
        });

        jEmailField.setBackground(new java.awt.Color(255, 255, 255));
        jEmailField.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jEmailField.setForeground(new java.awt.Color(0, 0, 0));
        jEmailField.setText("Email");
        jEmailField.setToolTipText("");
        jEmailField.setBorder(null);
        jEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jUsernameField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 226,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jSeparator1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 235,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jPasswordField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 226,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jSeparator2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 235,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(50, 50, 50)
                                                                .addComponent(jLoginButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 133,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76,
                                                        Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jPasswordFieldS,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 226,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jSeparator4,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 235,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jUsernameFieldS,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 226,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jSeparator3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 235,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jEmailField,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 226,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jSeparator5,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 235,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(50, 50, 50)
                                                                .addComponent(jSignUpButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 133,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(42, 42, 42))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 306,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 291,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(126, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jUsernameFieldS, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jEmailField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPasswordFieldS, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String[] extractNameAndPasswordFromFile() {
        String[] result = new String[2];
        BufferedReader br = null;
        int count = 0;
        String line1 = null, line3 = null;
        try {
            FileReader reader = new FileReader(
                    "src\\main\\java\\cs_ia\\Credentials.txt");
            br = new BufferedReader(reader);
            String line = br.readLine();
            while (line != null) {
                count++;
                if (count == 1) {
                    line1 = line;
                } else if (count == 3) {
                    line3 = line;
                }
                line = br.readLine();
            }

            result[0] = line1;
            result[1] = line3;

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
        return result;
    }

    private void jUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jUsernameFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jUsernameFieldActionPerformed

    private void jUsernameFieldSActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jUsernameFieldSActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jUsernameFieldSActionPerformed

    private void jEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jEmailFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jEmailFieldActionPerformed

    private void jUsernameFieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jUsernameFieldMouseClicked
        jUsernameField.setText("");
    }// GEN-LAST:event_jUsernameFieldMouseClicked

    private void jPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPasswordFieldMouseClicked
        jPasswordField.setText("");
    }// GEN-LAST:event_jPasswordFieldMouseClicked

    private void jLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jLoginButtonActionPerformed

        /*
         * File file = new
         * File("D:\\Code\\CompSci\\NetbeansProjects\\LoginPage\\CS_IA"); \
         */

        String username = jUsernameField.getText();
        String pwd = jPasswordField.getText();

        String[] arr = extractNameAndPasswordFromFile();

        if (username.equals("admin") && pwd.equals("abc")) {
            HomePage h = new HomePage(username);
            this.dispose();
            h.setLocationRelativeTo(null);
            h.setVisible(true);
            JOptionPane.showMessageDialog(null, "login successful");
        }

        else if (username.equals(arr[0]) && pwd.equals(arr[1])) {
            HomePage h = new HomePage(username);
            JOptionPane.showMessageDialog(null, "login successful");
            this.dispose();
            h.setLocationRelativeTo(null);
            h.setVisible(true);
        }

        else {
            JOptionPane.showMessageDialog(null, "wrong credentials \nplease try again");
        }
    }

    // GEN-LAST:event_jLoginButtonActionPerformed

    private void jSignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jSignUpButtonActionPerformed
        File file = new File("src\\main\\java\\cs_ia\\Credentials.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(jUsernameFieldS.getText());
            pw.println(jEmailField.getText());
            pw.println(jPasswordFieldS.getText());

            pw.close();

        } catch (IOException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(frame, "Account successfully created\nPlease restart the application!");

    }// GEN-LAST:event_jSignUpButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginPage l = new LoginPage();
                l.setLocationRelativeTo(null);
                l.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jEmailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jLoginButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordFieldS;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jSignUpButton;
    private javax.swing.JTextField jUsernameField;
    private javax.swing.JTextField jUsernameFieldS;
    // End of variables declaration//GEN-END:variables

}
