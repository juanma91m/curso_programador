
public class Persona {
	String nombre;
	String ocupacion;
	int anioNacimiento;
	
	int calcularEdad(int anioActual) {
		int edadAprox = anioActual - anioNacimiento;
		return edadAprox;
	}
}
