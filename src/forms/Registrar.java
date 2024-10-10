
package forms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * La clase Registrar representa una ventana para el registro de nuevos usuarios en una aplicación gráfica.
 * Esta clase extiende {@code JFrame} y permite a los usuarios ingresar un nombre de usuario y contraseña,
 * y confirmar la contraseña. Si las contraseñas coinciden, el usuario se registra y sus datos se almacenan
 * en un archivo de texto.
 */
public class Registrar extends javax.swing.JFrame {

   /**
     * Crea una nueva instancia de la clase {@code Registrar}.
     * Inicializa los componentes de la interfaz gráfica de usuario.
     */
    public Registrar() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        agregarusuario = new javax.swing.JTextField();
        agregarcontraseña = new javax.swing.JPasswordField();
        confirmarcontraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        jLabel3.setText("Confirmar contraseña");

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregarusuario)
                    .addComponent(agregarcontraseña)
                    .addComponent(confirmarcontraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(agregarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(agregarcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(confirmarcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Maneja el evento de acción del botón "ACEPTAR".
     * Valida los campos de entrada y, si son válidos, guarda el nuevo usuario en un archivo.
     *
     * @param evt el evento de acción generado por el botón
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //leer los valores de Usuario y Contraseña
        String usuario = agregarusuario.getText();
        String contraseña = agregarcontraseña.getText(); 
        String confcontraseña = confirmarcontraseña.getText();
    //verificar si Usuario o Contraseña son incorrectos
        if (usuario.isEmpty()|| contraseña.isEmpty()|| confcontraseña.isEmpty()){
            JOptionPane.showMessageDialog(this,"rellene todos los campos");
               return;
        }
    //verificar si las contraseñas coinciden si es haci guardar en un txt        
        if (!contraseña.equals(confcontraseña)){
                JOptionPane.showMessageDialog(this,"las contraseñas no coinciden");
        }else{
            try{
                FileWriter escribir = new FileWriter("usuarios.txt", true);
                try (BufferedWriter buffer = new BufferedWriter(escribir)) {
                    buffer.write(usuario + " : " + contraseña );
                    buffer.newLine();
                }
                JOptionPane.showMessageDialog(this,"usuario registrado con exito");
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(this, "error al guardar usuario");
            }
            this.dispose();
        
         }      
            
    }//GEN-LAST:event_jButton1ActionPerformed
 /**
     * Maneja el evento de acción del botón "CANCELAR".
     * Cierra la ventana de registro y regresa a la ventana de inicio.
     *
     * @param evt el evento de acción generado por el botón
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Inicio acceso = new Inicio();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

   /**
     * El punto de entrada de la aplicación.
     *
     * @param args los argumentos de línea de comandos
     */
    public static void main(String args[]) {
      /* Configura el look and feel Nimbus */
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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crea y muestra la ventana */
        java.awt.EventQueue.invokeLater(() -> {
            new Registrar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField agregarcontraseña;
    private javax.swing.JTextField agregarusuario;
    private javax.swing.JPasswordField confirmarcontraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
