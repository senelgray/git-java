package tareaDosJava;
import java.util.Scanner;


public class pedirDato {


	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese su nombre");
		String nombre=scanner.nextLine();
		
		System.out.println("Ingrese su edad: ");
		int edad=scanner.nextInt();
		
		
		System.out.println("Su nombre es "+nombre + " y su edad es de "+edad+" años. Que tenga un buen dia.");
	}
	}
