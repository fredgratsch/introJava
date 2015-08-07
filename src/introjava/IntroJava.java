/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author noite
 */
public class IntroJava {

    public  enum showmenu {
    
    SALVAR(1),IMPRIMIR(2),ABRIR(3),VISUALIZAR(4),FECHAR(5);
    
    private final int valor;
    showmenu(int valorOpcao){
    valor = valorOpcao;
     }
    public int getValor(){
     return valor;
    }
    
    }
    public static void main(String[] args) {        
         escolhe(showmenu.ABRIR); 
        
        Scanner teste = new Scanner(System.in);
        System.out.println("informe um valor");
        int retorno = teste.nextInt();
        
        while (retorno !=0) {
            System.out.println("informe outro  valor");
            retorno = teste.nextInt();                  
        }
        System.out.println("informado com sucesso");
        
    }
    
    public static void escolhe(showmenu Opcao){
    
        if(Opcao == showmenu.SALVAR){
            System.out.println("salvando");
            
        
        }else if (Opcao == showmenu.ABRIR){
              System.out.println("Abrindo arquivos");
        
        
        }
    
}
}
