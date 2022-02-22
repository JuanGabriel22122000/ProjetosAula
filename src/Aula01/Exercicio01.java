
package Aula01;

import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double NotaInicial,NotaFinal,Media;
        
        //System.out.println("Nota parcial: ");
        NotaInicial = entrada.nextDouble();
        
        System.out.println("Nota parcial: ");
        NotaFinal = entrada.nextDouble();
        
        Media = NotaInicial*0.4 + NotaFinal*0.60;
        System.out.println(Media);
        
    }
        
}
