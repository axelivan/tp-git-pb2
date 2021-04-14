package calculadora;

import java.util.Scanner;
 
public class Calculadora { 
	
	public static void sumar(Integer a, Integer b) {
		
case 1: resultado = a + b;
	
	System.out.println("El resultado es " + resultado.toString());
		
	}
	
	
	public static void restar(Integer a, Integer b) {
		
case 1: resultado = a - b;
	
	System.out.println("El resultado es " + resultado.toString());
		
	}
	
	
	public static void dividir(Integer a, Integer b) {
		
case 1: resultado = a / b;
	
	System.out.println("El resultado es " + resultado.toString());
		
	}
	public static void multiplicar(Integer a, Integer b) {
		
case 1: resultado = a * b;
	
	System.out.println("El resultado es " + resultado.toString());
		
	}
	
 public static void main(String[] args) {
	 
	 Integer a;  
 	Integer b; 
 	Integer opcion;    
 	Integer resultado;  
 	Scanner teclado = new Scanner(System.in);
 	
 	do{
 		System.out.println("Ingrese su operacion /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
 		opcion= teclado.nextInt();
 	}while(opcion < 1 && opcion > 4);
 System.out.println("Ingrese el primer numero");
 a = teclado.nextInt();
 System.out.println("Ingrese el segundo numero");
 b = teclado.nextInt();
 
 
 
 
 
 switch(opcion){
 sumar(a,b);
		break;
	case 2:
		restar(a,b);
		break;
	case 3:		
		multiplicar(a,b);

	break;
	case 4:
		dividir(a,b);
}
 
	
 
 }
 }