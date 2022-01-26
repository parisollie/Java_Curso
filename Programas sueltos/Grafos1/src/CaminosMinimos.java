
public class CaminosMinimos {
    
    //Metodo para determinar todos los caminos Floyd
    
    public String algoritmoFloyd(long[][] mAdy){//Recibe una matriz de tipo long porque es como si fuera el infinito
        
        int vertices=mAdy.length;//Para saber cuantos vertices tiene nuestra mtz
        long matrizAdyacencia[][] =mAdy;
        String caminos[][] = new String [vertices][vertices]; //Para ques e guarden los caminos de vertice a vertice
        String caminosAuxiliares[][] = new String[vertices][vertices];
        String caminoRecorrido = "",cadena = "" ,caminitos =""; //Cadena es para almacenar lo que vamos recorriendo
        int i,j,k;
        float temporal1,temporal2,temporal3,temporal4,minimo; // minimo, es para almacenar el camino minimo ir almacenandolo
        
        //Inicializando las matrices caminos y caminos auxiliares
        for(i = 0  ; i<vertices ;i++){
            for(j = 0 ; j<vertices ; j++){
                caminos[i][j]="";
                caminosAuxiliares[i][j]="";
            }
        }
        //Para empezar a buscar los caminos minimos
        for(k=0 ; k < vertices ; k ++){
             for(i=0 ; i < vertices ; i ++){
                  for(j=0 ; j < vertices ; j ++){
                      temporal1 = matrizAdyacencia[i][j];//Para ir ordenando e indicando donde esta el camino minimo
                      temporal2 = matrizAdyacencia[i][k];
                      temporal3 = matrizAdyacencia[j][k];
                      temporal4 = temporal2 +temporal3;
                      //Encontrando al minimo
                      minimo=Math.min(temporal1,temporal4);//.min compara el valor minimo para eso nuestro parametros temporal1 y temporal4
                      //Evaluando
                      if(temporal1 != temporal4){//Empieza a buscar el minimo
                          if(minimo == temporal4){//Checame si
                              caminoRecorrido = ""; // camino recorrido igual a nada
                              caminosAuxiliares[i][j] = k + "";
                              caminos[i][j] = caminosR(i,k,caminosAuxiliares,caminoRecorrido) + (k+1);//Haciendo método recursivo
                          }
                          
                      }
                      //Hacemos un cast porque minimo es de tipo flotante y nuestra matriz de adyacencia es tipo long
                      matrizAdyacencia[i][j]=(long)minimo;
                  }
            
            }
            
        }
        //Agregando el camino minimo  a cadena
        
        for(i = 0  ; i<vertices ; i++){
            for(j = 0 ; j<vertices ; j++){
                //Para crear nuestra matriz de pesos minimos
                cadena = cadena + "["+matrizAdyacencia[i][j]+"]";
            }
            cadena = cadena + "\n";
        }
         ///////////////////////////////////////////////
         for(i = 0  ; i<vertices ; i++){
            for(j = 0 ; j<vertices ; j++){
                //Para mostrar los caminos
                if(matrizAdyacencia[i][j]!= 1000000000){// si es diferente de inifito
                    if(i != j){ //Cuando se encuentra en el mismo ertice no tenemos aristas
                        if(caminos[i][j].equals("")){//.equals es igual a nada 
                            //caminitos + ....se esta concateanndo
                            caminitos +="De ("+(i+1)+"--->"+(j+1)+") Irse por ...("+(i+1)+", "+(j+1)+")\n";
                        }else{
                            caminitos +="De ("+(i+1)+"--->"+(j+1)+") Irse por ...("+(i+1)+", "+caminos[i][j]+", "+(j+1)+")\n";
                        }
                        
                        
                    }
                
         
                    
                    
                }
                
            }
        }
        //ES String debe retornar un Strig
         return "La Matriz de caminos más cortos entre los diferentes vertices es: \n"+cadena+
                "Los diferentes caminos mas cortos entre vertices son: \n"+caminitos;
    }
    //Para Hacer nuestro metodo recursivo
    public String caminosR(int i,int k,String[][] caminosAuxiliares,String caminoRecorrido){
        if(caminosAuxiliares[i][k].equals("")){
            // si caminos auxiliares no tiene nada ,pues
            return"";//retorna nada
        }else{
         //Recursividad al MIllon
         //Hacemos un cast porque le enviaremos a nuestra matriz aux,le sacaremos su entero a matrices aux
         //toString().. es para obtenerla
         
          caminoRecorrido +=caminosR(i,Integer.parseInt(caminosAuxiliares[i][k].toString()), caminosAuxiliares, caminoRecorrido)+(Integer.parseInt(caminosAuxiliares[i][k].toString())+1)+", ";
          return  caminoRecorrido; 
        }
    }
}
