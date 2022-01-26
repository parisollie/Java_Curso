

/*
Platillo no tiene nada que ver con persona pero ocmo implementa de interface,pude hacer uso del método comunicarse
*/

public class Platillo extends Comida implements Inter{
    
    //Sobree ecribimos el metodo comunicarse
    
    
    @Override
    public void comunicarse(){
        System.out.println("Este es un platillo delicioso");
    }
    
}
