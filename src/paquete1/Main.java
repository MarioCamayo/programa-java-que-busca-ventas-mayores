package paquete1;

import javax.swing.JOptionPane;

public class Main {
    /*crea un programa que almacene 10 ventas del mes y que te diga cuantas son mayores a s/.1500 Soles */
    public static void main(String[] args) {
        
        //Se declaran las variables
        int j = 0;
        int total = 0;
        int numVenta = 1;
        int numVentaMayores =1;

        // Se crea el array para alamacenar todas las ventas del mes
        double[] ventas = new double[10];

        //Se crea un bucle for para igresar las ventas de manera dinpamica
        for(int i= 0;i<ventas.length;i++){
            ventas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la venta  " +numVenta+" del mes:"));
            numVenta++;
        }

        //Se crea un bucle while para iterar sobre cada venta y encontrar las ventas mayores
        while (j < 10) {
            if (ventas[j] >= 1500) {
        // Se muestra por ventanas de diálogo las ventas mayores        
                JOptionPane.showMessageDialog(null,"La Venta Mayor Número " + numVentaMayores + ": "+ventas[j]);
                total++;
                numVentaMayores++;

            }
            j++;
        }
        // Se muestra por ventanas de diálogo la cantidad de  ventas mayores        

        JOptionPane.showMessageDialog(null,"El total de ventas mayores a S/. 1.500 son: " + total);
            
    }

}
