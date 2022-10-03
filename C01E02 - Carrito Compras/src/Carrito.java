
public class Carrito {
	private int proximaPosicion = 0;
	private int cantMax = 10;
	private Producto[] productos = new Producto[cantMax];
	private int[] unidades = new int[cantMax];

	float calcularPrecioCompra() {
		float precio = 0;
		int i = 0;

		while (i < proximaPosicion) {
			precio = precio + (productos[i].obtenerPrecioFinal() * unidades[i]);
			i++;
		}
		return precio;
	}

	public Producto getProducto(int posicion) {
		if (posicion < proximaPosicion - 1)
			return this.productos[posicion];
		else
			return null;
	}

	boolean agregarProducto(Producto p, int cant) {
		int i = 0;

		while (i < proximaPosicion) {
			if (p == productos[i]) {
				unidades[i] = unidades[i] + cant;
				return true;
			}
			i++;
		}

		if (proximaPosicion < productos.length) {
			productos[proximaPosicion] = p;
			unidades[proximaPosicion] = cant;
			proximaPosicion++;
			return true;
		}
		System.out.println("Carrito lleno.");
		return false;
	}

	void imprimirFactura() {
		int i = 0;

		while (i < proximaPosicion) {
			System.out.println(productos[i].getNombre() + " - " + unidades[i] + " - "
					+ productos[i].obtenerPrecioFinal() + " - " + unidades[i] * productos[i].obtenerPrecioFinal());
			i++;
		}

		System.out.println("TOTAL: " + calcularPrecioCompra());
	}
}
