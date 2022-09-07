
public class Main {

	public static void main(String[] args) {
		Producto p1 = new Producto();
		p1.codigo = 1;
		p1.nombre = "Yerba";
		p1.precio = (float) 500.2;
		
		Producto p2 = new Producto();
		p2.codigo = 2;
		p2.nombre = "Azucar";
		p2.precio = (float) 203.15;
		p2.descuento = 50;

		Carrito c1 = new Carrito();
		c1.agregarProducto(p1,3);
		c1.agregarProducto(p2,2);
		c1.agregarProducto(p1,4);
		c1.agregarProducto(p2,4);

		c1.imprimirFactura();
	}

}
