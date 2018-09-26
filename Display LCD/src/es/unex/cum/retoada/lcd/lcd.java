package es.unex.cum.retoada.lcd;

import java.util.*;

public class lcd {

	public static void main(String[] args) {
		lcd l = new lcd();
		
		Scanner s = new Scanner (System.in);
		String entrada = s.nextLine();
		ArrayList <String>lista = new ArrayList <String>();
		lista.add(entrada);
		while (entrada.charAt(0) != '0' || entrada.charAt(2) != '0') {
			entrada = s.nextLine();
			lista.add(entrada);
		}
		l.mostrar(lista);
		
	}
	
	public void mostrar (ArrayList <String> lista) {
		Iterator it = lista.iterator();
		while (it.hasNext()) {
			String numeros = (String) it.next();
			int tamanio = Integer.parseInt("" + numeros.charAt(0));
			for (int i = 2; i<numeros.length(); i++) {
				int n = Integer.parseInt("" + numeros.charAt(i));
				switch(n) {
					case 0:
						for (int j=0; j<tamanio; j++) {
							System.out.print("|");
							for (int t=0; t<tamanio; t++) {
								System.out.print("-");
							}
							System.out.println("|");
						}
						break;
				}
			}
		}
	}

}
