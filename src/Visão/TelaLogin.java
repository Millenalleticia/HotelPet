
package Visão;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame {

   
    public TelaLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1acessar = new javax.swing.JButton();
        jButton2sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsuário = new javax.swing.JTextField();
        jPasswordField1Senha = new javax.swing.JPasswordField();
        jLabel3logo = new javax.swing.JLabel();
        fundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1acessar.setText("Acessar");
        jButton1acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1acessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1acessar);
        jButton1acessar.setBounds(311, 193, 80, 30);

        jButton2sair.setText("Sair");
        jButton2sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2sairActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2sair);
        jButton2sair.setBounds(420, 193, 60, 30);

        jLabel1.setText("Usuário:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 100, 60, 14);

        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 140, 50, 14);

        jTextFieldUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuárioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuário);
        jTextFieldUsuário.setBounds(290, 90, 200, 30);

        jPasswordField1Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1Senha);
        jPasswordField1Senha.setBounds(290, 140, 200, 30);

        jLabel3logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon logo.png"))); // NOI18N
        getContentPane().add(jLabel3logo);
        jLabel3logo.setBounds(60, 20, 230, 230);

        fundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo tela login.jpg"))); // NOI18N
        fundoLogin.setText("labelfundo login");
        getContentPane().add(fundoLogin);
        fundoLogin.setBounds(0, 0, 550, 380);

        setSize(new java.awt.Dimension(563, 419));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1acessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1acessarActionPerformed
        
        if(jTextFieldUsuário.getText ().equals("adm")&& jPasswordField1Senha.getText().equals("123")){
       
     
     TelaPrincipal tela = null;
            try {
                tela = new TelaPrincipal();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
     tela.setVisible(true);
     dispose();
      }else{
         JOptionPane.showMessageDialog(rootPane, "Senha ou Usuário inválidos");
         
     }
    }//GEN-LAST:event_jButton1acessarActionPerformed

    private void jButton2sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2sairActionPerformed
    System.exit(0);
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2sairActionPerformed

    private void jTextFieldUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuárioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuárioActionPerformed

    private void jPasswordField1SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1SenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundoLogin;
    private javax.swing.JButton jButton1acessar;
    private javax.swing.JButton jButton2sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3logo;
    private javax.swing.JPasswordField jPasswordField1Senha;
    private javax.swing.JTextField jTextFieldUsuário;
    // End of variables declaration//GEN-END:variables
}
