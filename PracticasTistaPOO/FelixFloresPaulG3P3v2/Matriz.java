import javax.swing.JOptionPane;

public class Matriz {

    public static void main(String[] args) {

        int numeroFIlas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de filas para la matriz"));
        int numeroColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columnas para la matriz"));

        int matriz[][] = new int[numeroFIlas][numeroColumnas];
        //Llenar matriz
        for (int i = 0; i < numeroFIlas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion [" + (i + 1) + "," + (j + 1) + "] de la matriz"));
            }
        }
        //Imprimir matriz
        String resultado = "";
        for (int i = 0; i < numeroFIlas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                resultado += matriz[i][j];
                resultado += "    ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
