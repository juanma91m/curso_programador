
public class Producto {
	int codigo;
	String nombre;
	float precio;
//	int stock;
	float descuento = 0;
	
	float obtenerPrecioFinal() {
		float total = precio - descuento;
		return total;
	}
}
