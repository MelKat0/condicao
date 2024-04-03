package lpa;

import java.util.Scanner;

public class FurretTERNAR {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe uma idade: ");
		int idade = ler.nextInt ();
		String mensagem = idade >= 18 ? "Maior de idade." : "Menor de idade.";
		System.out.println(mensagem);

	}

}
