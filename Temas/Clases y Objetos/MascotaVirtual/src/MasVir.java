
public class MasVir {
    
    //Creamos los atributos de mascota virtual (todos los atributos son privados)
    private String nombre;
    private int peso;
    private float conocimiento;
    private int cantidadEstudios; // No puedo estudiar todo el dia
    private int cantidadAcciones;//Cada 6 acciones la mascota aumenta 1 año
    
    
//Creamos nuestro constructor insertando codigo con click 
    public MasVir(String nombre) {
        this.nombre = nombre;
        this.peso=500;//menos  de 200 y con mas de 1000 se moria
        this.conocimiento=0;
        this.cantidadEstudios=0;//cantidad de estudios
        this.cantidadAcciones=0;//cantidad de acciones
    }
    
    //El return es cuando quiero que devuelva algo
    public String getEstado(){
        
        String estado ="";
        if(!this.estaVivo()){
            estado +="\n------------------";//Ponemos un marco
            estado +="\n     D E A D     :( ";
            
        }
        
        estado +="\n------------------";//Ponemos un marco
        estado +="\nNOMBRE: "+ this.nombre; // retornamos el nombre de la macota
        estado +="\nPESO: "+ this.peso; // retornamos el peso de la macota
        estado +="\nProfesion: "+ this.getProfesion(); // retornamos el conocimiento de la mascota
        estado +="\nEdad: "+ this.getEdad(); // retornamos el conocimiento de la mascota
        
        estado +="\n------------------";//Ponemos un marco
        return estado;
    }
    //El metodo alimentar modifica el peso
    public String alimentar(int tipo){ //Recibe el tipo de alimento
        if(tipo==1) peso+=30; //Retornara el tipo de alimento que le hemos dado
        if(tipo==2) peso+=50;
        if(tipo==3) peso+=100;
        
        this.cantidadEstudios =0;//cada vez que aliemente la cantidad de estudios se volvera cero
        this.cantidadAcciones ++;
        return "^_^( yommy yommy )";//Esta comiendo
    }    
    public String ejercitar(int tipo){ //Recibe el tipo de ejercicio
        if(tipo==1) peso-=30; //El ejercicio baja el peso
        if(tipo==2) peso-=50;
        if(tipo==3) peso-=100;
        this.cantidadAcciones++;
        return "U_U( uffff )";//Esta ejercitando
    }
    private boolean tienehambre(){ // Metodo privada porque no se ocupara desde fuera
        if(this.cantidadEstudios >=3){ //despues de cada 3 estudios la mascota tiene hambre
           return true; 
        }else{
            return false;
        }
            
    }
    public boolean estaVivo(){
        if(this.peso>1000){
            return false;
        }
        if(this.peso<200){
            return false;
        }
        if(this.getEdad()==2){ // Puede ser asi ...if(this.getEdad()==5) return fale;
            return false;
        }
        return true;
    }
    
    public String estudiar(){ // Aumenta el conocimiento
        if(tienehambre()){ //Debemos preguntar si tiene hambre antes de hacer ejercicio
           return "No puedo estudiar...tengo hambre :(";
        }
        this.cantidadEstudios++; // aumentara la cantidad de estudios en 1 ,cada vez que estudie
        this.conocimiento += 0.5;
        this.cantidadAcciones++;
        return "U_U( uffff )";//Esta ejercitando
    }
    
    private int getEdad(){
        int edad = (this.cantidadAcciones/3); // 6 la cantidad de acciones que puede hacer
        return edad;
    }
    
    private String getProfesion(){
        if(this.conocimiento<1) return "Vago";
        if(this.conocimiento<3) return "Estudiante basica";
        if(this.conocimiento<5) return "Estudiante basica";
        if(this.conocimiento<7) return "Estudiante media";
        if(this.conocimiento<8) return "Estudiante universitaria";
        if(this.conocimiento<9) return "Profesor";
        if(this.conocimiento<10) return "Cientifico Loco)";
        return "Dios";
}
}
