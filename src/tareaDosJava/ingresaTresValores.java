package tareaDosJava;
import java.util.Scanner;

public class ingresaTresValores {

	
	public static void main(String[] args) {

	
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese el primer numero");
		int numero1=scanner.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		int numero2=scanner.nextInt();
		
		System.out.println("Ingrese el tercer numero numero");
		int numero3=scanner.nextInt();

		int mayor = obtenerMayor(numero1, numero2, numero3);
	    int menor = obtenerMenor(numero1, numero2, numero3);
		
		System.out.println("El mayor valor es: " + mayor);
		System.out.println("El mayor valor es: " + menor);
	
	
	}
	
	public static int obtenerMayor(int a, int b, int c) {
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }

    public static int obtenerMenor(int a, int b, int c) {
        int menor = a;

        if (b < menor) {
            menor = b;
        }

        if (c < menor) {
            menor = c;
        }

        return menor;
    }
}
	