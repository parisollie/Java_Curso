
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author andro
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;

        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("Elige la opcion");
            System.out.println("1.-Expresiones aritmeticas en java");
            System.out.println("2.-Saludando");
            System.out.println("3.-Operador Ternario");
            System.out.println("4.-Calificaciones");
            System.out.println("5.-For each");
            System.out.println("6.-Salir");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    
                    int a =10,b=0;
                    System.out.println("Selecciono: Expresiones aritmeticas en java ");
                    Expresiones calcula = new Expresiones (); //Objeto calcula a la instancia Expresiones
                    int operador = calcula.exp(a,b);
                    System.out.println("Ejemplo 1: "+operador);
                    
                    int c=10,d=0;
                    Expresiones calcular = new Expresiones ();//Objeto calcular a la instancia Expresiones
                    int ope = calcular.exp2(c,d);
                    System.out.println("Ejemplo 2: "+ope);
                    
                    int e=10,f=0;
                    Expresiones calcule = new Expresiones ();//Objeto calcule a la instancia Expresiones
                    int oper = calcule.exp3(e,f);
                    System.out.println("Ejemplo 3: "+oper);
                    
                    int g=5,h=10,i=15;
                    Expresiones calcules = new Expresiones ();//Objeto calcules a la instancia Expresiones
                    int operes = calcules.exp4(g,h,i);
                    System.out.println("Ejemplo 4: "+operes);
                    

                    break;
                case 2:
                    System.out.println("Saludo de acuerdo a la hora del día");
                    Calendar cal = Calendar.getInstance(); // Usando Calendar de java
                    int hora = cal.get(Calendar.HOUR_OF_DAY); //Nos dara la hora absoluta del día (en intervalos de 24 horas).
                    int mes = cal.get(Calendar.MONTH); //nos dara el mes
                    //Empezamos a definir los saludos de acuerdo a las hora del reloj
                    
                    if (hora == 5) {
                        if (mes > 2 && mes < 9) {
                            System.out.println("Buenos Dias!");
                        } else {
                            System.out.println("Buenas Noches!");
                        }
                    } else if (hora > 5 && hora < 12) {
                        System.out.println("Buenos Dias!");
                    } else if (hora > 11 && hora < 17) {
                        System.out.println("Buenas tardes!");
                    } else if (hora == 17) {
                        if (mes > 2 && mes < 9) {
                            System.out.println("Buenas Tardes!");
                        } else {
                            System.out.println("Buenas noches!");
                        }
                    } else if (hora > 17 && hora < 19) {
                        System.out.println("Buenas Noches!");
                    } else {
                        System.out.println("Buenas Noches!");
                    }

                  
                    break;
                case 3:
                    
                    System.out.println("Selecciono Operador Ternario ");
                    int x =11,y=11,z=0,u=2,po=5,j=89;
                    
                    OperadorTernario opertern = new OperadorTernario (); //Objeto calcula a la instancia OperadorTernario
                    int result = opertern.operternario(x,y,z);
                    System.out.println("Ejemplo 1: "+result);
                    
                    OperadorTernario opter = new OperadorTernario (); //Objeto calcula a la instancia OperadorTernario
                    int results = opter.operternario(u,po,j); // Mandamos los valores
                    System.out.println("Ejemplo 2: "+results); // devolvemos el reusltado

                    break;
                case 4:
                    
                    System.out.println("Selecciono Calificaciones");
                    float tareas,examenes, Proyectos,laboratorio,notaFinal;
                    Scanner entrada = new  Scanner (System.in);
                    System.out.println("Digita la calificacion de las tareas: ");
                    tareas = entrada.nextFloat();//Para guardr los datos
                    System.out.println("Digita la calificacion de los examenes: ");
                    examenes = entrada.nextFloat();//Para guardr los datos
                    System.out.println("Digita la calificacion de los proyectos: ");
                    Proyectos = entrada.nextFloat();//Para guardr los datos
                    System.out.println("Digita la calificacion del laboratorio: ");
                    laboratorio = entrada.nextFloat();//Para guardr los datos
        
                    //sacando los calculos
                    tareas *= 0.15f; //asignando los porcentajes
                    examenes *= 0.35f;
                    Proyectos *= 0.30f;
                    laboratorio *= 0.25f;
                    //sumando las notas
                    notaFinal = tareas + examenes +Proyectos +laboratorio;
        
                    System.out.println("La nota final es: "+notaFinal);

                    break;
                case 5 :
                    
                     System.out.println("For each");
                     int ar[] = {1,2,3,4,5,6,7,8,9,10}; //asignamos los calores
                     int var1 = 0;
                     int var2 = 10;
                     
                     
                      for(int ims:ar){
                         var1+=ar[ims-1];
                     }
                      
                      for(int ims:ar){
                        System.out.println(ar[ims-1]*(var2)); //le pones -1 porque si nos marcarra el error por los espacios
                     }
                     
                     
                     for(int ims:ar){
                         if(ims%4 == 0){
                             System.out.println(ar[ims-1]+ " Es divisible entre 4");
                         }
                     }
                     
                     
                     
                    
                     continue;

                case 6:
                    
                    System.out.println("Hasta Luego !");

                    break;
                default :
                    // ninguno de los anteriores
                    System.out.println("Su eleccion no es correcta");
                    continue;

            }


        }while(opcion !=6);
        sc.close();

    }
        
    }
    

