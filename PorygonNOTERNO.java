package lpa;

import java.util.Scanner;

public class PorygonNOTERNO {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1,n2,n3,n4, media;
		
		System.out.print("Informe a primeira nota: ");
		n1 = ler.nextDouble ();
		
		System.out.print("Informe a segunda nota: ");
		n2 = ler.nextDouble ();
		
		System.out.print("Informe a terceira nota: ");
		n3 = ler.nextDouble ();
		
		System.out.print("Informe a quarta nota: ");
		n4 = ler.nextDouble ();
		
		media = (n1+n2+n3+n4)/4;
		
		String mensagem = media >= 6 ? "Aprovado!" : "Reprovado!";
		System.out.println(mensagem);
	}

}
