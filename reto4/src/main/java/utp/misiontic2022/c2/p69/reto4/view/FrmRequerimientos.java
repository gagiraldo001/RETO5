/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p69.reto4.view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utp.misiontic2022.c2.p69.reto4.controller.ControllerRequerimientos;
import utp.misiontic2022.c2.p69.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.p69.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.p69.reto4.model.vo.Requerimiento_3;

/**
 *
 * @author PC
 */
public class FrmRequerimientos extends javax.swing.JFrame {

    /**
     * Creates new form FrmRequerimientos
     */
    public FrmRequerimientos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRequerimiento1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();
        btnRequerimiento2 = new javax.swing.JButton();
        btnRequerimiento3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRequerimiento1.setBackground(new java.awt.Color(51, 51, 255));
        btnRequerimiento1.setText("Requerimiento 1");
        btnRequerimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento1ActionPerformed(evt);
            }
        });

        miTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(miTabla);

        btnRequerimiento2.setText("Requerimiento 2");
        btnRequerimiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento2ActionPerformed(evt);
            }
        });

        btnRequerimiento3.setText("Requerimiento 3");
        btnRequerimiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento3ActionPerformed(evt);
            }
        });

        jLabel1.setText("RETO N??MERO 5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRequerimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRequerimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRequerimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRequerimiento1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnRequerimiento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRequerimiento3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequerimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento1ActionPerformed
        // TODO add your handling code here:
        // JOptionPane.showMessageDialog(this, "Ventana", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        String[] columnNombre = {"Fecha", "Id C??digo", "Nombre de Proveedor", "Pagado"};
        ControllerRequerimientos controlador = new ControllerRequerimientos();
        
        ArrayList<Requerimiento_1> listaR;
        
        try {
            listaR = controlador.consultarRequerimiento1();
            
            Object[][] datos = new Object[listaR.size()][4];
            
            int index = 0;
            for (Requerimiento_1 r: listaR){
                datos[index][0] = r.getFechaCompra();
                datos[index][1] = r.getCodCompra();
                datos[index][2] = r.getNombreProveedor();
                datos[index][3] = r.getPagado();
                index++;
            }
            
            DefaultTableModel model = new DefaultTableModel(datos, columnNombre);
            
            miTabla.setModel(model);
            
        } catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnRequerimiento1ActionPerformed

    private void btnRequerimiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento2ActionPerformed
        // TODO add your handling code here:
        String[] columnNombre = {"Fecha Inicio", "Ciudad", "Nombre de Constructora", "Lider", "Codigo Tipo", "Estrato"};
        ControllerRequerimientos controlador = new ControllerRequerimientos();
        
        ArrayList<Requerimiento_2> listaR;
        
        try {
            listaR = controlador.consultarRequerimiento2();
            
            Object[][] datos = new Object[listaR.size()][6];
            
            int index = 0;
            for (Requerimiento_2 r: listaR){
                datos[index][0] = r.getFechaInicio();
                datos[index][1] = r.getCiudad();
                datos[index][2] = r.getConstructora();
                datos[index][3] = r.getNombreLider();
                datos[index][4] = r.getCodigoTipo();
                datos[index][5] = r.getEstrato();
                index++;
            }
            
            DefaultTableModel model = new DefaultTableModel(datos, columnNombre);
            
            miTabla.setModel(model);
            
        } catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnRequerimiento2ActionPerformed

    private void btnRequerimiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento3ActionPerformed
        // TODO add your handling code here:
        String[] columnNombre = {"Nombre Abreviado"};
        ControllerRequerimientos controlador = new ControllerRequerimientos();
        
        ArrayList<Requerimiento_3> listaR;
        
        try {
            listaR = controlador.consultarRequerimiento3();
            
            Object[][] datos = new Object[listaR.size()][1];
            
            int index = 0;
            for (Requerimiento_3 r: listaR){
                datos[index][0] = r.getNombreAbreviado();
                index++;
            }
            
            DefaultTableModel model = new DefaultTableModel(datos, columnNombre);
            
            miTabla.setModel(model);
            
        } catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnRequerimiento3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRequerimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequerimiento1;
    private javax.swing.JButton btnRequerimiento2;
    private javax.swing.JButton btnRequerimiento3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable miTabla;
    // End of variables declaration//GEN-END:variables
}
