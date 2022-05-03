# Exercicio_Pousada

package Ex_Pousada;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Cliente quarto[] = new Cliente[10];
		
		System.out.print("Informe o nome do cliente: ");
		String nome = teclado.nextLine();
		System.out.print("Informe o e-mail do cliente: ");
		String email = teclado.next();
		
		//Validação da reservas
		boolean resp = false;
		while(resp == false) {
			System.out.println("Qual é o quarto desejado? Reservas de 0 a 9.");
			int num = teclado.nextInt();
		
			if(num > 0 && num <= 9) {
				if(quarto[num] == null) {
					quarto[num] = new Cliente(nome, email);
					System.out.println("Reserva do quarto " + num + " confirmada.");
					resp = true;
				} else {
					System.out.println("Este quarto não está disponível.");
				}
			} else {
				System.out.println("Resposta inválida, tente outra.");
			}
			
		}
		
		//Relatório das reservas
		System.out.println("Reservas:");
		for(int i = 0; i < 10; i++) {
			if(quarto[i] != null) {
				System.out.println("Quarto " + i + ": " + quarto[i].toString());
			}	
		}
		
		//Relatório específico das Reservas
		System.out.print("Informe o número do quarto que deseja consultar: ");
		int resp2 = teclado.nextInt();
		if(resp2 > 0 && resp2 <= 9) {
			if(quartos[resp2] == null) {
				System.out.println("Quarto não reservado");
			} else {
				System.out.println("Quarto reservado para " + quartos[resp2].getNome());
			}
		} else {
			while(resp2 < 0 || resp2 > 9) {
				System.out.println("Reposta inválida, informe valores de 0 a 9.");
				resp2 = teclado.nextInt()
			}
		}
		
		teclado.close();
	}

}
