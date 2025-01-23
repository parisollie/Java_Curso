
public class AlgortimosOrdenamiento {

    int i, j, temporal, pasadas;

    // Constructor para inicializar las variables.
    public AlgortimosOrdenamiento() {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }

    // ----------------Método burbuja versión 1, recibe un arreglo.--------------
    public void burbuja1(int[] arreglo) {
        pasadas = 0;
        // Se necesitan 2 ciclos.
        for (i = 0; i < arreglo.length; i++) {
            for (j = i + 1; j < arreglo.length; j++) {
                // Comparación
                if (arreglo[i] > arreglo[j]) {
                    // Intercambiando valores.
                    temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Termino en:" + pasadas + " pasadas");
    }

    // ----------------Método burbuja versión 2----------------------------------
    public void burbuja2(int[] arreglo) {
        pasadas = 0;
        // arreglo.length es la medida del vector
        for (i = 1; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length - 1; j++) {
                // comparación
                if (arreglo[j] > arreglo[j + 1]) {
                    // intercambiando valores
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
                // Cada que termine una pasada
                pasadas++;
            }
        }
        // Para saber en cuantas pasadas termino
        System.out.println("Termino en: " + pasadas + " pasadas");
    }

    // ----------------------------- Método Radix--------------------------------
    public void radix(int[] arreglo) {

        int x, i, j;
        // de 31 hasta 0 -> Integer.SIZE-1
        for (x = Integer.SIZE - 1; x >= 0; x--) {

            /*
             * arreglo.length....el mismo tamaño de nuestro arreglo
             * El vector aux es para estar moviendo los números,unidad ,decena y
             * centanas
             */
            int auxiliar[] = new int[arreglo.length];
            // La j es un contador importante que moverá todo lo demás.
            j = 0;
            for (i = 0; i < arreglo.length; i++) {

                /*
                 * x>=0 me devolvera un true o un false ,vamos a mover lo que
                 * tiene arreglo en la posicion i
                 */
                boolean mover = arreglo[i] << x >= 0;

                /*
                 * //Es la forma mas larga.
                 * if(x>y){
                 * mayor =x;
                 * }else{
                 * mayor=y;
                 * }
                 * Operador Ternario ?
                 * resultado=(condicion)?valor1:valor2
                 * mayor=(x>y)?x:y;
                 */

                /*
                 * si x==0(esa es mi condición),entonces sabes que evaluame mover(la negación)
                 * el operador ternario y lo comparas con el orginal
                 */
                if (x == 0 ? !mover : mover) {
                    // si resulta verdadero, lo que tenga en la posicion j ,lo pones en i
                    auxiliar[j] = arreglo[i];
                    j++;
                } else {
                    // si es falso se le asigna lo que tiene en arreglo(i)
                    arreglo[i - j] = arreglo[i];
                }

            }
            // Este for es aara que me vaya copiando lo que tengamos el arreglo auxiliar.
            for (i = j; i < auxiliar.length; i++) {
                // Para ir copiando
                auxiliar[i] = arreglo[i - j];
                // debbugueamos con el print
                System.out.print(auxiliar[i] + " ");

            }
            // Lo que teniamos en auxiliar lo pasamos a arreglo de nuevo
            arreglo = auxiliar;
            System.out.print("\n");
        }
        System.out.print("\nEl arreglo ordenado con Radix es: ");
        mostrarArreglo(arreglo);
    }

    // ----------------------------- Método Quick--------------------------------
    public void quick(int[] arreglo, int primero, int ultimo) {
        int i, j, pivote, auxiliar;
        i = primero;
        j = ultimo;
        pivote = arreglo[(primero + ultimo) / 2];
        System.out.println("El pivote es " + pivote);
        do {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            // Aqui hacemos el intercambio
            if (i <= j) {
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            // Mandamos recursividad
            quick(arreglo, primero, j);
        }
        if (i < ultimo) {
            quick(arreglo, i, ultimo);
        }
        mostrarArreglo(arreglo);
    }

    // ------------------------ Método Inserccion--------------------------------

    public void insercion(int[] arreglo, int n) {
        int i, j, k, auxilar;
        for (i = 1; i < n; i++) {
            auxilar = arreglo[i];
            j = i - 1;

            while (j >= 0 && arreglo[j] > auxilar) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = auxilar;
        }
        System.out.println("Arreglo ordenado por insercion: ");
        mostrarArreglo(arreglo);

    }

    // ------------------------ Método Shell------------------------------------

    public void shell(int[] arreglo) {
        int salto, i, j, k, auxilar;
        salto = arreglo.length / 2;
        while (salto > 0) {
            for (i = salto; i < arreglo.length; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (arreglo[j] <= arreglo[k]) {
                        j = -1;
                    } else {
                        auxilar = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = auxilar;
                        // j=j-salto;
                        j -= salto;
                    }
                }
            }
            salto = salto / 2;
        }
        System.out.println("Arreglo ordenado con Sheell");
        mostrarArreglo(arreglo);
    }

    // ---------------------Metodo Mezcla directa--------------------------------

    public int[] mezclaDirecta(int[] arreglo) {
        int i, j, k;
        // Validamos si el arreglo es tamaño 1 o 0,
        // Válidamos si el arreglo es tamaño 1 o 0...si un arreglo es de tamaño 0 o 1
        // quiere decir que ya esta ordenado
        // Que si hay algo que ordenar
        if (arreglo.length > 1) {
            // Con esto sabemos de que tamaño es la sublista izq
            int nElementosIzq = arreglo.length / 2;
            int nElementosDer = arreglo.length - nElementosIzq;

            // Este arreglo izq tiene los elementos de la sublista izq
            int arregloIzq[] = new int[nElementosIzq];
            // Este arreglo izq tiene los elementos de la sublista der
            int arregloDer[] = new int[nElementosDer];

            // Copiando los elementos de parte primera a al arreglo Izq

            for (i = 0; i < nElementosIzq; i++) {
                arregloIzq[i] = arreglo[i];
                // Para copiar la sublista izq a nuestro arreglo
                System.out.print(arregloIzq[i] + "-");
            }
            // Copiando los elementos de parte primera a al arreglo Der

            for (i = nElementosIzq; i < nElementosIzq + nElementosDer; i++) {
                // Recordando que nos recorreran -os indices
                arregloDer[i - nElementosIzq] = arreglo[i];
                System.out.print(arregloDer[i - nElementosIzq] + "**");
            }

            System.out.print("\n");
            // Recursividad.Mezcla Directa es un metodo Recursivo
            arregloIzq = mezclaDirecta(arregloIzq);
            arregloDer = mezclaDirecta(arregloDer);
            // Para ordenar

            i = 0;
            j = 0;
            k = 0;
            /* indice j para izquierdo,indice k para derecho, i para arreglo original */
            // arregloIzq.length (su medida) y
            while (arregloIzq.length != j && arregloDer.length != k) {
                // if(arregloIzq[j]>arregloDer[k]){ Descendente
                if (arregloIzq[j] > arregloDer[k]) {

                    arreglo[i] = arregloIzq[j];
                    System.out.print(arreglo[i] + " ");
                    ++i;
                    ++j;
                } else {
                    arreglo[i] = arregloDer[k];
                    System.out.print(arreglo[i] + " ");
                    i++;
                    k++;
                }

            } // Fin while

            // Arreglo Final,uniendo las sublistas

            while (arregloIzq.length != j) {
                arreglo[i] = arregloIzq[j];
                System.out.print(arreglo[i] + " ");
                i++;
                j++;
            }

            // Para ala parte derecha
            while (arregloDer.length != k) {
                arreglo[i] = arregloDer[k];
                // Imprime el arreglo fusinado
                System.out.println(arreglo[i] + " ");
                i++;
                k++;
            }
            System.out.println("\n");
        } // Fin de if principal
        return arreglo;
    }

    // -----------------------Método Mezcla Natural------------------------------
    public void mezclaNatural(int arreglo[]) {
        int izquierda = 0, izq = 0, derecha = arreglo.length - 1, der = derecha;
        boolean ordenado = false;
        do {
            ordenado = true;
            // Se va estar repetiendo por eso la inicializamos en cero
            izquierda = 0;

            // Tenemos que ver que los elementos esten ordenaos en tuplas
            while (izquierda < derecha) {
                izq = izquierda;
                while (izq < derecha && arreglo[izq] <= arreglo[izq + 1]) {
                    // Para ir checando si estan ordenados
                    izq++;
                }
                der = izq + 1;
                // Va ir buscando los que ya esten ordenados
                while (der == derecha - 1 || der < derecha && arreglo[der] < arreglo[der + 1]) {
                    der++;
                }
                // Para la fusion
                // Quiere decir que hay que mandar a ordenar
                if (der >= derecha) {
                    // se lo mandamos para que ordene
                    mezclaDirecta2(arreglo);
                    ordenado = false;
                }
                izquierda = izq;
            }
            // !ordenado la negacion de ordenado

        } while (!ordenado);
    }

    // ---------------------Metodo Mezcla directa 2-----------------------------
    public void mezclaDirecta2(int[] arreglo) {
        int i, j, k;
        // Validamos si el arreglo es tamaño 1 o 0
        // Que si hay algo que ordenar
        if (arreglo.length > 1) {
            // Con esto sabemos de que tamaño es la sublista izq
            int nElementosIzq = arreglo.length / 2;
            int nElementosDer = arreglo.length - nElementosIzq;
            // Este arreglo izq tiene los elementos de la sublista izq
            int arregloIzq[] = new int[nElementosIzq];
            // Este arreglo izq tiene los elementos de la sublista der
            int arregloDer[] = new int[nElementosDer];

            // Copiando los elementos de parte primera a al arreglo Izq

            for (i = 0; i < nElementosIzq; i++) {
                // Para copiar la sublista izq a nuestro arreglo
                arregloIzq[i] = arreglo[i];
            }
            // Copiando los elementos de parte primera a al arreglo Der

            for (i = nElementosIzq; i < nElementosIzq + nElementosDer; i++) {
                arregloDer[i - nElementosIzq] = arreglo[i];
            }
            // Recursividad
            arregloIzq = mezclaDirecta(arregloIzq);
            arregloDer = mezclaDirecta(arregloDer);

            // Para ordenar

            i = 0;
            j = 0;
            k = 0;

            /*
             * indice j para izq,indice k para der, i para
             * arreglo ori)
             */

            while (arregloIzq.length != j && arregloDer.length != k) {

                if (arregloIzq[j] < arregloDer[k]) {
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;
                } else {
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;
                }

            } // Fin while
              // Arreglo Final,uniendo las sublistas
            while (arregloIzq.length != j) {
                arreglo[i] = arregloIzq[j];
                i++;
                j++;
            }
            // Para ala parte derecha
            while (arregloDer.length != k) {
                arreglo[i] = arregloDer[k];
                i++;
                k++;
            }

        } // Fin de if principal

    }

    // -----------------------Busqueda Secuencial------------------------------
    // Recibe el arreglo y aparte recibimos el arreglo a buscar

    public int busquedasecuencial(int arreglo[], int elemento) {

        int i;
        boolean encontrado = false;
        for (i = 0; i < arreglo.length && encontrado == false; i++) {
            // Quiere decir que ya lo encontro
            if (elemento == arreglo[i]) {
                encontrado = true;
                // Lo tenemos en i ,asi que lo retornamos
                return i;
            }
        }
        // La posicion -1 no existe ,quiere decir que no fue encontrado
        return -1;
    }

    // --------------------- Metodo busqueda Binaria-----------------------------
    public int busquedabinaria(int arreglo[], int elemento) {
        int centro, primero, ultimo, valorCentro;
        // indices
        primero = 0;
        // si nuestro arreglo tienen 10 elementos ,sera de 0-9
        ultimo = arreglo.length - 1;

        while (primero <= ultimo) {
            centro = (primero + ultimo) / 2;
            valorCentro = arreglo[centro];
            System.out.println("Comparando a " + elemento + " Con " + arreglo[centro]);
            // Quiere decir que ya lo encontro
            if (elemento == valorCentro) {
                // El indice se almacena en centro
                return centro;
            } else if (elemento < valorCentro) {
                // Con el fin de desplazarnos hacia la izq
                ultimo = centro - 1;

            } else {
                // desplazarnos hacia la derecha
                primero = centro + 1;

            }

        }
        // ya lo tenemos
        return -1;
    }

    // Mostrar los datos del vector
    public void mostrarArreglo(int[] arreglo) {
        /*
         * crear una variable local ,porque cada vez que se mandamos a llamar
         * los valores,se alteran
         */
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "]");// lo concatenamos

        }
        System.out.println();
    }
}
