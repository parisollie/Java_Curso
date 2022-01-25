//Hagear Javafx 18
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.SeparatorMenuItem;//para dar como espacio
import javafx.scene.image.Image;
import  javafx.application.Platform;//Para poder salirnos

public class JavaFxMenu18 extends Application {
    Scene miEscena;
    Pane contenedor;
    MenuBar barraDeMenus;
    Menu mnuArchivo,mnuTutoriales,mnuPython;
    MenuItem mnuItemAbrir, mnuItemGuardar, mnuItemSalir;
    CheckMenuItem chkMnuItmWXPython ,chkMnuItmPyQT,chkMnuItmTkinter;
    RadioMenuItem rdoMnuItmJava,rdoMnuItmJavaFX;
    ToggleGroup grupoJava;

    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start (Stage miEscenario){
        barraDeMenus = new MenuBar ();
        mnuArchivo = new Menu("Archivo");
        mnuItemAbrir = new MenuItem("Abrir");
        mnuItemGuardar = new MenuItem("Guardar");
        mnuItemSalir = new MenuItem("Salir");
        
        mnuItemSalir.setOnAction(e->Platform.exit());//Para salir
        mnuItemGuardar.setOnAction(e->System.out.println("Guardando..."));
        mnuArchivo.getItems().addAll(mnuItemAbrir,mnuItemGuardar,new 
        SeparatorMenuItem(),mnuItemSalir);
        mnuTutoriales = new Menu("Tutoriales");
        grupoJava = new ToggleGroup();
        rdoMnuItmJava = new RadioMenuItem ("Java");
        rdoMnuItmJava.setToggleGroup(grupoJava);//Es para agregarlos al grupo
        rdoMnuItmJavaFX = new RadioMenuItem ("JavaFx");
        rdoMnuItmJavaFX.setToggleGroup(grupoJava);//Es para agregarlos al grupo
        mnuTutoriales.getItems().addAll(rdoMnuItmJava,rdoMnuItmJavaFX,new SeparatorMenuItem());
        mnuPython = new Menu("Pyhton");
        chkMnuItmWXPython = new CheckMenuItem("Phyton");
        chkMnuItmTkinter = new CheckMenuItem("Tkinter");
        chkMnuItmPyQT = new CheckMenuItem("PyQT");
        //El menu que yo creee que se llama phyton
        
        mnuPython.getItems().addAll(chkMnuItmWXPython,chkMnuItmPyQT,chkMnuItmTkinter);
        
        mnuTutoriales.getItems().add(mnuPython);//Vaciame en el de tutoriales este
        barraDeMenus.getMenus().addAll(mnuArchivo,mnuTutoriales);//Le agregamos 
        //a la barra de tarea eso
        
        contenedor = new Pane ();
        contenedor.getChildren().addAll(barraDeMenus);
        miEscena= new Scene(contenedor);
        miEscenario.setTitle("Ejemplo de la creacion del Menu");
        miEscenario.setMinWidth(350);
        miEscenario.setMinHeight(300);
        miEscenario.setScene(miEscena);
        miEscenario.getIcons().add(new Image(JavaFxMenu18.class.getResourceAsStream("/Imagenes/Logo.png")));
        miEscenario.show();
    }
}
