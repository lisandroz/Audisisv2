/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.ABMUsuario;

/**
 *
 * @author Nico
 */
public class FrmRegistrarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmRegistrarUsuario
     */
    public FrmRegistrarUsuario() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setTitle("Usuario");
        setMinimumSize(new java.awt.Dimension(70, 34));
        setNormalBounds(new java.awt.Rectangle(0, 0, 70, 0));
        setPreferredSize(new java.awt.Dimension(54, 34));
        getContentPane().setLayout(null);

        jTabbedPane1.setToolTipText("Datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Datos", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 12, 622, 280);
        jTabbedPane1.getAccessibleContext().setAccessibleName("Datos");

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 310, 73, 23);

        jButton2.setText("jButton2");
        getContentPane().add(jButton2);
        jButton2.setBounds(540, 310, 73, 23);

        setBounds(0, 0, 658, 378);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
