
public class PruebaEmpleado {

    public static void main(String[] args) {
         
        Gerente gerente = new Gerente ();
        //Gerente hereda todos los atributos y métodos
        //de Empleado (reusa código)
        gerente.setNombre("Ivan Moreno");
        gerente.setNumEmpleado(1234);
        gerente.setSueldo(15000);
        System.out.println("Nombre: "+ gerente.getNombre());
        System.out.println("Numero de empleado: "+ gerente.getNumEmpleado());
        System.out.println("Sueldo: "+gerente.getSueldo());
        //Y tiene metodos y atributos propios
        gerente.setPresupuesto(6000);
        /*
        System.out.println("Presupuesto: "+gerente.getPresupuesto());
        gerente.asignarPresupuesto(6000);
        System.out.println("Nuevo presupuesto: "+gerente.getPresupuesto());
        */
         //Se manda a llamar el metodo toString, el cual fue sobreescrito en la clase empleado
         System.out.println(gerente);
         /*
        Gerente gerente = new Gerente();
        //Instanceof permite validar si un objeto es de un tipo especifco
        if(gerente instanceof Gerente){
            System.out.println("Instancia de Gerente.");
        }
        //Como gerente hereda de empleado tambien es de tipo empleado
        if(gerente instanceof Empleado){
            System.out.println("Instancia de Empleado.");
        }
        if(gerente instanceof Object){
            System.out.println("Instancia de Objeto.");
        }
        */
        
    }
    
}
