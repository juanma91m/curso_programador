
public class Main {

	public static void main(String[] args) {
		Producto p1 = new Producto();
		p1.setCodigo(1);
		p1.setNombre("Yerba");
		p1.setPrecio((float) 500.2);

		Producto p2 = new Producto();
		p2.setCodigo(2);
		p2.setNombre("Azucar");
		p2.setPrecio((float) 203.15);
		p2.setDescuento(50);

		Carrito c1 = new Carrito();
		c1.agregarProducto(p1, 3);
		c1.agregarProducto(p2, 2);
		c1.agregarProducto(p1, 4);
		c1.agregarProducto(p2, 4);

		c1.imprimirFactura();
		Producto p = c1.getProducto(2);
		if (p != null) {
			System.out.println(p.getNombre());
		}
	}

}
