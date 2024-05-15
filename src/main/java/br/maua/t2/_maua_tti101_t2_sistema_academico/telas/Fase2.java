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
public class Fase2 extends javax.swing.JFrame {
int selecionado = -1; 
boolean botao_um = false;//0
boolean botao_dois = false;
boolean botao_tres = false;
boolean botao_quatro = false;
boolean uma_mochila = false;
boolean dois_lapis = false;
boolean tres_livros = false;
boolean quatro_borrachas = false;
public void verificar_estado(){
    if (botao_um) {
        jToggleButton4.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton4.setEnabled(false);
    }
    if (uma_mochila) {
        jToggleButton6.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton6.setEnabled(false);
    }
    if (botao_dois) {
        jToggleButton3.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton3.setEnabled(false);
    }
    if (dois_lapis) {
        jToggleButton7.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton7.setEnabled(false);
    }
    if (botao_tres) {
        jToggleButton2.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton2.setEnabled(false);
    }
    if (tres_livros) {
        jToggleButton1.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton1.setEnabled(false);
    }
    if (botao_quatro) {
        jToggleButton9.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton9.setEnabled(false);
    }
    if (quatro_borrachas) {
        jToggleButton8.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton8.setEnabled(false);
    }
}
    /**
     * Creates new form Fase2
     */
    public Fase2() {
        initComponents();
    }
    
    private boolean avaliarSelecionado(int valor){
        
        if (selecionado == -1){
            selecionado = valor;
            return false;
        }
        //este primeiro if está verificando se ele foi selecionado, e apenas ele.
        else if (valor %4 == selecionado %4 && valor != selecionado){
            return true;
        //este if verifica se os dois valores lógicos são iguais(selecionado e valor atual). caso sim, o valor ficará verdadeiro.
        }
        else {
            selecionado = -1;
            return false;
        }
        //se o segundo botão for selecionado errado, ele volta a lógica dos botões para o estado inicial.
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
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/treslivros.png"))); // NOI18N
        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(450, 240, 129, 122);

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numero3.png"))); // NOI18N
        jToggleButton2.setText("jToggleButton1");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(310, 60, 130, 122);

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numero2.png"))); // NOI18N
        jToggleButton3.setText("jToggleButton1");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(160, 60, 129, 122);

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numero1.png"))); // NOI18N
        jToggleButton4.setText("jToggleButton1");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton4);
        jToggleButton4.setBounds(20, 60, 129, 122);

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mochila.png"))); // NOI18N
        jToggleButton6.setText("jToggleButton1");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton6);
        jToggleButton6.setBounds(160, 240, 129, 122);

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/doislapis.png"))); // NOI18N
        jToggleButton7.setText("jToggleButton1");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton7);
        jToggleButton7.setBounds(310, 240, 129, 120);

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/quatroborrachas.png"))); // NOI18N
        jToggleButton8.setText("jToggleButton1");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton8);
        jToggleButton8.setBounds(10, 240, 129, 122);

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/numeoro4.png"))); // NOI18N
        jToggleButton9.setText("jToggleButton1");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton9);
        jToggleButton9.setBounds(450, 60, 129, 122);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/branco fundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        //três livros
        int valor = 6;
        if (!tres_livros && !botao_tres && avaliarSelecionado(valor)){
            tres_livros = true;
            botao_tres = true;
            verificar_estado();
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        //três
        int valor = 2;
        if (!tres_livros && !botao_tres && avaliarSelecionado(valor)){
            tres_livros = true;
            botao_tres = true;
            verificar_estado();
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        //dois
         int valor = 1;
        if (!botao_dois && !dois_lapis && avaliarSelecionado(valor)){
            botao_dois = true;
            dois_lapis = true;
            verificar_estado();
        }     
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        //um
        int valor = 0;
        if (!botao_um && !uma_mochila && avaliarSelecionado(valor)){
            botao_um = true;
            uma_mochila = true;
            verificar_estado();
        }    
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        //uma mochila
        int valor = 4;
        if (!botao_um && !uma_mochila && avaliarSelecionado(valor)){
            botao_um = true;
            uma_mochila = true;
            verificar_estado();
        }
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        //dois lápis
        int valor = 5;
        if (!botao_dois && !dois_lapis && avaliarSelecionado(valor)){
            botao_dois = true;
            dois_lapis = true;
            verificar_estado();
        }
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        //quatro borrachas
        int valor = 7;
        if (!botao_quatro && !quatro_borrachas && avaliarSelecionado(valor)){
            botao_quatro = true;
            quatro_borrachas = true;
            verificar_estado();
        }
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        //quatro
        int valor = 3;
        if (!botao_quatro && !quatro_borrachas && avaliarSelecionado(valor)){
            botao_quatro = true;
            quatro_borrachas = true;
            verificar_estado();
        }   
    }//GEN-LAST:event_jToggleButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Fase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fase2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fase2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
