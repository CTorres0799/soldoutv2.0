package soldOutv2.GUI;

public class guiPrincipal01 extends javax.swing.JFrame {

    public guiPrincipal01() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDash = new javax.swing.JPanel();
        btnDash = new rsbuttom.RSButtonMetro();
        pnlDashBoard = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblUserRol = new javax.swing.JLabel();
        btnInicio = new rsbuttom.RSButtonMetro();
        btnMenu = new rsbuttom.RSButtonMetro();
        btnCaja = new rsbuttom.RSButtonMetro();
        lblDashboard = new javax.swing.JLabel();
        pnlBackground = new javax.swing.JPanel();
        lblDashOFF = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoldOut v2.0");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDash.setBackground(new java.awt.Color(26, 26, 26));

        btnDash.setBackground(new java.awt.Color(26, 26, 26));
        btnDash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDash.setForeground(new java.awt.Color(26, 26, 26));
        btnDash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/dash.png"))); // NOI18N
        btnDash.setBorderPainted(false);
        btnDash.setColorBorde(new javax.swing.border.MatteBorder(null));
        btnDash.setColorHover(new java.awt.Color(32, 32, 32));
        btnDash.setColorNormal(new java.awt.Color(26, 26, 26));
        btnDash.setColorPressed(new java.awt.Color(35, 35, 35));
        btnDash.setFocusPainted(false);
        btnDash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlDashLayout = new javax.swing.GroupLayout(pnlDash);
        pnlDash.setLayout(pnlDashLayout);
        pnlDashLayout.setHorizontalGroup(
            pnlDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDash, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlDashLayout.setVerticalGroup(
            pnlDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashLayout.createSequentialGroup()
                .addComponent(btnDash, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1003, Short.MAX_VALUE))
        );

        getContentPane().add(pnlDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlDashBoard.setMaximumSize(new java.awt.Dimension(453, 1080));
        pnlDashBoard.setPreferredSize(new java.awt.Dimension(453, 1080));
        pnlDashBoard.setLayout(null);

        lblUserName.setBackground(new java.awt.Color(255, 255, 255));
        lblUserName.setFont(new java.awt.Font("Barlow Condensed", 1, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("#User");
        lblUserName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblUserName.setFocusable(false);
        lblUserName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlDashBoard.add(lblUserName);
        lblUserName.setBounds(200, 220, 60, 30);

        lblUserRol.setBackground(new java.awt.Color(0, 255, 0));
        lblUserRol.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblUserRol.setForeground(new java.awt.Color(0, 255, 0));
        lblUserRol.setText("#Rol");
        pnlDashBoard.add(lblUserRol);
        lblUserRol.setBounds(200, 250, 60, 20);

        btnInicio.setForeground(new java.awt.Color(32, 32, 32));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/btnMenu.png"))); // NOI18N
        btnInicio.setColorBorde(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnInicio.setColorHover(new java.awt.Color(91, 24, 0));
        btnInicio.setColorNormal(new java.awt.Color(2, 0, 0));
        btnInicio.setColorPressed(new java.awt.Color(51, 204, 0));
        btnInicio.setFocusPainted(false);
        btnInicio.setMargin(null);
        pnlDashBoard.add(btnInicio);
        btnInicio.setBounds(0, 270, 450, 60);

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/btnMenu.png"))); // NOI18N
        btnMenu.setColorHover(new java.awt.Color(91, 24, 0));
        btnMenu.setColorNormal(new java.awt.Color(2, 0, 0));
        btnMenu.setColorPressed(new java.awt.Color(51, 204, 0));
        btnMenu.setFocusPainted(false);
        btnMenu.setMaximumSize(new java.awt.Dimension(215, 37));
        btnMenu.setMinimumSize(new java.awt.Dimension(215, 37));
        btnMenu.setPreferredSize(new java.awt.Dimension(215, 37));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pnlDashBoard.add(btnMenu);
        btnMenu.setBounds(0, 340, 450, 60);

        btnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/Caja.png"))); // NOI18N
        btnCaja.setColorHover(new java.awt.Color(91, 24, 0));
        btnCaja.setColorNormal(new java.awt.Color(2, 0, 0));
        btnCaja.setColorPressed(new java.awt.Color(51, 204, 0));
        btnCaja.setFocusPainted(false);
        btnCaja.setMaximumSize(new java.awt.Dimension(215, 37));
        btnCaja.setMinimumSize(new java.awt.Dimension(215, 37));
        btnCaja.setPreferredSize(new java.awt.Dimension(215, 37));
        btnCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajaActionPerformed(evt);
            }
        });
        pnlDashBoard.add(btnCaja);
        btnCaja.setBounds(0, 410, 450, 60);

        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/dashBoardV2.png"))); // NOI18N
        pnlDashBoard.add(lblDashboard);
        lblDashboard.setBounds(0, 0, 453, 1080);

        getContentPane().add(pnlDashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlBackground.setBackground(new java.awt.Color(255, 102, 102));
        pnlBackground.setMaximumSize(new java.awt.Dimension(1920, 1080));
        pnlBackground.setMinimumSize(new java.awt.Dimension(1920, 1080));
        pnlBackground.setPreferredSize(new java.awt.Dimension(1920, 1080));
        pnlBackground.setLayout(null);

        lblDashOFF.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblDashOFFMouseMoved(evt);
            }
        });
        pnlBackground.add(lblDashOFF);
        lblDashOFF.setBounds(450, 0, 1470, 1080);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/gui_PRINCIPAL01v2.jpg"))); // NOI18N
        lblBackground.setToolTipText("");
        pnlBackground.add(lblBackground);
        lblBackground.setBounds(0, 0, 1930, 1080);

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashMouseClicked
      dashFunctionON();
    }//GEN-LAST:event_btnDashMouseClicked

    private void lblDashOFFMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashOFFMouseMoved
        dashFunctionOFF();
    }//GEN-LAST:event_lblDashOFFMouseMoved

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        guiMenu extMenu = new guiMenu();
        extMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaActionPerformed
       guiCaja extCaja = new guiCaja();
       extCaja.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnCajaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiPrincipal01().setVisible(true);
            }
        }
        );
    }

    //PROGRAMACION--METODOS\\
    public void dashFunctionON() {
            pnlDash.setVisible(false);
            pnlDash.setEnabled(false);
            lblDashOFF.setVisible(true);
            lblDashOFF.setEnabled(true);
            pnlDashBoard.setVisible(true);
            pnlDashBoard.setEnabled(true);

    }
    public void dashFunctionOFF() {
       pnlDash.setVisible(true);
       pnlDash.setEnabled(true);
       lblDashOFF.setVisible(false);
       lblDashOFF.setEnabled(false);
       pnlDashBoard.setVisible(false);
       pnlDashBoard.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnCaja;
    private rsbuttom.RSButtonMetro btnDash;
    private rsbuttom.RSButtonMetro btnInicio;
    private rsbuttom.RSButtonMetro btnMenu;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDashOFF;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserRol;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlDash;
    private javax.swing.JPanel pnlDashBoard;
    // End of variables declaration//GEN-END:variables
}
