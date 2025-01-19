//Hehegar-8

/*Metódo son sub-programas 
y definen el comportamiento de los objetos de una clase*/

public class Metodo {
    public static void main(String[] args) {
        /*Paso 3,creamos la instancia de "Auto",porque así se llama mi segunda
        clase "Auto"*/
        Auto primerAuto = new Auto();
        
        //Paso 4, llamamos a los metódos que creamos.
        primerAuto.arrancaruto();
        primerAuto.acelerarauto();
        primerAuto.frenarauto();
        primerAuto.apagarauto();
    }    
}
