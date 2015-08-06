/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author noite
 */
public class Animal {
    String nome;
    int idade;
    int peso;
    String CorDosOlhos;
    
    public String Comer(String mensagem){
        System.out.println("quero comer");
        String resultado = "mais";
        if(mensagem != "mais"){
            System.out.println("satisfeito");
           resultado = "Obrigado";
        }else{
            System.out.println("Ainda estou com fome quero comer");
        }        
        return resultado;
    }
    
    public int Dormir(){
     System.out.println("bucho cheio e agora vou JIBOIAR");
    return 1;
    }

    String Comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
