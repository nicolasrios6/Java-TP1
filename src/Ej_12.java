import java.util.Scanner;

public class Ej_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String salir = null;
		do {
			
			System.out.println("Ingrese un dia de la semana(1 a 7): ");
			int dia = sc.nextInt();
			
			
			switch (dia) {
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Dia laboral");
				salir = "out";
				break;
			case 1:
			case 7:
				System.out.println("Dia no laboral");
				salir = "out";
				break;
			default:
				System.out.println("El dia ingresado no corresponde a un dia de la semana, por favor vuelva a ingresar un numero.");
				break;
			}
		} while (salir != "out");
			sc.close();
	}
}
