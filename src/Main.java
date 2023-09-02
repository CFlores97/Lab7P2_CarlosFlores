
import java.awt.Color;
import java.awt.color.ColorSpace;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultTreeModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            File f = new File("./vehiculo.txt");

            agregarComboCarro();
            agregarComboVendedor();
            agregarComboCliente();

        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_todo = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_ventas = new javax.swing.JTree();
        btn_arbolCosas = new javax.swing.JButton();
        btn_arbolVentas = new javax.swing.JButton();
        jd_modificar = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_modificar = new javax.swing.JMenuItem();
        mi_guardar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp_vehiculo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_marca = new javax.swing.JTextField();
        tf_modelo = new javax.swing.JTextField();
        tf_precio = new javax.swing.JTextField();
        btn_addCar = new javax.swing.JButton();
        tf_color = new javax.swing.JTextField();
        tf_year = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jp_vendedor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_cantidadCarros = new javax.swing.JTextField();
        tf_dineroGanado = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        btn_addVendedor = new javax.swing.JButton();
        jp_cliente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_clienteNombre = new javax.swing.JTextField();
        tf_profesion = new javax.swing.JTextField();
        tf_edad = new javax.swing.JTextField();
        tf_carrosComprados = new javax.swing.JTextField();
        tf_sueldoDisp = new javax.swing.JTextField();
        btn_addCliente = new javax.swing.JButton();
        jp_venta = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cb_vendedores = new javax.swing.JComboBox<>();
        cb_carros = new javax.swing.JComboBox<>();
        cb_clientes = new javax.swing.JComboBox<>();
        tf_costo = new javax.swing.JTextField();
        btn_addVenta = new javax.swing.JButton();

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Admin");
        jt_todo.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_todo);

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jt_ventas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jt_ventas);

        btn_arbolCosas.setText("cargar\n");
        btn_arbolCosas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_arbolCosasMouseClicked(evt);
            }
        });

        btn_arbolVentas.setText("cargar\n");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btn_arbolCosas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btn_arbolVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_arbolCosas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_arbolVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ta_1.setColumns(20);
        ta_1.setRows(5);
        jScrollPane3.setViewportView(ta_1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mi_modificar.setText("Modificar");
        mi_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificarActionPerformed(evt);
            }
        });
        jMenu1.add(mi_modificar);

        mi_guardar.setText("Guardar");
        mi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_guardarActionPerformed(evt);
            }
        });
        jMenu1.add(mi_guardar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jd_modificar.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jd_modificarLayout = new javax.swing.GroupLayout(jd_modificar.getContentPane());
        jd_modificar.getContentPane().setLayout(jd_modificarLayout);
        jd_modificarLayout.setHorizontalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_modificarLayout.setVerticalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Marca:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Modelo");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Year");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Color");

        btn_addCar.setText("Agregar");
        btn_addCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addCarMouseClicked(evt);
            }
        });

        jButton1.setText("Ir a modificar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_vehiculoLayout = new javax.swing.GroupLayout(jp_vehiculo);
        jp_vehiculo.setLayout(jp_vehiculoLayout);
        jp_vehiculoLayout.setHorizontalGroup(
            jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_vehiculoLayout.createSequentialGroup()
                .addGroup(jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_vehiculoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_vehiculoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)))
                .addGroup(jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_vehiculoLayout.createSequentialGroup()
                        .addComponent(tf_color, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                        .addComponent(btn_addCar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(jp_vehiculoLayout.createSequentialGroup()
                        .addGroup(jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_vehiculoLayout.createSequentialGroup()
                                .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(189, 189, 189)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_year, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(213, Short.MAX_VALUE))))
        );
        jp_vehiculoLayout.setVerticalGroup(
            jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_vehiculoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btn_addCar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_vehiculoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(163, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_vehiculoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );

        jTabbedPane1.addTab("Vehiculo", jp_vehiculo);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cantidad de Carros:");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Dinero ganado:");

        btn_addVendedor.setText("Agregar");
        btn_addVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addVendedorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_vendedorLayout = new javax.swing.GroupLayout(jp_vendedor);
        jp_vendedor.setLayout(jp_vendedorLayout);
        jp_vendedorLayout.setHorizontalGroup(
            jp_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_vendedorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jp_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_vendedorLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_cantidadCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(btn_addVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_vendedorLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_dineroGanado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_vendedorLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jp_vendedorLayout.setVerticalGroup(
            jp_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_vendedorLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jp_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_vendedorLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jp_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_cantidadCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_vendedorLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btn_addVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jp_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_dineroGanado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(251, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vendedor", jp_vendedor);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Edad:");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre:");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Profesion:");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Sueldo Disponible:");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Carros Comprados");

        btn_addCliente.setText("Agregar");
        btn_addCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_clienteLayout = new javax.swing.GroupLayout(jp_cliente);
        jp_cliente.setLayout(jp_clienteLayout);
        jp_clienteLayout.setHorizontalGroup(
            jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_clienteLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_clienteLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(tf_sueldoDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_clienteLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(tf_carrosComprados, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_clienteLayout.createSequentialGroup()
                        .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_clienteLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(tf_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_clienteLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_clienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(190, 190, 190)
                        .addComponent(btn_addCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jp_clienteLayout.setVerticalGroup(
            jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_clienteLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_clienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_clienteLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tf_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_clienteLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_addCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_carrosComprados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jp_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_sueldoDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jp_cliente);

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Vendedor");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Costo:");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Cliente");

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Carro vendido:");

        btn_addVenta.setText("Agregar");
        btn_addVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addVentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_ventaLayout = new javax.swing.GroupLayout(jp_venta);
        jp_venta.setLayout(jp_ventaLayout);
        jp_ventaLayout.setHorizontalGroup(
            jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ventaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_ventaLayout.createSequentialGroup()
                        .addGroup(jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_vendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_carros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp_ventaLayout.createSequentialGroup()
                        .addGroup(jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_ventaLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_ventaLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addComponent(btn_addVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );
        jp_ventaLayout.setVerticalGroup(
            jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ventaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cb_vendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_ventaLayout.createSequentialGroup()
                        .addGroup(jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cb_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_addVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cb_carros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(254, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Venta", jp_venta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addCarMouseClicked
        try {

            Vehiculo car = new Vehiculo(
                    tf_marca.getText(),
                    tf_modelo.getText(),
                    tf_color.getText(),
                    tf_year.getText(),
                    Double.parseDouble(tf_precio.getText()));

            carros.add(car);
            //System.out.println(carros);

            File vehiculoFile = null;
            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                vehiculoFile = new File("./vehiculos.txt");
                fw = new FileWriter(vehiculoFile, true); //se crea el archivo en este momento
                bw = new BufferedWriter(fw);

                for (Vehiculo carro : carros) {
                    bw.write("[\n\t" + carro.getMarca() + ", " + "\n"
                            + "\t" + carro.getModelo() + ", " + "\n"
                            + "\t" + carro.getYear() + ", " + "\n"
                            + "\t" + carro.getPrecio() + ", " + "\n"
                            + "];"); //escribe desde el buffer

                }

                bw.newLine();
                bw.flush();

                tf_marca.setText("");
                tf_modelo.setText("");
                tf_precio.setText("");
                tf_color.setText("");
                tf_year.setText("");

                agregarComboCarro();

//                agregarComboCarro(vehiculoFile);
                JOptionPane.showMessageDialog(this, "Agregado exitosamente!");

            } catch (Exception e) {
                e.printStackTrace();
//JOptionPane.showMessageDialog(this, "No se puedo agregar, paso un error internamente");
            }

            bw.close();
            fw.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se puedo agregar");
        }


    }//GEN-LAST:event_btn_addCarMouseClicked

    private void btn_addVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addVendedorMouseClicked
        try {
            DefaultComboBoxModel modelVend = (DefaultComboBoxModel) cb_vendedores.getModel();

            Vendedor vend = new Vendedor(
                    tf_nombre.getText(),
                    Integer.parseInt(tf_cantidadCarros.getText()),
                    Double.parseDouble(tf_dineroGanado.getText()));

            vendedores.add(vend);
            modelVend.removeAllElements();

            File vehiculoFile = null;
            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                vehiculoFile = new File("./vendedores.txt");
                fw = new FileWriter(vehiculoFile, true); //se crea el archivo en este momento
                bw = new BufferedWriter(fw);

                for (Vendedor vendedor : vendedores) {
                    bw.write("[\n\t" + vendedor.getNombre() + ", " + "\n"
                            + "\t" + vendedor.getCarrosVendidos() + ", " + "\n"
                            + "\t" + vendedor.getDineroGenerado() + ", " + "\n"
                            + "];\n"); //escribe desde el buffer

                }

                modelVend.addAll(vendedores);

                bw.newLine();
                bw.flush();

                tf_nombre.setText("");
                tf_cantidadCarros.setText("");
                tf_dineroGanado.setText("");

                cb_vendedores.setModel(modelVend);

                JOptionPane.showMessageDialog(this, "Agregado exitosamente!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No se puedo agregar, paso un error internamente");
            }

            bw.close();
            fw.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se puedo agregar");
        }
    }//GEN-LAST:event_btn_addVendedorMouseClicked

    private void btn_addClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addClienteMouseClicked
        try {
            DefaultComboBoxModel modelClie = (DefaultComboBoxModel) cb_clientes.getModel();

            Double sueldoDisponible = Double.parseDouble(tf_sueldoDisp.getText());

            Cliente cli = new Cliente(
                    tf_clienteNombre.getText(),
                    tf_profesion.getText(),
                    Integer.parseInt(tf_edad.getText()),
                    Integer.parseInt(tf_carrosComprados.getText()),
                    sueldoDisponible);

            clientes.add(cli);

            modelClie.removeAllElements();

            File vehiculoFile = null;
            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                vehiculoFile = new File("./clientes.txt");
                fw = new FileWriter(vehiculoFile, true); //se crea el archivo en este momento
                bw = new BufferedWriter(fw);

                for (Cliente cliente : clientes) {
                    bw.write("[\n\t" + cliente.getNombre() + ", " + "\n"
                            + "\t" + cliente.getProfesion() + ", " + "\n"
                            + "\t" + cliente.getEdad() + ", " + "\n"
                            + "\t" + cliente.getCarrosComprados() + ", " + "\n"
                            + "\t" + cliente.getSueldoDisp() + ", " + "\n"
                            + "];\n"); //escribe desde el buffer

                }

                modelClie.addAll(clientes);

                bw.newLine();
                bw.flush();

                tf_clienteNombre.setText("");
                tf_profesion.setText("");
                tf_edad.setText("");
                tf_carrosComprados.setText("");
                tf_sueldoDisp.setText("");

                cb_clientes.setModel(modelClie);

                JOptionPane.showMessageDialog(this, "Agregado exitosamente!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No se puedo agregar, paso un error internamente");
            }

            bw.close();
            fw.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se puedo agregar");
        }
    }//GEN-LAST:event_btn_addClienteMouseClicked

    private void btn_addVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addVentaMouseClicked
        try {
            DefaultComboBoxModel modelClie = (DefaultComboBoxModel) cb_clientes.getModel();
            DefaultComboBoxModel modelVend = (DefaultComboBoxModel) cb_vendedores.getModel();
            DefaultComboBoxModel modelCar = (DefaultComboBoxModel) cb_carros.getModel();

            Venta vent = new Venta(
                    Double.parseDouble(tf_costo.getText()),
                    modelClie.getSelectedItem().toString(),
                    modelVend.getSelectedItem().toString(),
                    modelCar.getSelectedItem().toString()
            );

            ventas.add(vent);

            File vehiculoFile = null;
            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                vehiculoFile = new File("./ventas.txt");
                fw = new FileWriter(vehiculoFile, true); //se crea el archivo en este momento
                bw = new BufferedWriter(fw);

                for (Venta venta : ventas) {
                    bw.write("[\n\t" + venta.getCostoTrans() + ", " + "\n"
                            + "\t" + venta.getCliente() + ", " + "\n"
                            + "\t" + venta.getVendedor() + ", " + "\n"
                            + "\t" + venta.getCarroVend() + ", " + "\n"
                            + "];\n"); //escribe desde el buffer

                }

                bw.newLine();
                bw.flush();

                tf_costo.setText("");
                cb_clientes.setSelectedIndex(-1);
                cb_vendedores.setSelectedIndex(-1);
                cb_carros.setSelectedIndex(-1);

                JOptionPane.showMessageDialog(this, "Agregado exitosamente!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No se puedo agregar, paso un error internamente");
            }

            bw.close();
            fw.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se puedo agregar");
        }
    }//GEN-LAST:event_btn_addVentaMouseClicked

    private void btn_arbolCosasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_arbolCosasMouseClicked
        DefaultTreeModel m = (DefaultTreeModel) jt_todo.getModel();
        JFileChooser jf = new JFileChooser();

    }//GEN-LAST:event_btn_arbolCosasMouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jd_modificar.setModal(true);
        jd_modificar.pack();
        jd_modificar.setLocationRelativeTo(this);
        jd_modificar.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void mi_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificarActionPerformed
        ta_1.setText("");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int seleccion = fileChooser.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            try {
                File dir = fileChooser.getSelectedFile();

                FileReader fr = new FileReader(dir);
                BufferedReader br = new BufferedReader(fr);

                String line = "";
                String entrada = "";
                ArrayList<String> datos = new ArrayList<>();

                while ((line = br.readLine()) != null) {
                    ta_1.append(line + "\n");

                }

            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_mi_modificarActionPerformed

    private void mi_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_guardarActionPerformed
        JFileChooser jfc = new JFileChooser();

        int seleccion = jfc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {

                File fichero = null;

                fichero = jfc.getSelectedFile();

                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);
                bw.write(ta_1.getText());
                ta_1.setText("");
                bw.flush();
                JOptionPane.showMessageDialog(this, "Archivo modificado exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_mi_guardarActionPerformed

    public void agregarComboCarro() {
        DefaultComboBoxModel modeloCarro = (DefaultComboBoxModel) cb_carros.getModel();

        modeloCarro.removeAllElements();

        while (modeloCarro.getSize() > 0) {
            modeloCarro.removeElementAt(0);
        }

        ArrayList<Vehiculo> carrosTemp = new ArrayList<>();

        try {
            File f = new File("./vehiculos.txt");

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            String entrada = "";
            ArrayList<String> datos = new ArrayList<>();
            Vehiculo v = null;

            while ((line = br.readLine()) != null) {

                if (!line.contains("];")) {
                    entrada += line;

                } else {
                    datos.add(entrada);
                    entrada = "";
                }

            }

            for (String dato : datos) {
                String data[] = dato.split(",");
                data[0] = data[0].substring(1, data[0].length());
                data[1] = data[1].substring(2, data[1].length());
                data[2] = data[2].substring(2, data[2].length());
                data[3] = data[3].substring(2, data[3].length());
                v = new Vehiculo(data[0], data[1], data[2], Double.parseDouble(data[3]));

                modeloCarro.addElement(v);

            }

            cb_carros.setModel(modeloCarro);
            fr.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void agregarComboVendedor() {
        DefaultComboBoxModel modeloVendedor = (DefaultComboBoxModel) cb_vendedores.getModel();

        modeloVendedor.removeAllElements();
        while (modeloVendedor.getSize() > 0) {
            modeloVendedor.removeElementAt(0);
        }

        ArrayList<Vehiculo> carrosTemp = new ArrayList<>();

        try {
            File f = new File("./vendedores.txt");

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            String entrada = "";
            ArrayList<String> datos = new ArrayList<>();
            Vendedor v = null;

            while ((line = br.readLine()) != null) {

                if (!line.contains("];")) {
                    entrada += line;

                } else {
                    datos.add(entrada);
                    entrada = "";
                }

            }

            for (String dato : datos) {
                String data[] = dato.split(",");
                data[0] = data[0].substring(1, data[0].length());
                data[1] = data[1].substring(2, data[1].length());
                data[2] = data[2].substring(2, data[2].length());

                v = new Vendedor(data[0], Integer.parseInt(data[1]), Double.parseDouble(data[2]));

                modeloVendedor.addElement(v);

            }

            modeloVendedor.addAll(carrosTemp);
            cb_vendedores.setModel(modeloVendedor);
            fr.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void agregarComboCliente() {
        DefaultComboBoxModel modeloClientes = (DefaultComboBoxModel) cb_clientes.getModel();

        modeloClientes.removeAllElements();
        while (modeloClientes.getSize() > 0) {
            modeloClientes.removeElementAt(0);
        }

        ArrayList<Vehiculo> carrosTemp = new ArrayList<>();

        try {
            File f = new File("./clientes.txt");

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            String entrada = "";
            ArrayList<String> datos = new ArrayList<>();
            Cliente c = null;

            while ((line = br.readLine()) != null) {

                if (!line.contains("];")) {
                    entrada += line;

                } else {
                    datos.add(entrada);
                    entrada = "";
                }

            }

            for (String dato : datos) {
                String data[] = dato.split(",");
                data[0] = data[0].substring(1, data[0].length());
                data[1] = data[1].substring(2, data[1].length());
                data[2] = data[2].substring(2, data[2].length());
                data[3] = data[3].substring(2, data[3].length());
                data[4] = data[4].substring(2, data[4].length());

                c = new Cliente(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Double.parseDouble(data[4]));

                modeloClientes.addElement(c);

            }

            cb_clientes.setModel(modeloClientes);
            fr.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    Color colorCar;
    ArrayList<String> carrosCb;
    ArrayList<String> vendedoresCb;
    ArrayList<String> clientesCb;
    ArrayList<Vehiculo> carros = new ArrayList<>();
    ArrayList<Vendedor> vendedores = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Venta> ventas = new ArrayList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addCar;
    private javax.swing.JButton btn_addCliente;
    private javax.swing.JButton btn_addVendedor;
    private javax.swing.JButton btn_addVenta;
    private javax.swing.JButton btn_arbolCosas;
    private javax.swing.JButton btn_arbolVentas;
    private javax.swing.JComboBox<String> cb_carros;
    private javax.swing.JComboBox<String> cb_clientes;
    private javax.swing.JComboBox<String> cb_vendedores;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_modificar;
    private javax.swing.JPanel jp_cliente;
    private javax.swing.JPanel jp_vehiculo;
    private javax.swing.JPanel jp_vendedor;
    private javax.swing.JPanel jp_venta;
    private javax.swing.JTree jt_todo;
    private javax.swing.JTree jt_ventas;
    private javax.swing.JMenuItem mi_guardar;
    private javax.swing.JMenuItem mi_modificar;
    private javax.swing.JTextArea ta_1;
    private javax.swing.JTextField tf_cantidadCarros;
    private javax.swing.JTextField tf_carrosComprados;
    private javax.swing.JTextField tf_clienteNombre;
    private javax.swing.JTextField tf_color;
    private javax.swing.JTextField tf_costo;
    private javax.swing.JTextField tf_dineroGanado;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_modelo;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_profesion;
    private javax.swing.JTextField tf_sueldoDisp;
    private javax.swing.JTextField tf_year;
    // End of variables declaration//GEN-END:variables
}
