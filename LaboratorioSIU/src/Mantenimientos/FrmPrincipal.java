/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

/**
 *
 * @author diego
 */

public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    private FrmAlumnos nuevaVentana1;
    public FrmPrincipal() {
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

        DP_Workbench = new javax.swing.JDesktopPane();
        MB_Menu = new javax.swing.JMenuBar();
        M_Mantenimientos = new javax.swing.JMenu();
        MI_Alumnos = new javax.swing.JMenuItem();
        MI_Maestros = new javax.swing.JMenuItem();
        MI_Facultad = new javax.swing.JMenuItem();
        MI_Secciones = new javax.swing.JMenuItem();
        MI_Carreras = new javax.swing.JMenuItem();
        MI_Cursos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DP_WorkbenchLayout = new javax.swing.GroupLayout(DP_Workbench);
        DP_Workbench.setLayout(DP_WorkbenchLayout);
        DP_WorkbenchLayout.setHorizontalGroup(
            DP_WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        DP_WorkbenchLayout.setVerticalGroup(
            DP_WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        M_Mantenimientos.setText("Mantenimientos");

        MI_Alumnos.setText("Alumnos");
        MI_Alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_AlumnosActionPerformed(evt);
            }
        });
        M_Mantenimientos.add(MI_Alumnos);

        MI_Maestros.setText("Maestros");
        M_Mantenimientos.add(MI_Maestros);

        MI_Facultad.setText("Facultad");
        M_Mantenimientos.add(MI_Facultad);

        MI_Secciones.setText("Secciones");
        M_Mantenimientos.add(MI_Secciones);

        MI_Carreras.setText("Carreras");
        M_Mantenimientos.add(MI_Carreras);

        MI_Cursos.setText("Cursos");
        M_Mantenimientos.add(MI_Cursos);

        MB_Menu.add(M_Mantenimientos);

        setJMenuBar(MB_Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DP_Workbench)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DP_Workbench)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MI_AlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_AlumnosActionPerformed
        // TODO add your handling code here:
           nuevaVentana1 = new FrmAlumnos();
           DP_Workbench.add (nuevaVentana1);
    }//GEN-LAST:event_MI_AlumnosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DP_Workbench;
    private javax.swing.JMenuBar MB_Menu;
    private javax.swing.JMenuItem MI_Alumnos;
    private javax.swing.JMenuItem MI_Carreras;
    private javax.swing.JMenuItem MI_Cursos;
    private javax.swing.JMenuItem MI_Facultad;
    private javax.swing.JMenuItem MI_Maestros;
    private javax.swing.JMenuItem MI_Secciones;
    private javax.swing.JMenu M_Mantenimientos;
    // End of variables declaration//GEN-END:variables
}
