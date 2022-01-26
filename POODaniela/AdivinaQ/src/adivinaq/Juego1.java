/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaq;

import static javafx.scene.input.KeyCode.P;
import javax.swing.ImageIcon;
import java.util.Random;

/**
 *
 * @author IlseDaniela
 */

public class Juego1 extends javax.swing.JFrame {
int turno=0, pregunta=1,SI,NO,al=0,m=0,n=1,pi,x=1;
int vector[]=new int [16];
int vectorU[]=new int [16];
static int personaje,personajec,puntos,puntosc;
String puntaje, puntajec;
    /**
     * Creates new form Juego1
     */
    public Juego1() {
        
                initComponents();
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
    }

    public void JuegoC(){

        switch(personajec){
            case 1:
                switch (pregunta){
                    case 1:
                        PreguntasC.setText("Tiene Cabello Negro?");
                        break;
                     case 2:
                         PreguntasC.setText("Tiene ojos cafes?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene ojos azules?");
                        break;
                     case 4:
                          PreguntasC.setText("Tiene accesorios?");
                        
                        break;
                }
                
               break;
            case 2:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene Piel de Color?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene barba?");
                        break;
                     case 3:

                         PreguntasC.setText("Tiene Cabello Cafe?");

                        break;
                     case 4:
                        PreguntasC.setText("Tiene ojos cafes?");
                        break;
                }
              
            break;
            case 3:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene ojos cafes?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene barba?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene barba cafe?");
                        break;
                     case 4:
                         PreguntasC.setText("No Tiene Cabello?");
                        break;
                }
                
             break;
            case 4:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene ojos cafes?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene accesorios?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene barba?");
                        break;
                     case 4:
                         PreguntasC.setText("Tiene Cabello Cafe?");
                        break;
                }

            break;
            case 5:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene accesorios?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene ojos azules?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene cabello rizado?");
                        break;
                     case 4:
                         PreguntasC.setText("Tiene Cabello Rubio?");
                        break;
                }
                
            break;
            case 6:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene ojos cafes?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene barba?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene cabello cafe?");
                        break;
                     case 4:
                         PreguntasC.setText("Tiene piel de color?");
                        break;
                }
                     
            break;
            case 7:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene accesorios?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene ojos cafe?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene Barba?");
                        break;
                     case 4:
                         PreguntasC.setText("Tiene Cabello Negro?");
                        break;
                }
                  
            break;
            case 8:
                     switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene accesorios?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene ojos azules?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene cabello rizado?");
                        break;
                     case 4:
                         PreguntasC.setText("Tiene Cabello Negro?");
                        break;
                }
            break;
            case 9:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene accesorios?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene ojos azules?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene cabello Barba?");
                        break;
                     case 4:
                         PreguntasC.setText("Tiene Cabello Negro?");
                        break;
                }
                
            break;
            case 10:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene accesorios?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene ojos azules?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene cabello rizado?");
                        break;
                     case 4:
                         PreguntasC.setText("Tiene Cabello Rubio?");
                        break;
                }
             break;
             case 11:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene ojos cafes?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene piel de color?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene cabello rizado?");
                        break;
                     case 4:
                         PreguntasC.setText("Tiene Cabello cafe?");
                        break;
                }
             break;
             case 12:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene accesorios?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene ojos azules?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene barba?");
                        break;
                     case 4:
                         PreguntasC.setText("Tiene Cabello Cafe?");
                        break;
                }
             break;
             case 13:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene cabello negro?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene ojos cafes?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene barba?");
                        break;
                     case 4:
                         PreguntasC.setText("No tiene cabello?");
                        break;
                }
             break;
             case 14:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene cabello cafe?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene barba?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene accesorios?");
                        break;
                     case 4:
                         PreguntasC.setText("Tiene ojos cafe?");
                        break;
                }
             break;
             case 15:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene accesorios?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene piel de color?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene barba?");
                        break;
                     case 4:
                         PreguntasC.setText("Tiene Cabello Rizado?");
                        break;
                }
             break;
             case 16:
                switch (pregunta){
                    case 1:
                         PreguntasC.setText("Tiene accesorios?");
                        break;
                     case 2:
                        PreguntasC.setText("Tiene ojos azules?");
                        break;
                     case 3:
                         PreguntasC.setText("Tiene cabello rizado?");
                        break;
                     case 4:
                         PreguntasC.setText("Tiene Cabello Rubio?");
                        break;
                }
             break;
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

        Menu2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Menu4 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        Menu5 = new javax.swing.JLabel();
        Puntos = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        si = new javax.swing.JButton();
        Menu6 = new javax.swing.JLabel();
        no = new javax.swing.JButton();
        PreguntasC = new javax.swing.JTextField();
        Menu7 = new javax.swing.JLabel();
        Menu8 = new javax.swing.JLabel();
        PuntosC = new javax.swing.JTextField();
        Imagen = new javax.swing.JLabel();
        Menu11 = new javax.swing.JLabel();
        Menu12 = new javax.swing.JLabel();
        Menu13 = new javax.swing.JLabel();
        Menu14 = new javax.swing.JLabel();
        Menu15 = new javax.swing.JLabel();
        Menu16 = new javax.swing.JLabel();
        Menu17 = new javax.swing.JLabel();
        Menu18 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        D7 = new javax.swing.JLabel();
        P3 = new javax.swing.JButton();
        P11 = new javax.swing.JButton();
        P12 = new javax.swing.JButton();
        P4 = new javax.swing.JButton();
        P14 = new javax.swing.JButton();
        P6 = new javax.swing.JButton();
        P5 = new javax.swing.JButton();
        P13 = new javax.swing.JButton();
        P16 = new javax.swing.JButton();
        P8 = new javax.swing.JButton();
        P7 = new javax.swing.JButton();
        P15 = new javax.swing.JButton();
        P10 = new javax.swing.JButton();
        P9 = new javax.swing.JButton();
        P1 = new javax.swing.JButton();
        P2 = new javax.swing.JButton();
        Menu9 = new javax.swing.JLabel();
        Menu19 = new javax.swing.JLabel();
        REGLAS = new javax.swing.JButton();

        Menu2.setFont(new java.awt.Font("AR JULIAN", 0, 18)); // NOI18N
        Menu2.setForeground(new java.awt.Color(255, 102, 102));
        Menu2.setText("Registro");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.1.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.1.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.1.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.1.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel1.setBackground(new java.awt.Color(204, 204, 255));

        Menu4.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        Menu4.setForeground(new java.awt.Color(51, 0, 51));
        Menu4.setText("Preguntas Tu");

        b1.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        b1.setText("¿Tiene cabello negro?");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b4.setText("¿Tiene ojos cafe?");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b7.setText("¿Tiene accesorios?");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b5.setText("¿Tiene ojos azules?");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b8.setText("¿No tiene cabello?");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        b2.setText("¿Tiene cabello rubio?");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b9.setText("¿Su baraba es cafe?");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b6.setText("¿Usa Barba?");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("AR JULIAN", 0, 11)); // NOI18N
        b3.setText("¿Tiene cabello cafe?");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b12.setText("¿Su baraba es negra?");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b11.setText("¿Tiene cabello rizado?");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b10.setText("¿Tiene piel oscura?");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        error.setFont(new java.awt.Font("AR JULIAN", 0, 12)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b2)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b3)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b12))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Menu4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Menu4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(b1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(b7))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(b2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(b8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Menu5.setFont(new java.awt.Font("AR JULIAN", 0, 18)); // NOI18N
        Menu5.setForeground(new java.awt.Color(0, 51, 51));
        Menu5.setText("Puntos");

        Puntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntosActionPerformed(evt);
            }
        });

        si.setFont(new java.awt.Font("AR JULIAN", 0, 11)); // NOI18N
        si.setText("SI");
        si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siActionPerformed(evt);
            }
        });

        Menu6.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        Menu6.setForeground(new java.awt.Color(0, 0, 51));
        Menu6.setText("Preguntas Compu");

        no.setFont(new java.awt.Font("AR JULIAN", 0, 11)); // NOI18N
        no.setText("NO");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        PreguntasC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreguntasCActionPerformed(evt);
            }
        });

        Menu7.setFont(new java.awt.Font("AR JULIAN", 0, 18)); // NOI18N
        Menu7.setForeground(new java.awt.Color(0, 51, 51));
        Menu7.setText("Tu Personaje");

        Menu8.setFont(new java.awt.Font("AR JULIAN", 0, 18)); // NOI18N
        Menu8.setForeground(new java.awt.Color(0, 51, 51));
        Menu8.setText("Puntos Compu");

        PuntosC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntosCActionPerformed(evt);
            }
        });

        Menu11.setFont(new java.awt.Font("AR JULIAN", 0, 18)); // NOI18N
        Menu11.setForeground(new java.awt.Color(0, 51, 51));
        Menu11.setText("Descripcion");

        Menu12.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        Menu12.setForeground(new java.awt.Color(0, 51, 51));
        Menu12.setText("CABELLO");

        Menu13.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        Menu13.setForeground(new java.awt.Color(0, 51, 51));
        Menu13.setText("OJOS");

        Menu14.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        Menu14.setForeground(new java.awt.Color(0, 51, 51));
        Menu14.setText("TIPO DE CABELLO");

        Menu15.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        Menu15.setForeground(new java.awt.Color(0, 51, 51));
        Menu15.setText("BARBA");

        Menu16.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        Menu16.setForeground(new java.awt.Color(0, 51, 51));
        Menu16.setText("COLOR BARBA");

        Menu17.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        Menu17.setForeground(new java.awt.Color(0, 51, 51));
        Menu17.setText("ACCESORIOS");

        Menu18.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        Menu18.setForeground(new java.awt.Color(0, 51, 51));
        Menu18.setText("COLOR PIEL");

        D1.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        D1.setForeground(new java.awt.Color(0, 51, 51));

        D2.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        D2.setForeground(new java.awt.Color(0, 51, 51));

        D3.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        D3.setForeground(new java.awt.Color(0, 51, 51));

        D4.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        D4.setForeground(new java.awt.Color(0, 51, 51));

        D5.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        D5.setForeground(new java.awt.Color(0, 51, 51));

        D6.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        D6.setForeground(new java.awt.Color(0, 51, 51));

        D7.setFont(new java.awt.Font("AR JULIAN", 0, 10)); // NOI18N
        D7.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Menu7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(si)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(no))
                                .addComponent(PreguntasC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Menu6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Menu8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PuntosC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Menu16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Menu17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Menu18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Menu14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Menu13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Menu15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Menu12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Menu11, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Menu7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Menu6)
                                            .addComponent(Menu11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PreguntasC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Menu12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(D1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Menu14)
                                            .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Menu13)
                                            .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(si, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Menu15)
                                            .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Menu16)
                                            .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Menu17)
                                    .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Menu18)
                            .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PuntosC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Menu8))))
        );

        P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.11.png"))); // NOI18N
        P3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3ActionPerformed(evt);
            }
        });

        P11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.6.png"))); // NOI18N
        P11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P11ActionPerformed(evt);
            }
        });

        P12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.15.png"))); // NOI18N
        P12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P12ActionPerformed(evt);
            }
        });

        P4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.3.png"))); // NOI18N
        P4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4ActionPerformed(evt);
            }
        });

        P14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.19.png"))); // NOI18N
        P14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P14ActionPerformed(evt);
            }
        });

        P6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.9.png"))); // NOI18N
        P6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P6ActionPerformed(evt);
            }
        });

        P5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.4.png"))); // NOI18N
        P5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P5ActionPerformed(evt);
            }
        });

        P13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.12.png"))); // NOI18N
        P13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P13ActionPerformed(evt);
            }
        });

        P16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.7.png"))); // NOI18N
        P16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P16ActionPerformed(evt);
            }
        });

        P8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/2.1.png"))); // NOI18N
        P8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P8ActionPerformed(evt);
            }
        });

        P7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.16.png"))); // NOI18N
        P7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P7ActionPerformed(evt);
            }
        });

        P15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.5.png"))); // NOI18N
        P15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P15ActionPerformed(evt);
            }
        });

        P10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.13.png"))); // NOI18N
        P10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P10ActionPerformed(evt);
            }
        });

        P9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.14.png"))); // NOI18N
        P9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P9ActionPerformed(evt);
            }
        });

        P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.1.png"))); // NOI18N
        P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ActionPerformed(evt);
            }
        });

        P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.10.png"))); // NOI18N
        P2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2ActionPerformed(evt);
            }
        });

        Menu9.setFont(new java.awt.Font("Aparajita", 0, 24)); // NOI18N
        Menu9.setForeground(new java.awt.Color(51, 0, 0));
        Menu9.setText("1) Selecciona el personaje con el que jugaras");

        Menu19.setFont(new java.awt.Font("AR CHRISTY", 0, 36)); // NOI18N
        Menu19.setForeground(new java.awt.Color(51, 0, 51));
        Menu19.setText("¿?  ADIVINA QUIEN  ¿?");
        Menu19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        REGLAS.setBackground(new java.awt.Color(255, 255, 255));
        REGLAS.setFont(new java.awt.Font("HP Simplified", 0, 24)); // NOI18N
        REGLAS.setForeground(new java.awt.Color(0, 204, 204));
        REGLAS.setText("?");
        REGLAS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204)));
        REGLAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGLASActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P1)
                            .addComponent(P9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P2)
                            .addComponent(P10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P3)
                            .addComponent(P11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P4)
                            .addComponent(P12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P5)
                            .addComponent(P13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P6)
                            .addComponent(P14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P7)
                            .addComponent(P15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P8)
                            .addComponent(P16))
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Menu9))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(REGLAS, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Menu19)))
                        .addGap(238, 238, 238)
                        .addComponent(Menu5)
                        .addGap(18, 18, 18)
                        .addComponent(Puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Menu5))
                                .addGap(30, 30, 30))
                            .addComponent(Menu19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(REGLAS, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(Menu9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(P3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(P11))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(P5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(P13))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(P6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(P14))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(P7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(P15))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(P8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P16))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(P4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(P12))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(P1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(P9))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(P2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P10))))
                .addGap(103, 103, 103)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
            
             switch (personaje){
                case 1:
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b8.setVisible(false);
                    break;
                    case 2:
                    b1.setVisible(false);
                    error.setText("No tiene cabello Negro");
                        break;
                    case 3:
                        b1.setVisible(false);
                        error.setText("No tiene cabello Negro");
                        break;
                    case 4:
                        b1.setVisible(false);
                        error.setText("No tiene cabello Negro");
                        break;
                    case 5:
                        b1.setVisible(false);
                        error.setText("No tiene cabello Negro");
                        break;
                    case 6:
                        b1.setVisible(false);
                        error.setText("No tiene cabello Negro");
                        break;
                    case 7:
                      P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b8.setVisible(false);
                        break;
                    case 8:
                          P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b8.setVisible(false);
                    break;
                    case 9:
                       P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b8.setVisible(false);
                        break;
                    case 10:
                        b1.setVisible(false);
                        error.setText("No tiene cabello Negro");
                        break;
                    case 11:
                        b1.setVisible(false);
                        error.setText("No tiene cabello Negro");
                        break;
                    case 12:
                        b1.setVisible(false);
                        error.setText("No tiene cabello Negro");
                        break;
                    case 13:
                        b1.setVisible(false);
                        error.setText("No tiene cabello Negro");
                        break;
                    case 14:
                        b1.setVisible(false);
                        error.setText("No tiene cabello Negro");
                        break;
                    case 15:
                        b1.setVisible(false);
                        error.setText("No tiene cabello Negro");
                        break;
                    case 16:
                        b1.setVisible(false);
                        error.setText("No tiene cabello Negro");
                        break;
                        
                }
      int aux=0;
     for(int i=0;i<16;i++){
      if(vectorU [i]==1){
          aux=aux+1;
          }
      
      }   
     if (aux==1){
      puntos=puntos+100;
      Puntuacion pun=new Puntuacion();
      pun.setVisible(true);
      this.setVisible(false);
         
     }
     else {
        
         JuegoC();
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
    }
     
                   
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
    
             switch (personaje){
                case 1:
                    b3.setVisible(false);
                    error.setText("No tiene cabello Cafe");
                    break;
                    case 2:
                     b3.setVisible(false);
                    error.setText("No tiene cabello Cafe");
                        break;
                    case 3:
                         b3.setVisible(false);
                         error.setText("No tiene cabello Cafe");
                        break;
                    case 4:
                    P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b8.setVisible(false);
                        break;
                    case 5:
                         b3.setVisible(false);
                         error.setText("No tiene cabello Cafe");
                        break;
                    case 6:
                   P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b8.setVisible(false);
                        break;
                    case 7:
                       b3.setVisible(false);
                         error.setText("No tiene cabello Cafe");
                        break;
                    case 8:
                        b3.setVisible(false);
                         error.setText("No tiene cabello Cafe");
                    break;
                    case 9:
                         b3.setVisible(false);
                         error.setText("No tiene cabello Cafe");
                        break;
                    case 10:
                         b3.setVisible(false);
                         error.setText("No tiene cabello Cafe");
                        break;
                    case 11:
                  P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b8.setVisible(false);
                    break;
                    case 12:
                    P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b8.setVisible(false);
                    break;
                    case 13:
                         b3.setVisible(false);
                         error.setText("No tiene cabello Cafe");
                        break;
                    case 14:
                   P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b8.setVisible(false);
                        break;
                    case 15:
                  P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b8.setVisible(false);
                        break;
                    case 16:
                         b3.setVisible(false);
                         error.setText("No tiene cabello Cafe");
                        break;
                        
                }
int aux=0;
     for(int i=0;i<16;i++){
      if(vectorU [i]==1){
          aux=aux+1;
          }
      
      }   
     if (aux==1){
      puntos=puntos+100;
      Puntuacion pun=new Puntuacion();
      pun.setVisible(true);
      this.setVisible(false);
         
     }
     else {
        
         JuegoC();
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
    }
            
     
    }//GEN-LAST:event_b3ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
     
             switch (personaje){
                case 1:
                    b11.setVisible(false);
                    error.setText("No tiene cabello Rizado");
                    break;
                    case 2:
                    b11.setVisible(false);
                    error.setText("No tiene cabello Rizado");
                        break;
                    case 3:
                    b11.setVisible(false);
                    error.setText("No tiene cabello Rizado");
                        break;
                    case 4:
                    b11.setVisible(false);
                    error.setText("No tiene cabello Rizado");
                        break;
                    case 5:
                    b11.setVisible(false);
                    error.setText("No tiene cabello Rizado");
                        break;
                    case 6:
                    b11.setVisible(false);
                    error.setText("No tiene cabello Rizado");
                        break;
                    case 7:
                    b11.setVisible(false);
                    error.setText("No tiene cabello Rizado");
                        break;
                    case 8:
                    b11.setVisible(false);
                    error.setText("No tiene cabello Rizado");
                    break;
                    case 9:
                   b11.setVisible(false);
                    error.setText("No tiene cabello Rizado");
                        break;
                    case 10:
                    P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b11.setVisible(false);
                  
                        break;
                    case 11:
                        b11.setVisible(false);
                        error.setText("No tiene cabello Rizado");
                        break;
                  
                    case 12:
                    b11.setVisible(false);
                    error.setText("No tiene cabello Rizado");
                    break;
                    case 13:
                        b11.setVisible(false);
                    error.setText("No tiene cabello Rizado");
                        break;
                    case 14:
                    b11.setVisible(false);
                    error.setText("No tiene cabello Rizado");
                 
                        break;
                    case 15:
                    P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b11.setVisible(false);
                  
                        break;
                    case 16:
                     P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b11.setVisible(false);
                  
                        break;
                        
                }
int aux=0;
     for(int i=0;i<16;i++){
      if(vectorU [i]==1){
          aux=aux+1;
          }
      
      }   
     if (aux==1){
      puntos=puntos+100;
      Puntuacion pun=new Puntuacion();
      pun.setVisible(true);
      this.setVisible(false);
         
     }
     else {
        
         JuegoC();
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
    }
            
      
           
      
    }//GEN-LAST:event_b11ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed

             switch (personaje){
                case 1:
                    b5.setVisible(false);
                    error.setText("No tiene ojos azules");
                    break;
                    case 2:
                    b5.setVisible(false);
                    error.setText("No tiene ojos azules");
                        break;
                    case 3:
                       b5.setVisible(false);
                       error.setText("No tiene ojos azules");
                        break;
                    case 4:
                        b5.setVisible(false);
                        error.setText("No tiene ojos azules");
                        break;
                    case 5:
                    P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                    break;
                    case 6:
                        b5.setVisible(false);
                        error.setText("No tiene ojos azules");
                        break;
                    case 7:
                        b5.setVisible(false);
                       error.setText("No tiene ojos azules");
                       
                        break;
                    case 8:
                            P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                    break;
                    case 9:
                            P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                        break;
                    case 10:
                        b5.setVisible(false);
                       error.setText("No tiene ojos azules");
                        break;
                    case 11:
                       b5.setVisible(false);
                       error.setText("No tiene ojos azules");
                        break;
                    case 12:
                            P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                        break;
                    case 13:
                     b5.setVisible(false);
                       error.setText("No tiene ojos azules");
                        break;
                    case 14:
                        b5.setVisible(false);
                       error.setText("No tiene ojos azules");
                        break;
                    case 15:
                        b5.setVisible(false);
                       error.setText("No tiene ojos azules");
                        break;
                    case 16:
                        b5.setVisible(false);
                       error.setText("No tiene ojos azules");
                        break;
                        
                }
     int aux=0;
     for(int i=0;i<16;i++){
      if(vectorU [i]==1){
          aux=aux+1;
          }
      
      }   
     if (aux==1){
      puntos=puntos+100;
      Puntuacion pun=new Puntuacion();
      pun.setVisible(true);
      this.setVisible(false);
         
     }
     else {
        
         JuegoC();
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
    }
            

    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
    
             switch (personaje){
                case 1:
                    b6.setVisible(false);
                    b9.setVisible(false);
                    b12.setVisible(false);
                    error.setText("No tiene barba");
                    break;
                    case 2:
                   P1.setVisible(false);
                   vectorU[0]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b6.setVisible(false);
                        break;
                    case 3:
                    P1.setVisible(false);
                   vectorU[0]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b6.setVisible(false);
                      
                        break;
                    case 4:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                    case 5:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                    
                    break;
                    case 6:
                  P1.setVisible(false);
                   vectorU[0]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b6.setVisible(false);
                        break;
                    case 7:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                       
                        break;
                    case 8:
                     b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                    break;
                    case 9:
                    P1.setVisible(false);
                   vectorU[0]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b6.setVisible(false);
                        break;
                    case 10:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                        error.setText("No tiene barba");
                        break;
                    case 11:
                        b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                    case 12:
                    b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                    case 13:
                    P1.setVisible(false);
                   vectorU[0]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b6.setVisible(false);
                        break;
                    case 14:
                        P1.setVisible(false);
                   vectorU[0]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b6.setVisible(false);
                        break;
                    case 15:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                    case 16:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                        
                }
    int aux=0;
     for(int i=0;i<16;i++){
      if(vectorU [i]==1){
          aux=aux+1;
          }
      
      }   
     if (aux==1){
      puntos=puntos+100;
      Puntuacion pun=new Puntuacion();
      pun.setVisible(true);
      this.setVisible(false);
         
     }
     else {
        
         JuegoC();
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
    }
            

    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
 
             switch (personaje){
                case 1:
                   P2.setVisible(false);
                       vectorU[1]=0;
                    P3.setVisible(false);
                     vectorU[2]=0;
                    P7.setVisible(false);
                     vectorU[6]=0;
                    P9.setVisible(false);
                     vectorU[8]=0;
                    P11.setVisible(false);
                     vectorU[10]=0;
                    P12.setVisible(false);
                     vectorU[11]=0;
                    P13.setVisible(false);
                     vectorU[12]=0;
                    P14.setVisible(false);
                     vectorU[13]=0;
                    P15.setVisible(false);
                     vectorU[14]=0;
                     P16.setVisible(false);
                     vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b7.setVisible(false);
                    case 2:
                    b7.setVisible(false);
                    error.setText("No tiene accesorios");
                        break;
                    case 3:
                      b7.setVisible(false);
                    error.setText("No tiene accesorios");
                        break;
                    case 4:
                       P2.setVisible(false);
                       vectorU[1]=0;
                    P3.setVisible(false);
                     vectorU[2]=0;
                    P7.setVisible(false);
                     vectorU[6]=0;
                    P9.setVisible(false);
                     vectorU[8]=0;
                    P11.setVisible(false);
                     vectorU[10]=0;
                    P12.setVisible(false);
                     vectorU[11]=0;
                    P13.setVisible(false);
                     vectorU[12]=0;
                    P14.setVisible(false);
                     vectorU[13]=0;
                    P15.setVisible(false);
                     vectorU[14]=0;
                     P16.setVisible(false);
                     vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b7.setVisible(false);
                        break;
                    case 5:
                    P2.setVisible(false);
                       vectorU[1]=0;
                    P3.setVisible(false);
                     vectorU[2]=0;
                    P7.setVisible(false);
                     vectorU[6]=0;
                    P9.setVisible(false);
                     vectorU[8]=0;
                    P11.setVisible(false);
                     vectorU[10]=0;
                    P12.setVisible(false);
                     vectorU[11]=0;
                    P13.setVisible(false);
                     vectorU[12]=0;
                    P14.setVisible(false);
                     vectorU[13]=0;
                    P15.setVisible(false);
                     vectorU[14]=0;
                     P16.setVisible(false);
                     vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b7.setVisible(false);
                    
                    break;
                    case 6:
                    P2.setVisible(false);
                       vectorU[1]=0;
                    P3.setVisible(false);
                     vectorU[2]=0;
                    P7.setVisible(false);
                     vectorU[6]=0;
                    P9.setVisible(false);
                     vectorU[8]=0;
                    P11.setVisible(false);
                     vectorU[10]=0;
                    P12.setVisible(false);
                     vectorU[11]=0;
                    P13.setVisible(false);
                     vectorU[12]=0;
                    P14.setVisible(false);
                     vectorU[13]=0;
                    P15.setVisible(false);
                     vectorU[14]=0;
                     P16.setVisible(false);
                     vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b7.setVisible(false);
                        break;
                    case 7:
                         b7.setVisible(false);
                    error.setText("No tiene accesorios");
                       
                        break;
                    case 8:
                  P2.setVisible(false);
                       vectorU[1]=0;
                    P3.setVisible(false);
                     vectorU[2]=0;
                    P7.setVisible(false);
                     vectorU[6]=0;
                    P9.setVisible(false);
                     vectorU[8]=0;
                    P11.setVisible(false);
                     vectorU[10]=0;
                    P12.setVisible(false);
                     vectorU[11]=0;
                    P13.setVisible(false);
                     vectorU[12]=0;
                    P14.setVisible(false);
                     vectorU[13]=0;
                    P15.setVisible(false);
                     vectorU[14]=0;
                     P16.setVisible(false);
                     vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b7.setVisible(false);
                    break;
                    case 9:
                   b7.setVisible(false);
                    error.setText("No tiene accesorios");
                        break;
                    case 10:
                   P2.setVisible(false);
                       vectorU[1]=0;
                    P3.setVisible(false);
                     vectorU[2]=0;
                    P7.setVisible(false);
                     vectorU[6]=0;
                    P9.setVisible(false);
                     vectorU[8]=0;
                    P11.setVisible(false);
                     vectorU[10]=0;
                    P12.setVisible(false);
                     vectorU[11]=0;
                    P13.setVisible(false);
                     vectorU[12]=0;
                    P14.setVisible(false);
                     vectorU[13]=0;
                    P15.setVisible(false);
                     vectorU[14]=0;
                     P16.setVisible(false);
                     vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b7.setVisible(false);
                        break;
                    case 11:
                       b7.setVisible(false);
                    error.setText("No tiene accesorios");
                        break;
                    case 12:
                    b7.setVisible(false);
                    error.setText("No tiene accesorios");
                        break;
                    case 13:
                    b7.setVisible(false);
                    error.setText("No tiene accesorios");
                        break;
                    case 14:
                    b7.setVisible(false);
                    error.setText("No tiene accesorios");
                        break;
                    case 15:
                    b7.setVisible(false);
                    error.setText("No tiene accesorios");
                        break;
                    case 16:
                     b7.setVisible(false);
                    error.setText("No tiene accesorios");
                        break;
                        
                }
     int aux=0;
     for(int i=0;i<16;i++){
      if(vectorU [i]==1){
          aux=aux+1;
          }
      
      }   
     if (aux==1){
      puntos=puntos+100;
      Puntuacion pun=new Puntuacion();
      pun.setVisible(true);
      this.setVisible(false);
         
     }
     else {
        
         JuegoC();
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
    }
            

    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
      
          
               switch (personaje){
                case 1:
                    b8.setVisible(false);
                    error.setText("Si tiene cabello");
                    break;
                    case 2:
                   b8.setVisible(false);
                    error.setText("Si tiene cabello");
                        break;
                    case 3:
                    P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b8.setVisible(false);
                        break;
                    case 4:
                         b8.setVisible(false);
                    error.setText("Si tiene cabello");
                      
                        break;
                    case 5:
                       b8.setVisible(false);
                    error.setText("Si tiene cabello");
                    
                    break;
                    case 6:
                    b8.setVisible(false);
                    error.setText("Si tiene cabello");
                        break;
                    case 7:
                        b8.setVisible(false);
                    error.setText("Si tiene cabello");
                       
                        break;
                    case 8:
                   P2.setVisible(false);
                  b8.setVisible(false);
                    error.setText("Si tiene cabello");
                    break;
                    case 9:
                  b8.setVisible(false);
                    error.setText("Si tiene cabello");
                        break;
                    case 10:
                    b8.setVisible(false);
                    error.setText("Si tiene cabello");
                        break;
                    case 11:
                       b8.setVisible(false);
                    error.setText("Si tiene cabello");
                        break;
                    case 12:
                   b8.setVisible(false);
                    error.setText("Si tiene cabello");
                        break;
                    case 13:
                  P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b8.setVisible(false);
                        break;
                    case 14:
                   b8.setVisible(false);
                    error.setText("Si tiene cabello");
                        break;
                    case 15:
                   b8.setVisible(false);
                    error.setText("Si tiene cabello");
                        break;
                    case 16:
                     b8.setVisible(false);
                    error.setText("Si tiene cabello");
                        break;
                        
                }
     int aux=0;
     for(int i=0;i<16;i++){
      if(vectorU [i]==1){
          aux=aux+1;
          }
      
      }   
     if (aux==1){
      puntos=puntos+100;
      Puntuacion pun=new Puntuacion();
      pun.setVisible(true);
      this.setVisible(false);
         
     }
     else {
        
         JuegoC();
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
    }
            
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
       
             switch (personaje){
                case 1:
                    b6.setVisible(false);
                    b9.setVisible(false);
                    b12.setVisible(false);
                    error.setText("No tiene barba");
                    break;
                    case 2:
                    
                    b9.setVisible(false);
                    error.setText("No tiene barba cafe");
                        break;
                    case 3:
            P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                     vectorU[1]=0;
                    P4.setVisible(false);
                     vectorU[3]=0;
                    P5.setVisible(false);
                     vectorU[4]=0;
                    P7.setVisible(false);
                     vectorU[6]=0;
                    P8.setVisible(false);
                     vectorU[7]=0;
                    P9.setVisible(false);
                     vectorU[8]=0;
                    P10.setVisible(false);
                     vectorU[9]=0;
                    P11.setVisible(false);
                     vectorU[10]=0;
                    P12.setVisible(false);
                     vectorU[11]=0;
                    P13.setVisible(false);
                     vectorU[12]=0;
                    P15.setVisible(false);
                     vectorU[14]=0;
                    P16.setVisible(false);
                     vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b9.setVisible(false);
                        break;
                    case 4:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                    case 5:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                    
                    break;
                    case 6:
                    P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                     vectorU[1]=0;
                    P4.setVisible(false);
                     vectorU[3]=0;
                    P5.setVisible(false);
                     vectorU[4]=0;
                    P7.setVisible(false);
                     vectorU[6]=0;
                    P8.setVisible(false);
                     vectorU[7]=0;
                    P9.setVisible(false);
                     vectorU[8]=0;
                    P10.setVisible(false);
                     vectorU[9]=0;
                    P11.setVisible(false);
                     vectorU[10]=0;
                    P12.setVisible(false);
                     vectorU[11]=0;
                    P13.setVisible(false);
                     vectorU[12]=0;
                    P15.setVisible(false);
                     vectorU[14]=0;
                    P16.setVisible(false);
                     vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b9.setVisible(false);
                        break;
                    case 7:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                       
                        break;
                    case 8:
                     b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                    break;
                    case 9:
                    
                    b9.setVisible(false);
                    error.setText("No tiene barba cafe");
                        break;
                    case 10:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                        error.setText("No tiene barba");
                        break;
                    case 11:
                        b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                    case 12:
                    b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                    case 13:
                   
                    b9.setVisible(false);
                    error.setText("No tiene barba cafe");
                        break;
                    case 14:
                    P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                     vectorU[1]=0;
                    P4.setVisible(false);
                     vectorU[3]=0;
                    P5.setVisible(false);
                     vectorU[4]=0;
                    P7.setVisible(false);
                     vectorU[6]=0;
                    P8.setVisible(false);
                     vectorU[7]=0;
                    P9.setVisible(false);
                     vectorU[8]=0;
                    P10.setVisible(false);
                     vectorU[9]=0;
                    P11.setVisible(false);
                     vectorU[10]=0;
                    P12.setVisible(false);
                     vectorU[11]=0;
                    P13.setVisible(false);
                     vectorU[12]=0;
                    P15.setVisible(false);
                     vectorU[14]=0;
                    P16.setVisible(false);
                     vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b9.setVisible(false);
                        break;
                    case 15:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                    case 16:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                        
                }
    int aux=0;
     for(int i=0;i<16;i++){
      if(vectorU [i]==1){
          aux=aux+1;
          }
      
      }   
     if (aux==1){
      puntos=puntos+100;
      Puntuacion pun=new Puntuacion();
      pun.setVisible(true);
      this.setVisible(false);
         
     }
     else {
        
         JuegoC();
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
    }
            

    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
      
             switch (personaje){
                case 1:
                    b10.setVisible(false);
                    error.setText("No tiene piel oscura");
                    break;
                    case 2:
                    P1.setVisible(false);
                    vectorU[0]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b10.setVisible(false);
                    
                        break;
                    case 3:
                    b10.setVisible(false);
                    error.setText("No tiene piel oscura");
                      
                        break;
                    case 4:
                    b10.setVisible(false);
                    error.setText("No tiene piel oscura");
                        break;
                    case 5:
                    b10.setVisible(false);
                    error.setText("No tiene piel oscura");
                    
                    break;
                    case 6:
                     P1.setVisible(false);
                    vectorU[0]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b10.setVisible(false);
                    
                        break;
                    case 7:
                        b10.setVisible(false);
                    error.setText("No tiene piel oscura");
                       
                        break;
                    case 8:
                    b10.setVisible(false);
                    error.setText("No tiene piel oscura");
                    break;
                    case 9:
                    b10.setVisible(false);
                    error.setText("No tiene piel oscura");
                        break;
                    case 10:
                        b10.setVisible(false);
                    error.setText("No tiene piel oscura");
                        break;
                    case 11:
                   P1.setVisible(false);
                    vectorU[0]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b10.setVisible(false);
                    
                        break;
                    case 12:
                    b10.setVisible(false);
                    error.setText("No tiene piel oscura");
                        break;
                    case 13:
                   
                   b10.setVisible(false);
                    error.setText("No tiene piel oscura");
                        break;
                    case 14:
                     b10.setVisible(false);
                    error.setText("No tiene piel oscura");
                        break;
                    case 15:
                    P1.setVisible(false);
                    vectorU[0]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b10.setVisible(false);
                        break;
                    case 16:
                        b10.setVisible(false);
                    error.setText("No tiene piel oscura");
                        break;
                        
                }
 int aux=0;
     for(int i=0;i<16;i++){
      if(vectorU [i]==1){
          aux=aux+1;
          }
      
      }   
     if (aux==1){
      puntos=puntos+100;
      Puntuacion pun=new Puntuacion();
      pun.setVisible(true);
      this.setVisible(false);
         
     }
     else {
        
         JuegoC();
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
    }

    }//GEN-LAST:event_b10ActionPerformed

    private void P3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3ActionPerformed
         if (turno==0){
             Menu9.setVisible(false);
          personajec=3;
           jPanel2.setVisible(true);
          Random aleatorio = new Random(System.currentTimeMillis());
          personaje = aleatorio.nextInt(16)+1;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.11.png")));
          D1.setText("NO");
          D2.setText("NO");
          D3.setText("CAFES");
          D4.setText("SI");
          D5.setText("CAFE");
          D6.setText("NO");
          D7.setText("NO");
           for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
         
    }//GEN-LAST:event_P3ActionPerformed

    private void P11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P11ActionPerformed
        if (turno==0){
            Menu9.setVisible(false);
          jPanel2.setVisible(true);
          Random aleatorio = new Random(System.currentTimeMillis());
          personaje = aleatorio.nextInt(16)+1;
          personajec=11;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.6.png")));
          D1.setText("CAFE");
          D2.setText("LACIO");
          D3.setText("CAFES");
          D4.setText("NO");
          D5.setText("NO");
          D6.setText("NO");
          D7.setText("SI");
           for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
        
    }//GEN-LAST:event_P11ActionPerformed

    private void P12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P12ActionPerformed
       if (turno==0){
           Menu9.setVisible(false);
            jPanel2.setVisible(true);
          Random aleatorio = new Random(System.currentTimeMillis());
          personaje = aleatorio.nextInt(16)+1;
          personajec=12;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.15.png")));
          D1.setText("CAFE");
          D2.setText("LACIO");
          D3.setText("AZULES");
          D4.setText("NO");
          D5.setText("NO");
          D6.setText("NO");
          D7.setText("NO");
           for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
         
    }//GEN-LAST:event_P12ActionPerformed

    private void P4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4ActionPerformed
        if (turno==0){
            Menu9.setVisible(false);
            jPanel2.setVisible(true);
          Random aleatorio = new Random(System.currentTimeMillis());
          personaje = aleatorio.nextInt(16)+1;
          personajec=4;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.3.png")));
          D1.setText("CAFE");
          D2.setText("LACIO");
          D3.setText("CAFES");
          D4.setText("NO");
          D5.setText("NO");
          D6.setText("SI");
          D7.setText("NO");
          for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
      

    }//GEN-LAST:event_P4ActionPerformed

    private void P14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P14ActionPerformed
        if (turno==0){
            Menu9.setVisible(false);
          jPanel2.setVisible(true);
          Random aleatorio = new Random(System.currentTimeMillis());
          personaje = aleatorio.nextInt(16)+1;
          personajec=14;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.19.png")));
          D1.setText("CAFE");
          D2.setText("LACIO");
          D3.setText("CAFES");
          D4.setText("SI");
          D5.setText("CAFE");
          D6.setText("NO");
          D7.setText("NO");
          for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
        

    }//GEN-LAST:event_P14ActionPerformed

    private void P6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P6ActionPerformed
       if (turno==0){
           Menu9.setVisible(false);
            jPanel2.setVisible(true);
           Random aleatorio = new Random(System.currentTimeMillis());
          personaje = aleatorio.nextInt(16)+1;
          personajec=6;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.9.png")));
          D1.setText("CAFE");
          D2.setText("LACIO");
          D3.setText("CAFES");
          D4.setText("SI");
          D5.setText("CAFE");
          D6.setText("SI");
          D7.setText("SI");
          for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
        

    }//GEN-LAST:event_P6ActionPerformed

    private void P5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P5ActionPerformed
        if (turno==0){
            Menu9.setVisible(false);
             jPanel2.setVisible(true);
            Random aleatorio = new Random(System.currentTimeMillis());
          personaje = aleatorio.nextInt(16)+1;
          personajec=5;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.4.png")));
          D1.setText("RUBIO");
          D2.setText("LACIO");
          D3.setText("AZUL");
          D4.setText("NO");
          D5.setText("NO");
          D6.setText("SI");
          D7.setText("NO");
          for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
         
    }//GEN-LAST:event_P5ActionPerformed

    private void P13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P13ActionPerformed
        if (turno==0){
            Menu9.setVisible(false);
             jPanel2.setVisible(true);
            Random aleatorio = new Random(System.currentTimeMillis());
        personaje = aleatorio.nextInt(16)+1;
          personajec=13;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.12.png")));
          D1.setText("NO");
          D2.setText("NO");
          D3.setText("CAFE");
          D4.setText("SI");
          D5.setText("NEGRA");
          D6.setText("NO");
          D7.setText("NO");
          for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
        

    }//GEN-LAST:event_P13ActionPerformed

    private void P16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P16ActionPerformed
        if (turno==0){
            Menu9.setVisible(false);
             jPanel2.setVisible(true);
            Random aleatorio = new Random(System.currentTimeMillis());
        personaje = aleatorio.nextInt(16)+1;
          personajec=16;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.7.png")));
          D1.setText("RUBIO");
          D2.setText("RIZADO");
          D3.setText("CAFE");
          D4.setText("NO");
          D5.setText("NO");
          D6.setText("NO");
          D7.setText("NO");
          for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
         

    }//GEN-LAST:event_P16ActionPerformed

    private void P8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P8ActionPerformed
        if (turno==0){
            Menu9.setVisible(false);
             jPanel2.setVisible(true);
            Random aleatorio = new Random(System.currentTimeMillis());
        personaje = aleatorio.nextInt(16)+1;
          personajec=8;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/2.1.png")));
          D1.setText("NEGRO");
          D2.setText("LACIO");
          D3.setText("AZULES");
          D4.setText("NO");
          D5.setText("NO");
          D6.setText("SI");
          D7.setText("NO");
          for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
         

    }//GEN-LAST:event_P8ActionPerformed

    private void P7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P7ActionPerformed
        if (turno==0){
            Menu9.setVisible(false);
             jPanel2.setVisible(true);
            Random aleatorio = new Random(System.currentTimeMillis());
        personaje = aleatorio.nextInt(16)+1;
          personajec=7;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.16.png")));
          D1.setText("NEGRO");
          D2.setText("LACIO");
          D3.setText("CAFE");
          D4.setText("NO");
          D5.setText("NO");
          D6.setText("NO");
          D7.setText("NO");
          for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
        

    }//GEN-LAST:event_P7ActionPerformed

    private void P15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P15ActionPerformed
        if (turno==0){
            Menu9.setVisible(false);
             jPanel2.setVisible(true);
            Random aleatorio = new Random(System.currentTimeMillis());
        personaje = aleatorio.nextInt(16)+1;
          personajec=15;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.5.png")));
          D1.setText("CAFE");
          D2.setText("RIZADO");
          D3.setText("CAFE");
          D4.setText("NO");
          D5.setText("NO");
          D6.setText("NO");
          D7.setText("SI");
          for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
         

    }//GEN-LAST:event_P15ActionPerformed

    private void PuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PuntosActionPerformed

    private void P10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P10ActionPerformed
       if (turno==0){
           Menu9.setVisible(false);
         jPanel2.setVisible(true);
         Random aleatorio = new Random(System.currentTimeMillis());
        personaje = aleatorio.nextInt(16)+1;
          personajec=10;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.13.png")));
          D1.setText("RUBIO");
          D2.setText("RIZADO");
          D3.setText("CAFE");
          D4.setText("NO");
          D5.setText("NO");
          D6.setText("SI");
          D7.setText("NO");
          for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
         

    }//GEN-LAST:event_P10ActionPerformed

    private void P9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P9ActionPerformed
         jPanel2.setVisible(true);
         Menu9.setVisible(false);
        if (turno==0){
            Random aleatorio = new Random(System.currentTimeMillis());
          personaje = aleatorio.nextInt(16)+1;
          personajec=9;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.14.png")));
          D1.setText("NEGRO");
          D2.setText("LACIO");
          D3.setText("CAFE");
          D4.setText("SI");
          D5.setText("NEFRA");
          D6.setText("NO");
          D7.setText("NO");
          for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
         

    }//GEN-LAST:event_P9ActionPerformed

    private void P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1ActionPerformed
      if (turno==0){
          Menu9.setVisible(false);
        jPanel2.setVisible(true);
        Random aleatorio = new Random(System.currentTimeMillis());
        personaje = aleatorio.nextInt(16)+1;
          personajec=1;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.1.png")));
          D1.setText("NEGRO");
          D2.setText("LACIO");
          D3.setText("VERDES");
          D4.setText("NO");
          D5.setText("NO");
          D6.setText("SI");
          D7.setText("NO");
          for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
         

    }//GEN-LAST:event_P1ActionPerformed

    private void P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2ActionPerformed
        if (turno==0){
          jPanel2.setVisible(true);
          Menu9.setVisible(false);
          Random aleatorio = new Random(System.currentTimeMillis());
          personaje = aleatorio.nextInt(16)+1;
          personajec=2;
          turno=1;
          Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adivinaq/IMAGENES/1.10.png")));
          D1.setText("BLANCO");
          D2.setText("LACIO");
          D3.setText("CAFES");
          D4.setText("SI");
          D5.setText("BLANCA");
          D6.setText("NO");
          D7.setText("SI");
          for(int i=0;i<16;i++){
                            vectorU [i]=1;
                        }
      }
         

    }//GEN-LAST:event_P2ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
    
             switch (personaje){
                case 1:
                    b6.setVisible(false);
                    b9.setVisible(false);
                    b12.setVisible(false);
                    error.setText("No tiene barba");
                    break;
                    case 2:
                  b12.setVisible(false);
                    error.setText("No tiene barba negra");
                        break;
                    case 3:
                    b12.setVisible(false);
                    error.setText("No tiene barba negra");
                      
                        break;
                    case 4:
                         b6.setVisible(false);
                    b9.setVisible(false);
                    b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                    case 5:
                         b6.setVisible(false);
                    b9.setVisible(false);
                    b12.setVisible(false);
                    error.setText("No tiene barba");
                    break;
                    case 6:
                    b12.setVisible(false);
                    error.setText("No tiene barba negra");
                        break;
                    case 7:
                         b6.setVisible(false);
                    b9.setVisible(false);
                    b12.setVisible(false);
                    error.setText("No tiene barba");
                       
                        break;
                    case 8:
                          b6.setVisible(false);
                    b9.setVisible(false);
                    b12.setVisible(false);
                    error.setText("No tiene barba");
                    break;
                    case 9:
                  P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    
                    b12.setVisible(false);
                      
                        break;
                    case 10:
                             b6.setVisible(false);
                    b9.setVisible(false);
                    b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                    case 11:
                           b6.setVisible(false);
                    b9.setVisible(false);
                    b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                    case 12:
                         b6.setVisible(false);
                    b9.setVisible(false);
                    b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                    case 13:
                    P1.setVisible(false);
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P10.setVisible(false);
                    vectorU[9]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    P16.setVisible(false);
                    vectorU[15]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    
                    b12.setVisible(false);
                        break;
                    case 14:
                    
                    b12.setVisible(false);
                    error.setText("No tiene barba negra");
                        break;
                    case 15:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                    case 16:
                         b6.setVisible(false);
                         b9.setVisible(false);
                          b12.setVisible(false);
                    error.setText("No tiene barba");
                        break;
                        
                }
    int aux=0;
     for(int i=0;i<16;i++){
      if(vectorU [i]==1){
          aux=aux+1;
          }
      
      }   
     if (aux==1){
      puntos=puntos+100;
      Puntuacion pun=new Puntuacion();
      pun.setVisible(true);
      this.setVisible(false);
         
     }
     else {
        
         JuegoC();
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
    }
    }//GEN-LAST:event_b12ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
      
             switch (personaje){
                case 1:
                    b2.setVisible(false);
                    error.setText("No tiene cabello Rubio");
                    break;
                    case 2:
                    b2.setVisible(false);
                    error.setText("No tiene cabello Rubio");
                        break;
                    case 3:
                        b2.setVisible(false);
                    error.setText("No tiene cabello Rubio");
                        break;
                    case 4:
                        b2.setVisible(false);
                    error.setText("No tiene cabello Rubio");
                        break;
                    case 5:
                              P1.setVisible(false);  
                   P1.setVisible(false); 
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b8.setVisible(false);
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                        break;
                    case 6:
                       b2.setVisible(false);
                    error.setText("No tiene cabello Rubio");
                        break;
                    case 7:
                    b2.setVisible(false);
                    error.setText("No tiene cabello Rubio");
                        break;
                    case 8:
                    b2.setVisible(false);
                    error.setText("No tiene cabello Rubio");
                    break;
                    case 9:
                     b2.setVisible(false);
                    error.setText("No tiene cabello Rubio");
                   
                        break;
                    case 10:
                 P1.setVisible(false); 
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b8.setVisible(false);
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                        break;
                    case 11:
                       b2.setVisible(false);
                    error.setText("No tiene cabello Rubio");
                        break;
                    case 12:
                        b2.setVisible(false);
                    error.setText("No tiene cabello Rubio");
                        break;
                    case 13:
                        b2.setVisible(false);
                    error.setText("No tiene cabello Rubio");
                        break;
                    case 14:
                        b2.setVisible(false);
                    error.setText("No tiene cabello Rubio");
                        break;
                    case 15:
                        b2.setVisible(false);
                    error.setText("No tiene cabello Rubio");
                        break;
                    case 16:
                    P1.setVisible(false); 
                    vectorU[0]=0;
                    P2.setVisible(false);
                    vectorU[1]=0;
                    P3.setVisible(false);
                    vectorU[2]=0;
                    P4.setVisible(false);
                    vectorU[3]=0;
                    P6.setVisible(false);
                    vectorU[5]=0;
                    P7.setVisible(false);
                    vectorU[6]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P11.setVisible(false);
                    vectorU[10]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    P13.setVisible(false);
                    vectorU[12]=0;
                    P14.setVisible(false);
                    vectorU[13]=0;
                    P15.setVisible(false);
                    vectorU[14]=0;
                    b1.setVisible(false);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b8.setVisible(false);
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    break;
                }
     int aux=0;
     for(int i=0;i<16;i++){
      if(vectorU [i]==1){
          aux=aux+1;
          }
      
      }   
     if (aux==1){
      puntos=puntos+100;
      Puntuacion pun=new Puntuacion();
      pun.setVisible(true);
      this.setVisible(false);
         
     }
     else {
        
         JuegoC();
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
    }
            
          
    }//GEN-LAST:event_b2ActionPerformed
    
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
            switch (personaje){
                case 1:
                    b4.setVisible(false);
                    error.setText("No tiene ojos cafe");
                    break;
                    case 2:
                     P1.setVisible(false);
                    vectorU[0]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                        break;
                    case 3:
                   P1.setVisible(false);
                    vectorU[0]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);                       
                    break;
                    case 4:
                      P1.setVisible(false);
                    vectorU[0]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                        break;
                    case 5:
                     b4.setVisible(false);
                    error.setText("No tiene ojos cafe");
                    break;
                    case 6:
                 P1.setVisible(false);
                    vectorU[0]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                        break;
                    case 7:
                     P1.setVisible(false);
                    vectorU[0]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                       
                        break;
                    case 8:
              b4.setVisible(false);
                    error.setText("No tiene ojos cafe");
                    break;
                    case 9:
                     b4.setVisible(false);
                    error.setText("No tiene ojos cafe");
                        break;
                    case 10:
                   P1.setVisible(false);
                    vectorU[0]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                        break;
                    case 11:
                     P1.setVisible(false);
                    vectorU[0]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                        break;
                    case 13:
                     P1.setVisible(false);
                    vectorU[0]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                        break;
                    case 14:
                     P1.setVisible(false);
                    vectorU[0]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                        break;
                    case 15:
                     P1.setVisible(false);
                    vectorU[0]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                        break;
                    case 16:
                    P1.setVisible(false);
                    vectorU[0]=0;
                    P5.setVisible(false);
                    vectorU[4]=0;
                    P8.setVisible(false);
                    vectorU[7]=0;
                    P9.setVisible(false);
                    vectorU[8]=0;
                    P12.setVisible(false);
                    vectorU[11]=0;
                    puntos=puntos+10;
                    puntaje=String.valueOf(puntos);
                    Puntos.setText(puntaje);
                    b5.setVisible(false);
                    b4.setVisible(false);
                        break;
                        
                }
    int aux=0;
     for(int i=0;i<16;i++){
      if(vectorU [i]==1){
          aux=aux+1;
          }
      
      }   
     if (aux==1){
      puntos=puntos+100;
      Puntuacion pun=new Puntuacion();
      pun.setVisible(true);
      this.setVisible(false);
         
     }
     else {
        
         JuegoC();
         jPanel2.setVisible(false);
         jPanel3.setVisible(true);
    }
    }//GEN-LAST:event_b4ActionPerformed

    private void PuntosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntosCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PuntosCActionPerformed

    private void PreguntasCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreguntasCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PreguntasCActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        switch(personajec){
            case 1:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);

                break;
            }

            break;
            case 2:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
            }

            break;
            case 3:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }

            break;
            case 4:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:

                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }

            break;
            case 5:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:

                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }

            break;
            case 6:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }

            break;
            case 7:
            switch (pregunta){
                case 1:

                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:

                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }

            break;
            case 8:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:

                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 9:
            switch (pregunta){
                case 1:

                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntosc=3;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }

            break;
            case 10:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;

            }
            break;
            case 11:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 12:
            switch (pregunta){
                case 1:
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 13:
            switch (pregunta){
                case 1:
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 14:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Tiene ojos cafe?");
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 15:
            switch (pregunta){
                case 1:

                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:

                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                PreguntasC.setText("Tiene ojos cafe?");
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 16:
            switch (pregunta){
                case 1:

                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:

                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:

                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
        }

    }//GEN-LAST:event_noActionPerformed

    private void siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siActionPerformed
        switch(personajec){
            case 1:
            switch (pregunta){
                case 1:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntosc=0;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntosc=0;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 2:
            switch (pregunta){
                case 1:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }

            break;
            case 3:
            switch (pregunta){
                case 1:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }

            break;
            case 4:
            switch (pregunta){
                case 1:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }

            break;
            case 5:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }

            break;
            case 6:
            switch (pregunta){
                case 1:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }

            break;
            case 7:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }

            break;
            case 8:
            switch (pregunta){
                case 1:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 9:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }

            break;
            case 10:
            switch (pregunta){
                case 1:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);;
                break;
                case 3:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 11:
            switch (pregunta){
                case 1:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 12:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 13:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 14:
            switch (pregunta){
                case 1:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 15:
            switch (pregunta){
                case 1:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
            case 16:
            switch (pregunta){
                case 1:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=2;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 2:
                PreguntasC.setText("Falso");
                puntos=0;
                puntaje=String.valueOf(puntos);
                Puntos.setText(puntaje);
                pregunta=3;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 3:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                pregunta=4;
                jPanel2.setVisible(true);
                jPanel3.setVisible(false);
                break;
                case 4:
                puntosc=puntosc+10;
                puntajec=String.valueOf(puntosc);
                PuntosC.setText(puntajec);
                puntosp pp=new puntosp();
                pp.setVisible(true);
                this.setVisible(false);
                break;
            }
            break;
        }

    }//GEN-LAST:event_siActionPerformed

    private void REGLASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGLASActionPerformed
        reglas2 r=new reglas2();
        r.setVisible(true);
    }//GEN-LAST:event_REGLASActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
              
      
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego1().setVisible(true);
            }
        });
    }
        
                
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JLabel D7;
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Menu11;
    private javax.swing.JLabel Menu12;
    private javax.swing.JLabel Menu13;
    private javax.swing.JLabel Menu14;
    private javax.swing.JLabel Menu15;
    private javax.swing.JLabel Menu16;
    private javax.swing.JLabel Menu17;
    private javax.swing.JLabel Menu18;
    private javax.swing.JLabel Menu19;
    private javax.swing.JLabel Menu2;
    private javax.swing.JLabel Menu4;
    private javax.swing.JLabel Menu5;
    private javax.swing.JLabel Menu6;
    private javax.swing.JLabel Menu7;
    private javax.swing.JLabel Menu8;
    private javax.swing.JLabel Menu9;
    public javax.swing.JButton P1;
    private javax.swing.JButton P10;
    private javax.swing.JButton P11;
    private javax.swing.JButton P12;
    private javax.swing.JButton P13;
    private javax.swing.JButton P14;
    private javax.swing.JButton P15;
    private javax.swing.JButton P16;
    private javax.swing.JButton P2;
    private javax.swing.JButton P3;
    private javax.swing.JButton P4;
    private javax.swing.JButton P5;
    private javax.swing.JButton P6;
    private javax.swing.JButton P7;
    private javax.swing.JButton P8;
    private javax.swing.JButton P9;
    private javax.swing.JTextField PreguntasC;
    private javax.swing.JTextField Puntos;
    private javax.swing.JTextField PuntosC;
    private javax.swing.JButton REGLAS;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton no;
    private javax.swing.JPanel panel1;
    private javax.swing.JButton si;
    // End of variables declaration//GEN-END:variables

    

   
}

