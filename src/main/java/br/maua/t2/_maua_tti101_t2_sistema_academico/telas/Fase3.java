/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.maua.t2._maua_tti101_t2_sistema_academico.telas;

import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author luisa
 */
public class Fase3 extends javax.swing.JFrame{
int selecionado = -1; 
boolean peixe = false;//0
boolean abelha = false;
boolean leao = false;
boolean macaco = false;
boolean colmeia = false;
boolean mar = false;
boolean floresta = false;
boolean selva = false;
public void verificar_estado(){
    if (peixe) {
        jToggleButton4.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton4.setEnabled(false);
    }
    if (abelha) {
        jToggleButton10.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton10.setEnabled(false);
    }
    if (leao) {
        jToggleButton2.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton2.setEnabled(false);
    }
    if (mar) {
        jToggleButton7.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton7.setEnabled(false);
    }
    if (selva) {
        jToggleButton3.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton3.setEnabled(false);
    }
    if (macaco) {
        jToggleButton1.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton1.setEnabled(false);
    }
    if (floresta) {
        jToggleButton6.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton6.setEnabled(false);
    }
    if (colmeia) {
        jToggleButton5.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton5.setEnabled(false);
    }
}

    /**
     * Creates new form Fase3
     */
    public Fase3(){
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jToggleButton1.setIcon(new javax.swing.ImageIcon("C:\\20241_maua_tti101_t2_sistema_academico\\src\\main\\images\\macacoooo.png")); // NOI18N
        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(460, 80, 129, 123);

        jToggleButton2.setIcon(new javax.swing.ImageIcon("C:\\20241_maua_tti101_t2_sistema_academico\\src\\main\\images\\le.png")); // NOI18N
        jToggleButton2.setText("jToggleButton1");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(310, 80, 129, 123);

        jToggleButton3.setIcon(new javax.swing.ImageIcon("C:\\20241_maua_tti101_t2_sistema_academico\\src\\main\\images\\lele.png")); // NOI18N
        jToggleButton3.setText("jToggleButton1");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(10, 220, 129, 122);

        jToggleButton4.setIcon(new javax.swing.ImageIcon("C:\\20241_maua_tti101_t2_sistema_academico\\src\\main\\images\\pepe.png")); // NOI18N
        jToggleButton4.setText("jToggleButton1");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton4);
        jToggleButton4.setBounds(10, 80, 129, 122);

        jToggleButton5.setIcon(new javax.swing.ImageIcon("C:\\20241_maua_tti101_t2_sistema_academico\\src\\main\\images\\casaab.png")); // NOI18N
        jToggleButton5.setText("jToggleButton1");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton5);
        jToggleButton5.setBounds(460, 220, 129, 118);

        jToggleButton6.setIcon(new javax.swing.ImageIcon("C:\\20241_maua_tti101_t2_sistema_academico\\src\\main\\images\\arvmac.png")); // NOI18N
        jToggleButton6.setText("jToggleButton1");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton6);
        jToggleButton6.setBounds(310, 220, 129, 122);

        jToggleButton7.setIcon(new javax.swing.ImageIcon("C:\\20241_maua_tti101_t2_sistema_academico\\src\\main\\images\\marrr.png")); // NOI18N
        jToggleButton7.setText("jToggleButton1");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton7);
        jToggleButton7.setBounds(160, 220, 129, 122);

        jToggleButton10.setIcon(new javax.swing.ImageIcon("C:\\20241_maua_tti101_t2_sistema_academico\\src\\main\\images\\abelhaa.png")); // NOI18N
        jToggleButton10.setText("jToggleButton1");
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton10);
        jToggleButton10.setBounds(160, 80, 129, 122);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\20241_maua_tti101_t2_sistema_academico\\src\\main\\images\\branco fundo.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        //macaco
        int valor = 3;
        if (selecionado == -1)
            selecionado = valor%4;
        else if (selecionado != 3|| macaco )
            selecionado = -1;
        else {
            macaco = true;
            floresta = true;
            verificar_estado();
        }                        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        //leao
        int valor = 2;
        if (selecionado == -1)
            selecionado = valor%4;
        else if (selecionado != 2 || leao )
            selecionado = -1;
        else {
            leao = true;
            selva = true;
            verificar_estado();
        }                          
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        //selva
        int valor = 6;
        if (selecionado == -1)
            selecionado = valor%4;
        else if (selecionado != 6 || selva)
            selecionado = -1;
        else {
            selva = true;
            leao = true;
            verificar_estado();
        }                         
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        //peixe
        int valor = 0;
        if (selecionado == -1)
            selecionado = valor%4;
        else if (selecionado != 0 || peixe )
            selecionado = -1;
        else {
            peixe = true;
            mar = true;
            verificar_estado();
        }                      
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        //colmeia
        int valor = 5;
        if (selecionado == -1)
            selecionado = valor%4;
        else if (selecionado != 5 || colmeia )
            selecionado = -1;
        else {
            colmeia = true;
            abelha = true;
            verificar_estado();
        }                         
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        //floresta
        int valor = 7;
        if (selecionado == -1)
            selecionado = valor%4;
        else if (selecionado != 7 || floresta )
            selecionado = -1;
        else {
            floresta = true;
            macaco = true;
            verificar_estado();
        }                          
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        //mar
        int valor = 4;
        if (selecionado == -1)
            selecionado = valor%4;
        else if (selecionado != 4 || mar )
            selecionado = -1;
        else {
            mar = true;
            peixe = true;
            verificar_estado();
        }                         
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        //abelha
        int valor = 1;
        if (selecionado == -1)
            selecionado = valor%4;
        else if (selecionado != 1 || abelha )
            selecionado = -1;
        else {
            abelha = true;
            colmeia = true;
            verificar_estado();
        }
    }//GEN-LAST:event_jToggleButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Fase3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fase3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fase3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fase3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fase3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    // End of variables declaration//GEN-END:variables
}

