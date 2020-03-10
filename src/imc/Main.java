package imc;

import java.text.MessageFormat;
import java.util.Scanner;

import imc.classes.Pessoa;

public class Main {
	
	public static void main(String args[]) {
		int opcao = 0;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("::::::::::::::::::::CALCULAR SEU IMC::::::::::::::::::::");
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("1- Calcular IMC");
			System.out.println("Digite outro número para sair");
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.print("Digite sua opção: ");
			
			opcao = scanner.nextInt();
			
			if (opcao == 1) {
				System.out.print("Qual seu peso? ");
				double peso = scanner.nextDouble();
				System.out.print("Qual sua altura? ");
				double altura = scanner.nextDouble();
				
				
				if (altura <= 0) {
					System.out.println("A altura deve ser maior que 0");
				}
				
				Pessoa pessoa = new Pessoa(peso, altura);
				double resultado = pessoa.calculaImc();
				
				System.out.print(MessageFormat.format("Seu IMC é {0}", resultado));
				if (resultado < 18.5) {
					System.out.println(", você está abaixo do peso\n");
				}else if (resultado >= 18.5 && resultado <= 24.9) {
					System.out.println(", seu peso está normal\n");
				}else if (resultado >= 25 && resultado <= 29.9) {
					System.out.println(", você está com sobrepeso\n");
				}else {
					System.out.println(", você está obeso\n");
				}
			}
		} while(opcao != 1);
		
		System.out.println("Você saiu do sistema");
		
	}
	
	public void calculaImc() {
		
	}
	
}
