import java.util.Scanner;

public class Ej_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		int num = sc.nextInt();
		sc.close();
		
		if (num % 2 == 0) {
			System.out.println("El número ingresado es divisible por 2");
		} else {
			System.out.println("El número ingresado no es divisible por 2");
		}
	}
}
