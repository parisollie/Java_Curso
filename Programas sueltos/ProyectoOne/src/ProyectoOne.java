

public class ProyectoOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgortimosDeOrdenamiento ordenar=new AlgortimosDeOrdenamiento();//Creamos una instancia
        int vector2[]={55,4,43,44,2,10,4567,638,3,10,-5,-9};
       
       /*Mezcla Natural
        System.out.println("\t.:Mezcla Natural:.\t\n");
        System.out.println("Arreglo vector2 Original: ");
        ordenar.mostrarArreglo(vector2);
        System.out.println("Arreglo original con Mezcla Natural");
        ordenar.mezclaNatural(vector2);
        ordenar.mostrarArreglo(vector2);
       
       */
       
        
        //Radix
        System.out.println("\t.:Radix:.\t\n");
        System.out.println("Arreglo Orginal");
        ordenar.mostrarArreglo(vector2); //Para que me muestre el vector original
        ordenar.radix(vector2);
    
    }
}
