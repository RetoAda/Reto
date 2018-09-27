package es.unex.cum.retoada.lcd;

import java.util.*;

public class lcd {
	private HashMap <Integer, booleanos>mapanumeros = new HashMap<Integer, booleanos>();

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
		l.dibujo2(lista);
		s.close();

	}

	public void mostrar (ArrayList <String> lista) {
		Iterator it = lista.iterator();
		ArrayList <booleanos> l = new ArrayList <booleanos>(); //Lista para guardar los booleanos que luego queremos mostrar
		while (it.hasNext()) {
			l.clear(); //Se borran todos los elementos de la lista para dibujar la nueva fila
			String numeros = (String) it.next();
			int tamanio = Integer.parseInt("" + numeros.charAt(0)); //Tamaño de los números
			for (int i = 2; i<numeros.length(); i++) {
				int n = Integer.parseInt("" + numeros.charAt(i));
				booleanos b = new booleanos();
				booleanos B;
				switch(n) {
				case 0:
					//b.cero();
					B = new booleanos(true, true, true, false, true, true, true, 0);
					l.add(B);
					break;
				case 1: 
					//b.uno();
					B = new booleanos(false, false, true, false, false, true, false, 1);
					l.add(B);
					break;
				case 2:
					//b.dos();
					B = new booleanos(true, false, true, true, true, false, true, 2);
					l.add(B);
					break;
				case 3:
					//b.tres();
					B = new booleanos(true, false, true, true, false, true, true, 3);
					l.add(B);
					break;
				case 4:
					//b.cuatro();
					B = new booleanos(false, true, true, true, false, true, false, 4);
					l.add(B);
					break;
				case 5:
					//b.cinco();
					B = new booleanos(true, true, false, true, false, true, true, 5);
					l.add(B);
					break;
				case 6:
					//b.seis();
					B = new booleanos(true, true, false, true, true, true, true, 6);
					l.add(B);
					break;
				case 7:
					B = new booleanos(true, false, true, false, false, true, false, 7);
					//b.siete();
					l.add(B);
					break;
				case 8:
					B = new booleanos(true, true, true, true, true, true, true, 8);
					l.add(B);
					break;
				case 9:
					B = new booleanos(true, true, true, true, false, true, true, 9);
					//b.nueve();
					l.add(B);
					break;
				}
			}
			String guion = new String(new char[tamanio]).replace("\0", "-");
			String espacio = new String(new char[tamanio+2]).replace("\0", " ");
			String medio = new String(new char[tamanio]).replace("\0", " ");
			//Ya tengo guardado los booleanos de los números que tengo que mostrar
			//Hay que acceder a la lista 5 veces para dibujar las distintas líneas
			//Primera vez: norte (-)
			Iterator it2 = l.iterator();
			while (it2.hasNext()) {
				booleanos b = (booleanos) it2.next(); //Cojo los booleanos del número
				/*for (int i = 0; i<tamanio; i++) {
					System.out.print(" ");
					if (b.getNorte()) System.out.print("-");
					else System.out.print(" ");
					System.out.print(" ");
				}*/
				if (b.getNorte()) {
					System.out.print(" ");
					System.out.print(guion);
					System.out.print(" ");
				}
				else {
					System.out.print(espacio);
				}

			}
			System.out.println(" ");

			//Segunda vez: nororeste y noreste (|)
			for (int i = 0; i<tamanio; i++) {
				it2 = l.iterator();
				while (it2.hasNext()) {
					booleanos b = (booleanos) it2.next(); //Cojo los booleanos del número
					if (b.getNoroeste()) System.out.print("|");
					else System.out.print(" ");
					System.out.print(medio);
					if (b.getNoreste()) System.out.print("|");
					else System.out.print(" ");

				}
				System.out.println(" ");
			}

			//Tercera vez: centro (-) --> igual que el norte
			it2 = l.iterator();
			while (it2.hasNext()) {
				booleanos b = (booleanos) it2.next(); //Cojo los booleanos del número
				/*for (int i = 0; i<tamanio; i++) {
					System.out.print(" ");
					if (b.getCentro()) System.out.print("-");
					else System.out.print(" ");
					System.out.print(" ");
				}*/
				if (b.getCentro()) {
					System.out.print(" ");
					System.out.print(guion);
					System.out.print(" ");
				}
				else {
					System.out.print(espacio);
				}
			}
			System.out.println(" ");

			//Cuarta vez: suroeste y sureste (|) --> igual que noroeste y noreste
			for (int i = 0; i<tamanio; i++) {
				it2 = l.iterator();
				while (it2.hasNext()) {
					booleanos b = (booleanos) it2.next(); //Cojo los booleanos del número
					if (b.getSuroeste()) System.out.print("|");
					else System.out.print(" ");
					System.out.print(medio);
					if (b.getSureste()) System.out.print("|");
					else System.out.print(" ");

				}
				System.out.println(" ");
			}

			//Quita vez: sur (-) --> igual que norte y centro
			it2 = l.iterator();
			while (it2.hasNext()) {
				booleanos b = (booleanos) it2.next(); //Cojo los booleanos del número
				/*for (int i = 0; i<tamanio; i++) {
					System.out.print(" ");
					if (b.getSur()) System.out.print("-");
					else System.out.print(" ");
					System.out.print(" ");
				}*/
				if (b.getSur()) {
					System.out.print(" ");
					System.out.print(guion);
					System.out.print(" ");
				}
				else {
					System.out.print(espacio);
				}
			}
			System.out.println(" ");
		}
	}
	/**
	 * Función que guarda en un HashMap todos los digitos para consultarlos fácilmente
	 */
	public void crearMapa() {

		booleanos B;

		B = new booleanos(true, true, true, false, true, true, true, 0);
		mapanumeros.put(0, B);
		B = new booleanos(false, false, true, false, false, true, false, 1);
		mapanumeros.put(1, B);
		B = new booleanos(true, false, true, true, true, false, true, 2);
		mapanumeros.put(2, B);
		B = new booleanos(true, false, true, true, false, true, true, 3);
		mapanumeros.put(3, B);
		B = new booleanos(false, true, true, true, false, true, false, 4);
		mapanumeros.put(4, B);
		B = new booleanos(true, true, false, true, false, true, true, 5);
		mapanumeros.put(5, B);
		B = new booleanos(true, true, false, true, true, true, true, 6);
		mapanumeros.put(6, B);
		B = new booleanos(true, false, true, false, false, true, false, 7);
		mapanumeros.put(7, B);
		B = new booleanos(true, true, true, true, true, true, true, 8);
		mapanumeros.put(8, B);
		B = new booleanos(true, true, true, true, false, true, true, 9);
		mapanumeros.put(9, B);
	}

	public void dibujo2(ArrayList<String> lista) {
		crearMapa();
		String numero = "1234";
		Iterator it = lista.iterator();
		ArrayList <booleanos> l = new ArrayList <booleanos>(); //Lista para guardar los booleanos que luego queremos mostrar
		while (it.hasNext()) {
			String numeros = (String) it.next();
			int tamanio = (Integer.parseInt(""+numeros.charAt(0)));
			StringTokenizer tokens_numeros = new StringTokenizer(numeros);
			tokens_numeros.nextToken();
			String num = tokens_numeros.nextToken(); //Número que se va a representar

			/*Cadenas auxiliares útiles a la hora de la representación*/
			String guion = new String(new char[tamanio]).replace("\0", "-");
			String espacio = new String(new char[tamanio+2]).replace("\0", " ");
			String medio = new String(new char[tamanio]).replace("\0", " ");

			/* Representación del norte */
			for (int i = 0; i<num.length(); i++) {
				int cifra = Integer.parseInt(""+num.charAt(i));
				booleanos b = mapanumeros.get(cifra);
				if (b.getNorte()) {
					System.out.print(" ");
					System.out.print(guion);
					System.out.print(" ");
				}
				else {
					System.out.print(espacio);
				}
			}
			System.out.println(" ");
			/* Representación del noroeste y el noreste */
			for (int j = 0; j<tamanio; j++) {
				for (int i = 0; i<num.length(); i++) {
					int cifra = Integer.parseInt(""+num.charAt(i));
					booleanos b = mapanumeros.get(cifra);

					if (b.getNoroeste()) System.out.print("|");
					else System.out.print(" ");
					System.out.print(medio);
					if (b.getNoreste()) System.out.print("|");
					else System.out.print(" ");
				}
				System.out.println(" ");
			}
			/* Representación del centro */
			for (int i = 0; i<num.length(); i++) {
				int cifra = Integer.parseInt(""+num.charAt(i));
				booleanos b = mapanumeros.get(cifra);
				if (b.getCentro()) {
					System.out.print(" ");
					System.out.print(guion);
					System.out.print(" ");
				}
				else {
					System.out.print(espacio);
				}
			}
			System.out.println(" ");
			/* Representación del suroeste y sureste */
			for (int j = 0; j<tamanio; j++) {
				for (int i = 0; i<num.length(); i++) {
					int cifra = Integer.parseInt(""+num.charAt(i));
					booleanos b = mapanumeros.get(cifra);

					if (b.getSuroeste()) System.out.print("|");
					else System.out.print(" ");
					System.out.print(medio);
					if (b.getSureste()) System.out.print("|");
					else System.out.print(" ");
				}
				System.out.println(" ");
			}
			/* Representación del sur */
			for (int i = 0; i<num.length(); i++) {
				int cifra = Integer.parseInt(""+num.charAt(i));
				booleanos b = mapanumeros.get(cifra);
				if (b.getSur()) {
					System.out.print(" ");
					System.out.print(guion);
					System.out.print(" ");
				}
				else {
					System.out.print(espacio);
				}
			}
			System.out.println(" ");
		}
	}

}
