

public class CasaInteligente {
	int habitantes;
	Robot robotLimpieza;

	public void salirCasa() {
		habitantes = habitantes - 1;
		
		if (habitantes == 0)
			robotLimpieza.limpiar(10,10);
	}
	
	public void asignarRobotLimpieza(Robot robot) {
		robotLimpieza = robot;
	}
}