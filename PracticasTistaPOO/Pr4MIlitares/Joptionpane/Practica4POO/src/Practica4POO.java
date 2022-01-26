//Programa con JoptionPane
/*Se creara un programa en el cual se pueda introducir:

-El nombre de una divicion militar.
-El nombre de la zona de divicion.
-El numero de batallones de la divicion.

Se creara el nombre de cada batallon,cada batallon tendra :

-El numero de identificador.
-El nombre de la categoria.
-La ubicacion del estado del batallon.
-El numero de militares de dicho batallon.

Despues se crearan los militares de dicho batallon con ciertos criterios:

-La matricula del militar.
-El nombre del militar.
-El nombre del grado del militar.

El programa nos enseñara cuantos militares se han creado ,asi como el
numero de batallones creados en ese momento.

-Nos mostrara los datos de la divicion:
-El nombre.
-la zona.
-El id del batallon.
-La categoria.
-La ubicacion.
-Los militares del batallon ,asi como sus datos correspondientes.

Finalmente nos dira se crearon un total de x batallones
y se crearon un total de x militares.
*/
import java.util.Scanner;
 
public class Practica4POO {
  
   
    public static void main(String[] args) {
        
        Division division1;
        division1 = Division.crearDivision();
        division1.imprimirDivision();
        
    }
    
    
}
