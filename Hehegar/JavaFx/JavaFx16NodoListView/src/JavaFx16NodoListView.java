//14 Java Fx Haegar
import javafx.application.Application;
import javafx.beans.value.ChangeListener;//Nos sirve para saber cuando se cambia la lista
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JavaFx16NodoListView extends Application {
    Scene miEscena;
    Pane contenedor;
    Label lblPregunta,lblSeleccion;
    ListView<String>lstLenguajes;//Nuestra lista de lenguajes de programación
    Button BtnNuevo,BtnAgregar,BtnEliminar;
    TextField txtNuevo;
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage miEscenario){
        
        lblPregunta = new Label("Qué lenguaje de programación prácticas más?");
        lblPregunta.setTranslateX(20);
        lblPregunta.setTranslateY(20);
        
        lblSeleccion = new Label("Aún no has seleccion un lenguaje");
        lblSeleccion.setTranslateX(20);
        lblSeleccion.setTranslateY(270);
        
        lstLenguajes = new ListView<>();
        //Creamos los items
        lstLenguajes.getItems().addAll("Java","Phyton","C","Ruby");
        //Colocamos en un lugar en especifico a nuestro list view
        lstLenguajes.setTranslateX(20);
        lstLenguajes.setTranslateY(50);
        lstLenguajes.setMaxSize(200, 200);
        //Agregando el evento
        lstLenguajes.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
            @Override
            public void changed(ObservableValue <? extends String> x,String anterior,String actual){
                lblSeleccion.setText("Has seleccionado el lenguaje: "+ actual);
            }
        });
        
        BtnNuevo = new Button("Nuevo");
        BtnNuevo.setTranslateX(300);
        BtnNuevo.setTranslateY(50);
        BtnNuevo.setPrefSize(120, 30);//Le damos tamaño al boton
        
        txtNuevo = new TextField();
        txtNuevo.setTranslateX(300);
        txtNuevo.setTranslateY(100);
        txtNuevo.setPrefSize(120, 30);//Le damos tamaño al boton
        txtNuevo.setVisible(false);//Para no aparezca visible inmediatamente
        
        BtnAgregar = new Button("Agregar");
        BtnAgregar.setTranslateX(300);
        BtnAgregar.setTranslateY(150);
        BtnAgregar.setPrefSize(120, 30);//Le damos tamaño al boton
        
        BtnEliminar = new Button("Eliminar");
        BtnEliminar.setTranslateX(300);
        BtnEliminar.setTranslateY(200);
        BtnEliminar.setPrefSize(120, 30);//Le damos tamaño al boton
        
        BtnNuevo.setOnAction(e->nuevo());//Mandamos a llamar al metodo nuevo
        BtnAgregar.setOnAction(e->agregar());//Mandamos a llamar al met agregar
        BtnEliminar.setOnAction(e->eliminar());
        
        contenedor = new Pane ();
        contenedor.getChildren().addAll(lblPregunta,lstLenguajes,lblSeleccion,txtNuevo,BtnNuevo,BtnAgregar,BtnEliminar);
        miEscena= new Scene(contenedor);
        miEscenario.setTitle("Ejemplo de ListView");
        miEscenario.setMinWidth(500);
        miEscenario.setMinHeight(350);
        miEscenario.setScene(miEscena);
        miEscenario.getIcons().add(new Image(JavaFx16NodoListView.class.getResourceAsStream("/Imagenes/July.Jpg")));
        miEscenario.show();
    }
    //Métodos
    
    public void nuevo(){
        txtNuevo.setVisible(true);//Para que aparezca
        BtnAgregar.setDisable(false);//Para habilitarlo nuevamente
    }
    public void agregar(){
        //Validar que al escribir algo se agregue
        if(txtNuevo.getText().equals("")){
            lblSeleccion.setText("No has escrito nada !");
        }else{
            lstLenguajes.getItems().add(txtNuevo.getText());//agregamos el texto
            txtNuevo.setText("");
            txtNuevo.setVisible(false);//Para que nos quite nuevamente
            BtnAgregar.setDisable(true);//Para quese desactve
        }
    }
    public void eliminar(){
        int indice;
        indice = lstLenguajes.getSelectionModel().getSelectedIndex();
        //Cuándo seleccionamos nuestro indice
        if(indice != -1){//!=-1 es que hay lenguajes
            lstLenguajes.getItems().remove(indice);
            lstLenguajes.getSelectionModel().select(-1);//para que el usuario afuerza elimine uno
        }
    }
}

