
package Vista;


public class JFPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFPrincipal.class.getName());

   
    public JFPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        java.awt.CardLayout layout = (java.awt.CardLayout) JPanelContenedor.getLayout();
        layout.show(JPanelContenedor, "tarjetaLogin");
        java.awt.Font fuenteNegrita = new java.awt.Font("Arial", java.awt.Font.BOLD, 16);
        JMenuPrincipal.setUI(new javax.swing.plaf.basic.BasicMenuBarUI());
        
        this.JMenuPrincipal.setVisible(false);
        JMenuPrincipal.setOpaque(true);
        JMenuPrincipal.setBackground(new java.awt.Color(0, 170, 228));
        JMenuPrincipal.setBorderPainted(false);
        
        JPerfil.setForeground(java.awt.Color.WHITE);
        JPerfil.setFont(fuenteNegrita);
        JGestion.setForeground(java.awt.Color.WHITE);
        JGestion.setFont(fuenteNegrita);
        JRegistros.setForeground(java.awt.Color.WHITE);
        JRegistros.setFont(fuenteNegrita);
        JReportes.setForeground(java.awt.Color.WHITE);
        JReportes.setFont(fuenteNegrita);
        JSalir.setForeground(java.awt.Color.WHITE);
        JSalir.setFont(fuenteNegrita);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelContenedor = new javax.swing.JPanel();
        JPanelPerfil = new javax.swing.JPanel();
        btnIniciarSesion = new javax.swing.JButton();
        JPVerPerfil = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblLegajo = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        lblAño = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMaterias = new javax.swing.JList<>();
        JPInscribirse = new javax.swing.JPanel();
        JPInscribirse2 = new javax.swing.JPanel();
        JLlblInscribirse1 = new javax.swing.JLabel();
        JPInscribirsetxtNombre = new javax.swing.JTextField();
        JLlblInscribirse2 = new javax.swing.JLabel();
        JPInscribirsenudCuatrimestre = new javax.swing.JSpinner();
        JPlblInscribirse3 = new javax.swing.JLabel();
        JPInscribirsetxtCodigo = new javax.swing.JTextField();
        JPlblInscribirse4 = new javax.swing.JLabel();
        JPInscribirsetxtAño = new javax.swing.JTextField();
        JPInscribirsebtnInscribirse = new javax.swing.JButton();
        JPBajaMateria = new javax.swing.JPanel();
        JPBajaMateria2 = new javax.swing.JPanel();
        JPBMsp2 = new javax.swing.JScrollPane();
        JPBMlstMateria = new javax.swing.JList<>();
        JPBMbtnDarBaja = new javax.swing.JButton();
        JPMateriaYPromedio = new javax.swing.JPanel();
        JPMateriaYPromedio2 = new javax.swing.JPanel();
        BtnConsultarPromedio = new javax.swing.JButton();
        Scrollpane2Materias = new javax.swing.JScrollPane();
        JlistMaterias = new javax.swing.JList<>();
        Parcial1 = new javax.swing.JLabel();
        Parcial2 = new javax.swing.JLabel();
        IEFI = new javax.swing.JLabel();
        Recuperatorio = new javax.swing.JLabel();
        FINAL = new javax.swing.JLabel();
        Promedio = new javax.swing.JLabel();
        JlabelParcial1 = new javax.swing.JLabel();
        JlabelParcial2 = new javax.swing.JLabel();
        JLblRecuperatorio = new javax.swing.JLabel();
        JlableIefi = new javax.swing.JLabel();
        JlblFinal = new javax.swing.JLabel();
        JlblPromedio = new javax.swing.JLabel();
        JPBuscarMateria = new javax.swing.JPanel();
        JpaneBuscarMateria = new javax.swing.JPanel();
        INGRESARCODIGO = new javax.swing.JLabel();
        INGRESARNOMBRE = new javax.swing.JLabel();
        LblMateriaEncontrada = new javax.swing.JLabel();
        BtnBuscarMateria = new javax.swing.JButton();
        TxTIngresarNombre = new javax.swing.JTextField();
        TxtIngresarCodigo = new javax.swing.JTextField();
        JPRegistroAsistencia = new javax.swing.JPanel();
        JPRA = new javax.swing.JPanel();
        JPRAScrollPane = new javax.swing.JScrollPane();
        JPRAlstMateria = new javax.swing.JList<>();
        JPRAcmbAsistencia = new javax.swing.JComboBox<>();
        JPRAbtnRegistrar = new javax.swing.JButton();
        JPRegistroNota = new javax.swing.JPanel();
        JPRN = new javax.swing.JPanel();
        JPRNscrollpane = new javax.swing.JScrollPane();
        JPRNlstMateria = new javax.swing.JList<>();
        JPRNlblnota = new javax.swing.JLabel();
        JPRNnudNota = new javax.swing.JSpinner();
        JPRNbtnRegistrar = new javax.swing.JButton();
        JPReportes = new javax.swing.JPanel();
        jPanelReportes = new javax.swing.JPanel();
        btnReportesGeneral = new javax.swing.JButton();
        btnReportesMateriasCriticas = new javax.swing.JButton();
        btnReportesMateriasAprobadas = new javax.swing.JButton();
        jScrollPaneReportes = new javax.swing.JScrollPane();
        lstResultado = new javax.swing.JTable();
        JMenuPrincipal = new javax.swing.JMenuBar();
        JPerfil = new javax.swing.JMenu();
        JMIVerPerfil = new javax.swing.JMenuItem();
        JGestion = new javax.swing.JMenu();
        JMItemMateria = new javax.swing.JMenuItem();
        JMIDarseBaja = new javax.swing.JMenuItem();
        JMIMateriaPromedio = new javax.swing.JMenuItem();
        JMIBuscarMateria = new javax.swing.JMenuItem();
        JRegistros = new javax.swing.JMenu();
        JMIAsistencia = new javax.swing.JMenuItem();
        JMINotas = new javax.swing.JMenuItem();
        JReportes = new javax.swing.JMenu();
        JMIReportes = new javax.swing.JMenuItem();
        JSalir = new javax.swing.JMenu();
        JMISalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autogestión - Instancia Evaluativa 2");
        setPreferredSize(new java.awt.Dimension(824, 680));

        JPanelContenedor.setPreferredSize(new java.awt.Dimension(824, 680));
        JPanelContenedor.setLayout(new java.awt.CardLayout());

        JPanelPerfil.setBackground(new java.awt.Color(0, 170, 228));

        btnIniciarSesion.setBackground(new java.awt.Color(217, 217, 217));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIniciarSesion.addActionListener(this::btnIniciarSesionActionPerformed);

        javax.swing.GroupLayout JPanelPerfilLayout = new javax.swing.GroupLayout(JPanelPerfil);
        JPanelPerfil.setLayout(JPanelPerfilLayout);
        JPanelPerfilLayout.setHorizontalGroup(
            JPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelPerfilLayout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(543, Short.MAX_VALUE))
        );
        JPanelPerfilLayout.setVerticalGroup(
            JPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelPerfilLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        JPanelContenedor.add(JPanelPerfil, "tarjetaLogin");

        JPVerPerfil.setBackground(new java.awt.Color(255, 255, 255));
        JPVerPerfil.setPreferredSize(new java.awt.Dimension(824, 680));
        JPVerPerfil.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(824, 680));

        JLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        JLabel7.setText("Datos del estudiante");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Legajo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Carrera:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Año de ingreso:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Materias:");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblLegajo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblLegajo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCarrera.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCarrera.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblAño.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblAño.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lstMaterias.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(lstMaterias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblAño, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLegajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(469, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(JLabel7)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        JPVerPerfil.add(jPanel1, "card2");

        JPanelContenedor.add(JPVerPerfil, "card2");

        JPInscribirse.setPreferredSize(new java.awt.Dimension(824, 680));
        JPInscribirse.setLayout(new java.awt.CardLayout());

        JPInscribirse2.setBackground(new java.awt.Color(255, 255, 255));
        JPInscribirse2.setPreferredSize(new java.awt.Dimension(824, 680));

        JLlblInscribirse1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        JLlblInscribirse1.setText("Ingrese el nombre de la materia:");

        JPInscribirsetxtNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JPInscribirsetxtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Requerido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 10))); // NOI18N

        JLlblInscribirse2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        JLlblInscribirse2.setText("Ingrese el cuatrimestre:");

        JPInscribirsenudCuatrimestre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Requerido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 10))); // NOI18N

        JPlblInscribirse3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        JPlblInscribirse3.setText("Ingrese el código de la materia:");

        JPInscribirsetxtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JPInscribirsetxtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Requerido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 10))); // NOI18N

        JPlblInscribirse4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        JPlblInscribirse4.setText("Ingrese el año:");

        JPInscribirsetxtAño.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JPInscribirsetxtAño.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Requerido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 10))); // NOI18N

        JPInscribirsebtnInscribirse.setBackground(new java.awt.Color(0, 170, 228));
        JPInscribirsebtnInscribirse.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        JPInscribirsebtnInscribirse.setForeground(new java.awt.Color(255, 255, 255));
        JPInscribirsebtnInscribirse.setText("Inscribirse");

        javax.swing.GroupLayout JPInscribirse2Layout = new javax.swing.GroupLayout(JPInscribirse2);
        JPInscribirse2.setLayout(JPInscribirse2Layout);
        JPInscribirse2Layout.setHorizontalGroup(
            JPInscribirse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPInscribirse2Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(JPInscribirse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPInscribirse2Layout.createSequentialGroup()
                        .addGroup(JPInscribirse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLlblInscribirse1)
                            .addComponent(JLlblInscribirse2)
                            .addComponent(JPlblInscribirse3))
                        .addGap(18, 18, 18)
                        .addGroup(JPInscribirse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JPInscribirsetxtNombre)
                            .addComponent(JPInscribirsetxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPInscribirsenudCuatrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPInscribirse2Layout.createSequentialGroup()
                        .addComponent(JPlblInscribirse4)
                        .addGroup(JPInscribirse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPInscribirse2Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(JPInscribirsetxtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPInscribirse2Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(JPInscribirsebtnInscribirse, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(397, Short.MAX_VALUE))
        );
        JPInscribirse2Layout.setVerticalGroup(
            JPInscribirse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPInscribirse2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(JPInscribirse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLlblInscribirse1)
                    .addComponent(JPInscribirsetxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPInscribirse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLlblInscribirse2)
                    .addComponent(JPInscribirsenudCuatrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPInscribirse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPInscribirsetxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPlblInscribirse3))
                .addGap(18, 18, 18)
                .addGroup(JPInscribirse2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPlblInscribirse4)
                    .addComponent(JPInscribirsetxtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(JPInscribirsebtnInscribirse, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        JPInscribirse.add(JPInscribirse2, "card2");

        JPanelContenedor.add(JPInscribirse, "card4");

        JPBajaMateria.setPreferredSize(new java.awt.Dimension(824, 680));
        JPBajaMateria.setLayout(new java.awt.CardLayout());

        JPBajaMateria2.setBackground(new java.awt.Color(255, 255, 255));
        JPBajaMateria2.setPreferredSize(new java.awt.Dimension(824, 680));

        JPBMlstMateria.setBackground(new java.awt.Color(217, 217, 217));
        JPBMlstMateria.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JPBMsp2.setViewportView(JPBMlstMateria);

        JPBMbtnDarBaja.setBackground(new java.awt.Color(0, 170, 228));
        JPBMbtnDarBaja.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        JPBMbtnDarBaja.setForeground(new java.awt.Color(255, 255, 255));
        JPBMbtnDarBaja.setText("Dar de baja");

        javax.swing.GroupLayout JPBajaMateria2Layout = new javax.swing.GroupLayout(JPBajaMateria2);
        JPBajaMateria2.setLayout(JPBajaMateria2Layout);
        JPBajaMateria2Layout.setHorizontalGroup(
            JPBajaMateria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBajaMateria2Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addGroup(JPBajaMateria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPBMsp2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(JPBMbtnDarBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(526, Short.MAX_VALUE))
        );
        JPBajaMateria2Layout.setVerticalGroup(
            JPBajaMateria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBajaMateria2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(JPBMsp2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(JPBMbtnDarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        JPBajaMateria.add(JPBajaMateria2, "card2");

        JPanelContenedor.add(JPBajaMateria, "card5");

        JPMateriaYPromedio.setPreferredSize(new java.awt.Dimension(824, 680));
        JPMateriaYPromedio.setLayout(new java.awt.CardLayout());

        JPMateriaYPromedio2.setBackground(new java.awt.Color(255, 255, 255));
        JPMateriaYPromedio2.setPreferredSize(new java.awt.Dimension(824, 680));

        BtnConsultarPromedio.setBackground(new java.awt.Color(0, 170, 228));
        BtnConsultarPromedio.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        BtnConsultarPromedio.setText("Consultar Promedio");
        BtnConsultarPromedio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnConsultarPromedio.addActionListener(this::BtnConsultarPromedioActionPerformed);

        JlistMaterias.setBackground(new java.awt.Color(217, 217, 217));
        JlistMaterias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JlistMaterias.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JlistMaterias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Scrollpane2Materias.setViewportView(JlistMaterias);

        Parcial1.setText("PARCIAL 1:");
        Parcial1.setToolTipText("");

        Parcial2.setText("PARCIAL 2:");

        IEFI.setText("IEFI:");

        Recuperatorio.setText("RECUPERATORIO:");

        FINAL.setText("FINAL:");

        Promedio.setText("PROMEDIO:");

        JlabelParcial1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JlabelParcial1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlabelParcial1.setText("-");
        JlabelParcial1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JlabelParcial2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JlabelParcial2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlabelParcial2.setText("-");
        JlabelParcial2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLblRecuperatorio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JLblRecuperatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLblRecuperatorio.setText("-");
        JLblRecuperatorio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JlableIefi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JlableIefi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlableIefi.setText("-");
        JlableIefi.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JlblFinal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JlblFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlblFinal.setText("-");
        JlblFinal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JlblPromedio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JlblPromedio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlblPromedio.setText("-");
        JlblPromedio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout JPMateriaYPromedio2Layout = new javax.swing.GroupLayout(JPMateriaYPromedio2);
        JPMateriaYPromedio2.setLayout(JPMateriaYPromedio2Layout);
        JPMateriaYPromedio2Layout.setHorizontalGroup(
            JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPMateriaYPromedio2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(Scrollpane2Materias, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPMateriaYPromedio2Layout.createSequentialGroup()
                        .addComponent(BtnConsultarPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(372, 372, 372))
                    .addGroup(JPMateriaYPromedio2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPMateriaYPromedio2Layout.createSequentialGroup()
                                .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FINAL)
                                    .addComponent(Promedio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JlblPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JlableIefi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(JlblFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(372, 372, 372))
                            .addGroup(JPMateriaYPromedio2Layout.createSequentialGroup()
                                .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(JPMateriaYPromedio2Layout.createSequentialGroup()
                                        .addComponent(Recuperatorio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLblRecuperatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                    .addComponent(IEFI)
                                    .addGroup(JPMateriaYPromedio2Layout.createSequentialGroup()
                                        .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Parcial2)
                                            .addComponent(Parcial1))
                                        .addGap(42, 42, 42)
                                        .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JlabelParcial2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                            .addComponent(JlabelParcial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        JPMateriaYPromedio2Layout.setVerticalGroup(
            JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPMateriaYPromedio2Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(BtnConsultarPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPMateriaYPromedio2Layout.createSequentialGroup()
                        .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JlabelParcial1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Parcial1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Parcial2)
                            .addComponent(JlabelParcial2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Recuperatorio)
                            .addComponent(JLblRecuperatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IEFI)
                            .addComponent(JlableIefi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FINAL)
                            .addComponent(JlblFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(JPMateriaYPromedio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Promedio)
                            .addComponent(JlblPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addComponent(Scrollpane2Materias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
        );

        JPMateriaYPromedio.add(JPMateriaYPromedio2, "card15");

        JPanelContenedor.add(JPMateriaYPromedio, "card6");

        JPBuscarMateria.setPreferredSize(new java.awt.Dimension(824, 680));
        JPBuscarMateria.setLayout(new java.awt.CardLayout());

        JpaneBuscarMateria.setBackground(new java.awt.Color(255, 255, 255));
        JpaneBuscarMateria.setPreferredSize(new java.awt.Dimension(824, 680));

        INGRESARCODIGO.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        INGRESARCODIGO.setText("INGRESAR EL CODIGO DE LA MATERIA:");

        INGRESARNOMBRE.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        INGRESARNOMBRE.setText("INGRESAR EL NOMBRE DE LA MATERIA:");

        LblMateriaEncontrada.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LblMateriaEncontrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblMateriaEncontrada.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BtnBuscarMateria.setBackground(new java.awt.Color(0, 170, 228));
        BtnBuscarMateria.setText("BUSCAR MATERIA");

        TxTIngresarNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxTIngresarNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Requerido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 10))); // NOI18N

        TxtIngresarCodigo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TxtIngresarCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "*Requerido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 10))); // NOI18N

        javax.swing.GroupLayout JpaneBuscarMateriaLayout = new javax.swing.GroupLayout(JpaneBuscarMateria);
        JpaneBuscarMateria.setLayout(JpaneBuscarMateriaLayout);
        JpaneBuscarMateriaLayout.setHorizontalGroup(
            JpaneBuscarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpaneBuscarMateriaLayout.createSequentialGroup()
                .addGroup(JpaneBuscarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpaneBuscarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpaneBuscarMateriaLayout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addGroup(JpaneBuscarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(INGRESARNOMBRE)
                                .addComponent(INGRESARCODIGO))
                            .addGap(56, 56, 56)
                            .addGroup(JpaneBuscarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtIngresarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxTIngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpaneBuscarMateriaLayout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addComponent(LblMateriaEncontrada, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JpaneBuscarMateriaLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(BtnBuscarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        JpaneBuscarMateriaLayout.setVerticalGroup(
            JpaneBuscarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpaneBuscarMateriaLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(JpaneBuscarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INGRESARNOMBRE)
                    .addComponent(TxTIngresarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(JpaneBuscarMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INGRESARCODIGO)
                    .addComponent(TxtIngresarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(BtnBuscarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(LblMateriaEncontrada, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        JPBuscarMateria.add(JpaneBuscarMateria, "card2");

        JPanelContenedor.add(JPBuscarMateria, "card7");

        JPRegistroAsistencia.setPreferredSize(new java.awt.Dimension(824, 680));
        JPRegistroAsistencia.setLayout(new java.awt.CardLayout());

        JPRA.setBackground(new java.awt.Color(255, 255, 255));
        JPRA.setPreferredSize(new java.awt.Dimension(824, 680));

        JPRAlstMateria.setBackground(new java.awt.Color(217, 217, 217));
        JPRAlstMateria.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JPRAScrollPane.setViewportView(JPRAlstMateria);

        JPRAcmbAsistencia.setBackground(new java.awt.Color(217, 217, 217));
        JPRAcmbAsistencia.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JPRAcmbAsistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presente", "Ausente" }));

        JPRAbtnRegistrar.setBackground(new java.awt.Color(0, 170, 228));
        JPRAbtnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        JPRAbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        JPRAbtnRegistrar.setText("Registrar");

        javax.swing.GroupLayout JPRALayout = new javax.swing.GroupLayout(JPRA);
        JPRA.setLayout(JPRALayout);
        JPRALayout.setHorizontalGroup(
            JPRALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRALayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(JPRAScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPRALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JPRAcmbAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPRAbtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        JPRALayout.setVerticalGroup(
            JPRALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRALayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(JPRALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPRALayout.createSequentialGroup()
                        .addComponent(JPRAcmbAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPRAbtnRegistrar))
                    .addComponent(JPRAScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(295, Short.MAX_VALUE))
        );

        JPRegistroAsistencia.add(JPRA, "card2");

        JPanelContenedor.add(JPRegistroAsistencia, "card8");

        JPRegistroNota.setPreferredSize(new java.awt.Dimension(824, 680));
        JPRegistroNota.setLayout(new java.awt.CardLayout());

        JPRN.setBackground(new java.awt.Color(255, 255, 255));
        JPRN.setPreferredSize(new java.awt.Dimension(824, 680));

        JPRNlstMateria.setBackground(new java.awt.Color(217, 217, 217));
        JPRNlstMateria.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JPRNscrollpane.setViewportView(JPRNlstMateria);

        JPRNlblnota.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JPRNlblnota.setText("Nota:");

        JPRNnudNota.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        JPRNbtnRegistrar.setBackground(new java.awt.Color(0, 170, 228));
        JPRNbtnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        JPRNbtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        JPRNbtnRegistrar.setText("Registrar");

        javax.swing.GroupLayout JPRNLayout = new javax.swing.GroupLayout(JPRN);
        JPRN.setLayout(JPRNLayout);
        JPRNLayout.setHorizontalGroup(
            JPRNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRNLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(JPRNscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(JPRNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JPRNbtnRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPRNLayout.createSequentialGroup()
                        .addComponent(JPRNlblnota)
                        .addGap(18, 18, 18)
                        .addComponent(JPRNnudNota, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        JPRNLayout.setVerticalGroup(
            JPRNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRNLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(JPRNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPRNLayout.createSequentialGroup()
                        .addGroup(JPRNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JPRNlblnota)
                            .addComponent(JPRNnudNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPRNbtnRegistrar))
                    .addComponent(JPRNscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );

        JPRegistroNota.add(JPRN, "card2");

        JPanelContenedor.add(JPRegistroNota, "card9");

        JPReportes.setPreferredSize(new java.awt.Dimension(824, 680));
        JPReportes.setLayout(new java.awt.CardLayout());

        jPanelReportes.setBackground(new java.awt.Color(255, 255, 255));
        jPanelReportes.setPreferredSize(new java.awt.Dimension(824, 680));

        btnReportesGeneral.setBackground(new java.awt.Color(0, 170, 228));
        btnReportesGeneral.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        btnReportesGeneral.setForeground(new java.awt.Color(255, 255, 255));
        btnReportesGeneral.setText("Reporte General");

        btnReportesMateriasCriticas.setBackground(new java.awt.Color(0, 170, 228));
        btnReportesMateriasCriticas.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        btnReportesMateriasCriticas.setForeground(new java.awt.Color(255, 255, 255));
        btnReportesMateriasCriticas.setText("Reporte Materias Criticas");

        btnReportesMateriasAprobadas.setBackground(new java.awt.Color(0, 170, 228));
        btnReportesMateriasAprobadas.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        btnReportesMateriasAprobadas.setForeground(new java.awt.Color(255, 255, 255));
        btnReportesMateriasAprobadas.setText("Reporte Materias Aprobadas");

        lstResultado.setBackground(new java.awt.Color(217, 217, 217));
        lstResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstResultado.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lstResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPaneReportes.setViewportView(lstResultado);

        javax.swing.GroupLayout jPanelReportesLayout = new javax.swing.GroupLayout(jPanelReportes);
        jPanelReportes.setLayout(jPanelReportesLayout);
        jPanelReportesLayout.setHorizontalGroup(
            jPanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelReportesLayout.createSequentialGroup()
                        .addComponent(btnReportesGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReportesMateriasCriticas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReportesMateriasAprobadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanelReportesLayout.setVerticalGroup(
            jPanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportesLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReportesGeneral)
                    .addComponent(btnReportesMateriasCriticas)
                    .addComponent(btnReportesMateriasAprobadas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        JPReportes.add(jPanelReportes, "card2");

        JPanelContenedor.add(JPReportes, "card10");

        getContentPane().add(JPanelContenedor, java.awt.BorderLayout.CENTER);

        JMenuPrincipal.setBackground(new java.awt.Color(0, 170, 228));
        JMenuPrincipal.setForeground(new java.awt.Color(0, 170, 228));
        JMenuPrincipal.setBorderPainted(false);
        JMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        JMenuPrincipal.setPreferredSize(new java.awt.Dimension(400, 29));

        JPerfil.setText("Ver perfil");
        JPerfil.addActionListener(this::JPerfilActionPerformed);

        JMIVerPerfil.setText("Ver perfil");
        JMIVerPerfil.addActionListener(this::JMIVerPerfilActionPerformed);
        JPerfil.add(JMIVerPerfil);

        JMenuPrincipal.add(JPerfil);

        JGestion.setText("Gestión de materias");

        JMItemMateria.setText("Inscribirse a una materia");
        JMItemMateria.addActionListener(this::JMItemMateriaActionPerformed);
        JGestion.add(JMItemMateria);

        JMIDarseBaja.setText("Darse de baja a una materia");
        JMIDarseBaja.addActionListener(this::JMIDarseBajaActionPerformed);
        JGestion.add(JMIDarseBaja);

        JMIMateriaPromedio.setText("Listado de materias y promedios");
        JMIMateriaPromedio.addActionListener(this::JMIMateriaPromedioActionPerformed);
        JGestion.add(JMIMateriaPromedio);

        JMIBuscarMateria.setText("Buscar materias");
        JMIBuscarMateria.addActionListener(this::JMIBuscarMateriaActionPerformed);
        JGestion.add(JMIBuscarMateria);

        JMenuPrincipal.add(JGestion);

        JRegistros.setText("Registros");

        JMIAsistencia.setText("Registro de asistencias");
        JMIAsistencia.addActionListener(this::JMIAsistenciaActionPerformed);
        JRegistros.add(JMIAsistencia);

        JMINotas.setText("Registro de notas");
        JMINotas.addActionListener(this::JMINotasActionPerformed);
        JRegistros.add(JMINotas);

        JMenuPrincipal.add(JRegistros);

        JReportes.setText("Reportes");

        JMIReportes.setText("Reportes");
        JMIReportes.addActionListener(this::JMIReportesActionPerformed);
        JReportes.add(JMIReportes);

        JMenuPrincipal.add(JReportes);

        JSalir.setText("Salir");

        JMISalir.setText("Salir");
        JMISalir.addActionListener(this::JMISalirActionPerformed);
        JSalir.add(JMISalir);

        JMenuPrincipal.add(JSalir);

        setJMenuBar(JMenuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMItemMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMItemMateriaActionPerformed
        JPanelContenedor.removeAll();
        JPanelContenedor.add(JPInscribirse);
        JPanelContenedor.repaint();
        JPanelContenedor.revalidate();
        JMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_JMItemMateriaActionPerformed

    private void JMIDarseBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIDarseBajaActionPerformed
        JPanelContenedor.removeAll();
        JPanelContenedor.add(JPBajaMateria);
        JPanelContenedor.repaint();
        JPanelContenedor.revalidate();
        JMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_JMIDarseBajaActionPerformed

    private void JMIMateriaPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIMateriaPromedioActionPerformed
        JPanelContenedor.removeAll();
        JPanelContenedor.add(JPMateriaYPromedio);
        JPanelContenedor.repaint();
        JPanelContenedor.revalidate();
        JMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_JMIMateriaPromedioActionPerformed

    private void JMIBuscarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIBuscarMateriaActionPerformed
        JPanelContenedor.removeAll();
        JPanelContenedor.add(JPBuscarMateria);
        JPanelContenedor.repaint();
        JPanelContenedor.revalidate();
        JMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_JMIBuscarMateriaActionPerformed

    private void JPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPerfilActionPerformed
        JPanelContenedor.removeAll();
        JPanelContenedor.add(JPVerPerfil);
        JPanelContenedor.repaint();
        JPanelContenedor.revalidate();
        JMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_JPerfilActionPerformed

    private void JMIVerPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIVerPerfilActionPerformed
        JPanelContenedor.removeAll();
        JPanelContenedor.add(JPVerPerfil);
        JPanelContenedor.repaint();
        JPanelContenedor.revalidate();
        JMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_JMIVerPerfilActionPerformed

    private void JMIAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAsistenciaActionPerformed
        JPanelContenedor.removeAll();
        JPanelContenedor.add(JPRegistroAsistencia);
        JPanelContenedor.repaint();
        JPanelContenedor.revalidate();
        JMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_JMIAsistenciaActionPerformed

    private void JMINotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMINotasActionPerformed
        JPanelContenedor.removeAll();
        JPanelContenedor.add(JPRegistroNota);
        JPanelContenedor.repaint();
        JPanelContenedor.revalidate();
        JMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_JMINotasActionPerformed

    private void JMIReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIReportesActionPerformed
        JPanelContenedor.removeAll();
        JPanelContenedor.add(JPReportes);
        JPanelContenedor.repaint();
        JPanelContenedor.revalidate();
        JMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_JMIReportesActionPerformed

    private void JMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMISalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JMISalirActionPerformed

    private void BtnConsultarPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarPromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnConsultarPromedioActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        JPanelContenedor.removeAll();
        JPanelContenedor.add(JPVerPerfil);
        JPanelContenedor.repaint();
        JPanelContenedor.revalidate();
        JMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new JFPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarMateria;
    private javax.swing.JButton BtnConsultarPromedio;
    private javax.swing.JLabel FINAL;
    private javax.swing.JLabel IEFI;
    private javax.swing.JLabel INGRESARCODIGO;
    private javax.swing.JLabel INGRESARNOMBRE;
    private javax.swing.JMenu JGestion;
    private javax.swing.JLabel JLabel7;
    private javax.swing.JLabel JLblRecuperatorio;
    private javax.swing.JLabel JLlblInscribirse1;
    private javax.swing.JLabel JLlblInscribirse2;
    private javax.swing.JMenuItem JMIAsistencia;
    private javax.swing.JMenuItem JMIBuscarMateria;
    private javax.swing.JMenuItem JMIDarseBaja;
    private javax.swing.JMenuItem JMIMateriaPromedio;
    private javax.swing.JMenuItem JMINotas;
    private javax.swing.JMenuItem JMIReportes;
    private javax.swing.JMenuItem JMISalir;
    private javax.swing.JMenuItem JMIVerPerfil;
    private javax.swing.JMenuItem JMItemMateria;
    private javax.swing.JMenuBar JMenuPrincipal;
    private javax.swing.JButton JPBMbtnDarBaja;
    private javax.swing.JList<String> JPBMlstMateria;
    private javax.swing.JScrollPane JPBMsp2;
    private javax.swing.JPanel JPBajaMateria;
    private javax.swing.JPanel JPBajaMateria2;
    private javax.swing.JPanel JPBuscarMateria;
    private javax.swing.JPanel JPInscribirse;
    private javax.swing.JPanel JPInscribirse2;
    private javax.swing.JButton JPInscribirsebtnInscribirse;
    private javax.swing.JSpinner JPInscribirsenudCuatrimestre;
    private javax.swing.JTextField JPInscribirsetxtAño;
    private javax.swing.JTextField JPInscribirsetxtCodigo;
    private javax.swing.JTextField JPInscribirsetxtNombre;
    private javax.swing.JPanel JPMateriaYPromedio;
    private javax.swing.JPanel JPMateriaYPromedio2;
    private javax.swing.JPanel JPRA;
    private javax.swing.JScrollPane JPRAScrollPane;
    private javax.swing.JButton JPRAbtnRegistrar;
    private javax.swing.JComboBox<String> JPRAcmbAsistencia;
    private javax.swing.JList<String> JPRAlstMateria;
    private javax.swing.JPanel JPRN;
    private javax.swing.JButton JPRNbtnRegistrar;
    private javax.swing.JLabel JPRNlblnota;
    private javax.swing.JList<String> JPRNlstMateria;
    private javax.swing.JSpinner JPRNnudNota;
    private javax.swing.JScrollPane JPRNscrollpane;
    private javax.swing.JPanel JPRegistroAsistencia;
    private javax.swing.JPanel JPRegistroNota;
    private javax.swing.JPanel JPReportes;
    private javax.swing.JPanel JPVerPerfil;
    private javax.swing.JPanel JPanelContenedor;
    private javax.swing.JPanel JPanelPerfil;
    private javax.swing.JMenu JPerfil;
    private javax.swing.JLabel JPlblInscribirse3;
    private javax.swing.JLabel JPlblInscribirse4;
    private javax.swing.JMenu JRegistros;
    private javax.swing.JMenu JReportes;
    private javax.swing.JMenu JSalir;
    private javax.swing.JLabel JlabelParcial1;
    private javax.swing.JLabel JlabelParcial2;
    private javax.swing.JLabel JlableIefi;
    private javax.swing.JLabel JlblFinal;
    private javax.swing.JLabel JlblPromedio;
    private javax.swing.JList<String> JlistMaterias;
    private javax.swing.JPanel JpaneBuscarMateria;
    private javax.swing.JLabel LblMateriaEncontrada;
    private javax.swing.JLabel Parcial1;
    private javax.swing.JLabel Parcial2;
    private javax.swing.JLabel Promedio;
    private javax.swing.JLabel Recuperatorio;
    private javax.swing.JScrollPane Scrollpane2Materias;
    private javax.swing.JTextField TxTIngresarNombre;
    private javax.swing.JTextField TxtIngresarCodigo;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnReportesGeneral;
    private javax.swing.JButton btnReportesMateriasAprobadas;
    private javax.swing.JButton btnReportesMateriasCriticas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelReportes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneReportes;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblLegajo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JList<String> lstMaterias;
    private javax.swing.JTable lstResultado;
    // End of variables declaration//GEN-END:variables
}
