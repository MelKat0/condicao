package lpa;

import java.util.Scanner;

public class LickitungBONUSIF {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario, anos;
		
		System.out.print("Informe o salário: ");
		salario = ler.nextDouble();
		System.out.print("Informe os anos dentro da empresa: ");
		anos = ler.nextDouble();
		
		double bonus1 = ((salario*0.05)+salario);
		double bonus2 = ((salario*0.07)+salario);
		
		if (anos <= 3) {
			System.out.println("O salário com bônus é R$"+ bonus1);
		}
		else {
			System.out.println("O salário com bônus é R$"+ bonus2);
		}
		ler.close ();
	}

}
