package Exercicios.Aula01;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Programa que recebe o ano de nascimento e retorna a idade do usuário
 * @author Wendley
 */

public class Exercicio02 {
    public static void main(String[] args) {
        //Instância do Calendar para receber o ano do Sistema.
        Calendar calendario = Calendar.getInstance();
        //Função que pega o ano
        int ano = calendario.get(Calendar.YEAR);
        
        //Scanner para pegar a entrada do usuário
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o ano de nascimento:");
        int anoNasc = entrada.nextInt();
        System.out.println("Sua idade é:" + (ano - anoNasc));
        
    }
}
