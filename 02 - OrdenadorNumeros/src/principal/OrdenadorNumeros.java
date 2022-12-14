package principal;

import java.util.Scanner;

public class OrdenadorNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] arreglo = new int[4];

		for (int i = 0; i < arreglo.length; i++)
			arreglo[i] = teclado.nextInt();

		for (int i = 0; i < arreglo.length - 1; i++) {
			int posMin = i;

			for (int j = i + 1; j < arreglo.length; j++)
				if (arreglo[j] < arreglo[posMin])
					posMin = j;

			int aux = arreglo[i];
			arreglo[i] = arreglo[posMin];
			arreglo[posMin] = aux;
		}

		System.out.println("El arreglo ordenado es:");
		for (int i = 0; i < arreglo.length; i++)
			System.out.print(arreglo[i] + ", ");
		
	}
}

