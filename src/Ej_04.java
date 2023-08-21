import java.util.Scanner;

public class Ej_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Ingrese el segundo número: ");
		int num2 = sc.nextInt();
		sc.close();
		
		if (num1 > num2) {
			System.out.println("El primer número es el mayor");
		} else if (num1 < num2) {
			System.out.println("El segundo número es el mayor");
		} else {
			System.out.println("Los numeros son iguales");
		}
	
	}
}
