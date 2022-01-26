
public class Circulo {
    
    static float PI=3.1416f;
    private float radio;

    public float getRadio(){
        return radio;
    }
    
    public void setRadio(float radio){
        this.radio = radio;
    }
    /*
    public void SetRadio(float radio){
        if(radio<0){
            radio=0;
        }
        this.radio =radio;
    }
    */
    public float peremetro(){
        return 2*PI*radio;
    }
    
    public float area(){
        return 2*radio*radio;
    }
    public String tosString(){
        return "Circulo [radio=" + radio + "]";
    }
    
    
    
    
    
}
