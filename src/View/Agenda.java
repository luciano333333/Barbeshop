/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author lujos
 */
public class Agenda extends javax.swing.JFrame {
 
    private final AgendaController controller;
   
    public Agenda() {
        initComponents();
       
        controller=new AgendaController(this);
        Iniciar();   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextID = new javax.swing.JTextField();
        TextValor = new javax.swing.JTextField();
        TextData = new javax.swing.JTextField();
        TextHora = new javax.swing.JTextField();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jComboBoxServico = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextObsevacao = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAgendamentos = new javax.swing.JTable();
        jLabelFundoMenu = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agenda");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 190, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 20, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cliente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 80, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Serviços");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 90, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor R$");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 90, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 60, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hora");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 60, -1));

        TextID.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        TextID.setText("0");
        TextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIDActionPerformed(evt);
            }
        });
        getContentPane().add(TextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 110, 30));

        TextValor.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        TextValor.setText("0");
        TextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorActionPerformed(evt);
            }
        });
        getContentPane().add(TextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 110, 30));

        TextData.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        getContentPane().add(TextData, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 110, 30));

        TextHora.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        getContentPane().add(TextHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 110, 30));

        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jComboBoxServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxServicoItemStateChanged(evt);
            }
        });
        jComboBoxServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServicoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Observação");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 168, 130, 20));

        TextObsevacao.setColumns(20);
        TextObsevacao.setRows(5);
        jScrollPane1.setViewportView(TextObsevacao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 380, 160));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("Agendar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 380, 40));

        jTableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane2.setViewportView(jTableAgendamentos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 690, 110));

        jLabelFundoMenu.setBackground(new java.awt.Color(51, 255, 0));
        jLabelFundoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 820, 690));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/866232e8f50423d26b6828398cb15ecf.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxServicoActionPerformed

    private void TextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorActionPerformed

    private void jComboBoxServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxServicoItemStateChanged
       this.controller.atualizaValor();
    }//GEN-LAST:event_jComboBoxServicoItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.controller.agendar();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIDActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextData;
    private javax.swing.JTextField TextHora;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextArea TextObsevacao;
    private javax.swing.JTextField TextValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelFundoMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAgendamentos;
    // End of variables declaration//GEN-END:variables

    private void Iniciar() {
     this.controller.atualizarTabela();
     this.controller.atualizaCliente();
     this.controller.atualizaServico();
     this.controller.atualizaValor();
    
    }

    public JTable getjTableAgendamentos() {
        return jTableAgendamentos;
    }

    public void setjTableAgendamentos(JTable jTableAgendamentos) {
        this.jTableAgendamentos = jTableAgendamentos;
    }

    public JComboBox<String> getjComboBoxCliente() {
        return jComboBoxCliente;
    }

    public void setjComboBoxCliente(JComboBox<String> jComboBoxCliente) {
        this.jComboBoxCliente = jComboBoxCliente;
    }

    public JComboBox<String> getjComboBoxServico() {
        return jComboBoxServico;
    }

    public void setjComboBoxServico(JComboBox<String> jComboBoxServico) {
        this.jComboBoxServico = jComboBoxServico;
    }

    public JTextField getTextValor() {
        return TextValor;
    }

    public void setTextValor(JTextField TextValor) {
        this.TextValor = TextValor;
    }

    public JTextField getTextData() {
        return TextData;
    }

    public void setTextData(JTextField TextData) {
        this.TextData = TextData;
    }

    public JTextField getTextHora() {
        return TextHora;
    }

    public void setTextHora(JTextField TextHora) {
        this.TextHora = TextHora;
    }

    public JTextField getTextID() {
        return TextID;
    }

    public void setTextID(JTextField TextID) {
        this.TextID = TextID;
    }

    public JTextArea getTextObsevacao() {
        return TextObsevacao;
    }

    public void setTextObsevacao(JTextArea TextObsevacao) {
        this.TextObsevacao = TextObsevacao;
    }
    
}
