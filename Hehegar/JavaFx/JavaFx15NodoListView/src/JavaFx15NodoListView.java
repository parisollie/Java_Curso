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


public class JavaFx15NodoListView extends Application {
    Scene miEscena;
    Pane contenedor;
    Label lblPregunta,lblSeleccion;
    ListView<String>lstLenguajes;//Nuestra lista de lenguajes de programación

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
        
        contenedor = new Pane ();
        contenedor.getChildren().addAll(lblPregunta,lstLenguajes,lblSeleccion);
        miEscena= new Scene(contenedor);
        miEscenario.setTitle("Ejemplo de ListView");
        miEscenario.setMinWidth(350);
        miEscenario.setMinHeight(350);
        miEscenario.setScene(miEscena);
        miEscenario.getIcons().add(new Image(JavaFx15NodoListView.class.getResourceAsStream("/Imagenes/July.Jpg")));
        miEscenario.show();
    }
}
