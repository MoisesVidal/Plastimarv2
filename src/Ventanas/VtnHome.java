/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.sql.Connection;
import Clases.ConectarBase;
import Clases.Querys;
import Clases.Sesion;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class VtnHome extends javax.swing.JFrame
{

    int xy, xx;
    static Connection con = null;
    public static int nivel_usaurio = 0;
    public ArrayList<Object> columnaMap1 = new ArrayList();
    Querys q;

    /**
     * Creates new form VtnHome
     */
    public VtnHome()
    {
        initComponents();
        jPPanelOverlay.setBackground(new Color(223, 227, 238, 200));
        jBiniciarSesion.setBackground(new java.awt.Color(139, 157, 195));
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

        jPPanel2 = new javax.swing.JPanel();
        jLUsuario = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLContraseña = new javax.swing.JLabel();
        jPFContraseña = new javax.swing.JPasswordField();
        jBiniciarSesion = new javax.swing.JButton();
        jLUsuario1 = new javax.swing.JLabel();
        exit2 = new javax.swing.JLabel();
        exit3 = new javax.swing.JLabel();
        jPPanelOverlay = new javax.swing.JPanel();
        jLLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 500));
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLUsuario.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLUsuario.setForeground(new java.awt.Color(59, 89, 152));
        jLUsuario.setText("Usuario: ");
        jPPanel2.add(jLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 168, -1, -1));

        jTFUsuario.setBorder(null);
        jTFUsuario.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jTFUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jTFUsuarioKeyTyped(evt);
            }
        });
        jPPanel2.add(jTFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 192, 300, -1));

        jSeparator1.setBackground(new java.awt.Color(223, 227, 238));
        jSeparator1.setForeground(new java.awt.Color(223, 227, 238));
        jPPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 216, 300, 10));

        jSeparator2.setBackground(new java.awt.Color(223, 227, 238));
        jSeparator2.setForeground(new java.awt.Color(223, 227, 238));
        jPPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 300, 10));

        jLContraseña.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLContraseña.setForeground(new java.awt.Color(59, 89, 152));
        jLContraseña.setText("Contraseña: ");
        jPPanel2.add(jLContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 232, -1, -1));

        jPFContraseña.setBorder(null);
        jPFContraseña.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jPFContraseñaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                jPFContraseñaKeyTyped(evt);
            }
        });
        jPPanel2.add(jPFContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 256, 300, 19));

        jBiniciarSesion.setBackground(new java.awt.Color(102, 102, 255));
        jBiniciarSesion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jBiniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jBiniciarSesion.setText("Iniciar sesion");
        jBiniciarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 157, 195)));
        jBiniciarSesion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBiniciarSesionActionPerformed(evt);
            }
        });
        jBiniciarSesion.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                jBiniciarSesionKeyPressed(evt);
            }
        });
        jPPanel2.add(jBiniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 304, 300, 35));

        jLUsuario1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLUsuario1.setForeground(new java.awt.Color(59, 89, 152));
        jLUsuario1.setText("Iniciar sesion");
        jPPanel2.add(jLUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 112, -1, -1));

        exit2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        exit2.setForeground(new java.awt.Color(139, 157, 195));
        exit2.setText("_");
        exit2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                exit2MousePressed(evt);
            }
        });
        jPPanel2.add(exit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 8, 32, -1));

        exit3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit3.setForeground(new java.awt.Color(139, 157, 195));
        exit3.setText("X");
        exit3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                exit3MousePressed(evt);
            }
        });
        jPPanel2.add(exit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 16, 32, 16));

        getContentPane().add(jPPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 464, 504));

        jPPanelOverlay.setBackground(new java.awt.Color(0, 0, 0));
        jPPanelOverlay.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                jPPanelOverlayMouseDragged(evt);
            }
        });
        jPPanelOverlay.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPPanelOverlayMousePressed(evt);
            }
        });
        jPPanelOverlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/log12.png"))); // NOI18N
        jPPanelOverlay.add(jLLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 176, 248, 144));

        getContentPane().add(jPPanelOverlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -4, 448, 504));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/botellas.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 504));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        con = ConectarBase.conectaBD();
    }//GEN-LAST:event_formWindowOpened

    private void jBiniciarSesionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBiniciarSesionActionPerformed
    {//GEN-HEADEREND:event_jBiniciarSesionActionPerformed
        login();
    }//GEN-LAST:event_jBiniciarSesionActionPerformed

    private void jTFUsuarioKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFUsuarioKeyPressed
    {//GEN-HEADEREND:event_jTFUsuarioKeyPressed
        Validaciones.enter(this, evt, jPFContraseña);
    }//GEN-LAST:event_jTFUsuarioKeyPressed

    private void jTFUsuarioKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTFUsuarioKeyTyped
    {//GEN-HEADEREND:event_jTFUsuarioKeyTyped

    }//GEN-LAST:event_jTFUsuarioKeyTyped

    private void jPFContraseñaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jPFContraseñaKeyPressed
    {//GEN-HEADEREND:event_jPFContraseñaKeyPressed
        Validaciones.enter(this, evt, jBiniciarSesion);
    }//GEN-LAST:event_jPFContraseñaKeyPressed

    private void jPFContraseñaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jPFContraseñaKeyTyped
    {//GEN-HEADEREND:event_jPFContraseñaKeyTyped
        Validaciones.validaAlfanumerico(evt);
    }//GEN-LAST:event_jPFContraseñaKeyTyped

    private void jBiniciarSesionKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jBiniciarSesionKeyPressed
    {//GEN-HEADEREND:event_jBiniciarSesionKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            jBiniciarSesionActionPerformed(null);
        }
    }//GEN-LAST:event_jBiniciarSesionKeyPressed

    private void exit2MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_exit2MousePressed
    {//GEN-HEADEREND:event_exit2MousePressed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_exit2MousePressed

    private void exit3MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_exit3MousePressed
    {//GEN-HEADEREND:event_exit3MousePressed
        this.dispose();
    }//GEN-LAST:event_exit3MousePressed

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed
        ConectarBase.desconectaBD(con);
    }//GEN-LAST:event_formWindowClosed

    private void jPPanelOverlayMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPPanelOverlayMousePressed
    {//GEN-HEADEREND:event_jPPanelOverlayMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPPanelOverlayMousePressed

    private void jPPanelOverlayMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPPanelOverlayMouseDragged
    {//GEN-HEADEREND:event_jPPanelOverlayMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPPanelOverlayMouseDragged

    void login()
    {
        q = new Querys();
        try
        {
            columnaMap1 = q.Seleccion(con, "*", "empleados", "correo='" + jTFUsuario.getText() + "'", true);

        } catch (Exception e)
        {
            System.out.println("Error: exception ->" + e);
        }

        //Verifica el correo y contraseña
        if (columnaMap1.isEmpty())
        {
            Mensaje.error(this, "El correo ingresado no existe\nCapture un correo valido");
            CtrlInterfaz.selecciona(jTFUsuario);
        } else
        {
            if (columnaMap1.get(11).equals(jPFContraseña.getText()))
            {
                System.out.println("Password correcto");

                if (columnaMap1.get(9).equals("1"))
                {
                    Sesion.datosUsuario = columnaMap1;
                    new VtnAPrincipal().setVisible(true);
                    this.dispose();
                }
                if (columnaMap1.get(9).equals("2"))
                {
                    Sesion.datosUsuario = columnaMap1;
                    new VtnGPPrincipal().setVisible(true);
                    this.dispose();
                }
                if (columnaMap1.get(9).equals("3"))
                {
                    Sesion.datosUsuario = columnaMap1;
                    new VtnGSPrincipal().setVisible(true);
                    this.dispose();
                }
                if (columnaMap1.get(9).equals("4"))
                {
                    Sesion.datosUsuario = columnaMap1;
                    new VtnEPrincipal().setVisible(true);
                    this.dispose();
                }
            } else
            {
                Mensaje.error(this, "La contraseña ingresada es erronea\nCapture una contraseña valida");
                CtrlInterfaz.selecciona(jPFContraseña);
            }
        }

        //Compara tipo de usuario
    }

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
                if ("GTK".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit2;
    private javax.swing.JLabel exit3;
    private javax.swing.JButton jBiniciarSesion;
    private javax.swing.JLabel jLContraseña;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLUsuario1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPasswordField jPFContraseña;
    private javax.swing.JPanel jPPanel2;
    private javax.swing.JPanel jPPanelOverlay;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}