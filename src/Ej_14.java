import java.util.Scanner;

public class Ej_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean salida = true;
		
		@SuppressWarnings("removal")
		int num = new Double(Math.random() * 100).intValue();
		int intentos = 0;
		
		do {
			System.out.println("Ingrese un numero entre 0 y 100: ");
			int numeroUsuario = Integer.parseInt(sc.nextLine());
			intentos++;
			
			if(numeroUsuario == num) {
				System.out.println("Acertaste en : " + intentos + " intentos");
				salida = false;
			} else if (numeroUsuario > num) {
				System.out.println("El numero es mas bajo");
				
			} else {
				System.out.println("El numero es mas alto");
			}
		} while (salida);
		sc.close();
	}
	
}
