
//Java fx ha 6 y 7
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;//Contenedor
import javafx.scene.control.Label;//Label mandando el mensaje
import javafx.scene.control.Button;

public class EjemploButton extends Application  {
    //Creando las instancias
    Scene miEscena;
    Pane contenedor;
    Button btnNuevo,btnGuardar,btnCancelar;
    Label lblMensaje;
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage miEscenario){
        //Creando actores principales
        btnNuevo = new Button("Nuevo");
        btnNuevo.setMinWidth(80);
        btnNuevo.setTranslateX(20);
        btnNuevo.setTranslateY(20);
        btnGuardar = new Button("Guardar");
        btnGuardar.setMinWidth(80);
        btnGuardar.setTranslateX(120);
        btnGuardar.setTranslateY(20);
        btnCancelar = new Button("Cancelar");
        btnCancelar.setMinWidth(80);
        btnCancelar.setTranslateX(220);
        btnCancelar.setTranslateY(20);
        lblMensaje = new Label ("Mensaje");
        lblMensaje.setTranslateX(120);
        lblMensaje.setTranslateY(70);
        contenedor = new Pane();
        //Vaciando a los actores
        contenedor.getChildren().addAll(btnNuevo,btnGuardar,btnCancelar,lblMensaje);
        //Creando la escena
        miEscena = new Scene(contenedor);
        //Personalizando el esceneario
        //Dando evento a los botones
        btnNuevo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                //Instrucciones para los botones
                lblMensaje.setText("Pulsaste el boton nuevo");
            }
        });
        //Utilizando expresiones Lamba
        btnGuardar.setOnAction(evento -> lblMensaje.setText("Pulsaste el btn Guardar"));
        btnCancelar.setOnAction(evento -> cancelar());//Llamamamos al metódo cancelar
        
        miEscenario.setTitle("Ejemplo con Button");
        miEscenario.setMinWidth(350);
        miEscenario.setMinHeight(150);
        
        //Asignando el escenario a la escena
        
        miEscenario.setScene(miEscena);
        miEscenario.show();
       
    }
    
    public void cancelar (){
        lblMensaje.setText("Pulsaste el btn Cancelar");
    }
    
}
