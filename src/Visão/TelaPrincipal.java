
package Visão;


import modeloConnetion.ConexaoBD;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TelaPrincipal extends javax.swing.JFrame {
    ConexaoBD conecta = new ConexaoBD();
  
   
    public TelaPrincipal() throws ClassNotFoundException {
        initComponents();
        conecta.Conexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jInternalFrameBemvindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jLabelCadastrotelaPrincipal = new javax.swing.JLabel();
        jLabelAgenda = new javax.swing.JLabel();
        jButtonAgendaAnimal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonCadastroFuncionarios = new javax.swing.JButton();
        jButtonCadastroAnimal = new javax.swing.JButton();
        jButtonCadastroCliente = new javax.swing.JButton();
        jLabelPainelTelaPrincipal = new javax.swing.JLabel();
        jButtonfecharbemvindo = new javax.swing.JButton();
        jLabelFundoTelaPrincipal = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCadFuncionário = new javax.swing.JMenuItem();
        jMenuItemCadClientes = new javax.swing.JMenuItem();
        jMenuItemCadAnimal = new javax.swing.JMenuItem();
        jMenuAgenda = new javax.swing.JMenu();
        jMenuItemAgendamento = new javax.swing.JMenuItem();
        jMenuServiços = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemtelabemvindos = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemvindo.setTitle("Bem-Vindos");
        jInternalFrameBemvindo.setVisible(true);
        jInternalFrameBemvindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jLabelCadastrotelaPrincipal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCadastrotelaPrincipal.setText("Cadastros-");
        jPanelInternal.add(jLabelCadastrotelaPrincipal);
        jLabelCadastrotelaPrincipal.setBounds(0, 30, 70, 17);

        jLabelAgenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAgenda.setText("Agenda:");
        jPanelInternal.add(jLabelAgenda);
        jLabelAgenda.setBounds(10, 250, 70, 20);

        jButtonAgendaAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon agenda_1.png"))); // NOI18N
        jButtonAgendaAnimal.setToolTipText("Agenda");
        jButtonAgendaAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaAnimalActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonAgendaAnimal);
        jButtonAgendaAnimal.setBounds(0, 280, 170, 140);
        jButtonAgendaAnimal.getAccessibleContext().setAccessibleDescription("Agendamento");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento de :");
        jPanelInternal.add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 22);

        jButtonCadastroFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon funcionario_1.png"))); // NOI18N
        jButtonCadastroFuncionarios.setToolTipText("Funcionário");
        jButtonCadastroFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroFuncionariosActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadastroFuncionarios);
        jButtonCadastroFuncionarios.setBounds(0, 50, 140, 170);

        jButtonCadastroAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon animal.png"))); // NOI18N
        jButtonCadastroAnimal.setToolTipText("Animal");
        jButtonCadastroAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroAnimalActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadastroAnimal);
        jButtonCadastroAnimal.setBounds(320, 50, 130, 160);

        jButtonCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon cliente_1.png"))); // NOI18N
        jButtonCadastroCliente.setToolTipText("Cliente");
        jButtonCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroClienteActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadastroCliente);
        jButtonCadastroCliente.setBounds(150, 50, 150, 170);
        jPanelInternal.add(jLabelPainelTelaPrincipal);
        jLabelPainelTelaPrincipal.setBounds(0, 10, 560, 480);

        jInternalFrameBemvindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(0, 20, 640, 440);

        jButtonfecharbemvindo.setText("Fechar");
        jButtonfecharbemvindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonfecharbemvindoActionPerformed(evt);
            }
        });
        jInternalFrameBemvindo.getContentPane().add(jButtonfecharbemvindo);
        jButtonfecharbemvindo.setBounds(550, 0, 90, 23);

        getContentPane().add(jInternalFrameBemvindo);
        jInternalFrameBemvindo.setBounds(0, 50, 660, 500);
        getContentPane().add(jLabelFundoTelaPrincipal);
        jLabelFundoTelaPrincipal.setBounds(40, 0, 620, 450);

        jMenuCadastros.setText("Cadastros");

        jMenuItemCadFuncionário.setText("Funcionários");
        jMenuItemCadFuncionário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadFuncionárioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadFuncionário);

        jMenuItemCadClientes.setText("Clientes");
        jMenuItemCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClientesActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadClientes);

        jMenuItemCadAnimal.setText("Animal");
        jMenuItemCadAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadAnimalActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCadAnimal);

        jMenuBar3.add(jMenuCadastros);

        jMenuAgenda.setText("Agenda");

        jMenuItemAgendamento.setText("Agendamento");
        jMenuItemAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendamentoActionPerformed(evt);
            }
        });
        jMenuAgenda.add(jMenuItemAgendamento);

        jMenuBar3.add(jMenuAgenda);

        jMenuServiços.setText("Serviços");
        jMenuBar3.add(jMenuServiços);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemtelabemvindos.setText("Tela Bem-Vindos");
        jMenuItemtelabemvindos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemtelabemvindosActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemtelabemvindos);

        jMenuBar3.add(jMenuFerramentas);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar3.add(jMenuSair);

        setJMenuBar(jMenuBar3);

        setSize(new java.awt.Dimension(686, 605));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonfecharbemvindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonfecharbemvindoActionPerformed
     jInternalFrameBemvindo.dispose();
        
       
    }//GEN-LAST:event_jButtonfecharbemvindoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        conecta.desconecta();
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemtelabemvindosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemtelabemvindosActionPerformed
    
    TelaPrincipal tela = null;
        try {
            tela = new TelaPrincipal();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    tela.setVisible(true);
    dispose();

        
    }//GEN-LAST:event_jMenuItemtelabemvindosActionPerformed

    private void jMenuItemCadFuncionárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFuncionárioActionPerformed
      FormFuncionarios tela = new FormFuncionarios();
      tela.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadFuncionárioActionPerformed

    private void jButtonCadastroFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroFuncionariosActionPerformed
    FormFuncionarios tela = new FormFuncionarios();
      tela.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastroFuncionariosActionPerformed

    private void jMenuItemCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClientesActionPerformed
     FormCliente tela = new FormCliente();
      tela.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadClientesActionPerformed

    private void jButtonCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroClienteActionPerformed
      FormCliente tela = new FormCliente();
      tela.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastroClienteActionPerformed

    private void jMenuItemCadAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadAnimalActionPerformed
     FormAnimal tela = new FormAnimal();
      tela.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadAnimalActionPerformed

    private void jButtonCadastroAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroAnimalActionPerformed
      FormAnimal tela = new FormAnimal();
      tela.setVisible(true);
   // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastroAnimalActionPerformed

    private void jMenuItemAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendamentoActionPerformed
                                                      
    formAgenda tela = new formAgenda();
    tela.setVisible(true); 
 // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAgendamentoActionPerformed

    private void jButtonAgendaAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaAnimalActionPerformed
    
    formAgenda tela = new formAgenda();
    tela.setVisible(true);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgendaAnimalActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendaAnimal;
    private javax.swing.JButton jButtonCadastroAnimal;
    private javax.swing.JButton jButtonCadastroCliente;
    private javax.swing.JButton jButtonCadastroFuncionarios;
    private javax.swing.JButton jButtonfecharbemvindo;
    private javax.swing.JInternalFrame jInternalFrameBemvindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelCadastrotelaPrincipal;
    private javax.swing.JLabel jLabelFundoTelaPrincipal;
    private javax.swing.JLabel jLabelPainelTelaPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenuAgenda;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemAgendamento;
    private javax.swing.JMenuItem jMenuItemCadAnimal;
    private javax.swing.JMenuItem jMenuItemCadClientes;
    private javax.swing.JMenuItem jMenuItemCadFuncionário;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemtelabemvindos;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuServiços;
    private javax.swing.JPanel jPanelInternal;
    // End of variables declaration//GEN-END:variables
}
