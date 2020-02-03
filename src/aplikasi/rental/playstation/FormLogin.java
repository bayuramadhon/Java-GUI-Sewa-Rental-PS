/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.rental.playstation;

import com.jtattoo.plaf.noire.NoireLookAndFeel;
import java.util.Arrays;
import javax.swing.UIManager;


public class FormLogin extends javax.swing.JFrame {

    
    public FormLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        Btnexit = new javax.swing.JButton();
        BtnLogin = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Login Rental PS ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(176, 28, 116, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bayu Ramadhan\\Downloads\\Administrator-icon.png")); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(15, 90, 90, 32);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bayu Ramadhan\\Downloads\\key-icon.png")); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 140, 110, 32);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama);
        txtNama.setBounds(140, 90, 195, 26);

        Btnexit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bayu Ramadhan\\Downloads\\Button-Close-icon.png")); // NOI18N
        Btnexit.setText("Exit");
        Btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnexitActionPerformed(evt);
            }
        });
        getContentPane().add(Btnexit);
        Btnexit.setBounds(310, 229, 100, 40);

        BtnLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bayu Ramadhan\\Downloads\\Login-icon.png")); // NOI18N
        BtnLogin.setText("Login");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLogin);
        BtnLogin.setBounds(130, 230, 107, 41);
        getContentPane().add(txtpassword);
        txtpassword.setBounds(140, 150, 195, 26);

        setSize(new java.awt.Dimension(574, 384));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed
    //source code/coding untuk username dan password
    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        String nama = "bayu";
        String username = txtNama.getText();
        char[] password = txtpassword.getPassword();
        char[] correctPass = new char[] {'1', '2', '3', '4'};
        if (username.equals(nama) && Arrays.equals(password, correctPass)) {
            this.setVisible(false);
            new RentalPs().setVisible(true);
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "maaf nama user atau password salah");
                   
            txtNama.setText("");
            txtpassword.setText("");
            txtNama.requestFocus();
        }
    }//GEN-LAST:event_BtnLoginActionPerformed
    //source code/coding untuk untuk untuk keluar dari form login
    private void BtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnexitActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         try {UIManager.setLookAndFeel(new NoireLookAndFeel());
            //UIManager.setLoOKAndFeel(new McWinLookAndFeel());
            
	} catch (Exception e){
	}
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JButton Btnexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
