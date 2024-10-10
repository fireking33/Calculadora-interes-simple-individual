
package forms;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


/**
 * La clase Seleccion representa una ventana de selección en una aplicación gráfica.
 * Permite a los usuarios elegir entre dos opciones: acceder a una calculadora o ver un historial
 * que se abre como un documento de texto.
 */
public class Seleccion extends javax.swing.JFrame {

   /**
     * Crea una nueva instancia de la clase {@code Seleccion}.
     * Inicializa los componentes de la interfaz gráfica de usuario.
     */
    public Seleccion() {
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("SELECCION");

        jButton1.setText("INTERES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("HISTORIAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /**
     * Maneja el evento de acción del botón "INTERES".
     * Abre la ventana de la calculadora.
     *
     * @param evt el evento de acción generado por el botón
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Calculadora acceso = new Calculadora();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
/**
     * Maneja el evento de acción del botón "HISTORIAL".
     * Abre el documento de texto que contiene el historial.
     *
     * @param evt el evento de acción generado por el botón
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        abrirDocumento();
    }//GEN-LAST:event_jButton2ActionPerformed
 /**
     * Abre el documento de texto "resultado.txt" utilizando la aplicación predeterminada del sistema.
     * Si el archivo no existe, imprime un mensaje en la consola.
     */
    private void abrirDocumento() {
        try {
            File documento = new File("resultado.txt"); // Cambia esto a la ruta correcta de tu archivo
            if (documento.exists()) {
                Desktop.getDesktop().open(documento);
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException ex) {
            ex.printStackTrace(); // Agregar manejo de excepciones
        }
        }
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
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      /* Crea y muestra la ventana */
        java.awt.EventQueue.invokeLater(() -> {
            new Seleccion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
