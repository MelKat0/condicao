package lpa;

import java.util.Scanner;

public class LickitungTERNA {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario, anos;
		
		System.out.print("Informe o salário: ");
		salario = ler.nextDouble();
		System.out.print("Informe os anos dentro da empresa: ");
		anos = ler.nextDouble();
		
	
		
		String mensagem = anos > 3 ? "O salário com bônus é R$" + ((salario*0.07)+salario) : "O salário com bônus é R$" + ((salario*0.05)+salario);
		System.out.println(mensagem);
	}

}
