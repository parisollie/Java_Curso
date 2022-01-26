//86 chica Implementacion de interfaces no gráficas
public class Polimorfismo86 {

    public static void main(String[] args) {
        
        Mujer m1 = new Mujer ();
        //m1.hablar(); // No se puede hacer asi por que el metodo hablar hablar y necesita el método estatico para poderse usar
        Persona.hablar(m1);
        
        
        Hombre h1 = new Hombre();
        Persona.hablar(h1);
        
        //El compilador no sabe exacatamente lo que le vamos a pasar que objeto a la funcion hablar,no sabe si es tipo de mujer o hombre
        
        niños n1 = new niños();
        Persona.hablar(n1);
        
    
    }
    
}
