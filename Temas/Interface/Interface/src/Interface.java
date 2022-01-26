
//87 chica
public class Interface {

    
    public static void main(String[] args) {
       Mujer m1 = new Mujer ();
       Persona.hablar(m1); // le pasamos un argumeto de tipo mujer
       
       Hombre h1 = new Hombre ();
       Persona.hablar(h1);
       
       Platillo platillo = new Platillo ();
       Persona.hablar(platillo);
       
       Postre postre = new Postre ();
       Persona.hablar(postre);
    }
    
}
