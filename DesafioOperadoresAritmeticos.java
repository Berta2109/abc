package exerciciosbeg;

public class DesafioOperadoresAritmeticos {

	public static void main(String[] args) {
		
		
		var x = (3+2);
		var y = 6;
		var z = 6;
		var result = (y*x);
		System.out.println(result);
		var result2 =(result/2);
		var resultado2 = (int) Math.pow(result2, 2);
		System.out.println(resultado2); 
		
		var x1 = (1-5);
		var y1 = (2-7);
		var z1 = 2;
		var result3 = (x1 * y1);
		System.out.println(result3);
		var result4 = (result3/2);
		System.out.println(result4);
		var resultado3=(int)Math.pow(result4, 2);
		var resultado4 = (int) Math.pow(resultado3,3 );
		System.out.println(resultado4);
		
		var x3 = 10;
		var resultado5 = (int)Math.pow(x3, 3);
		System.out.println(resultado5);

		var quase = (resultado2 - resultado4);
		System.out.println(quase);
		
		 var div = (resultado5);
		 System.out.println(resultado2 - resultado4/div); 
		 
		
	//	var x1 = (1-5);
	//	var y1 = (2-7);
	//	var z1 = 2;
	//	var resultado2 = (int) Math.pow(x1*y1/2, 2);
	//	var resultado3 = (int) Math.pow(resultado2, 3);
		
	//	var x3 = 10;
	//	var resultado4 = (int) Math.pow(x3, 3);
		
		
	//	System.out.println(resultado1 - resultado3 /resultado4);
		
		 
		 
		 double numA = Math.pow(6 * (3+2), 2);
		 double denA = 3 * 2;
		 
		 double numB = (1 - 5) * (2-7);
		 double denB = 2;
		 
		 double superiorA = numA/numB;
		 double superiorB = Math.pow(numB, denB);
		 
		 double superior = Math.pow(superiorA - superiorB, 3);
		 double inferior = Math.pow(10, 3);
		 
		 double resultado = superior / inferior ;
		 
		 System.out.println("o resultado é" + resultado);
		 
		 
	}
	
}
