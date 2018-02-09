package Exercicios.Aula01;
import java.util.Scanner;

/**
 * Programa que pede o nome e a idade do usuário, em seguida mostra ao usuário
 * @author Wendley
 */

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome:");
        String nome = entrada.next();
        System.out.println("Informa sua idade:");
        int idade = entrada.nextInt();
        System.out.println("O nome informado:"+ nome + "\nA idade informada:"+
                idade);
    }
    
}
