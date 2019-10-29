/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Querys;
import Clases.Sesion;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class VtnGSPrincipal extends javax.swing.JFrame
{

    int xy, xx;
    ArrayList<Object> columnaMap1 = new ArrayList();
    Querys q;

    /**
     * Creates new form VtnAPrincipal
     */
    public VtnGSPrincipal()
    {
        initComponents();
//        this.setExtendedState(MAXIMIZED_BOTH);
        jLNombreAdmin.setText(Sesion.datosUsuario.get(2) + " " +
                Sesion.datosUsuario.get(3) + " " + Sesion.datosUsuario.get(4));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPTop = new javax.swing.JPanel();
        jLNombreAdmin = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLAdministrador = new javax.swing.JLabel();
        jIconoAdmin = new javax.swing.JLabel();
        jLBienvenido = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPTop.setBackground(new java.awt.Color(139, 157, 195));
        jPTop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                jPTopMouseDragged(evt);
            }
        });
        jPTop.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPTopMousePressed(evt);
            }
        });
        jPTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLNombreAdmin.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLNombreAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jPTop.add(jLNombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 120, 320, 16));

        exit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                exitMousePressed(evt);
            }
        });
        jPTop.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 23, 32, 16));

        jLAdministrador.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLAdministrador.setText("Gerente Sucursal Secundaria");
        jPTop.add(jLAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jIconoAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jIconoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/icons8-agregar-administrador-80 (1).png"))); // NOI18N
        jPTop.add(jIconoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 56, 80, 80));

        jLBienvenido.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jLBienvenido.setText("Bienvenido:");
        jPTop.add(jLBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 120, 144, 16));

        exit1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setText("_");
        exit1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                exit1MousePressed(evt);
            }
        });
        jPTop.add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 16, 32, -1));

        getContentPane().add(jPTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -8, 952, 248));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 952, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 952, 512));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_exitMousePressed
    {//GEN-HEADEREND:event_exitMousePressed
        // TODO add your handling code here:
        new VtnHome().setVisible(true);
        Sesion.datosUsuario = null;
        this.dispose();
    }//GEN-LAST:event_exitMousePressed

    private void jPTopMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPTopMouseDragged
    {//GEN-HEADEREND:event_jPTopMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPTopMouseDragged

    private void jPTopMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPTopMousePressed
    {//GEN-HEADEREND:event_jPTopMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPTopMousePressed

    private void exit1MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_exit1MousePressed
    {//GEN-HEADEREND:event_exit1MousePressed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_exit1MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnGSPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnGSPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnGSPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnGSPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnGSPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel jIconoAdmin;
    private javax.swing.JLabel jLAdministrador;
    private javax.swing.JLabel jLBienvenido;
    private javax.swing.JLabel jLNombreAdmin;
    private javax.swing.JPanel jPTop;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
