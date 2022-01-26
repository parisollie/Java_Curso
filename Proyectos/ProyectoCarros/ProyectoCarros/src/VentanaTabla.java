import Inicio.*;
import Otros.*;
import Otros.Limpiar_txt;
import Otros.imgTabla;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class VentanaTabla extends javax.swing.JFrame {


    Limpiar_txt lt = new Limpiar_txt();
    //La ruta donde se va a guardar el txt
    private String ruta_txt = "mi.txt";

    Producto p;
    Proceso rp;

    int clic_tabla;

    public VentanaTabla() {

        initComponents();
        rp = new Proceso();

        try{

            cargar_txt();
            listarRegistro();
        }catch(Exception ex){
            mensaje("No existe el archivo txt");
        }
    }

    public void cargar_txt(){

        try{
            //FileInputStream nos permitira guardar en código binario
            FileInputStream fis = new FileInputStream(ruta_txt);
            //Nos permite cargar los datos en memoria,no importa si sea doble
            //int o lo que seea.
            ObjectInputStream in = new ObjectInputStream(fis);

            if(in != null){//Si hay datos
                //Cargamos el tipo de dato proceso y lo almacenamos en el arraylist
                rp = (Proceso)in.readObject();
                in.close();
            }


        /*
        File ruta = new File(ruta_txt);
        try{
            //Cargamos el archivo
            FileReader fi = new FileReader(ruta);
            BufferedReader bu = new BufferedReader(fi);


            String linea = null;
            while((linea = bu.readLine())!=null){
                StringTokenizer st = new StringTokenizer(linea, ",");
                p = new Producto();
                p.setCodigo(Integer.parseInt(st.nextToken()));
                p.setNombre(st.nextToken());
                p.setPrecio(Double.parseDouble(st.nextToken()));
                p.setDescripcion(st.nextToken());
                rp.agregarRegistro(p);
            }
            bu.close();*/
        }catch(Exception ex){
            mensaje("Error al cargar archivo: "+ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }

    public void grabar_txt(){
        //FileWriter fw;
        //PrintWriter pw;
        //Estos metódos nos sirven para guardar en txt
        FileOutputStream fos;
        ObjectOutputStream out;
        try{
            //fw = new FileWriter(ruta_txt);
            //pw = new PrintWriter(fw);
            fos = new FileOutputStream(ruta_txt);
            out = new ObjectOutputStream(fos);
            //Verificamos si hay datos para guardar en texto
            if(out != null){
                //Si hay datos guardamos en el txt
                out.writeObject(rp);//WriteObject para cualquier tipo de dato
                out.close();
            }
            /*
            for(int i = 0; i < rp.cantidadRegistro(); i++){
                p = rp.obtenerRegistro(i);
                pw.println(String.valueOf(p.getCodigo()+", "+p.getNombre()+",
                "+p.getPrecio()+", "+p.getDescripcion()));
            }
             pw.close();*/

        }catch(Exception ex){
            mensaje("Error al grabar archivo: "+ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }

    public void ingresarRegistro(File ruta){
        try{

            if(leerCodigo() == -666)mensaje("Ingresar código entero");
            else if(leerNombre() == null)mensaje("Ingresar nombre");
            else if(leerTelefono() == -666) mensaje("Ingresar teléfono");
            else if(leerDireccion() == null)mensaje("Ingresar dirección");
            else if(leerColor() == null)mensaje("Ingresar color");
            else if(leerPiel() == null)mensaje("Ingresar piel");

            else{
                p = new Producto(leerCodigo(), leerNombre(), leerTelefono(),
                        leerDireccion(),leerFoto(ruta),leerColor(),leerPiel());
                if(rp.buscaCodigo(p.getCodigo())!= -1)mensaje("Este código ya "
                        + "existe");
                else rp.agregarRegistro(p);//Si no lo agregamos

                grabar_txt();
                listarRegistro();
                lt.limpiar_texto(panel); //Limpiamos la caja de texto
            }
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }
    }

    public void modificarRegistro(File ruta){
        try{

            if(leerCodigo() == -666)mensaje("Ingresar código entero");
            else if(leerNombre() == null)mensaje("Ingresar nombre");
            else if(leerTelefono() == -666) mensaje("Ingresar teléfono");
            else if(leerDireccion() == null)mensaje("Ingresar dirección");
            else if(leerColor() == null)mensaje("Ingresar color");
            else if(leerPiel() == null)mensaje("Ingresar piel");

            else{
                int codigo = rp.buscaCodigo(leerCodigo());
                //En caso de que la ruta de la foto este vacia
                if(txtRuta.getText().equalsIgnoreCase(""))
                    p = new Producto(leerCodigo(), leerNombre(), leerTelefono(),
                            leerDireccion(),leerFoto2(codigo),leerColor(),leerPiel());


                else p = new Producto(leerCodigo(), leerNombre(), leerTelefono(),
                        leerDireccion(),leerFoto(ruta),leerColor(),leerPiel());
                //Si el código no existe
                if(codigo == -1)rp.agregarRegistro(p);
                else rp.modificarRegistro(codigo, p);

                grabar_txt();
                listarRegistro();
                lt.limpiar_texto(panel);//Limpiamos la caja de texto
            }
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }
    }

    public void eliminarRegistro(){
        try{
            if(leerCodigo() == -666) mensaje("Ingrese código entero");

            else{
                //Buscamos elcodigo
                int codigo = rp.buscaCodigo(leerCodigo());
                //Si el codigo no esta
                if(codigo == -1) mensaje("El código no existe");

                else{
                    int s = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar ? ","Si/No",0);
                    if(s == 0){
                        //LLamamos a la clase eliminar registro para eliminar
                        rp.eliminarRegistro(codigo);

                        grabar_txt();
                        listarRegistro();
                        lt.limpiar_texto(panel);
                    }
                }


            }
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }
    }
    //Nos permite visualizar los datos en la tabla
    public void listarRegistro(){
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };

        dt.addColumn("Codigo");
        dt.addColumn("Nombre");
        dt.addColumn("Telefono");
        dt.addColumn("Direccion");
        dt.addColumn("Color");
        dt.addColumn("Piel");
        dt.addColumn("Foto");


        tabla.setDefaultRenderer(Object.class, new imgTabla());

        Object fila[] = new Object[dt.getColumnCount()];
        for(int i = 0; i < rp.cantidadRegistro(); i++){
            p = rp.obtenerRegistro(i);
            fila[0] = p.getCodigo();
            fila[1] = p.getNombre();
            fila[2] = p.getTelefono();
            fila[3] = p.getDireccion();
            fila[4] = p.getColor();
            fila[5] = p.getPiel();

            try{
                //Obtenemos la foto que hemos cargado en memoria
                byte[] bi = p.getFoto();
                BufferedImage image = null;
                InputStream in = new ByteArrayInputStream(bi);
                image = ImageIO.read(in);
                //getScaledInstance- Es para dar el tamaño
                ImageIcon img = new ImageIcon(image.getScaledInstance(60, 60, 0));
                fila[6] = new JLabel(img);

            }catch(Exception ex){
                fila[6] = "No hay imagen";

            }
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
    }

    public int leerCodigo(){
        try{
            int codigo = Integer.parseInt(txtCodigo.getText().trim());
            return codigo;
        }catch(Exception ex){
            return -666;
        }
    }

    public String leerNombre(){
        try{
            String nombre = txtNombre.getText().trim().replace(" ", "_");
            return nombre;
        }catch(Exception ex){
            return null;
        }
    }

    public int leerTelefono(){
        try{
            int telefono = Integer.parseInt(txtTelefono.getText().trim());
            return telefono;
        }catch(Exception ex){
            return -666;
        }
    }

    public Object leerDireccion(){
        try{
            Object direccion = txtDireccion.getText().trim();
            return direccion;
        }catch(Exception ex){
            return null;
        }
    }
    public String leerColor(){
        try{
            String color = txtColor.getText().trim().replace(" ", "_");
            return color;
        }catch(Exception ex){
            return null;
        }
    }

     public String leerPiel(){
        try{
            String piel = txtPiel.getText().trim().replace(" ", "_");
            return piel;
        }catch(Exception ex){
            return null;
        }
    }

     public byte[] leerFoto(File ruta){
        try{
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            return icono;
        }catch(Exception ex){
            return null;
        }
    }

   //Este metódo nos permite cargar la foto que ya tenemos en memoria
    public byte[] leerFoto2(int codigo){
            p = rp.obtenerRegistro(codigo);
            try{
               return p.getFoto();
            }catch(Exception ex){
               return null;
            }
        }

    public void mensaje(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPiel = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Base de Datos con Bloc de Notas .txt");

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 888, 271));

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jButton3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        txtDireccion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        panel.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 130, 181, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Dirección:");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Teléfono:");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, -1, -1));

        txtTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        panel.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 94, 181, -1));

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        panel.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 56, 181, -1));

        txtCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        panel.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 19, 181, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Código:");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 66, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Nombre:");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Agregar carro:");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 22, 110, -1));

        jButton4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton4.setText("Buscar foto...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 22, 155, -1));

        txtRuta.setEditable(false);
        txtRuta.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        panel.add(txtRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 58, 155, 25));

        lblFoto.setBackground(new java.awt.Color(204, 255, 204));
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panel.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 19, 118, 100));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/limpiar.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Color del carro:");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 173, -1, 24));

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        panel.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 173, 182, 26));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Piel de los acientos:");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 229, -1, -1));

        txtPiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPielActionPerformed(evt);
            }
        });
        panel.add(txtPiel, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 219, 182, 28));

        jButton6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton6.setText("Salir");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        panel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 88, -1));

        jButton7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton7.setText("Menu cliente");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        panel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 130, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/espiral.jpg"))); // NOI18N
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File ruta = new File(txtRuta.getText());
        this.ingresarRegistro(ruta);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        File ruta = new File(txtRuta.getText());
        this.modificarRegistro(ruta);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.eliminarRegistro();


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG "
                + "& GIF","jpg","png","gif");
        jf.setFileFilter(fil);
        jf.setCurrentDirectory(new File("Fotos"));
        int el = jf.showOpenDialog(this);
        if(el == JFileChooser.APPROVE_OPTION){
            txtRuta.setText(jf.getSelectedFile().getAbsolutePath());
            lblFoto.setIcon(new ImageIcon(txtRuta.getText()));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        clic_tabla = tabla.rowAtPoint(evt.getPoint());

        int codigo = (int)tabla.getValueAt(clic_tabla, 0);
        String nombre = ""+tabla.getValueAt(clic_tabla, 1);
        int telefono = (int)tabla.getValueAt(clic_tabla, 2);
        Object direccion = ""+tabla.getValueAt(clic_tabla, 3);
        String color = ""+tabla.getValueAt(clic_tabla, 4);
        String piel = ""+tabla.getValueAt(clic_tabla, 5);

        txtCodigo.setText(String.valueOf(codigo));
        txtNombre.setText(nombre);
        txtTelefono.setText(String.valueOf(telefono));
        txtDireccion.setText(String.valueOf(direccion));
        txtColor.setText(color);
        txtPiel.setText(piel);


        try{
            JLabel lbl = (JLabel)tabla.getValueAt(clic_tabla, 6);
            lblFoto.setIcon(lbl.getIcon());
        }catch(Exception ex){
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Limpiar_txt lp = new Limpiar_txt();
        lp.limpiar_texto(panel);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        dispose();
        JOptionPane.showMessageDialog(null,"Has salido del programa");
    }//GEN-LAST:event_jButton6MouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtPielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPielActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPielActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        Carros obj=new Carros();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7MouseClicked




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
            java.util.logging.Logger.getLogger(VentanaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPiel;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
