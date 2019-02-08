package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        int n, soma = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        n = input.nextInt();
        
        for(int i = 0; i < n; i++){
            soma = soma + i;
        }
        System.out.println(soma);
    }
    
}
