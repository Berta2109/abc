package fundamentos.operadores;

import java.util.Scanner;

public class Desafiocalculadora {

	public static void main(String[] args) {
		
		// ler num1
		// ler num2
		
		Scanner entrada = new Scanner (System.in);
	
		
		System.out.println("informe o n�mero: ");
		
		double num1 = entrada.nextDouble();
		
		System.out.println("informe o n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("informe a opera�ao: ");
		String op = entrada.next();
		
		//L�gica
		double resultado = "+".equals(op) ? num1 + num2 :0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		
		System.out.printf("%f.2f %s %.2f =%.2f", num1, op, num2,resultado);
	
		
		entrada.close();
	}
	
	
	
	
}
