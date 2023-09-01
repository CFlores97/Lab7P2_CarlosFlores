
import java.awt.Color;
import java.awt.color.ColorSpace;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btn_color = new javax.swing.JButton();
        btn_addCar = new javax.swing.JButton();
        date_year = new com.toedter.calendar.JDateChooser();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        tf_costo = new javax.swing.JTextField();
        btn_addVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

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

        btn_color.setText("Color");
        btn_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_colorMouseClicked(evt);
            }
        });

        btn_addCar.setText("Agregar");
        btn_addCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addCarMouseClicked(evt);
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
                        .addComponent(btn_color)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                        .addComponent(btn_addCar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(jp_vehiculoLayout.createSequentialGroup()
                        .addGroup(jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(btn_color)
                    .addComponent(btn_addCar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(date_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jp_vehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
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
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_ventaLayout.createSequentialGroup()
                        .addGroup(jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_addVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jp_ventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            Vehiculo car = new Vehiculo(tf_marca.getText(), tf_modelo.getText(), colorCar, date_year.getDate(), Double.parseDouble(tf_precio.getText()));
            carros.add(car);

            File vehiculoFile = null;
            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                vehiculoFile = new File("./vehiculos.txt");
                fw = new FileWriter(vehiculoFile); //se crea el archivo en este momento
                bw = new BufferedWriter(fw);

                for (Vehiculo carro : carros) {
                    bw.write("[\n\t" + carro.getMarca() + ", " + "\n"
                            + "\t" + carro.getModelo() + ", " + "\n"
                            + "\t" + carro.getYear() + ", " + "\n"
                            + "\t" + carro.getPrecio() + ", " + "\n"
                            + "]\n"); //escribe desde el buffer

                }

                bw.newLine();
                bw.flush();

                tf_marca.setText("");
                tf_modelo.setText("");
                tf_precio.setText("");

                JOptionPane.showMessageDialog(this, "Agregado exitosamente!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No se puedo agregar, paso un error internamente");
            }

            bw.close();
            fw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se puedo agregar");
        }


    }//GEN-LAST:event_btn_addCarMouseClicked

    private void btn_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_colorMouseClicked

        colorCar = JColorChooser.showDialog(this, "Elija un color", Color.BLACK);

    }//GEN-LAST:event_btn_colorMouseClicked

    private void btn_addVendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addVendedorMouseClicked
        try {
            Vendedor vend = new Vendedor(
                    tf_nombre.getText(), 
                    Integer.parseInt(tf_cantidadCarros.getText()), 
                    Double.parseDouble(tf_dineroGanado.getText()));
            
            vendedores.add(vend);

            File vehiculoFile = null;
            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                vehiculoFile = new File("./vendedores.txt");
                fw = new FileWriter(vehiculoFile); //se crea el archivo en este momento
                bw = new BufferedWriter(fw);

                for (Vendedor vendedor : vendedores) {
                    bw.write("[\n\t" + vendedor.getNombre() + ", " + "\n"
                            + "\t" + vendedor.getCarrosVendidos() + ", " + "\n"
                            + "\t" + vendedor.getDineroGenerado() + ", " + "\n"
                            + "]\n"); //escribe desde el buffer

                }

                bw.newLine();
                bw.flush();

                tf_nombre.setText("");
                tf_cantidadCarros.setText("");
                tf_dineroGanado.setText("");

                JOptionPane.showMessageDialog(this, "Agregado exitosamente!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No se puedo agregar, paso un error internamente");
            }

            bw.close();
            fw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se puedo agregar");
        }
    }//GEN-LAST:event_btn_addVendedorMouseClicked

    private void btn_addClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addClienteMouseClicked
        try {
            Double sueldoDisponible = Double.parseDouble(tf_sueldoDisp.getText());
            
            Cliente cli = new Cliente(tf_nombre.getText(),  
                    tf_profesion.getText(), 
                    Integer.parseInt(tf_edad.getText()), 
                    Integer.parseInt(tf_carrosComprados.getText()), 
                    sueldoDisponible);
            
            clientes.add(cli);

            File vehiculoFile = null;
            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                vehiculoFile = new File("./clientes.txt");
                fw = new FileWriter(vehiculoFile); //se crea el archivo en este momento
                bw = new BufferedWriter(fw);

                for (Cliente cliente : clientes) {
                    bw.write("[\n\t" + cliente.getNombre() + ", " + "\n"
                            + "\t" + cliente.getProfesion()+ ", " + "\n"
                            + "\t" + cliente.getEdad()+ ", " + "\n"
                            + "\t" + cliente.getCarrosComprados()+ ", " + "\n"
                            + "\t" + cliente.getSueldoDisp()+ ", " + "\n"
                            + "]\n"); //escribe desde el buffer

                }

                bw.newLine();
                bw.flush();

                tf_nombre.setText("");
                tf_profesion.setText("");
                tf_edad.setText("");
                tf_carrosComprados.setText("");
                tf_sueldoDisp.setText("");

                JOptionPane.showMessageDialog(this, "Agregado exitosamente!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No se puedo agregar, paso un error internamente");
            }

            bw.close();
            fw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se puedo agregar");
        }
    }//GEN-LAST:event_btn_addClienteMouseClicked

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
    ArrayList<Vehiculo> carros = new ArrayList<>();
    ArrayList<Vendedor> vendedores = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Venta> ventas = new ArrayList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addCar;
    private javax.swing.JButton btn_addCliente;
    private javax.swing.JButton btn_addVendedor;
    private javax.swing.JButton btn_addVenta;
    private javax.swing.JButton btn_color;
    private com.toedter.calendar.JDateChooser date_year;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jp_cliente;
    private javax.swing.JPanel jp_vehiculo;
    private javax.swing.JPanel jp_vendedor;
    private javax.swing.JPanel jp_venta;
    private javax.swing.JTextField tf_cantidadCarros;
    private javax.swing.JTextField tf_carrosComprados;
    private javax.swing.JTextField tf_clienteNombre;
    private javax.swing.JTextField tf_costo;
    private javax.swing.JTextField tf_dineroGanado;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_modelo;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_profesion;
    private javax.swing.JTextField tf_sueldoDisp;
    // End of variables declaration//GEN-END:variables
}
