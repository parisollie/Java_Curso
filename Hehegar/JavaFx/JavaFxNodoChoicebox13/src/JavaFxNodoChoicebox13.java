//13 Java Fx Haegar
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;


public class JavaFxNodoChoicebox13 extends Application {
    Scene miEscena;
    Pane contenedor;
    ChoiceBox<String> chbCarreras;
    Label lblPregunta,lblSeleccion,lblMensaje;
    

    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage miEscenario){
        lblPregunta = new Label("Qué carrera estás estudiando ?");
        lblPregunta.setTranslateX(20);
        lblPregunta.setTranslateY(20);
        chbCarreras = new ChoiceBox<>();
        chbCarreras.setTranslateX(20);
        chbCarreras.setTranslateY(50);
        //Agregando los items
        chbCarreras.getItems().addAll("Ing. Sistemas","Ing. Sw","Ing Industrial");
        lblMensaje = new Label("Tu carrera es: ");
        lblMensaje.setTranslateX(20);
        lblMensaje.setTranslateY(160);
        
        lblSeleccion = new Label();
        lblSeleccion.setTranslateX(100);
        lblSeleccion.setTranslateY(160);
        lblSeleccion.textProperty().bind(chbCarreras.valueProperty());
        //Obtenemos la seleccion con property y con el metodo bind enlazamos ,lo
        //enlazamos con el onservar value y lo que tenga carreras no los dará
        
        contenedor = new Pane ();
        contenedor.getChildren().addAll(lblPregunta,chbCarreras,lblMensaje,lblSeleccion);
        miEscena= new Scene(contenedor);
        miEscenario.setTitle("Ejemplo del nodo choice box");
        miEscenario.setMinWidth(350);
        miEscenario.setMinHeight(300);
        miEscenario.setScene(miEscena);
        miEscenario.show();
    }
}
