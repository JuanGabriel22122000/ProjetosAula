
package Aula01;


public class Aula01 {
    public static void main(String[] args) {
            
        
        //Conversão double para int
        double v1 = 25.63;
        int v2 = (int)v1;
        
        System.out.println(v1);
        System.out.println(v2);
        
        String s1 = "10", s2 = "20";
        String s3 = s1 + s2;
        
        System.out.println(s3);
        
        //Conversão do tipo String->int
        
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = n1+n2;
        
        System.out.println(n3);
    }
    }

