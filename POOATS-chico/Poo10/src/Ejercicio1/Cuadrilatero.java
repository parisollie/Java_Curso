/*
71.-Construir un programa que calcule el área y el perimetro de un cuadrilatero dada la longitud 
de sus lados.Los Valores de la longitud deberán introducirse por la línea de ordenes.Si es un
cuadrado,solo se proprocionará la longitud de uno de los lados al constructor.
 */
package Ejercicio1;

public class Cuadrilatero {
    //Atributos
    //Usando encapsulamiento
    private float lado1;
    private float lado2;
   
   //Métodos constructor 1(siempre y cuando sea un cuadrilatero)
    
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Método constructor 2 (Cuadrado)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2=lado1;//Estamos igualando el lado 1 a los dos lados porue es un cuadrado
    }
    
    public float getPerimetro(){
        float perimetro = 2*(lado1+lado2);
        return perimetro;
    }
    
    public float getArea(){
        
        float area = (lado1*lado2);
        return area;
    }
    
 }
