package edu.Pablo.Java;
public class MinhaClasse {
    public static void main (String [] args) {
       String primeiroNome = "Pablo";
       String segundoNome = "Henrique";
     
     
       String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
       
       System.out.print (nomeCompleto);
    }

    private static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
    

        
    
}