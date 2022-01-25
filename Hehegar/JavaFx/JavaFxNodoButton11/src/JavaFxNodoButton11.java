//11 Java FX RadioButon Haegar
import java.io.InputStream;//Una ruta de acceso
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;//Se acompaña de toggle
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;//Es dónde van todos los botones
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class JavaFxNodoButton11 extends Application {
    //Creando las instancias
    Scene miEscena;
    Pane contenedor;
    ToggleGroup grpEquipos;
    RadioButton rdbAmerica,rdbGuadalajara;
    Label lblEquipo;
    InputStream ruta;
    Image imagen;
    

    public static void main(String[] args) {
        Application.launch(args);
    }
     @Override
    public void start (Stage miEscenario){
        lblEquipo = new Label("Tu equipo favorito:");
        lblEquipo.setTranslateX(20);
        lblEquipo.setTranslateY(20);
        //Creando el grupo
        grpEquipos = new ToggleGroup();
        rdbAmerica = new RadioButton("America");
        rdbAmerica.setTranslateX(20);
        rdbAmerica.setTranslateY(50);
        //Agregando al ToggleGroup
        rdbAmerica.setToggleGroup(grpEquipos);
        rdbAmerica.setSelected(true);//Aparece seleccionado por defecto
        
        rdbGuadalajara = new RadioButton("Guadalajara");
        rdbGuadalajara.setTranslateX(170);
        rdbGuadalajara.setTranslateY(50);
        //Agregando al ToggleGroup
        rdbGuadalajara.setToggleGroup(grpEquipos);
        asignarImg();
        grpEquipos.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
            
            @Override
            public void changed(ObservableValue <? extends Toggle>x, Toggle anterior ,Toggle actual){
                if(grpEquipos.getSelectedToggle()!=null){//!=null Ya se izo un click
                    RadioButton rdbAux = (RadioButton) grpEquipos.getSelectedToggle(); 
                    //Nos permite saber cual se selecciono
                    lblEquipo.setText("Tu equipo es el "+rdbAux.getText());
                    System.out.println("El equipo anterior seleccionado es "+anterior);
                    System.out.println("El equipo anterior seleccionado es "+actual);
                }
            }
        
        });
                
        
        //creando contenedor
        contenedor = new Pane();
        contenedor.getChildren().addAll(lblEquipo,rdbAmerica,rdbGuadalajara);
        //Creando la escena
        miEscena = new Scene(contenedor);
        miEscenario.setTitle("Ejemplo nodo radio Button");
        miEscenario.setMinWidth(350);
        miEscenario.setMinHeight(150);
        miEscenario.setScene(miEscena);
        miEscenario.show();
   }
    public void asignarImg(){
        ruta = getClass().getResourceAsStream("/Imagenes/america.png");
        imagen = new Image(ruta, 24,24,false, true);//TAMAÑO DE LA IMAGEN
        //Se la asignamos al boton
        rdbAmerica.setGraphic(new ImageView(imagen));
        ruta = getClass().getResourceAsStream("/Imagenes/guadalajara.jpg");
        imagen = new Image(ruta, 24,24,false, true);//TAMAÑO DE LA IMAGEN
        //Se la asignamos al boton
        rdbGuadalajara.setGraphic(new ImageView(imagen));
        
    }
}
