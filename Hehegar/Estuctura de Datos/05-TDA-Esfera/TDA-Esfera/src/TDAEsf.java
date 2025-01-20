
public class TDAEsf {
    private double radio;
    //Constructor
    public TDAEsf(double radioInicial){
        if(radioInicial > 0){
            this.radio = radioInicial;
        }else{
            this.radio = 0.0;
        }
    }
    //Creamos los métodos u operaciones del TDAEsfera.
    
    public double getRadio(){
        return radio;
        //también podemos poner
        //return this.radio;
    }
    public double getDiametro(){
        return (radio*2);
    }
    public double getCirfunferencia(){
        return (Math.PI*getDiametro());
    }
    public double getArea(){
        return (4*Math.PI*radio*radio);
    }
    public double getVolumen(){
        return(4*Math.PI*Math.pow(radio, 3))/3;
    }
    
    
}
