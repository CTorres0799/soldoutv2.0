package soldOutv2.GUI;

import java.awt.Image; //pedriño
import javax.swing.ImageIcon; //pedriño

/**
 *
 * @author cristian
 */

import Metodos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class guiLogin extends javax.swing.JFrame {

    public guiLogin() {
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/IMG/413.jpg")).getImage();
        setIconImage(icon);
    }

    Conexion cc = new Conexion();
    Connection con = cc.obtenerConexion();


    public void validarUsuario() {
        
    int resultado = 0;
    
        try {

            String usuario = txfUsuario.getText();
            String password = String.valueOf(pfdContraseña.getPassword());
            String sql = " select * from usuarios where nombreUsuario = ' " +usuario+ " '  and contraseña = ' " + password + " ' ";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                resultado = 1;
                if (resultado == 1) {

                    JOptionPane.showMessageDialog(null, "Bienvenido" + usuario + " :D ");
                    guiPrincipal01 opnPrincipal = new guiPrincipal01();
                    opnPrincipal.setVisible(true);
                   dispose();
                } else {
                    JOptionPane.showMessageDialog(null, " Lo lamento" + usuario
                            + " tus credenciales son incorrectas :( intentalo de nuevo ", " Error: Usuario u/o Clave, incorrectos ",
                            JOptionPane.WARNING_MESSAGE);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error:" + e.getMessage()
                    + " contacte a su supervisor ", " Error Interno 07EC4TCH ",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        rSButtonMetro2 = new rsbuttom.RSButtonMetro();
        txfUsuario = new javax.swing.JTextField();
        pfdContraseña = new javax.swing.JPasswordField();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 672));
        setUndecorated(true);

        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMetro2.setBackground(new java.awt.Color(0, 0, 0));
        rSButtonMetro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/close.png"))); // NOI18N
        rSButtonMetro2.setColorHover(new java.awt.Color(153, 0, 0));
        rSButtonMetro2.setColorNormal(new java.awt.Color(0, 0, 0));
        rSButtonMetro2.setColorPressed(new java.awt.Color(51, 51, 51));
        rSButtonMetro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro2ActionPerformed(evt);
            }
        });
        pnlBackground.add(rSButtonMetro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 70, 70));

        txfUsuario.setBackground(new java.awt.Color(0, 0, 0));
        txfUsuario.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txfUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfUsuario.setCaretColor(new java.awt.Color(204, 0, 51));
        txfUsuario.setSelectionColor(new java.awt.Color(204, 0, 51));
        pnlBackground.add(txfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 210, 30));

        pfdContraseña.setBackground(new java.awt.Color(0, 0, 0));
        pfdContraseña.setForeground(new java.awt.Color(255, 255, 255));
        pfdContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pfdContraseña.setToolTipText("");
        pfdContraseña.setCaretColor(new java.awt.Color(204, 0, 51));
        pfdContraseña.setSelectionColor(new java.awt.Color(204, 0, 51));
        pnlBackground.add(pfdContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 210, 30));

        rSButtonMetro1.setBackground(new java.awt.Color(0, 0, 0));
        rSButtonMetro1.setText("Login");
        rSButtonMetro1.setColorHover(new java.awt.Color(0, 153, 51));
        rSButtonMetro1.setColorNormal(new java.awt.Color(0, 0, 0));
        rSButtonMetro1.setColorPressed(new java.awt.Color(153, 51, 0));
        rSButtonMetro1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });
        pnlBackground.add(rSButtonMetro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/guiLogin2.jpg"))); // NOI18N
        pnlBackground.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        validarUsuario();
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void rSButtonMetro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro2ActionPerformed
        dispose();
    }//GEN-LAST:event_rSButtonMetro2ActionPerformed

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
            java.util.logging.Logger.getLogger(guiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    private javax.swing.JPasswordField pfdContraseña;
    private javax.swing.JPanel pnlBackground;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    private rsbuttom.RSButtonMetro rSButtonMetro2;
    private javax.swing.JTextField txfUsuario;
    // End of variables declaration//GEN-END:variables
}
