import java.util.Scanner;

public class Ej_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Ingrese un número: ");
			num = sc.nextInt();
		} while (num <= 0);
		sc.close();
	}

}
