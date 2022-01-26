
public class AlgortimosDeOrdenamiento {
    
    int i ,j,temporal,pasadas;
    public AlgortimosDeOrdenamiento (){ //Constructor
    this.i=0;
    this.j=0;
    this.temporal=0;
    }
    
    //Meotodo Radix
    
    public void radix(int[] arreglo){
        int x,i,j;
        for(x = Integer.SIZE-1; x>=0 ; x--){//de 31 bytes hasta 0 Integer.SIZE-1....sería de 0 a 31 en realidad
            
            int auxiliar[] = new int[arreglo.length];//El vector aux es para estar moviendo los numeros,unidad ,decena y centanas
            j = 0; //Es un contador importante para programar todo lo demás
            for(i=0 ; i<arreglo.length ; i++){
                boolean mover = arreglo[i] << x >=0;//x>=0 Me devolvera un true o un false, que le vamos asignar a arreglo en la posicion[i], que se llama "mover"
                /*
                if(x>y){
                   mayor =x;
                }else{
                    mayor=y;
                }
                Operador Ternario ?
                resultado=(condicion)?valor1:valor2
                mayor=(x>y)?x:y; // Donde se quiere guardar el resultado
                */
                if(x==0 ? !mover:mover){// Si x==0(esa es mi condicion) entonces sábes que entonces evaluame  y niega (mover) el operador ternario  y lo comparas con el orginal
                    // si resulta verdadero
                    auxiliar[j]=arreglo[i];
                    j++;    
                }else {
                    arreglo[i-j]=arreglo[i];//Si es falso se le asigna lo que tiene en arreglo(i) 
                    System.out.print("["+arreglo[i-j] + "]");
                }
            } //Fin For
            
            //Para que me vaya copiando lo que tengamos el arreglo auxiliar
            for(i=j;i<auxiliar.length;i++){ 
                auxiliar[i]=arreglo[i-j]; // Para ir copiando 
               
            }
            arreglo=auxiliar;
        }
        System.out.println("El arreglo ordenado con Radix es: ");
        mostrarArreglo(arreglo);
    }
    
    //Método Mezcla Natural 
    public void mezclaNatural(int arreglo[]){
        int izquierda=0,izq=0,derecha=arreglo.length-1,der=derecha;
        boolean ordenado=false;
        do{
            ordenado=true;
            izquierda=0;// Se va estar repetiendo por eso la inicializamos en cero
            while(izquierda< derecha){ //Tenemos que ver que los elementos esten ordenaos en tuplas
                izq=izquierda;
                while(izq<derecha && arreglo[izq]<=arreglo[izq+1]){
                    izq++;//Para ir checnaod si estan ordenados
                }
                der=izq+1;
                while(der == derecha-1 || der< derecha &&  arreglo[der]<=arreglo[der+1]){//Va ir buscando los que ya esten ordenados
                    der++;
                }
                //Para la fusion
                if(der<=derecha){//Quiere decir que hay que mandar a ordenar
                    mezclaDirecta(arreglo); // se lo mandamos para que ordene
                    ordenado=false;
                }
                izquierda=izq;
            }
            
        }while(!ordenado); //!ordenado la negacion de ordenado
    }   
    
    //Metodo Mezcla directa
    
    public int [] mezclaDirecta(int [] arreglo){
        int i,j,k;
        //Validamos si el arreglo es tamaño 1 o 0
        if( arreglo.length > 1){ // Que si hay algo que ordenar
            
            int nElementosIzq = arreglo.length/2; // Con esto sabemos de que tamaño es la sublista izq
            int nElementosDer= arreglo.length-nElementosIzq;
            
            int arregloIzq[]= new int [nElementosIzq];//Este arreglo izq tiene los elementos de la sublista izq
            int arregloDer[]= new int [nElementosDer];//Este arreglo izq tiene los elementos de la sublista der
            
            //Copiando los elementos de  parte primera a al arreglo Izq
            
            for(i = 0; i<nElementosIzq ; i++){
                arregloIzq[i]= arreglo[i];//Para copiar la sublista izq a nuestro arreglo
            }
            //Copiando los elementos de  parte primera a al arreglo Der
            
            for(i =nElementosIzq ; i<nElementosIzq+nElementosDer ; i++){
                arregloDer[i-nElementosIzq]= arreglo[i];
            }
            //Recursividad
            arregloIzq=mezclaDirecta(arregloIzq);
            arregloDer=mezclaDirecta(arregloDer);
            
            //Para ordenar
            
            i=0;
            j=0;
            k=0;
            
            while(arregloIzq.length != j && arregloDer.length != k){ /*indice j para izq,indice k para der, i para arreglo ori)*/
                  
            if(arregloIzq[j]<arregloDer[k]){
                      arreglo[i]=arregloIzq[j];
                      i++;
                      j++ ;       
                  }else{
                       arreglo[i]=arregloDer[k];
                       i++;
                       k++;
                    }
        
            }//Fin while
            //Arreglo Final,uniendo las sublistas
            while(arregloIzq.length!=j){
                arreglo[i]=arregloIzq[j];
                i++;
                j++;
            }
            //Para ala parte derecha
            while(arregloDer.length!= k){
                arreglo[i] = arregloDer[k];
                i++;
                k++;
        }
        
    }//Fin de if principal
     return arreglo ;   
}
    
    
    
    //Mostrar los datos del vector
    public void mostrarArreglo(int[]  arreglo){
        int k;// crear una variable local ,por que cada vez que se mandan a llamar los valores se alteran
        for(k=0;k<arreglo.length;k++){
            System.out.print("["+arreglo[k] + "]");// lo concatenamos
            
        }
        System.out.println();
    }
    
    
    
    
}
