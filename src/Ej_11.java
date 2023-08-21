import java.util.Scanner;

public class Ej_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String contraseña = "hola";
		int intentos = 3;
		boolean correcta = false;
		String password;
		for (int i = 0; i < intentos && !correcta; i++) {
			System.out.println("Ingrese la contraseña");
			password = sc.nextLine();
			
			if (password.equals(contraseña)) {
				System.out.println("Acceso Correcto");
				correcta = true;
			}
		}
		sc.close();
	}

}
