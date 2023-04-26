/*Faça um programa que mostra o valor das vendas de uma loja e
a média de vendas de todos os vendedores. O usuário do
programa deve fornecer a quantidade de vendedores da loja e o
valor das vendas de cada vendedor.

Modifique o programa anterior para mostrar o maior valor de
vendas e o número do vendedor que mais vendeu.
*/


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int quantidadeVendedores;
		System.out.print("Digite a quantidade de vendedores da loja: ");
		quantidadeVendedores = input.nextInt();

		double valorVendas;
		double totalVendasLoja = 0;
		double maiorVenda = 0;
		int melhorVendedor = 0;

		for (int i=0; i < quantidadeVendedores; i++){
			System.out.printf("Digite o valor das vendas do %dº vendedor(a):%n", i+1);
			valorVendas = input.nextDouble();
			totalVendasLoja += valorVendas;

			if (valorVendas > maiorVenda){
				maiorVenda = valorVendas;
				melhorVendedor = i + 1;
			}
		}

		System.out.printf("Valor total de vendas da loja: %.2f%n", totalVendasLoja);
		System.out.printf("Média de vendas dos vendedores: %.2f%n", totalVendasLoja/quantidadeVendedores);
		System.out.printf("Maior valor de vendas entre os vendedores: %.2f%n", maiorVenda);
		System.out.printf("Vendedor que mais vendeu: %dº", melhorVendedor);
	}
}