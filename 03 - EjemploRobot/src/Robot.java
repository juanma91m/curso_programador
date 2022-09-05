

public class Robot {
	int x;
	int y;
	String estado;

	public void limpiar(int posicionX, int posicionY) {
		mover(posicionX, posicionY);
		estado = "LIMPIANDO";
	}

	public void mover(int posicionX, int posicionY) {
		x = posicionX;
		y = posicionY;
	}

	void apagar() {
		estado = "APAGADO";
	}
}