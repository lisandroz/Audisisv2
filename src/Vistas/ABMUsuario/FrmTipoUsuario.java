/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.ABMUsuario;

import Vistas.General.CellEditor;
import Vistas.General.CellRender;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nico
 */
public class FrmTipoUsuario extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form FrmTipoUsuario
     */
    public FrmTipoUsuario() {
        initComponents();
        this.setSize(525, 335);        
        //jTable1.setModel(modelo);
//        modelo.addColumn("Selec");
//        modelo.addColumn("Nombre");
        modelo.setDataVector(new Object[][] {
        { "Archivo->Tipo Usuario", false },
        { "Profesional->Alta Profesional", false },
        { "Pacientes->Pacientes", true },
        { "Profesionales->Profesionales", true },
        { "Herramientas->Config. Parametros", false }
         }, 
        new Object[] { "Menu", "Habilitado" });
        jTable1.setModel(modelo);
        //se crea el JCheckBox en la columna indicada en getColum(cuenta desde 0)
        jTable1.getColumnModel().getColumn(1).setCellEditor( new CellEditor() );
        jTable1.getColumnModel().getColumn(1).setCellRenderer(new CellRender() );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Tipos de Usuarios");
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 60, 340, 220);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Nuevo");
        jButton1.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel1.add(jButton1);

        jButton2.setText("Editar");
        jButton2.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setText("Eliminar");
        jButton3.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(380, 20, 110, 100);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Gerente", "Profesional", "Secretaría" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(110, 20, 250, 20);

        jLabel1.setText("Tipo de Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 80, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
