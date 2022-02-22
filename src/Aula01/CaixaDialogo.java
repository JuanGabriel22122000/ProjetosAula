
package Aula01;

import javax.swing.JOptionPane;
  
public class CaixaDialogo {
    public static void main(String[] args) {
        
        String msg = "Este é um exemplo de mensagem";
        JOptionPane.showMessageDialog(
        null,
        msg);
        
        JOptionPane.showMessageDialog(
                null, 
                msg, 
                "Lab. Prgramação III", 
                JOptionPane.WARNING_MESSAGE
                );
        
        //opção 1
        String v1 = JOptionPane.showInputDialog("Entre com o valor");
        
        //Opção 2
        double n1 = Double.parseDouble(
                JOptionPane.showInputDialog("Entre com o valor")
        );
        
        System.out.println(n1 + n1);
        System.out.println(v1 + v1); 
        
        
    }
    
}
