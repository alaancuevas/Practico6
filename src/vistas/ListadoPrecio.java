/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import java.util.TreeSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import entidades.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author Jin
 */
public class ListadoPrecio extends javax.swing.JInternalFrame {

    private TreeSet<Producto> productos;
    private DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form ListadoPrecios //
     */
    public ListadoPrecio(TreeSet<Producto> productos) {
        initComponents();
        this.productos = productos;
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlListadoPrecios = new javax.swing.JLabel();
        jlPrecioMinimo = new javax.swing.JLabel();
        jtfPrecioMinimoIngresar = new javax.swing.JTextField();
        jtfPrecioMaximoIngresar = new javax.swing.JTextField();
        jlPrecioMaximo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();

        setClosable(true);

        jlListadoPrecios.setBackground(new java.awt.Color(255, 255, 255));
        jlListadoPrecios.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlListadoPrecios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlListadoPrecios.setText("Listado por Precios");

        jlPrecioMinimo.setBackground(new java.awt.Color(255, 255, 255));
        jlPrecioMinimo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlPrecioMinimo.setText("Precio maximo:");

        jtfPrecioMinimoIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPrecioMinimoIngresarKeyReleased(evt);
            }
        });

        jtfPrecioMaximoIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPrecioMaximoIngresarKeyReleased(evt);
            }
        });

        jlPrecioMaximo.setBackground(new java.awt.Color(255, 255, 255));
        jlPrecioMaximo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlPrecioMaximo.setText("Ingresa precio Minimo:");

        jtTabla.setBackground(new java.awt.Color(204, 204, 204));
        jtTabla.setForeground(new java.awt.Color(0, 0, 0));
        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlPrecioMaximo)
                .addGap(18, 18, 18)
                .addComponent(jtfPrecioMinimoIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jlPrecioMinimo)
                .addGap(18, 18, 18)
                .addComponent(jtfPrecioMaximoIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlListadoPrecios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlListadoPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPrecioMaximoIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPrecioMinimo)
                    .addComponent(jlPrecioMaximo)
                    .addComponent(jtfPrecioMinimoIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPrecioMaximoIngresarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecioMaximoIngresarKeyReleased
        // TODO add your handling code here:
        try {
            verificarPrecios();
        } catch (NumberFormatException e) {
            System.out.println("Error: Numero faltante/Ingreso invalido.");
            return;
        }
    }//GEN-LAST:event_jtfPrecioMaximoIngresarKeyReleased

    private void jtfPrecioMinimoIngresarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecioMinimoIngresarKeyReleased
        // TODO add your handling code here:
        try {
            verificarPrecios();
        } catch (NumberFormatException e) {
            System.out.println("Error: Numero faltante/Ingreso invalido.");
            return;
        }
    }//GEN-LAST:event_jtfPrecioMinimoIngresarKeyReleased

    private void verificarPrecios() {
        borrarFilas();

        double minPrecio = Double.parseDouble(jtfPrecioMinimoIngresar.getText());
        double maxPrecio = Double.parseDouble(jtfPrecioMaximoIngresar.getText());

        for (Producto prod : productos) {
            double precio = prod.getPrecio();
            if (precio >= minPrecio && precio <= maxPrecio) {
                Vector renglon = new Vector();
                renglon.add(prod.getCodigo());
                renglon.add(prod.getDescripcion());
                renglon.add(prod.getPrecio());
                renglon.add(prod.getStock());
                renglon.add(prod.getRubro());
                modelo.addRow(renglon);
                System.out.println(renglon);
            }
        }
    }

    private void armarCabecera() {

        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Rubro");
        jtTabla.setModel(modelo);
    }

    private void borrarFilas() {

        int filas = modelo.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {

            modelo.removeRow(f);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlListadoPrecios;
    private javax.swing.JLabel jlPrecioMaximo;
    private javax.swing.JLabel jlPrecioMinimo;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField jtfPrecioMaximoIngresar;
    private javax.swing.JTextField jtfPrecioMinimoIngresar;
    // End of variables declaration//GEN-END:variables

}
