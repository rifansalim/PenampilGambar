/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;

/**
 *
 * @author LENOVO
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
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

        buttonpanel = new javax.swing.JPanel();
        amuntaibtn = new javax.swing.JButton();
        balikpapanbtn = new javax.swing.JButton();
        banjarbarubtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        imagepanel = new javax.swing.JPanel();
        balikpapan = new javax.swing.JLabel();
        banjarbaru = new javax.swing.JLabel();
        amuntai = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonpanel.setBackground(new java.awt.Color(255, 255, 0));

        amuntaibtn.setText("Amuntai");
        amuntaibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amuntaibtnActionPerformed(evt);
            }
        });
        buttonpanel.add(amuntaibtn);

        balikpapanbtn.setText("Balikpapan");
        balikpapanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balikpapanbtnActionPerformed(evt);
            }
        });
        buttonpanel.add(balikpapanbtn);

        banjarbarubtn.setText("Banjarbaru");
        banjarbarubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banjarbarubtnActionPerformed(evt);
            }
        });
        buttonpanel.add(banjarbarubtn);

        exitbtn.setText("exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        buttonpanel.add(exitbtn);

        getContentPane().add(buttonpanel, java.awt.BorderLayout.PAGE_START);

        imagepanel.setLayout(new java.awt.CardLayout());

        balikpapan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/balikpapan.jpg"))); // NOI18N
        imagepanel.add(balikpapan, "1");

        banjarbaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/banjarbaru.jpg"))); // NOI18N
        imagepanel.add(banjarbaru, "2");

        amuntai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/amuntai.jpg"))); // NOI18N
        imagepanel.add(amuntai, "0");

        getContentPane().add(imagepanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void amuntaibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amuntaibtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"0");
    }//GEN-LAST:event_amuntaibtnActionPerformed

    private void balikpapanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balikpapanbtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"1");
    }//GEN-LAST:event_balikpapanbtnActionPerformed

    private void banjarbarubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banjarbarubtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"2");
    }//GEN-LAST:event_banjarbarubtnActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amuntai;
    private javax.swing.JButton amuntaibtn;
    private javax.swing.JLabel balikpapan;
    private javax.swing.JButton balikpapanbtn;
    private javax.swing.JLabel banjarbaru;
    private javax.swing.JButton banjarbarubtn;
    private javax.swing.JPanel buttonpanel;
    private javax.swing.JButton exitbtn;
    private javax.swing.JPanel imagepanel;
    // End of variables declaration//GEN-END:variables
}
