package buscaminas;
import java.util.Scanner;

public class Buscaminas extends javax.swing.JFrame{ 
   
    public static void main(String[] args) {
        int N,minas,cont=0,X=0,Y=0;
        char A[][]=new char[30][30]; 
	int B[][]=new int[30][30];
        Scanner sc=new Scanner(System.in);
        metodosBuscaminas mB=new metodosBuscaminas();
        N=mB.validarDimensionBuscaminas();/*Inicia llamando a la funcion para crear las dimensiones de la matriz del buscaminas*/
        minas=mB.validarNumeroMinas(N); /* Llama a la función para agregar las minas al gusto del usuario */
        mB.generarBuscaminas(A,N,minas);/*Genera minas dadas por usuario*/
        mB.contarMinas(A,N);/*Coloca los digitos mientras no haya mina*/
        mB.matrizBanderaAuxiliar(B,A,N);
        do{
            System.out.println("Existen "+ minas+ " minas");
            do{
                System.out.println("Ingrese posición fila: ");
                X=sc.nextInt();
                System.out.println("Ingrese posición columna: ");
                Y=sc.nextInt();
                if(X>N||Y>N||X<=0||Y<=0){
                    System.out.println("Posición no válida");
                }
            }while(X>N||Y>N||X<=0||Y<=0);
            mB.reportarBuscaminasCasillaDestapada(N,X,Y,B,A);/*Verifica las coordenadas y "destapa" casilla*/
            mB.mostrarContenidoCasillaDestapada(B,A,N);
            cont=mB.ContarMinasSinDestapar(N,B);
            System.out.println("\n\n");
            if(mB.verificarCasillaDestapada(A,X,Y,N)!=1){
                System.out.println("¡PERDISTE! :(");
            }
            if(cont==minas&&mB.verificarCasillaDestapada(A,X,Y,N)==1){
                System.out.println("¡GANASTE! :)");
            }
        }while((mB.verificarCasillaDestapada(A,X,Y,N)==1)&&(cont!=minas));
        
    }
        
}
