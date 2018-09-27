package es.unex.cum.retoada.lcd;

public class booleanos {
	
	protected boolean norte;
	protected boolean noroeste;
	protected boolean noreste;
	protected boolean centro;
	protected boolean suroeste;
	protected boolean sureste;
	protected boolean sur;
	protected int numero;
	
	public booleanos() {
		norte = true;
		noroeste = true;
		noreste = true;
		centro = true;
		suroeste = true;
		sureste = true;
		sur = true;
		numero = 8;
	}
	
	
	public booleanos(boolean norte, boolean noroeste, boolean noreste, boolean centro, boolean suroeste,
			boolean sureste, boolean sur, int numero) {
		super();
		this.norte = norte;
		this.noroeste = noroeste;
		this.noreste = noreste;
		this.centro = centro;
		this.suroeste = suroeste;
		this.sureste = sureste;
		this.sur = sur;
		this.numero = numero;
	}


	public boolean getNorte() {
		return norte;
	}

	public void setNorte(boolean norte) {
		this.norte = norte;
	}

	public boolean getNoroeste() {
		return noroeste;
	}

	public void setNoroeste(boolean noroeste) {
		this.noroeste = noroeste;
	}

	public boolean getNoreste() {
		return noreste;
	}

	public void setNoreste(boolean noreste) {
		this.noreste = noreste;
	}

	public boolean getCentro() {
		return centro;
	}

	public void setCentro(boolean centro) {
		this.centro = centro;
	}

	public boolean getSuroeste() {
		return suroeste;
	}

	public void setSuroeste(boolean suroeste) {
		this.suroeste = suroeste;
	}

	public boolean getSureste() {
		return sureste;
	}

	public void setSureste(boolean sureste) {
		this.sureste = sureste;
	}

	public boolean getSur() {
		return sur;
	}

	public void setSur(boolean sur) {
		this.sur = sur;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

	public void cero() {
		centro = false;
		numero = 0;
	}
	
	public void uno () {
		norte = false;
		noroeste = false;
		centro = false;
		suroeste = false;
		sur = false;
		numero = 1;
	}
	
	public void dos () {
		noroeste = false;
		sureste = false;
		numero = 2;
	}
	
	public void tres () {
		noroeste = false;
		suroeste = false;
		numero = 3;
	}
	
	public void cuatro () {
		norte = false;
		suroeste = false;
		sur = false;
		numero = 4;
	}
	
	public void cinco () {
		noreste = false;
		suroeste = false;
		numero = 5;
	}
	
	public void seis () {
		noreste = false;
		numero = 6;
	}
	
	public void siete () {
		noroeste = false;
		centro = false;
		suroeste = false;
		sur = false;
		numero = 7;
	}
	
	public void nueve () {
		suroeste = false;
		sur = false;
		numero = 9;
	}
}
