package lpa;

import java.util.Scanner;

public class LickitungSWITCH {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos;
		double salario;
		
		System.out.print("Informe o salário: ");
		salario = ler.nextDouble();
		System.out.print("Informe os anos dentro da empresa: ");
		anos = ler.nextInt();
		
		switch (anos) {
		case 0,1,2,3:
			System.out.println("O salário é R$"+((salario*1.05)));
		break;
		
		default:
			System.out.println("O salário é R$"+((salario*1.07)));
		}
		ler.close ();

	}
	
}
