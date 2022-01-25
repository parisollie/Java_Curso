//12 Haegar
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;


public class JavaFxNodoCheckbox12 extends Application {
    Scene miEscena;
    Pane contenedor;
    Label lblPregunta,lblOrden;
    CheckBox chkCafe,chkLeche,chkPostre;
    Button btnOrdenar;
    String orden;//Voy guardando
    

    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage miEscenario){
        lblPregunta = new  Label("Qué deseas ordenar?");
        lblPregunta.setTranslateX(20);
        lblPregunta.setTranslateY(20);
        
        
        
        
        chkCafe =  new CheckBox ("Cafe");
        chkCafe.setTranslateX(20);
        chkCafe.setTranslateY(50);
        
        chkLeche =  new CheckBox ("Leche");
        chkLeche.setTranslateX(20);
        chkLeche.setTranslateY(80);
        
        chkPostre =  new CheckBox ("Postre");
        chkPostre.setTranslateX(20);
        chkPostre.setTranslateY(110);
        btnOrdenar = new Button("Ordenar");
        btnOrdenar.setMinWidth(90);
        btnOrdenar.setMinHeight(30);
        btnOrdenar.setTranslateX(100);
        btnOrdenar.setTranslateY(80);
        DropShadow sombra = new DropShadow();//Aplicando sombra
        btnOrdenar.setEffect(sombra);
        //Creando evento 
        btnOrdenar.setOnAction(e -> mostrarOrden(chkCafe,chkLeche,chkPostre));
        
        lblOrden = new Label("");
        lblOrden.setTranslateX(50);
        lblOrden.setTranslateY(200);
        
        contenedor = new Pane ();
        contenedor.getChildren().addAll(lblPregunta,chkCafe,chkLeche,chkPostre,btnOrdenar,lblOrden);
        miEscena= new Scene(contenedor);
        miEscenario.setTitle("Ejemplo del nodo Checkbox");
        miEscenario.setMinWidth(350);
        miEscenario.setMinHeight(300);
        miEscenario.setScene(miEscena);
        miEscenario.show();
    }
    //Metódo
    
    public void mostrarOrden(CheckBox chkC,CheckBox chkL,CheckBox chkP){
     
        orden = "Ordenaste: ";
        if(chkC.isSelected())//Si esta seleccionado haz
            orden = orden +"Café--->";
        if(chkL.isSelected())//Si esta seleccionado haz
            orden = orden +"Leche--->";
        if(chkP.isSelected())//Si esta seleccionado haz
            orden = orden +"Postre--->";
        if(!chkC.isSelected() && !chkL.isSelected() && !chkP.isSelected() )
            orden = orden +"No has seleccionado nada !";
        lblOrden.setText(orden);//Asignale lo que ordeno
    }
}
