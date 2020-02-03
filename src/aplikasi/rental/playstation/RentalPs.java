
package aplikasi.rental.playstation;

import com.jtattoo.plaf.noire.NoireLookAndFeel;
import java.awt.HeadlessException;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class RentalPs extends javax.swing.JFrame {
   // Dekelarasi tipe variabel
   String Biayaperjam;
   int Waktupenggunaan;
   String Sw1 = "0";
   
    public RentalPs() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelBiaya = new javax.swing.JLabel();
        LabelWaktu = new javax.swing.JLabel();
        LabelLainnya = new javax.swing.JLabel();
        ComboBox1 = new javax.swing.JComboBox<>();
        txtWaktu = new javax.swing.JTextField();
        txtBiaya = new javax.swing.JTextField();
        txtLainnya = new javax.swing.JTextField();
        TotalBayar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Kembalian = new javax.swing.JLabel();
        LabelRpKembalian = new javax.swing.JLabel();
        LabelUangdibayar = new javax.swing.JLabel();
        txtuangdibayar = new javax.swing.JTextField();
        LabelNilaiTotalBayar = new javax.swing.JLabel();
        LabelKembalian = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        btnHitung = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Btnexit = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Aplikasi Rental Ps");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 20, 125, 20);

        jLabel3.setText("Jenis PS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 70, 70, 20);

        LabelBiaya.setText("Biaya Perjam");
        getContentPane().add(LabelBiaya);
        LabelBiaya.setBounds(15, 144, 120, 20);

        LabelWaktu.setText("Waktu Penggunaan");
        getContentPane().add(LabelWaktu);
        LabelWaktu.setBounds(15, 194, 170, 20);

        LabelLainnya.setText("Pesanan Lainnya (snack)");
        getContentPane().add(LabelLainnya);
        LabelLainnya.setBounds(15, 244, 210, 20);

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PS2(fat)", "PS2(slim)", "PS3(fat)", "PS3(slim)", "PS4(slim)", "PS4(pro)" }));
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox1);
        ComboBox1.setBounds(140, 70, 99, 26);
        getContentPane().add(txtWaktu);
        txtWaktu.setBounds(210, 190, 283, 26);

        txtBiaya.setEditable(false);
        txtBiaya.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtBiaya.setEnabled(isEnabled());
        getContentPane().add(txtBiaya);
        txtBiaya.setBounds(210, 150, 283, 26);
        getContentPane().add(txtLainnya);
        txtLainnya.setBounds(210, 240, 283, 26);

        TotalBayar.setText("Total Bayar");
        getContentPane().add(TotalBayar);
        TotalBayar.setBounds(15, 299, 110, 20);

        jLabel8.setText("Jam");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(500, 190, 30, 20);

        Kembalian.setText("Kembalian ");
        getContentPane().add(Kembalian);
        Kembalian.setBounds(15, 400, 100, 20);

        LabelRpKembalian.setText("Rp");
        getContentPane().add(LabelRpKembalian);
        LabelRpKembalian.setBounds(169, 400, 19, 20);

        LabelUangdibayar.setText("Uang yang dibayar");
        getContentPane().add(LabelUangdibayar);
        LabelUangdibayar.setBounds(15, 350, 160, 20);
        getContentPane().add(txtuangdibayar);
        txtuangdibayar.setBounds(206, 347, 198, 26);

        LabelNilaiTotalBayar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LabelNilaiTotalBayar.setText("0");
        getContentPane().add(LabelNilaiTotalBayar);
        LabelNilaiTotalBayar.setBounds(210, 300, 180, 20);

        LabelKembalian.setText("0");
        getContentPane().add(LabelKembalian);
        LabelKembalian.setBounds(210, 400, 190, 20);

        btnBatal.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bayu Ramadhan\\Downloads\\draw-eraser-icon.png")); // NOI18N
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal);
        btnBatal.setBounds(130, 450, 110, 40);

        btnHitung.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bayu Ramadhan\\Downloads\\Calculator-icon.png")); // NOI18N
        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnHitung);
        btnHitung.setBounds(280, 450, 120, 40);

        btnprint.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bayu Ramadhan\\Downloads\\Actions-document-print-icon.png")); // NOI18N
        btnprint.setText("Print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        getContentPane().add(btnprint);
        btnprint.setBounds(420, 460, 110, 140);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bayu Ramadhan\\Pictures\\playstation-logo (2).jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 90, 300, 320);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(540, 0, 350, 660);

        Btnexit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bayu Ramadhan\\Downloads\\close.png")); // NOI18N
        Btnexit.setText("Exit");
        Btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnexitActionPerformed(evt);
            }
        });
        getContentPane().add(Btnexit);
        Btnexit.setBounds(130, 520, 110, 40);

        setSize(new java.awt.Dimension(896, 702));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //source code/coding untuk pilhan jenis ps di combo box
    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
        
        if (ComboBox1.getSelectedItem().equals("PS2(fat)")) {
            txtBiaya.setText("2000"); 
        } else if (ComboBox1.getSelectedItem().equals("PS2(slim)")) {
            txtBiaya.setText("5000");
        } else if (ComboBox1.getSelectedItem().equals("PS3(fat)")) {
            txtBiaya.setText("10000");
        } else if (ComboBox1.getSelectedItem().equals("PS3(slim)")) {
            txtBiaya.setText("15000"); 
        } else if (ComboBox1.getSelectedItem().equals("PS4(slim)")) {
            txtBiaya.setText("20000");
        } else if (ComboBox1.getSelectedItem().equals("PS4(pro)")) {
            txtBiaya.setText("25000");
        }
        txtWaktu.requestFocus();
    }//GEN-LAST:event_ComboBox1ActionPerformed

    //source code/coding untuk menghapus semua inputan aplikasi di tombol batal
    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        //Perintah Batal
        txtBiaya.setText("");
        txtWaktu.setText("");
        txtLainnya.setText("");
        txtuangdibayar.setText("");
    }//GEN-LAST:event_btnBatalActionPerformed

    //source code/coding untuk kalkulasi aplikasi di button hitung
    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed

        int lblperjam;
        lblperjam = Integer.parseInt(txtBiaya.getText());
        int lblWaktupenggunaan;
        lblWaktupenggunaan = Integer.parseInt(txtWaktu.getText());
        int lblSnack ;
        if ("".equals(txtLainnya.getText())) {
            txtLainnya.setText("0");
        }
        lblSnack = Integer.parseInt(txtLainnya.getText());
        
        int totalBayar;

        totalBayar = (lblperjam*lblWaktupenggunaan)+ lblSnack;
        DecimalFormat formater = new DecimalFormat("#,###");
        String output = formater.format(totalBayar);
        LabelNilaiTotalBayar.setText(String.valueOf("Rp. "+output));
        if (Sw1 == "1") {
            int uangbayar = Integer.parseInt(txtuangdibayar.getText());
            int kembalian;
            kembalian = uangbayar-totalBayar;
            LabelKembalian.setText(Integer.toString(kembalian));
        }
        Sw1 = "1";
    }//GEN-LAST:event_btnHitungActionPerformed

    //source code/coding untuk mengprint output aplikasi ke notepad di button print
    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed

        try {

            File temp = new File("printrentalps.txt");
            if (temp.exists()) {
                temp.delete();
            }
            FileWriter fileWriter = new FileWriter("printrentalps.txt", true);
            fileWriter.write(LabelBiaya.getText() + ": "+ txtBiaya.getText());
            fileWriter.write(System.getProperty("line.separator"));
            fileWriter.write(LabelWaktu.getText() + ": " + txtWaktu.getText());
            fileWriter.write(System.getProperty("line.separator"));
            fileWriter.write(LabelLainnya.getText() + ": " + txtLainnya.getText());
            fileWriter.write(System.getProperty("line.separator"));
            fileWriter.write(TotalBayar.getText() + ": " + LabelNilaiTotalBayar.getText());
            fileWriter.write(System.getProperty("line.separator"));
            fileWriter.write(LabelUangdibayar.getText() + ": " + txtuangdibayar.getText());
            fileWriter.write(System.getProperty("line.separator"));
            fileWriter.write(Kembalian.getText() + ": " + LabelKembalian.getText());
            fileWriter.flush();
            fileWriter.close();
            JOptionPane.showMessageDialog(rootPane, "sukses");

        } catch (HeadlessException | IOException e) {

            JOptionPane.showMessageDialog(rootPane,"eror" );
        }
        ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "printrentalps.txt");
        try {
            pb.start();
        } catch (IOException ex) {
            Logger.getLogger(RentalPs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void BtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnexitActionPerformed
        //exit
        System.exit(0);
    }//GEN-LAST:event_BtnexitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
        try {UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            //UIManager.setLoOKAndFeel(new McWinLookAndFeel());

	} catch (Exception e){
	}
        
        java.awt.EventQueue.invokeLater(() -> { 
            new RentalPs().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnexit;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JLabel Kembalian;
    private javax.swing.JLabel LabelBiaya;
    private javax.swing.JLabel LabelKembalian;
    private javax.swing.JLabel LabelLainnya;
    private javax.swing.JLabel LabelNilaiTotalBayar;
    private javax.swing.JLabel LabelRpKembalian;
    private javax.swing.JLabel LabelUangdibayar;
    private javax.swing.JLabel LabelWaktu;
    private javax.swing.JLabel TotalBayar;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnprint;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextField txtLainnya;
    private javax.swing.JTextField txtWaktu;
    private javax.swing.JTextField txtuangdibayar;
    // End of variables declaration//GEN-END:variables
}
