
public class Carrito {
	int proximaPosicion = 0;
	int cantMax = 10;
	Producto[] productos = new Producto[cantMax];
	int[] unidades = new int[cantMax];

	float calcularPrecioCompra() {
		float precio = 0;
		int i = 0;

		while (i < proximaPosicion) {
			precio = precio + (productos[i].obtenerPrecioFinal() * unidades[i]);
			i++;
		}
		return precio;
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
			System.out.println(productos[i].nombre + " - " + unidades[i] + " - " + productos[i].obtenerPrecioFinal()
					+ " - " + unidades[i] * productos[i].obtenerPrecioFinal());
			i++;
		}

		System.out.println("TOTAL: " + calcularPrecioCompra());
	}
}
