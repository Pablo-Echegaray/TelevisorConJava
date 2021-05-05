package ar.edu.unlam.televisor1;

public class Televisores {

	public static void main(String[] args) {

		// declaracion e instancia del objeto
		Televisor smartTV = new Televisor("Noblex");

		// volumen y canal inicial
		System.out.println("El volumen inicial del televisor marca " + smartTV.getMarca() + " es : "
				+ smartTV.getVolumen() + ". Y su canal inicial es: " + smartTV.getCanal());

		// cambio al canal 20 y subo 2 canales mas. Subo el volumen 5 veces. canal = 22
		// - volumen = 6
		smartTV.cambiarCanal(20);
		smartTV.subirVolumen();
		smartTV.subirVolumen();
		smartTV.subirVolumen();
		smartTV.subirVolumen();
		smartTV.subirVolumen();
		smartTV.subirCanal();
		smartTV.subirCanal();

		System.out.println("El volumen del televisor marca " + smartTV.getMarca() + " ahora es: " + smartTV.getVolumen()
				+ ". Y su canal cambio al: " + smartTV.getCanal());

		// bajo de canal 3 veces y muteo el volumen. canal = 19 - volumen = 0
		smartTV.bajarCanal();
		smartTV.bajarCanal();
		smartTV.bajarCanal();
		smartTV.mutear();

		System.out.println("El volumen del televisor marca " + smartTV.getMarca() + " ha sido muteado, ahora es: "
				+ smartTV.getVolumen() + ". Y su canal cambio al: " + smartTV.getCanal());

		// cambio al canal 1 y bajo el canal y el volumen para testear que las
		// validaciones funcionen. Debe devolver canal = 1 y volumen= 0
		smartTV.cambiarCanal(1);
		smartTV.bajarCanal();
		smartTV.bajarCanal();
		smartTV.bajarVolumen();
		smartTV.bajarVolumen();

		System.out.println("El volumen del televisor marca " + smartTV.getMarca() + " sigue siendo: "
				+ smartTV.getVolumen() + ". Y su canal cambio al: " + smartTV.getCanal());

		// desmuteo el volumen y deberia volver a el anterior estado antes de mutearse
		// (6) y luego le subo 1. volumen = 7
		smartTV.mutear();
		smartTV.subirVolumen();

		System.out.println("El volumen del televisor marca " + smartTV.getMarca() + " fue desmuteado, y ahora es: "
				+ smartTV.getVolumen() + ". Y su canal se mantuvo en el: " + smartTV.getCanal());

	}
}