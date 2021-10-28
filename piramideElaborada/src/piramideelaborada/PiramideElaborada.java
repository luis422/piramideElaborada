package piramideelaborada;

import javax.swing.JOptionPane;

public class PiramideElaborada {

    public static void main(String[] args) {
        int numLinhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de linhas:"));
        
        System.out.println();
        for (int altura = 1; altura <= numLinhas; altura++) {

            for (int espacos = 1; espacos <= numLinhas - altura; espacos++) {
                System.out.print(" ");
            }

            for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
