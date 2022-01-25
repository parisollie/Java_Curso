
//14 Java Fx Haegar
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;


public class JavaFx14NodoComboBox extends Application {
    Scene miEscena;
    Pane contenedor;
    ComboBox<String>cmbCarreras;
    Label lblPregunta,lblSeleccion;
    

    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage miEscenario){
        lblPregunta = new Label("Qué carrera estás estudiando ?");
        lblPregunta.setTranslateX(20);
        lblPregunta.setTranslateY(20);
        
        cmbCarreras = new  ComboBox<>();
        cmbCarreras.setTranslateX(20);
        cmbCarreras.setTranslateY(60);
        //Agregando los items
        cmbCarreras.getItems().addAll("Veterinaria","Relaciones Int.","Medicina");
        cmbCarreras.getSelectionModel().selectFirst();//selectFirst() que en atumatico ya este seleccionado
        cmbCarreras.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
            @Override
            public void changed(ObservableValue<? extends String>x,String anterior,String actual){
                lblSeleccion.setText(actual);
            }
        });
        lblSeleccion = new Label();
        lblSeleccion.setTranslateX(100);
        lblSeleccion.setTranslateY(160);
        lblSeleccion.setText("Veterinaria");
        //Al momento de no tener nada seleccionado ,esto hará nos aparezca por defecto
        
        contenedor = new Pane ();
        contenedor.getChildren().addAll(lblPregunta,cmbCarreras,lblSeleccion);
        miEscena= new Scene(contenedor);
        miEscenario.setTitle("Ejemplo del nodo Combo box");
        miEscenario.setMinWidth(350);
        miEscenario.setMinHeight(300);
        miEscenario.setScene(miEscena);
        miEscenario.show();
    }
}