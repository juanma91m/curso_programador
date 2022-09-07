import java.util.Scanner;

public class PruebaPersona {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese el año actual");
		int anioActual = Integer.parseInt(teclado.nextLine());

		Persona p1 = new Persona();
		System.out.println("Ingrese el nombre de la persona 1");
		p1.nombre = teclado.nextLine();

		System.out.println("Ingrese la ocupación de la persona 1");
		p1.ocupacion = teclado.nextLine();

		System.out.println("Ingrese el año de nacimiento de la persona 1");
		p1.anioNacimiento = Integer.parseInt(teclado.nextLine());

		Persona p2 = new Persona();
		System.out.println("Ingrese el nombre de la persona 2");
		p2.nombre = teclado.nextLine();

		System.out.println("Ingrese la ocupación de la persona 2");
		p2.ocupacion = teclado.nextLine();

		System.out.println("Ingrese el año de nacimiento de la persona 2");
		p2.anioNacimiento = Integer.parseInt(teclado.nextLine());

		System.out.println("La edad aprox. de " + p1.nombre + " es " + p1.calcularEdad(anioActual));
		System.out.println("La edad aprox. de " + p2.nombre + " es " + p2.calcularEdad(anioActual));
	}

}
