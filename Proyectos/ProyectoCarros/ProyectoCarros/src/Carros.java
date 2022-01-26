

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Carros extends javax.swing.JFrame {

    ImageIcon Imagen [] = new ImageIcon[8];
    int contador = 1;
    
    public Carros() {
        initComponents();
        this.setTitle("Menu cliente");
        for(int i =1 ; i<7 ; i++){
            Imagen[i] = new ImageIcon (getClass().getResource("/Imagenes/fot"
                    +i+".jpg"));
            jLabel1.setIcon(Imagen[1]);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 77, 450, 300));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Autos disponibles");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 380, 30));

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Anterior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 80, -1));

        jButton4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton4.setText("Características");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 140, 20));

        jButton5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton5.setText("Ingresar datos ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 150, 20));

        jLabel4.setBackground(new java.awt.Color(0, 0, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(contador == 6){
            contador = 0;
        } 
        contador ++;
        jLabel1.setIcon(Imagen[contador]);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(contador == 1){
            contador = 7;
        } 
        contador --;
        jLabel1.setIcon(Imagen[contador]);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int dato = 0;

        do {
            try {
                dato = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.MinniCopper\n"
                        + "2.Ferrari\n"
                        + "3.Camioneta\n"
                        + "4.Van\n"
                        + "5.Tesla\n"
                        + "6.Beetle\n"
                        + "7.Salir\n"
                        + "Elige una opcion...", "Caracteristicas del carro",
                        JOptionPane.QUESTION_MESSAGE));

                switch (dato) {

                    case 1:
                        JOptionPane.showMessageDialog(null, "MINICopper");
                        JOptionPane.showMessageDialog(null, "Cantidad de "
                                + "pasajeros: 4 " + "\nColores: "
                                + "[Rojo-Rosa-Azul-Verde] "
                                + "\nAño: 2015-2019 " + "\nMarca: MINICoper " + 
                              "\nPrecio: [$500,000-$700,000] " , 
                                " Auto deportivo",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Ferrari");
                        JOptionPane.showMessageDialog(null, "Cantidad de"
                                + " pasajeros: 2-4 " + "\nColores:"
                                + "[Rojo-Rosa-Azul-Amarillo] "
                                + "\nAño: 2018-2019 " + "\nMarca: Ferrari " + 
                              "\nPrecio: [$1,4500,000-$1,500,000] " ,
                                " Auto de lujo",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Camioneta");
                        JOptionPane.showMessageDialog(null, "Cantidad de "
                                + "pasajeros: 2-6 " + "\nColores: "
                                + "[Rojo-Negro-Azul-Rojo] "
                                + "\nAño: 2018-2019 " + "\nMarcas: "
                                + "Ford y Chevrolet " + 
                              "\nPrecio: [$500,000-$854,000] "+"\nCantidad de"
                                + " carga: [400-700] kg" , " Camioneta",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Van");
                        JOptionPane.showMessageDialog(null, "Cantidad de "
                                + "pasajeros: 6-8 " + "\nColores: "
                                + "[Rojo-Gris-Azul-Blanco] "
                                + "\nAño: 2016-2019 " + "\nMarca: Volkswagen " + 
                              "\nPrecio: [$350,000-$400,000]" , " Vagoneta",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Tesla");
                        JOptionPane.showMessageDialog(null, "Cantidad de "
                                + "pasajeros: 2-4 " +
                                "\nColores: [Rojo-Verde-Azul metalico-Blanco] "
                                + "\nAño: 2018-2019 " + "\nMarca: Tesla " + 
                              "\nPrecio: [$750,000-$800,000]" , " Auto compacto",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Beetle");
                        JOptionPane.showMessageDialog(null, "Cantidad"
                                + " de pasajeros: 2-4 " +
                                "\nColores:[Rojo-Verde-Rosa metalico-Turquesa] "
                                + "\nAño: 2015-2019 " + "\nMarca: Volkswagen " + 
                              "\nPrecio:[$500,000-$800,000]" , " Auto deportivo",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion"
                                + " finalizada", "Fin",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,
                                "No se encuentra el numero");
                        break;
                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (dato != 7);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        JOptionPane.showMessageDialog(null,"Has salido del programa");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        VentanaTabla obj=new VentanaTabla();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.
                    UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Carros.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carros.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carros.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carros.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
