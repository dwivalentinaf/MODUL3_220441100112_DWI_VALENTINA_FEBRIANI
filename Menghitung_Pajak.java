/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Menghitung_Pajak extends javax.swing.JFrame {

    /**
     * Creates new form Menghitung_Pajak
     */
    public Menghitung_Pajak() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtPekerjaan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGaji = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtJumlahKendaraan = new javax.swing.JTextField();
        bSimpan = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        bHitungPajak = new javax.swing.JButton();
        txtTotalPajak = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        bKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("APLIKASI MENGHITUNG PAJAK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(149, 1, 330, 70);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(58, 172, 63, 16);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pekerjaan");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(58, 206, 63, 16);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama);
        txtNama.setBounds(179, 169, 210, 22);
        jPanel1.add(txtPekerjaan);
        txtPekerjaan.setBounds(179, 203, 210, 22);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gaji");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(58, 240, 63, 16);

        txtGaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGajiActionPerformed(evt);
            }
        });
        jPanel1.add(txtGaji);
        txtGaji.setBounds(179, 237, 209, 22);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jumlah Kendaraan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(58, 274, 110, 16);

        txtJumlahKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahKendaraanActionPerformed(evt);
            }
        });
        jPanel1.add(txtJumlahKendaraan);
        txtJumlahKendaraan.setBounds(179, 271, 209, 22);

        bSimpan.setText("Simpan");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(bSimpan);
        bSimpan.setBounds(180, 400, 72, 23);

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });
        jPanel1.add(bReset);
        bReset.setBounds(280, 400, 72, 23);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_3/icon_pajak_resize-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(1, 1, 150, 140);

        bHitungPajak.setText("Hitung Total Pajak");
        bHitungPajak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungPajakActionPerformed(evt);
            }
        });
        jPanel1.add(bHitungPajak);
        bHitungPajak.setBounds(180, 310, 160, 30);

        txtTotalPajak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPajakActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotalPajak);
        txtTotalPajak.setBounds(180, 350, 210, 22);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mari Membayar Pajak !!");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(150, 90, 330, 40);

        bKeluar.setText("Keluar");
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(bKeluar);
        bKeluar.setBounds(380, 400, 72, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGajiActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtJumlahKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahKendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahKendaraanActionPerformed

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed

        try {
        // Mendapatkan nilai dari inputan
        String nama = txtNama.getText();
        String pekerjaan = txtPekerjaan.getText();
        double gaji = Double.parseDouble(txtGaji.getText());
        int jumlahKendaraan = Integer.parseInt(txtJumlahKendaraan.getText());
        double pajak = Double.parseDouble(txtTotalPajak.getText());

        
        if (gaji < 0 || jumlahKendaraan < 0) {
            JOptionPane.showMessageDialog(this, "Gaji dan jumlah kendaraan tidak boleh negatif!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Data Berhasil disimpan!!! \n Nama : " + nama + "\n Pekerjaan :" + pekerjaan + "\n gaji : " + gaji
                + "\n Jumlah Kendaraan : " + jumlahKendaraan + "\n Pajak :" + pajak);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan nilai yang valid!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_bSimpanActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtPekerjaan.setText("");
        txtGaji.setText("");
        txtJumlahKendaraan.setText("");
        txtTotalPajak.setText("");
    }//GEN-LAST:event_bResetActionPerformed

    private void bHitungPajakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungPajakActionPerformed
        try {
        
        String nama = txtNama.getText();
        String pekerjaan = txtPekerjaan.getText();
        double gaji = Double.parseDouble(txtGaji.getText());
        int jumlahKendaraan = Integer.parseInt(txtJumlahKendaraan.getText());

        
        if (gaji < 0 || jumlahKendaraan < 0) {
            JOptionPane.showMessageDialog(this, "Gaji dan jumlah kendaraan tidak boleh negatif!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

      
        double pajak;
        if (gaji >= 10_000_000 && jumlahKendaraan <= 3) {
            pajak = 0.15 * gaji;
        } else if (gaji >= 5_000_000 && jumlahKendaraan >= 2) {
            pajak = 0.10 * gaji;
        } else if (gaji >= 5_000_000 && jumlahKendaraan <= 1) {
            pajak = 0.07 * gaji;
        } else if (gaji < 5_000_000 && jumlahKendaraan <= 1) {
            pajak = 0.05 * gaji;
        } else if (gaji < 5_000_000 && jumlahKendaraan >= 0) {
            pajak = 0.025 * gaji;
        } else {
            pajak = 0.0; 
        }

        
        txtTotalPajak.setText(String.valueOf(pajak));
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan nilai numerik yang valid!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_bHitungPajakActionPerformed

    private void txtTotalPajakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPajakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPajakActionPerformed

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bKeluarActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Menghitung_Pajak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menghitung_Pajak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menghitung_Pajak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menghitung_Pajak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menghitung_Pajak().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHitungPajak;
    private javax.swing.JButton bKeluar;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtGaji;
    private javax.swing.JTextField txtJumlahKendaraan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPekerjaan;
    private javax.swing.JTextField txtTotalPajak;
    // End of variables declaration//GEN-END:variables
}
