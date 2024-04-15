/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.TreeSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import entidades.Producto;
import entidades.Rubro;

/**
 *
 * @author Jin
 */
public class ConsultaProductoRubro extends javax.swing.JInternalFrame {

    private TreeSet<Producto> productos;
    private DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form ConsultaProductoRubro
     */
    public ConsultaProductoRubro(TreeSet<Producto> productos) {
        initComponents();
        this.productos = productos;
        llenarCombo();
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

        jlERubro = new javax.swing.JLabel();
        jcCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jlERubro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlERubro.setText("Elija Rubro:");

        jcCategorias.setBackground(new java.awt.Color(153, 153, 153));
        jcCategorias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriasActionPerformed(evt);
            }
        });

        jtLista.setBackground(new java.awt.Color(204, 204, 204));
        jtLista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtLista.setForeground(new java.awt.Color(0, 0, 0));
        jtLista.setModel(new javax.swing.table.DefaultTableModel(
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
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtLista.setGridColor(new java.awt.Color(51, 51, 51));
        jtLista.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jtLista.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jtLista);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de Productos por Rubro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jlERubro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlERubro)
                    .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriasActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        Rubro rubro = (Rubro) jcCategorias.getSelectedItem();

        for (Producto prod : productos) {

            if (rubro.equals(prod.getRubro())) {

                Vector renglon = new Vector<>();
                renglon.add(prod.getCodigo());
                renglon.add(prod.getDescripcion());
                renglon.add(prod.getPrecio());
                renglon.add(prod.getStock());

                modelo.addRow(renglon);
            }
        }


    }//GEN-LAST:event_jcCategoriasActionPerformed

    private void llenarCombo() {

        Rubro comestible = new Rubro(1, "Comestible");
        Rubro limpieza = new Rubro(2, "Limpieza");
        Rubro perfumeria = new Rubro(3, "Perfumeria");

        jcCategorias.addItem(comestible);
        jcCategorias.addItem(limpieza);
        jcCategorias.addItem(perfumeria);

    }

    private void armarCabecera() {

        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Rubro");
        jtLista.setModel(modelo);
    }

    private void borrarFilas() {

        int filas = modelo.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {

            modelo.removeRow(f);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Rubro> jcCategorias;
    private javax.swing.JLabel jlERubro;
    private javax.swing.JTable jtLista;
    // End of variables declaration//GEN-END:variables
}
