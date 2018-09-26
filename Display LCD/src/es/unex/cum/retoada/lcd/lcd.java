package es.unex.cum.retoada.lcd;

import java.util.*;

public class lcd {

	public static void main(String[] args) {
		lcd l = new lcd();
		
		//Lo primero es leer lo introducido por teclado
		Scanner s = new Scanner (System.in);
		String entrada = s.nextLine();
		ArrayList <String>lista = new ArrayList <String>();
		lista.add(entrada); //voy guardando en la lista lo que me va metiendo por teclado
		while (entrada.charAt(0) != '0' || entrada.charAt(2) != '0') { //dejo de leer cuando introduce 0 0
			entrada = s.nextLine();
			lista.add(entrada);
		}
		l.mostrar(lista);
		
	}
	
	public void mostrar (ArrayList <String> lista) {
		Iterator it = lista.iterator();
		ArrayList <booleanos> l = new ArrayList <booleanos>(); //lista para guardar los booleanos que luego queremos mostrar
		while (it.hasNext()) {
			String numeros = (String) it.next();
			int tamanio = Integer.parseInt("" + numeros.charAt(0)); //tamaño de los números
			for (int i = 2; i<numeros.length(); i++) {
				int n = Integer.parseInt("" + numeros.charAt(i));
				booleanos b = new booleanos();
				switch(n) {
					case 0:
						b.cero();
						l.add(b);
						break;
					case 1: 
						b.uno();
						l.add(b);
						break;
					case 2:
						b.dos();
						l.add(b);
						break;
					case 3:
						b.tres();
						l.add(b);
						break;
					case 4:
						b.cuatro();
						l.add(b);
						break;
					case 5:
						b.cinco();
						l.add(b);
						break;
					case 6:
						b.seis();
						l.add(b);
						break;
					case 7:
						b.siete();
						l.add(b);
						break;
					case 8:
						l.add(b);
						break;
					case 9:
						b.nueve();
						l.add(b);
						break;
				}
			}
			
			//Ya tengo guardado los booleanos de los números que tengo que mostrar
		}
	}

}
