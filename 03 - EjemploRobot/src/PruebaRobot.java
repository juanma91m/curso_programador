public class PruebaRobot {

	public static void main(String[] args) {
		Robot miRobot = new Robot();
		CasaInteligente casa = new CasaInteligente();

		casa.asignarRobotLimpieza(miRobot);
		casa.habitantes = 2;

		casa.salirCasa();
		casa.salirCasa();
		System.out.println(casa.habitantes);
		System.out.println(miRobot.x + "   " + miRobot.y + "    " + miRobot.estado);
	}
}