package basicjava;

public class aritmetica {

	public static void main(String[] args) {
		// Declaração de variáveis
        int num1 = 10;
        int num2 = 5;

        // Soma
        int soma = num1 + num2;
        System.out.println("Soma: " + soma); // Resultado: 15

        // Subtração
        int subtracao = num1 - num2;
        System.out.println("Subtração: " + subtracao); // Resultado: 5

        // Multiplicação
        int multiplicacao = num1 * num2;
        System.out.println("Multiplicação: " + multiplicacao); // Resultado: 50

        // Divisão
        int divisao = num1 / num2;
        System.out.println("Divisão: " + divisao); // Resultado: 2

        // Resto da divisão (módulo)
        int resto = num1 % num2;
        System.out.println("Resto da divisão: " + resto); // Resultado: 0

        // Operadores unários
        int num3 = 1;

        // Incremento
        num3++;
        System.out.println("Incremento: " + num3); // Resultado: 2

        // Decremento
        num3--;
        System.out.println("Decremento: " + num3); // Resultado: 1

        // Operações com ponto flutuante
        double num4 = 3.14;
        double num5 = 2.71;

        // Soma
        double somaDouble = num4 + num5;
        System.out.println("Soma (double): " + somaDouble); // Resultado: 5.85

        // Multiplicação
        double multiplicacaoDouble = num4 * num5;
        System.out.println("Multiplicação (double): " + multiplicacaoDouble); // Resultado: 8.5334
	}

}
