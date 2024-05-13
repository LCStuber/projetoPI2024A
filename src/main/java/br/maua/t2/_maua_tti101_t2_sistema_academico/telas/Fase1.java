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
public class Fase1 extends javax.swing.JFrame {
int selecionado = -1; 
boolean botao_amarelo = false;
boolean botao_azul = false;
boolean botao_vermelho = false;
boolean botao_verde = false;
boolean banana = false;
boolean planta = false;
boolean nuvem = false;
boolean morango = false;
public void verificar_estado(){
    if (botao_amarelo) {
        jToggleButton4.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton4.setEnabled(false);
    }
    if (banana) {
        jToggleButton8.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton8.setEnabled(false);
    }
    if (botao_azul) {
        jToggleButton3.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton3.setEnabled(false);
    }
    if (nuvem) {
        jToggleButton7.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton7.setEnabled(false);
    }
    if (botao_vermelho) {
        jToggleButton1.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton1.setEnabled(false);
    }
    if (morango) {
        jToggleButton6.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton6.setEnabled(false);
    }
    if (botao_verde) {
        jToggleButton2.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton2.setEnabled(false);
    }
    if (planta) {
        jToggleButton5.setBorder(BorderFactory.createLineBorder(Color.green));
        jToggleButton5.setEnabled(false);
    }
}
    /**
     * Creates new form Fase1
     */
    public Fase1() {
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
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(450, 70, 129, 122);

        jToggleButton2.setText("jToggleButton1");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(310, 70, 129, 122);

        jToggleButton3.setText("jToggleButton1");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(170, 70, 129, 122);

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/maua/t2/_maua_tti101_t2_sistema_academico/telas/vermelho.png"))); // NOI18N
        jToggleButton4.setText("jToggleButton1");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton4);
        jToggleButton4.setBounds(30, 70, 129, 122);

        jToggleButton5.setText("jToggleButton1");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton5);
        jToggleButton5.setBounds(30, 220, 129, 122);

        jToggleButton6.setText("jToggleButton1");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton6);
        jToggleButton6.setBounds(170, 220, 129, 122);

        jToggleButton7.setText("jToggleButton1");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton7);
        jToggleButton7.setBounds(310, 220, 129, 122);

        jToggleButton8.setText("jToggleButton1");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton8);
        jToggleButton8.setBounds(450, 220, 129, 122);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // vermelho
        int valor = 3;
        if (!botao_vermelho && !morango && avaliarSelecionado(valor)){
            botao_vermelho = true;
            morango = true;
            verificar_estado();
        // ele está verificando se os botões de mesmas cores já foram acertados
        //se não foram vai se tornar verdadeiro, e deixar o botão como selecionado vizualmente
        }    
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // verde
        int valor = 2;
        if (!botao_verde && !planta && avaliarSelecionado(valor)){
            botao_verde = true;
            planta = true;
            verificar_estado();
        }   
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // azul
        int valor = 1;
        if (!botao_azul && !nuvem && avaliarSelecionado(valor)){
            botao_azul = true;
            nuvem = true;
            verificar_estado();
        }     
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        //amarelo
        int valor = 0;
        if (!botao_amarelo && !banana && avaliarSelecionado(valor)){
            botao_amarelo = true;
            banana = true;
            verificar_estado();
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // planta verde
        int valor = 6;
        if (!botao_vermelho && !morango && avaliarSelecionado(valor)){
            botao_vermelho = true;
            morango = true;
            verificar_estado();
        }                    
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // morango
        int valor = 7;
         if (!botao_vermelho && !morango && avaliarSelecionado(valor)){
            botao_vermelho = true;
            morango = true;
            verificar_estado();
        // ele está verificando se os botões de mesmas cores já foram acertados
        //se não foram vai se tornar verdadeiro, e deixar o botão como selecionado vizualmente
        } 
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        //nuvem
        int valor = 5;
        if (!botao_azul && !nuvem && avaliarSelecionado(valor)){
            botao_azul = true;
            nuvem = true;
            verificar_estado();
        }   
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        //banana
        int valor = 4;
        if (!botao_amarelo && !banana && avaliarSelecionado(valor)){
            botao_amarelo = true;
            banana = true;
            verificar_estado();
        }
    }//GEN-LAST:event_jToggleButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fase1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    // End of variables declaration//GEN-END:variables
}
