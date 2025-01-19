//13 Hehegar
/*Encapsulamiento.
Se denomina asi al ocultamiento del estado,es decir ,de los datos(atributos)
miembro de un objeto de manera que solo pueda cambiar mediante las operaciones
definidas para ese objeto.
-Acceso prohibido.
-Solo se accede atraves de metódos Get and Set*/

public class Encapsulamiento {

    public static void main(String[] args) {
        //Paso 4, 
        
        Alumno alu1=new Alumno();
        Alumno alu2=new Alumno();
        
        //Paso 5, Accedemos al numero de control mientras el set
        alu1.setNoControl(12345);
        alu1.nombre="Rafael";
        alu1.apellidos="Rafael Rodrigo";
        alu1.setEmail("andrewRiordan@gmail.com");
        
        alu1.verDatos();
        //Para acceder al NoControl usamos el get ,de otra manera no saldría
        System.out.println("Accediento al numero de control: "
                +alu1.getNoControl()+" ,que es privado");
    }
    
}
