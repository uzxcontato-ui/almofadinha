// Padrões de desenvolvimento e conceitos

import java.util.*;

public class c2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        /*
         * Conceito de package:
         * - Pode ser criado direto com a classe
         * - Ou invertendo o exemplo: iv.br.com --> com.br.iv
         */

        System.out.println("Olá, informe seu nome:");
        String name = scanner.nextLine(); // nextLine captura a linha inteira

        System.out.println("Informe sua idade:");
        int age = scanner.nextInt(); // captura número inteiro

        // Exemplo de saída formatada
        System.out.printf("Olá %s, sua idade é %d%n", name, age);

        /*
         * println --> imprime com quebra de linha automática
         * print   --> imprime tudo junto, sem quebra
         * printf  --> permite formatar strings com placeholders (%s, %d, etc.)
         */

        scanner.close(); // sempre bom fechar o Scanner
    }
}
