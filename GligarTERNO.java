package lpa;

import java.util.Scanner;

public class GligarTERNO {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a;
		
		System.out.print("Informe um valor: ");
		a = ler.nextDouble ();
		
		String mensagem = (a % 5 ==0) ? ("O número " + a + " é múltiplo de 5.") : ("O número " + a + " não é múltiplo de 5.");
		System.out.println(mensagem);
	}

}
