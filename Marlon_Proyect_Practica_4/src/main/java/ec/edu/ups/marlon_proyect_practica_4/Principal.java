/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.ups.marlon_proyect_practica_4;

import ec.edu.ups.marlon_proyect_practica_4.controlador.ControladorBiblioteca;
import ec.edu.ups.marlon_proyect_practica_4.controlador.ControladorLibro;
import ec.edu.ups.marlon_proyect_practica_4.controlador.ControladorPrestamo;
import ec.edu.ups.marlon_proyect_practica_4.controlador.ControladorUsuario;
import ec.edu.ups.marlon_proyect_practica_4.modelo.Biblioteca;
import ec.edu.ups.marlon_proyect_practica_4.vista.Agregar_Libro;
import ec.edu.ups.marlon_proyect_practica_4.vista.Buscar_libro;
import ec.edu.ups.marlon_proyect_practica_4.vista.Crear_Usuario;
import ec.edu.ups.marlon_proyect_practica_4.vista.Devolver_Libro;
import ec.edu.ups.marlon_proyect_practica_4.vista.Prestar_Libro;

/**
 *
 * @author davidvargas
 */
public class Principal extends javax.swing.JFrame {
    //Controlador
    private ControladorBiblioteca controloadroBiblioteca;
    private ControladorLibro controladorLibro;
    private ControladorUsuario controladorUsuario;
    private ControladorPrestamo controladorPrestamo;
    
    // Ventanas
    private Crear_Usuario ventanaCrearUsuario;
    private Agregar_Libro agregar_Libro;
    private Buscar_libro buscar_libro;
    private Devolver_Libro devolver_libro;
    private Prestar_Libro prestar_Libro;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        String nombreBiblioteca = "Nombre de la biblioteca";
        String direccionBiblioteca = "Dirección de la biblioteca";
        Biblioteca biblioteca = new Biblioteca(nombreBiblioteca, direccionBiblioteca);
        
        controladorUsuario = new ControladorUsuario(biblioteca);
        controloadroBiblioteca = new ControladorBiblioteca(biblioteca);
        controladorPrestamo = new ControladorPrestamo();
        controladorLibro = new ControladorLibro(controladorUsuario); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        btnCrearUsuario = new javax.swing.JButton();
        btnAgregarLibro = new javax.swing.JButton();
        btnBuscarLibro = new javax.swing.JButton();
        btnPrestarLibros = new javax.swing.JButton();
        btnDevolverLibro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 13), new java.awt.Color(204, 204, 255))); // NOI18N
        desktopPane.setForeground(new java.awt.Color(0, 0, 0));

        btnCrearUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });
        desktopPane.add(btnCrearUsuario);
        btnCrearUsuario.setBounds(50, 50, 150, 56);

        btnAgregarLibro.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgregarLibro.setText("Agregar Libros");
        btnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibroActionPerformed(evt);
            }
        });
        desktopPane.add(btnAgregarLibro);
        btnAgregarLibro.setBounds(50, 120, 150, 56);

        btnBuscarLibro.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnBuscarLibro.setText("Buscar Libros");
        btnBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroActionPerformed(evt);
            }
        });
        desktopPane.add(btnBuscarLibro);
        btnBuscarLibro.setBounds(220, 50, 150, 56);

        btnPrestarLibros.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnPrestarLibros.setText("Prestar Libros");
        btnPrestarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarLibrosActionPerformed(evt);
            }
        });
        desktopPane.add(btnPrestarLibros);
        btnPrestarLibros.setBounds(220, 120, 150, 56);

        btnDevolverLibro.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnDevolverLibro.setText("Devolver Libro");
        btnDevolverLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverLibroActionPerformed(evt);
            }
        });
        desktopPane.add(btnDevolverLibro);
        btnDevolverLibro.setBounds(390, 80, 151, 56);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        mostrarBotones(false); // Oculta los botones
        if (ventanaCrearUsuario == null) {
            ventanaCrearUsuario = new Crear_Usuario(controladorUsuario);
            desktopPane.add(ventanaCrearUsuario);
        }
        ventanaCrearUsuario.setVisible(true);
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibroActionPerformed
        mostrarBotones(false);
        if (agregar_Libro == null) {
            agregar_Libro = new Agregar_Libro(controladorUsuario, controladorLibro);
            desktopPane.add(agregar_Libro);
        }
        agregar_Libro.setVisible(true);
    }//GEN-LAST:event_btnAgregarLibroActionPerformed

    private void btnBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroActionPerformed
        mostrarBotones(false);
        if (buscar_libro == null) {
            buscar_libro = new Buscar_libro(controladorLibro);
            desktopPane.add(buscar_libro);
        }
        buscar_libro.setVisible(true);
    }//GEN-LAST:event_btnBuscarLibroActionPerformed

    private void btnPrestarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarLibrosActionPerformed
        mostrarBotones(false);
        if (prestar_Libro == null) {
            prestar_Libro = new Prestar_Libro(controladorUsuario, controladorLibro);
            desktopPane.add(prestar_Libro);
        }
        prestar_Libro.setVisible(true);
    }//GEN-LAST:event_btnPrestarLibrosActionPerformed

    private void btnDevolverLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverLibroActionPerformed
        mostrarBotones(false);
        if (devolver_libro == null){
            devolver_libro = new Devolver_Libro(controladorUsuario, controladorLibro);
            desktopPane.add(devolver_libro);
        }
        devolver_libro.setVisible(true);
    }//GEN-LAST:event_btnDevolverLibroActionPerformed

    public void mostrarBotones(boolean mostrar) {
        btnCrearUsuario.setVisible(mostrar);
        btnAgregarLibro.setVisible(mostrar);
        btnBuscarLibro.setVisible(mostrar);
        btnPrestarLibros.setVisible(mostrar);
        btnDevolverLibro.setVisible(mostrar);
    }
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLibro;
    private javax.swing.JButton btnBuscarLibro;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnDevolverLibro;
    private javax.swing.JButton btnPrestarLibros;
    private javax.swing.JDesktopPane desktopPane;
    // End of variables declaration//GEN-END:variables
}
