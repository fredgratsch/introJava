/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author noite
 */
public class IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aves objPassaro = new Aves();
             String resultado = objPassaro.Comer(); 
                       
            if(resultado == "MAIS" ){
             System.out.print("VOU ENVIAR MAIS COMIDA");
            
            
            }
            
            
//        Scanner teste = new Scanner(System.in);
//        System.out.println("informe um valor");
//        int retorno = teste.nextInt();
//        
//        while (retorno !=0) {
//            System.out.println("informe outro  valor");
//            retorno = teste.nextInt();                  
//        }
//        System.out.println("informado com sucesso");
        
    }
    
}
