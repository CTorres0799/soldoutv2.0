package soldOutv2.GUI;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView;
import soldOutv2.GUI.guiCaja;
import java.awt.Image; //pedriño
import javax.swing.ImageIcon; //pedriño

public class guiMenu extends javax.swing.JFrame {
    //FILTRADO ALIMENTOS//

    JTable jtableBuscar;
    DefaultTableModel dm;
    static double total;
    double sub_total;
    double igv;
    double Recibi; //pedriño
    double Cambio; //pedriño
    String importe;
    String printTotal;
    String printCambio;//pedriño
    

    public guiMenu() {
        total = 0;
        sub_total = 0.0;
        igv = 0.0;
        Recibi = 0.0; //pedriño
        Cambio = 0.0; //pedriño
        initComponents();
        //añadirCheckbox(0, tblProductos);
        Image icon = new ImageIcon(getClass().getResource("/IMG/413.jpg")).getImage(); //pedriño
        setIconImage(icon); //pedriño
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgCategorias = new javax.swing.ButtonGroup();
        pnlBackground = new javax.swing.JPanel();
        pnlDash = new javax.swing.JPanel();
        btnDash = new rsbuttom.RSButtonMetro();
        lblCategorias = new javax.swing.JLabel();
        pnlDashBoard = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblUserRol = new javax.swing.JLabel();
        btnInicio = new rsbuttom.RSButtonMetro();
        btnMenu = new rsbuttom.RSButtonMetro();
        btnCaja = new rsbuttom.RSButtonMetro();
        lblDashboard = new javax.swing.JLabel();
        rbnEntradas = new javax.swing.JRadioButton();
        rbnEntradasBrazas = new javax.swing.JRadioButton();
        rbnTodoDia = new javax.swing.JRadioButton();
        rbnEspBra = new javax.swing.JRadioButton();
        rbnPesMar = new javax.swing.JRadioButton();
        rbnMenuF = new javax.swing.JRadioButton();
        rbnPostres = new javax.swing.JRadioButton();
        rbnParaTomar = new javax.swing.JRadioButton();
        rbnBebidas = new javax.swing.JRadioButton();
        txtCantidad = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JLabel();
        txfTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txfRecibi = new javax.swing.JTextField();
        txfCambio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txfSubTotal = new javax.swing.JTextField();
        txfCantidad = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKalis = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCaja = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnTicket = new rsbuttom.RSButtonMetro();
        txfBuscador = new javax.swing.JTextField();
        btnAñadir = new rsbuttom.RSButtonMetro();
        lblDashOFF = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        btnCalcular1 = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));

        pnlBackground.setPreferredSize(new java.awt.Dimension(1920, 1080));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlBackground.add(pnlDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblCategorias.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorias.setText("Categorias");
        pnlBackground.add(lblCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, -1));

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
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
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
        btnCaja.setBounds(0, 400, 450, 60);

        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/dashBoardV2.png"))); // NOI18N
        pnlDashBoard.add(lblDashboard);
        lblDashboard.setBounds(0, 0, 453, 1080);

        pnlBackground.add(pnlDashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        rbnEntradas.setBackground(new java.awt.Color(149, 21, 21));
        btgCategorias.add(rbnEntradas);
        rbnEntradas.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        rbnEntradas.setForeground(new java.awt.Color(255, 255, 255));
        rbnEntradas.setText("Entradas");
        rbnEntradas.setBorder(new javax.swing.border.MatteBorder(null));
        rbnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnEntradasActionPerformed(evt);
            }
        });
        pnlBackground.add(rbnEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        rbnEntradasBrazas.setBackground(new java.awt.Color(149, 21, 21));
        btgCategorias.add(rbnEntradasBrazas);
        rbnEntradasBrazas.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        rbnEntradasBrazas.setForeground(new java.awt.Color(255, 255, 255));
        rbnEntradasBrazas.setText("Entradas a las brazas");
        rbnEntradasBrazas.setBorder(new javax.swing.border.MatteBorder(null));
        rbnEntradasBrazas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnEntradasBrazasActionPerformed(evt);
            }
        });
        pnlBackground.add(rbnEntradasBrazas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        rbnTodoDia.setBackground(new java.awt.Color(149, 21, 21));
        btgCategorias.add(rbnTodoDia);
        rbnTodoDia.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        rbnTodoDia.setForeground(new java.awt.Color(255, 255, 255));
        rbnTodoDia.setText("Para todo el dia");
        rbnTodoDia.setBorder(new javax.swing.border.MatteBorder(null));
        rbnTodoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnTodoDiaActionPerformed(evt);
            }
        });
        pnlBackground.add(rbnTodoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        rbnEspBra.setBackground(new java.awt.Color(149, 21, 21));
        btgCategorias.add(rbnEspBra);
        rbnEspBra.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        rbnEspBra.setForeground(new java.awt.Color(255, 255, 255));
        rbnEspBra.setText("Especialidades a las brazas");
        rbnEspBra.setBorder(new javax.swing.border.MatteBorder(null));
        rbnEspBra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnEspBraActionPerformed(evt);
            }
        });
        pnlBackground.add(rbnEspBra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        rbnPesMar.setBackground(new java.awt.Color(149, 21, 21));
        btgCategorias.add(rbnPesMar);
        rbnPesMar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        rbnPesMar.setForeground(new java.awt.Color(255, 255, 255));
        rbnPesMar.setText("Pescados & Mariscos");
        rbnPesMar.setBorder(new javax.swing.border.MatteBorder(null));
        rbnPesMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnPesMarActionPerformed(evt);
            }
        });
        pnlBackground.add(rbnPesMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        rbnMenuF.setBackground(new java.awt.Color(149, 21, 21));
        btgCategorias.add(rbnMenuF);
        rbnMenuF.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        rbnMenuF.setForeground(new java.awt.Color(255, 255, 255));
        rbnMenuF.setText("Menú Fitness");
        rbnMenuF.setBorder(new javax.swing.border.MatteBorder(null));
        rbnMenuF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnMenuFActionPerformed(evt);
            }
        });
        pnlBackground.add(rbnMenuF, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        rbnPostres.setBackground(new java.awt.Color(149, 21, 21));
        btgCategorias.add(rbnPostres);
        rbnPostres.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        rbnPostres.setForeground(new java.awt.Color(255, 255, 255));
        rbnPostres.setText("Nuestros Postres");
        rbnPostres.setBorder(new javax.swing.border.MatteBorder(null));
        rbnPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnPostresActionPerformed(evt);
            }
        });
        pnlBackground.add(rbnPostres, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, -1, -1));

        rbnParaTomar.setBackground(new java.awt.Color(149, 21, 21));
        btgCategorias.add(rbnParaTomar);
        rbnParaTomar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        rbnParaTomar.setForeground(new java.awt.Color(255, 255, 255));
        rbnParaTomar.setText("Algo para tomar");
        rbnParaTomar.setBorder(new javax.swing.border.MatteBorder(null));
        rbnParaTomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnParaTomarActionPerformed(evt);
            }
        });
        pnlBackground.add(rbnParaTomar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, -1, -1));

        rbnBebidas.setBackground(new java.awt.Color(149, 21, 21));
        btgCategorias.add(rbnBebidas);
        rbnBebidas.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        rbnBebidas.setForeground(new java.awt.Color(255, 255, 255));
        rbnBebidas.setText("Bebidas");
        rbnBebidas.setBorder(new javax.swing.border.MatteBorder(null));
        rbnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnBebidasActionPerformed(evt);
            }
        });
        pnlBackground.add(rbnBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 200, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setText("Cantidad:");
        pnlBackground.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, -1, -1));

        txtTotal.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtTotal.setText("Total:");

        txfTotal.setEditable(false);
        txfTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTotalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setText("Recibi: ");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel4.setText("Cambio: ");

        txfRecibi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txfRecibi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfRecibiActionPerformed(evt);
            }
        });

        txfCambio.setEditable(false);
        txfCambio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txfCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCambioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setText("SubTotal: ");

        txfSubTotal.setEditable(false);
        txfSubTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txfSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfSubTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfRecibi, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                        .addComponent(txtTotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal)
                    .addComponent(txfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txfRecibi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pnlBackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 790, 880, -1));
        pnlBackground.add(txfCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 150, -1));

        tblKalis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"001", "Alitas 6pzs", "Bufalo Red Hot", "65"},
                {"002", "Hamburguesa", "Sencilla", "80"},
                {"003", "Filete Pescado", "Al Ajillo", "150"},
                {"004", "Alitas 12pzs", "BBQ Hot", "90"},
                {"005", "Tequila Botella", "San Matias Reposado", "185"},
                {"006", "Cocteles", "Piña Colada", "50"},
                {"006", "Hot Dog", "Hot Dog", "20"}
            },
            new String [] {
                "idAlimento", "Nombre", "Descripcion", "Precio"
            }
        ));
        jScrollPane3.setViewportView(tblKalis);

        pnlBackground.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 890, 100));

        tblCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cantidad", "Nombre", "Descripcion", "Precio", "Importe"
            }
        ));
        jScrollPane2.setViewportView(tblCaja);

        pnlBackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 640, 890, 100));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlBackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 1600, 170));

        jPanel3.setPreferredSize(new java.awt.Dimension(250, 500));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        pnlBackground.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 320, 350, 660));

        btnTicket.setText("Ticket ");
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });
        pnlBackground.add(btnTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 750, -1, -1));

        txfBuscador.setBackground(new java.awt.Color(204, 204, 204));
        txfBuscador.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txfBuscador.setForeground(new java.awt.Color(255, 255, 255));
        txfBuscador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscador.setAutoscrolls(false);
        txfBuscador.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, new java.awt.Color(255, 255, 255)));
        txfBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscadorKeyReleased(evt);
            }
        });
        pnlBackground.add(txfBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 340, 30));

        btnAñadir.setBackground(new java.awt.Color(255, 255, 255));
        btnAñadir.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        btnAñadir.setForeground(new java.awt.Color(0, 0, 0));
        btnAñadir.setText("Añadir");
        btnAñadir.setColorBorde(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        btnAñadir.setColorHover(new java.awt.Color(204, 204, 204));
        btnAñadir.setColorNormal(new java.awt.Color(255, 255, 255));
        btnAñadir.setColorPressed(new java.awt.Color(51, 204, 0));
        btnAñadir.setColorTextHover(new java.awt.Color(204, 0, 0));
        btnAñadir.setColorTextNormal(new java.awt.Color(0, 0, 0));
        btnAñadir.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnAñadir.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        pnlBackground.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 90, 30));

        lblDashOFF.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblDashOFFMouseMoved(evt);
            }
        });
        pnlBackground.add(lblDashOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, -20, 1550, 1100));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/gui_PRINCIPAL01v2.jpg"))); // NOI18N
        pnlBackground.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnCalcular1.setText("Calcular");
        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
            }
        });
        pnlBackground.add(btnCalcular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 750, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //PROGRAMACION--METODOS\\
    private TableRowSorter Filtrado;

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

    private void filtro(String consulta, JTable jtableBuscar) {
        dm = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }

    //AÑADIR CHECKBOX
    public void añadirCheckbox(int columna, JTable tabla) {
        TableColumn tc = tabla.getColumnModel().getColumn(columna);
        tc.setCellEditor(tabla.getDefaultEditor(Boolean.class));
        tc.setCellEditor(tabla.getDefaultEditor(Boolean.class));
    }

    //PILA PLATILLOS GUARDADOS
    Stack platillos = new Stack();

    public void ElementosPila() {
        for (int i = 0; i < 10; i++) {
            platillos.push((Integer.toString(i)));
        }
    }


    private void btnDashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashMouseClicked
        dashFunctionON();
    }//GEN-LAST:event_btnDashMouseClicked

    private void lblDashOFFMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashOFFMouseMoved
        dashFunctionOFF();
    }//GEN-LAST:event_lblDashOFFMouseMoved

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed

    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        guiPrincipal01 extPrincipal = new guiPrincipal01();
        extPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void txfBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscadorKeyReleased
        filtro(txfBuscador.getText().toUpperCase(), tblKalis);
    }//GEN-LAST:event_txfBuscadorKeyReleased

    private void rbnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnEntradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnEntradasActionPerformed

    private void rbnEntradasBrazasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnEntradasBrazasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnEntradasBrazasActionPerformed

    private void rbnTodoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnTodoDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnTodoDiaActionPerformed

    private void rbnEspBraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnEspBraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnEspBraActionPerformed

    private void rbnPesMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPesMarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnPesMarActionPerformed

    private void rbnMenuFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnMenuFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnMenuFActionPerformed

    private void rbnPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPostresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnPostresActionPerformed

    private void rbnParaTomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnParaTomarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnParaTomarActionPerformed

    private void rbnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnBebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnBebidasActionPerformed

    private void btnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaActionPerformed
        guiCaja extCaja = new guiCaja();
        extCaja.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCajaActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed

        int filaS = tblKalis.getSelectedRow(); //verificamos que algo se encuentre documentado

        try {
            String idAlimento, Nombre, Descripcion, Precio, Cantidad, efectivo;
            double calcular = 0.0, x = 0.0, igvs = 0.0;
            int cant = 0;

            if (filaS == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione un platillo porfavor", "Advertencia", JOptionPane.WARNING_MESSAGE);

                if (txfCantidad.getText() == "") {
                    JOptionPane.showMessageDialog(null, "Ingrese la cantidad de consumo", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }

            } else {
                dm = (DefaultTableModel) tblKalis.getModel();
                idAlimento = tblKalis.getValueAt(filaS, 0).toString();
                Nombre = tblKalis.getValueAt(filaS, 1).toString();
                Descripcion = tblKalis.getValueAt(filaS, 2).toString();
                Precio = tblKalis.getValueAt(filaS, 3).toString();
                Cantidad = txfCantidad.getText(); 
                efectivo = txfRecibi.getText();
                

                //CALCULOS;
                x = (Double.parseDouble(Precio) * Integer.parseInt(Cantidad));
                
                importe = String.valueOf(x);
                total = (Double.parseDouble(importe) + total);
                printTotal = String.valueOf(total);
                
                System.out.println(total);
                
                //Pedriño
                Cambio = (Integer.parseInt(efectivo) - total);
                printCambio = String.valueOf(Cambio);
                
                txfCambio.setText(printCambio);
                //txfCambio.setText(Integer.toBinaryString((int) puta))
                //hatasta aqui 
                
                txfTotal.setText(printTotal);
         
                dm = (DefaultTableModel) tblCaja.getModel();
                String filaElementos[] = {Cantidad, Nombre, Descripcion, Precio, importe};
                dm.addRow(filaElementos);

                txfCantidad.setText("");
                
                
                /*Cambio = (total - Double.parseDouble(Recibi));
                printCambio = String.ValueOf(Cambio);*/

                //guiCaja extCobro = new guiCaja();
                //extCobro.setVisible(true);
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnAñadirActionPerformed

    private void txfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTotalActionPerformed

    private void txfRecibiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfRecibiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfRecibiActionPerformed

    private void txfCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCambioActionPerformed

    private void txfSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfSubTotalActionPerformed

    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcular1ActionPerformed

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTicketActionPerformed

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
            java.util.logging.Logger.getLogger(guiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgCategorias;
    private rsbuttom.RSButtonMetro btnAñadir;
    private rsbuttom.RSButtonMetro btnCaja;
    private rsbuttom.RSButtonMetro btnCalcular1;
    private rsbuttom.RSButtonMetro btnDash;
    private rsbuttom.RSButtonMetro btnInicio;
    private rsbuttom.RSButtonMetro btnMenu;
    private rsbuttom.RSButtonMetro btnTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblDashOFF;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserRol;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlDash;
    private javax.swing.JPanel pnlDashBoard;
    private javax.swing.JRadioButton rbnBebidas;
    private javax.swing.JRadioButton rbnEntradas;
    private javax.swing.JRadioButton rbnEntradasBrazas;
    private javax.swing.JRadioButton rbnEspBra;
    private javax.swing.JRadioButton rbnMenuF;
    private javax.swing.JRadioButton rbnParaTomar;
    private javax.swing.JRadioButton rbnPesMar;
    private javax.swing.JRadioButton rbnPostres;
    private javax.swing.JRadioButton rbnTodoDia;
    private javax.swing.JTable tblCaja;
    private javax.swing.JTable tblKalis;
    private javax.swing.JTextField txfBuscador;
    private javax.swing.JTextField txfCambio;
    private javax.swing.JTextField txfCantidad;
    private javax.swing.JTextField txfRecibi;
    private javax.swing.JTextField txfSubTotal;
    private javax.swing.JTextField txfTotal;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
