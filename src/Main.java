/*Faça um programa que mostra o valor das vendas de uma loja e
a média de vendas de todos os vendedores. O usuário do
programa deve fornecer a quantidade de vendedores da loja e o
valor das vendas de cada vendedor.
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

		for (int i=0; i < quantidadeVendedores; i++){
			System.out.printf("Digite o valor das vendas do %dº vendedor(a):%n", i+1);
			valorVendas = input.nextDouble();
			totalVendasLoja += valorVendas;
		}

		System.out.printf("Valor total de vendas da loja: %.2f%n", totalVendasLoja);
		System.out.printf("Média de vendas dos vendedores: %.2f", totalVendasLoja/quantidadeVendedores);
	}
}