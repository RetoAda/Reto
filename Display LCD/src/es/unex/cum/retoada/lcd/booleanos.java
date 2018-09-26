package es.unex.cum.retoada.lcd;

public class booleanos {
	
	protected boolean norte;
	protected boolean noroeste;
	protected boolean noreste;
	protected boolean centro;
	protected boolean suroeste;
	protected boolean sureste;
	protected boolean sur;
	
	public booleanos() {
		norte = true;
		noroeste = true;
		noreste = true;
		centro = true;
		suroeste = true;
		sureste = true;
		sur = true;
	}
	
	public void cero() {
		centro = false;
	}
	
	public void uno () {
		norte = false;
		noroeste = false;
		centro = false;
		suroeste = false;
		sur = false;
	}
	
	public void dos () {
		noroeste = false;
		sureste = false;
	}
	
	public void tres () {
		noroeste = false;
		suroeste = false;
	}
	
	public void cuatro () {
		norte = false;
		suroeste = false;
		sur = false;
	}
	
	public void cinco () {
		noreste = false;
		suroeste = false;
	}
	
	public void seis () {
		noreste = false;
	}
	
	public void siete () {
		noroeste = false;
		centro = false;
		suroeste = false;
		sur = false;
	}
	
	public void nueve () {
		suroeste = false;
		sur = false;
	}
}
