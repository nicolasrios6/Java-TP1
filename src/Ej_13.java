import java.util.Scanner;

public class Ej_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		int num = sc.nextInt();
		
		if (num <= 1) {
			System.out.println("El número " + num + " no es primo");
		} else {
			int raiz = (int) Math.sqrt(num);
			int contador = 0;
			
			for (int i = raiz; i > 1; i--) {
				if (num % i == 0) {
					contador ++;
				}
			}
			 
            if (contador < 1) {
                System.out.println("El numero " + num + " es primo");
            } else {
                System.out.println("El numero " + num + " no es primo");
            }
		}
		sc.close();
	}

}
