package edu.Pablo.Java;
public class BoletimEstudantil {
 
    public static void main(String[] args) {
        int mediaFinal = 7;
         if (mediaFinal<6)
                System.out.println("REPROVADO");
            else if (mediaFinal==6)
                System.out.println("EXAME");
            else
                System.out.println("APROVADO");
        
    }
}

