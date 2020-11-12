
package soldOutv2.GUI;

public class guiPrincipal01 extends javax.swing.JFrame {

    public guiPrincipal01() {
        initComponents();
        holaMundo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlDashBoard = new javax.swing.JPanel();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        lblDashboard = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoldOut v2.0");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBackground.setBackground(new java.awt.Color(255, 102, 102));
        pnlBackground.setMaximumSize(new java.awt.Dimension(1920, 1080));
        pnlBackground.setMinimumSize(new java.awt.Dimension(1920, 1080));
        pnlBackground.setPreferredSize(new java.awt.Dimension(1920, 1080));
        pnlBackground.setLayout(null);

        pnlDashBoard.setMaximumSize(new java.awt.Dimension(453, 1080));
        pnlDashBoard.setPreferredSize(new java.awt.Dimension(453, 1080));
        pnlDashBoard.setLayout(null);

        rSButtonMetro1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rSButtonMetro1.setForeground(new java.awt.Color(32, 32, 32));
        rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/btnMenu.png"))); // NOI18N
        rSButtonMetro1.setColorBorde(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rSButtonMetro1.setColorHover(new java.awt.Color(51, 51, 51));
        rSButtonMetro1.setColorNormal(new java.awt.Color(32, 32, 32));
        rSButtonMetro1.setColorPressed(new java.awt.Color(149, 21, 21));
        rSButtonMetro1.setMargin(null);
        pnlDashBoard.add(rSButtonMetro1);
        rSButtonMetro1.setBounds(0, 140, 450, 60);

        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/dashBoard.png"))); // NOI18N
        pnlDashBoard.add(lblDashboard);
        lblDashboard.setBounds(0, 0, 453, 1080);

        pnlBackground.add(pnlDashBoard);
        pnlDashBoard.setBounds(0, 0, 453, 1080);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/gui_PRINCIPAL01.jpg"))); // NOI18N
        lblBackground.setToolTipText("");
        pnlBackground.add(lblBackground);
        lblBackground.setBounds(0, 0, 1920, 1080);

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiPrincipal01().setVisible(true);
            }
        }
        );
    }

    public void holaMundo() {
        System.out.println("HOLA MUNDO");
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlDashBoard;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    // End of variables declaration//GEN-END:variables
}
