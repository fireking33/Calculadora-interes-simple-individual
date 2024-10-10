
package forms;

import javax.swing.JOptionPane;

/**
 * La clase Inicio representa una ventana de inicio de sesión en una aplicación gráfica.
 * Esta clase extiende {@code JFrame} para proporcionar una interfaz de usuario donde los usuarios
 * pueden ingresar sus credenciales para acceder a la aplicación o registrarse.
 * Contiene campos de texto para el nombre de usuario y la contraseña, así como botones para iniciar sesión,
 * registrarse y salir de la aplicación.
 
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Crea una nueva instancia de la clase {@code Inicio}.
     * Inicializa los componentes de la interfaz gráfica de usuario.
     */
    public Inicio() {
        initComponents();
    }

    /**
     * Este método es llamado desde el constructor para inicializar el formulario.
     * <p>
     * ADVERTENCIA: No modifiques este código. El contenido de este método es regenerado 
     * siempre por el editor de formularios.
     * </p>
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("INICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        jLabel1.setText("USUARIO");

        jLabel2.setText("CONTRASEÑA");

        jButton3.setText("REGISTRAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Maneja el evento de acción del botón de iniciar sesión.
     * Valida las credenciales del usuario y, si son correctas,
     * abre la ventana de selección; de lo contrario, muestra un mensaje de error.
     *
     * @param evt el evento de acción generado por el botón
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String user = txtUsuario.getText();
    String pwd = new String(txtContraseña.getPassword()); // Usar getPassword para obtener la contraseña
        boolean autenticado = false;
    if (user.equals("ricardofermin")&& pwd.equals("12345")){
        Seleccion acceso = new Seleccion();
        acceso.setVisible(true);
        this.setVisible(false);
        }else{
        JOptionPane.showMessageDialog(null,"usuario o contraseña es incorrecto");
    }
    }//GEN-LAST:event_jButton1ActionPerformed
 /**
     * Maneja el evento de acción del botón de salir.
     * Cierra la aplicación.
     *
     * @param evt el evento de acción generado por el botón
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
/**
     * Maneja el evento de acción del botón de registrarse.
     * Abre la ventana de registro.
     *
     * @param evt el evento de acción generado por el botón
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Registrar acceso;
        acceso = new Registrar();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
/**
     * Maneja el evento de acción cuando se presiona la tecla Enter
     * en el campo de contraseña.
     *
     * @param evt el evento de acción generado por el campo de contraseña
     */
    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        
    }//GEN-LAST:event_txtContraseñaActionPerformed

    /**
     * El punto de entrada de la aplicación.
     *
     * @param args los argumentos de línea de comandos
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crear y desplegar el form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
