
//Etiquetas y campos de texto java fx 5 Haegar
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EtiquetasyCamposDeTexto  extends Application {
    Scene miEscena;
    Pane contenedor;
    Label lblNombre, lblApellido;
    TextField txtNombre, txtapellidos;

   
    public static void main(String[] args) {
         Application.launch(args);//ejecutamos
    }
    @Override
    public void start(Stage miEscenario){//De parametros siempre va Stage
        lblNombre = new Label("Nombre: ");
        lblNombre.setTranslateX(20); //Estamos ubicando a nuestras labels
        lblNombre.setTranslateY(20);
        txtNombre = new TextField();
        txtNombre.setTranslateX(90);
        txtNombre.setTranslateY(20);
        
        lblApellido = new Label("Apellidos: ");
        lblApellido.setTranslateX(20);
        lblApellido.setTranslateY(60);
        txtapellidos = new TextField();
        txtapellidos.setTranslateX(90);
        txtapellidos.setTranslateY(60);
       
        //Creando al contenedor
        contenedor = new Pane();
        contenedor.getChildren().addAll(lblNombre,lblApellido,txtNombre,
                txtapellidos);//Agregamos una coleccion
        //Creamos la escena
        miEscena = new Scene(contenedor);//Ponemos en la escena al contenedor dónde estan los actores
        miEscenario.setTitle("Ejemplo de Label y textField");
        miEscenario.setMinWidth(300);
        miEscenario.setMinHeight(150);
        //Asignamos la escena al escenario
        miEscenario.setScene(miEscena);//Asignale a la escena
        
        //Mostramos el esceneario
        miEscenario.show();
        
        
    }
}
