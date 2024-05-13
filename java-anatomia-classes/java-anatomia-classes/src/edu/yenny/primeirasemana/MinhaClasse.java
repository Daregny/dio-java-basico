package edu.yenny.primeirasemana;
// Aprendendo a Sintaxe Java - Anatomia das Classes 1 até 3
// Isso é a clase
public class MinhaClasse{

    // Isso é o metodo - Metódo principal
    public static void main (String [] args) {
        
        // Metodo System
        System.out.print("Olá, mundo! ");

        String primeiroNome = "Yenny";
        String segundoNome = "Odalis";
        
        // Execução do Metodo nomeCompleto
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    // Metódo para concatenar Nome Completo
    public static String nomeCompleto (String primeroNome, String segundoNome){
        return "- Resultado do método " + primeroNome.concat(" ").concat(segundoNome);
    }

}