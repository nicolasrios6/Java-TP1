import java.util.Scanner;

public class Ej_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el precio del producto: ");
		double precioProducto = sc.nextDouble();
		sc.close();
		double IVA  = 1.21;
		
		System.out.println("El precio del producto con IVA es: " + (precioProducto * IVA));
	}

}
