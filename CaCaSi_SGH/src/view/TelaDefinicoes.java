/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
/**
 *
 * @author Customer
 */
public class TelaDefinicoes extends javax.swing.JFrame {

    /**
     * Creates new form TelaDefinicoes
     */
    public TelaDefinicoes() {
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

        btnServicos = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JButton();
        bntSenha = new javax.swing.JButton();
        btnPrecos = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnServicos.setText("                                                            Servicos");
        getContentPane().add(btnServicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 23));

        btnUsuario.setText("Alterar Usuario");
        getContentPane().add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, 380, -1));

        bntSenha.setText("Alterar Senha");
        getContentPane().add(bntSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, 380, -1));

        btnPrecos.setText("Alterar Precos");
        getContentPane().add(btnPrecos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, 380, -1));

        btnVoltar.setText("Voltar");
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 266, 98, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaDefinicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDefinicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDefinicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDefinicoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDefinicoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSenha;
    private javax.swing.JButton btnPrecos;
    private javax.swing.JLabel btnServicos;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnVoltar;
    // End of variables declaration//GEN-END:variables
}
