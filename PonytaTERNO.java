package lpa;

import java.util.Scanner;

public class PonytaTERNO {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro nome: ");
		String nome1 = ler.next ();
		
		System.out.println("Escreva o segundo nome: ");
		String nome2 = ler.next ();
		
		System.out.println(nome1.equals(nome2) ? "ingual.":"deferente.");
	}

}
