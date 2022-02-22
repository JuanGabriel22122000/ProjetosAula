
package Aula01;

import javax.swing.JOptionPane;


public class Exemplo2 {
    public static void main(String[] args){
        
        String v1, v2;
        double n1,n2, soma;
        
        //Entrada
        v1 = JOptionPane.showInputDialog("Valor 1");
        v2 = JOptionPane.showInputDialog("Valor 2");
        
        //Converter String->double
        n1 = Double.parseDouble(v1);
        n2 = Double.parseDouble(v2);
        
        soma = n1 +n2;
        
        JOptionPane.showMessageDialog(null, "Soma = " + String.format("%.2f", soma));
    }

   
}
