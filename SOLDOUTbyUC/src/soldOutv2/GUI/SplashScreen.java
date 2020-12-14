package soldOutv2.GUI;

import Metodos.Conexion;
import Metodos.loadingBar;
import java.awt.Color;
import java.awt.Image; //periño
import javax.swing.ImageIcon; //pedriño

public class SplashScreen extends javax.swing.JFrame {

    loadingBar hilo;

    public SplashScreen() {
        initComponents();
        hilo = new loadingBar(pgsCargando);
        pgsCargando.setBackground(Color.yellow);
        hilo.start();
        hilo = null;
        Image icon = new ImageIcon (getClass().getResource("/IMG/413.jpg")).getImage(); //pedriño
        setIconImage(icon); //pedriño
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSplash = new javax.swing.JPanel();
        pgsCargando = new javax.swing.JProgressBar();
        lblSplashS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 400));
        setUndecorated(true);

        pnlSplash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pgsCargando.setBackground(new java.awt.Color(16, 52, 107));
        pgsCargando.setForeground(new java.awt.Color(255, 255, 255));
        pgsCargando.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.black));
        pgsCargando.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pgsCargandoStateChanged(evt);
            }
        });
        pnlSplash.add(pgsCargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 230, 20));

        lblSplashS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/413.jpg"))); // NOI18N
        pnlSplash.add(lblSplashS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSplash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSplash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pgsCargandoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pgsCargandoStateChanged
       
        if (pgsCargando.getValue() == 100) {
            dispose();
            guiLogin opnLog = new guiLogin();
            opnLog.setVisible(true);
        }
    }//GEN-LAST:event_pgsCargandoStateChanged

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblSplashS;
    private javax.swing.JProgressBar pgsCargando;
    private javax.swing.JPanel pnlSplash;
    // End of variables declaration//GEN-END:variables
}
