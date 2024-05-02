package paquete1;

import javax.swing.JOptionPane;

public class NumeroMayorArray {
    public static void main(String[] args) {
        
        int [] arrayNumeros = new int[5];

        int numeroMayor = arrayNumeros[0];

        //Se crea un bucle for para igresar los números en el array
        for(int i = 0;i<arrayNumeros.length;i++){
        arrayNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog("*****************  BIENVENIDO  ******************"+
        "\n"+"TE AYUDARÉ A ENCOMTRAR EL NÚMERO MAYOR"
        + "\n"+"------------------  Ingrese 5 números  ------------------ "));
           
        //Se crea una condicional para almacenar cada vex que el número sea mayor
            if(arrayNumeros[i]> numeroMayor){
                numeroMayor = arrayNumeros[i];
            }
        
        }
        
        //Se muestra el númerp mayor solicitado
        JOptionPane.showMessageDialog(null,"----- FELICITACIONES -----" +"\n" +"El Número Mayor Es " + numeroMayor);

        
    }

}
