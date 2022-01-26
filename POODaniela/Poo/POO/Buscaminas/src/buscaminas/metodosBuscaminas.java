package buscaminas;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;//implementación de hilos logrado.

public class metodosBuscaminas {
    /*MÉTODO PARA VALIDAR LAS DIMENSIONES DEL BUSCAMINAS*/
    public int validarDimensionBuscaminas(){
        int N;
        Scanner sc=new Scanner(System.in);
        do{
            
         System.out.println("Vamos a crear tu campo de juego.\n"
                   + "Este deberá ser cuadrado (nxn)"); 
         System.out.println("Ingrese el número n");
         N=sc.nextInt();
         if(N<9||N>20){
             System.out.println("Mínimo 9, Máximo 20");
         }
        }while(N<9||N>20);
        return N;
    }
    /*MÉTODO QUE PERMITE VALIDAR EL NUMERO DE MINAS*/
    /* Minimo de minas 10, maximo # de casillas entre 2-----(N*N/2)*/
    public int validarNumeroMinas(int N){
        int minas=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Ingrese el número de minas:\n"
                    + "\t Mínimo 10, Máximo "+ ((N*N)/2));
            minas=sc.nextInt();
            if(minas<10||minas>((N*N)/2)){
                System.out.println("Valor no aceptado, intentalo de nuevo");
            }
        }while(minas<10||minas>((N*N)/2));
        return minas;
    }
    
/*MÉTODO PARA GENERAR BUSCAMINAS*/
    public void generarBuscaminas(char A[][],int N,int minas){
        int i,j,k=0,a,b;
        while(k<minas) {
            int colu=ThreadLocalRandom.current().nextInt(9,20+1), fil=ThreadLocalRandom.current().nextInt(9,20+1);
            A[colu%N][fil%N]='*';
            k=0;
            for(i=0;i<N;i++) {
                for(j=0;j<N;j++) {
                    if(A[i][j]=='*') {
                        k=k+1;
                    }else {
                        A[i][j]='0';
                    }
                }
            }
        }
    }
    /*MÉTODO PARA COLOCAR LOS DIGITOS EN EL INTERIOR DEL BUSCAMINAS*/
    public void contarMinas(char A[][],int N){
         int i,j,k=0,n=0;
        for(i=0;i<N;i++) {
            for (j=0;j<N;j++) {
                 if(A[i][j]!='*') {
                    k=j-1;
                    n=0;
                    while(k<=j+1) {
                        if (A[i-1][k]=='*') {
                            n=n+1;
                        }
                        if(A[i][k]=='*' && k!=j) {
                            n=n+1;
                        }
                        if(A[i+1][k]=='*') {
                            n=n+1;
                        }
                        k=k+1;
                    }
                    if(n!=0) {
                        leerColocarDigitoBuscaminas(A,i,j,n);      
                    }
                }
            }
        }
    }
    /*MÉTODO QUE COLOCA EL DIGITO CORRESPONDIENTE EN UNA CASILLA, (NÚMERO DE MINAS CERCA)*/
    public void leerColocarDigitoBuscaminas(char A[][],int i,int j,int n) {
        if(n==1) {
            A[i][j]='1';
        }else {
            if(n==2) {
                A[i][j]='2';
            }else {
                if(n==3) {
                    A[i][j]='3';
                }else {
                    if(n==4) {
                        A[i][j]='4';
                    }else {
                        if(n==5) {
                            A[i][j]='5';
                        }else {
                            if(n==6) {
                                A[i][j]='6';
                            }else {
                                if(n==7) {
                                    A[i][j]='7';
                                }else {
                                    if(n==8) {
                                        A[i][j]='8';
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    /*MÉTODO QUE PERMITE LLENAR UNA MATRIZ AUXILIAR LA CUAL SERVIRA PARA 
           MOSTRAR LAS CASILLAS DESTAPADAS DEL BUSCAMINAS*/

    public void matrizBanderaAuxiliar(int B[][],char A[][],int N) {
        limpiarMatriz(B,N);
        int i=0,j=0,k=0;
        for(i=0;i<N;i++) {
            for(j=0;j<N;j++) {
                if(A[i][j]=='0') {   
                    k=j-1;
                    while(k<=j+1) {
                        if(0<=k && k<N && i<N-1) {
                            B[i+1][k]=-1;
                        }
                        if(0<=k&&k<N) {
                            B[i][k]=-1;
                        }
                        if(0<=k && 0<i && k<N) {
                            B[i-1][k]=-1;
                        }
                        k=k+1;
                    }   
                }else {
                    if(B[i][j]!=-1) {
                        B[i][j]=1;
                    }
                }          
            }
        }
    }
    /*MÉTODO PARA LIMPIAR UNA MATRIZ DE ENTEROS*/
    public void limpiarMatriz(int B[][], int N){
        int i,j;
        for(i=0;i<N;i++) {
            for(j=0;j<N;j++) {
                B[i][j]=0;
            }
        }    
    }
    /*MÉTODO QUE REPORTA EL BUSCAMINAS CON CASILLA DESTAPADA*/

    public void reportarBuscaminasCasillaDestapada(int N,int n,int m,int B[][],char A[][]) {
        int i=0,j=0,X,Y;
            X=n-1;
            Y=m-1;
            for(i=0;i<N;i++) {
            for(j=0;j<N;j++) {
                if(i==X && j==Y) {
                    if(B[i][j]==-1 && A[i][j]=='0') {
                        verificarAdyacente(B,i,j);
                        i=N;
                    }else {
                        B[i][j]=0;
                        i=N;
                    }
                }
            }
        }
    }
    
    /*MÉTODO PARA ANALIZAR LAS CASILLAS ADYACENTES A UNA CASILLA VACIA*/

    public void verificarAdyacente(int B[][],int i, int j) {
        B[i][j]=0;
        if(B[i][j-1]==-1) {
            verificarAdyacente(B,i,j-1);
        }
        if(B[i][j+1]==-1) {
            verificarAdyacente(B,i,j+1);
        }
        if(B[i-1][j]==-1) {
            verificarAdyacente(B,i-1,j);
        }
        if(B[i+1][j]==-1) {
            verificarAdyacente(B,i+1,j);
        }
    }
    /*MÉTODO QUE PERMITE MOSTRAR LO QUE CONTIENE EN UNA CASILLA*/

    public void mostrarContenidoCasillaDestapada(int B[][],char A[][],int N) {
        int i=0,j=0;
        for(i=0;i<N;i++) {
            if(i<j) {
                System.out.println("\n\n");
                //printf("  %c",186);
            }
            for(j=0;j<N;j++) {
                if(B[i][j]==0) {
                    System.out.println(A[i][j]);
                    if(j<N-1) {
                        System.out.println("  ");
                    }
                }else {
                    //printf("%c",219);
                    if(j<N-1) {
                        System.out.println("  ");
                    }
                }
            }
        }
    }
    
    
    /* MÉTODO QUE PERMITE SEGUIR JUGANDO MIENTRAS
   NO SE ENCUENTRE UNA MINA*/
   /*"Retorna" 1 si la casilla no contiene una mina y -1 si la casilla esta ocupada por una mina*/

    public int verificarCasillaDestapada(char A[][],int n,int m,int N) {
        int i,j,X,Y;
        int digito=0;
        X=n-1;
        Y=m-1;
        for(i=0;i<N;i++) {
            for(j=0;j<N;j++) {
                if(i==X&&j==Y) {
                    if(A[i][j]!='*') {
                        digito=1;
                        i=N;
                    }else {
                        digito=-1;
                        i=N;
                    }
                }
            }
        }
        return digito;
    }
    /*MÉTODO QUE PERMITE VERIFICAR SI EL JUGAGOR A 
  GANADO CONTANDO LAS CASILLAS SIN DESTAPAR*/
  /* Si el # de casillas tapadas es igual al numero de minas el jugador gana*/
  
    public int ContarMinasSinDestapar(int N,int B[][]) {
        int i=0,j=0,cont=0;
        for(i=0;i<N;i++) {
            for(j=0;j<N;j++) {
                if(B[i][j]==1) {
                    cont=cont+1;
                }
            }
        }
        return cont;
    }  
}
