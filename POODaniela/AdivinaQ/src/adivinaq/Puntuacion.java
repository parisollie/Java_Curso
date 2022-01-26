/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaq;

import static adivinaq.MENU_3.dificultad;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author IlseDaniela
 */
public class Puntuacion extends javax.swing.JFrame {
double Puntos,JuegosG,JuegosP,JuegosJ;
String jj,jg,p,pp,ppp;
int PER,Pun;
    /**
     * Creates new form Puntuacion
     */
    public Puntuacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        int j= MENU_3. dificultad;
        int l= Menu .libre;
        
        
        String varClave = IniciarC.usuario_adivina[0];
        jg=IniciarC.usuario_adivina[4];
        jj=IniciarC.usuario_adivina[7];
        p=IniciarC.usuario_adivina[6];
        if(j==1){
            PER=JUEGO.personaje;
            Pun = JUEGO.puntos;
        }
        else
            PER=Juego1.personaje;
            Pun=Juego1.puntos;
        
        switch (PER){
            case 1:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.1.png")));
              break;
               case 2:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.10.png")));
              break;
               case 3:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.11.png")));
              break;
               case 4:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.3.png")));
              break;
               case 5:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.4.png")));
              break;
               case 6:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.9.png")));
              break;
               case 7:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.16.png")));
              break;
               case 8:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/2.1.png")));
              break;
               case 9:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.14.png")));
              break;
               case 10:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.13.png")));
              break;
               case 11:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.6.png")));
              break;
               case 12:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.15.png")));
              break;
             case 13:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.12.png")));
              break;
             case 14:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.19.png")));
              break;
              case 15:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.5.png")));
              break;
              case 16:
                icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.7.png")));
              break;
              
        }
        
        
        System.out.println("l= "+l);
        if(l==0){
            switch (j){
                case 1:
                    pp=String.valueOf(Pun);
                    puntuacion.setText("Puntuacion: "+pp);
                    nombre1.setText(varClave);
            try{
                File f=new File ("Registro.txt");
                FileReader fr=new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                
                
                StringBuffer strbf = new StringBuffer();
                
                if (f.exists()){
                    String linea;
                    while((linea=br.readLine())!=null){
                        
                        String jugador[]=linea.split(",");

                        if(jugador[0].equals(varClave)){
                        
                            Puntos=Double.parseDouble(p);
                            JuegosG=Double.parseDouble(jg);
                            JuegosJ=Double.parseDouble(jj);
                            Puntos=Puntos + Pun;
                            JuegosG=JuegosG+1;
                            JuegosJ=JuegosJ+1;
                            jj=String.valueOf(JuegosJ);
                            jg=String.valueOf(JuegosG);
                            p=String.valueOf(Puntos);
                            strbf.append(jugador[0]+","+jugador[1]+","+jugador[2]+","+
                                     jugador[3]+","+jg+","+jugador[5]+","+ p+","+jj+"\n");
                        
                        }else{
                        
                        strbf.append(linea+"\n");
                        
                        
                        }
                    }
                    br.close();
                    fr.close();
                    
                    FileWriter fw = new FileWriter(f,false);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw=new PrintWriter(bw);
                pw.println(strbf.toString());
                    bw.close();
                    fw.close();
           
                    
                }
            }
            catch(IOException e){
                System.out.println(e);

            }
                    break;
                case 2:
            pp=String.valueOf(Pun);
            puntuacion.setText("Puntuacion: "+pp);
            nombre1.setText(varClave);
            try{
                File f=new File ("Registro.txt");
                FileReader fr=new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                
                
                StringBuffer strbf = new StringBuffer();
                
                if (f.exists()){
                    String linea;
                    while((linea=br.readLine())!=null){
                        
                        String jugador[]=linea.split(",");

                        if(jugador[0].equals(varClave)){
                        
                            Puntos=Double.parseDouble(p);
                            JuegosG=Double.parseDouble(jg);
                            JuegosJ=Double.parseDouble(jj);
                            Puntos=Puntos + Pun;
                            JuegosG=JuegosG+1;
                            JuegosJ=JuegosJ+1;
                            jj=String.valueOf(JuegosJ);
                            jg=String.valueOf(JuegosG);
                            p=String.valueOf(Puntos);
                            strbf.append(jugador[0]+","+jugador[1]+","+jugador[2]+","+
                                     jugador[3]+","+jg+","+jugador[5]+","+ p+","+jj+"\n");
                        
                        }else{
                        
                        strbf.append(linea+"\n");
                        
                        
                        }
                    }
                    br.close();
                    fr.close();
                    
                    FileWriter fw = new FileWriter(f,false);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw=new PrintWriter(bw);
                pw.println(strbf.toString());
                    bw.close();
                    fw.close();
           
                    
                }
            }
            catch(IOException e){
                System.out.println(e);

            }
                    break;
            }
            
        }
        else{
        nombre1.setText("Invitado");
        ppp=String.valueOf(Pun);
        puntuacion.setText("Puntuacion: "+ppp);
        

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        Menu3 = new javax.swing.JLabel();
        puntuacion = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        Menu2 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        salir.setFont(new java.awt.Font("AR JULIAN", 0, 18)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 102, 102));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/icons8_Multiply_32px.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        Menu3.setFont(new java.awt.Font("AR HERMANN", 0, 36)); // NOI18N
        Menu3.setForeground(new java.awt.Color(204, 51, 255));
        Menu3.setText("¡¡FELICIDADES!!");

        puntuacion.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        puntuacion.setForeground(new java.awt.Color(0, 0, 51));

        nombre1.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        nombre1.setForeground(new java.awt.Color(0, 0, 51));

        Menu2.setFont(new java.awt.Font("AR CHRISTY", 0, 36)); // NOI18N
        Menu2.setForeground(new java.awt.Color(51, 0, 51));
        Menu2.setText("¿?  ADIVINA QUIEN  ¿?");
        Menu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Aparajita", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Personaje");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menu3)
                    .addComponent(Menu2))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Menu3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Menu2 m2=new Menu2();
        m2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Puntuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puntuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puntuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puntuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puntuacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menu2;
    private javax.swing.JLabel Menu3;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel puntuacion;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
