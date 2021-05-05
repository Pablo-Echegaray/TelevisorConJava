package ar.edu.unlam.televisor1;

public class Televisor {

	private String marca;
	private int volumen;
	private int canal;
	private boolean mute;
	private int volumenActual;

	public Televisor(String marca) {
		this.marca = marca;
		this.volumen = 1;
		this.canal = 1;
		this.mute = false;
	}

	public String getMarca() {
		return marca;
	}

	public int getCanal() {
		return canal;
	}

	public int getVolumen() {
		return volumen;
	}

	public void cambiarCanal(int nuevoCanal) {
		if (nuevoCanal > 0 && nuevoCanal < 200) {
			canal = nuevoCanal;
		}
	}

	public void subirCanal() {
		if (canal < 200) {
			canal++;
		}
	}

	public void bajarCanal() {
		if (canal > 1) {
			canal--;
		}
	}

	public void subirVolumen() {
		if (volumen < 100) {
			volumen++;
		}
		volumenActual = volumen;
	}

	public void bajarVolumen() {
		if (volumen > 0) {
			volumen--;
			volumenActual = volumen;
		}

	}

	public void mutear() {
		if (volumen >= 0 && mute == false) {
			volumen = 0;
			mute = true;
		} else if (volumen == 0 && mute == true) {
			volumen = volumenActual;
		}

	}
}
