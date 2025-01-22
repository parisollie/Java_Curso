
public class CaminosMinimos {

    // Método para determinar todos los caminos,mediante Floyd.
    public String algoritmoFloyd(long[][] mAdy) {
        // Paso 1, declaracion de variables.

        // Para saber cuantos vertices tiene nuestra mtz
        int vertices = mAdy.length;
        // Recibe una matriz de tipo long porque es como si fuera el infinito.
        long matrizAdyacencia[][] = mAdy;
        // Para ques se guarden los caminos de vértice a vértice
        String caminos[][] = new String[vertices][vertices];
        // Mtz de caminos auxiliares,se parece a la anterior.
        String caminosAuxiliares[][] = new String[vertices][vertices];
        // Cadena es para almacenar lo que vamos recorriendo
        String caminoRecorrido = "", cadena = "", caminitos = "";
        // Variables para recorrer mediante ciclos.
        int i, j, k;
        // minimo, es para almacenar el camino minimo ir almacenandolo.
        float temporal1, temporal2, temporal3, temporal4, minimo;

        // Paso 2, Inicializando las matrices caminos y caminos auxiliares.
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                caminos[i][j] = "";
                caminosAuxiliares[i][j] = "";
            }
        }
        // Paso 3, para empezar a buscar los caminos mínimos.
        for (k = 0; k < vertices; k++) {
            for (i = 0; i < vertices; i++) {
                for (j = 0; j < vertices; j++) {
                    /*
                     * Asignamos valores a nuestras variables temporales para ir ordenando
                     * e indicando donde esta el camino mínimo
                     * a matrz de adyacencia le asignamos los valores de i y j.
                     */
                    temporal1 = matrizAdyacencia[i][j];
                    temporal2 = matrizAdyacencia[i][k];
                    temporal3 = matrizAdyacencia[j][k];
                    temporal4 = temporal2 + temporal3;
                    /*
                     * Encontrando el camino mínimo:
                     * lo alamcenamos en minimo y le ponemos Math.min compara el valor mínimo
                     * para eso nuestro párametros,temporal1 y temporal4
                     */
                    minimo = Math.min(temporal1, temporal4);

                    // Evaluando,empieza a buscar el mínimo.
                    if (temporal1 != temporal4) {
                        // Checame si
                        if (minimo == temporal4) {
                            // camino recorrido igual a nada
                            caminoRecorrido = "";
                            caminosAuxiliares[i][j] = k + "";
                            /*
                             * Recibe 2 parámetros 2 de tipo entero y despues string, lo que nos devuelva
                             * le concatenamos el k +1.
                             */
                            caminos[i][j] = caminosR(i, k, caminosAuxiliares, caminoRecorrido) + (k + 1);

                        }

                    }
                    /*
                     * Hacemos un cast porque mínimo es de tipo flotante y nuestra matriz de
                     * adyacencia es tipo long.
                     */
                    matrizAdyacencia[i][j] = (long) minimo;
                }

            }

        }
        // Paso 4, agregando el camino mínimo a cadena.
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                /*
                 * Le vamos agregando a cadena,esto es para crear nuestra matriz de pesos
                 * mínimos
                 */
                cadena = cadena + "[" + matrizAdyacencia[i][j] + "]";
            }
            cadena = cadena + "\n";
        }
        // Paso 5,la lógica
        for (i = 0; i < vertices; i++) {
            for (j = 0; j < vertices; j++) {
                /*
                 * Para mostrar los caminos, si es diferente de inifito, ve agregando los
                 * caminos.
                 */
                if (matrizAdyacencia[i][j] != 1000000000) {
                    // Cuando se encuentra en el mismo vértice no tenemos aristas
                    if (i != j) {
                        // si ademas caminos caminos[i][j].equals(""), es igual a nada.
                        if (caminos[i][j].equals("")) {
                            // caminitos + ....se esta concateanndo
                            caminitos += "De (" + (i + 1) + "--->" + (j + 1) + ") Irse por ...(" + (i + 1)
                                    + ", " + (j + 1) + ")\n";
                        } else {
                            caminitos += "De (" + (i + 1) + "--->" + (j + 1) + ") Irse por ...(" + (i + 1)
                                    + ", " + caminos[i][j] + ", " + (j + 1) + ")\n";
                        }
                    }
                }
            }
        }
        // Es String debe retornar un Strig
        return "La Matriz de caminos más cortos entre los diferentes vertices es: \n" + cadena +
                "Los diferentes caminos mas cortos entre vertices son: \n" + caminitos;
    }

    // Para Hacer nuestro método recursivo
    public String caminosR(int i, int k, String[][] caminosAuxiliares, String caminoRecorrido) {
        if (caminosAuxiliares[i][k].equals("")) {
            // si caminos auxiliares no tiene nada ,pues no retorna nada.
            return "";
        } else {
            /*
             * El camino recorrido le vamos a mandar a llamar a nuestro método caminoR,
             * Hacemos un cast porque le enviaremos a nuestra matriz aux,le sacaremos su
             * entero a matrices aux ,es de tipo cadenas asi que tosString para obtenerla
             */

            caminoRecorrido += caminosR(i, Integer.parseInt(caminosAuxiliares[i][k].toString()), caminosAuxiliares,
                    caminoRecorrido) + (Integer.parseInt(caminosAuxiliares[i][k].toString()) + 1) + ", ";

            return caminoRecorrido;
        }
    }
}
