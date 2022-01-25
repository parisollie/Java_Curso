//masterH-4 Realizando los import necesarios
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;//Nuestro nodo

public class JavaFxapp1 extends Application {//Hereda
    

    public static void main(String[] args) {
        
        Application.launch(args);
    }
    @Override
    public void start(Stage miEscenario){//De parametros siempre va Stage
        //Creamos un nodo tip Text
        Text miTexto = new Text("Welcome");
        //Creamos el contenedor
        VBox contenedor = new VBox ();
        //Agregamos el texto al nodo de tipo texto al contenedor
        contenedor.getChildren().add(miTexto);
        //Asignamos tamaño al contenedor
        contenedor.setMinSize(350, 250);
        //Creamos una escena y le asignamos el contenedor
        Scene miEscena = new Scene(contenedor);
        //Asignamos propiedades al escenario
        miEscenario.setTitle("My first app javafx");
        miEscenario.setMinWidth(500);
        miEscenario.setMinHeight(500);
        //Asignamos la escena al escenario
        miEscenario.setScene(miEscena);//Asignale a la escena
        
        //Mostramos el esceneario
        miEscenario.show();
        
        
        
    }
    
}
