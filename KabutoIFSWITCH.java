package lpa;

import java.util.Scanner;

public class KabutoIFSWITCH {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o dia de domingo à sábado: ");
		String dia = ler.next();
		
		switch (dia) {
		
		case "domingo":
			System.out.println("O dia informado é 1.");
			break;
		case "segunda":
			System.out.println("O dia informado é 2.");
			break;
		case "terça":
			System.out.println("O dia informado é 3.");
			break;
		case "quarta":
			System.out.println("O dia informado é 4.");
			break;
		case "quinta":
			System.out.println("O dia informado é 5");
			break;
		case "sexta":
			System.out.println("O dia informado é 6.");
			break;
		case "sábado":
			System.out.println("O dia informado é 7.");
			break;
		
		default:
			System.out.println("O dia é inválido!");
		}
		ler.close();
	}

}
