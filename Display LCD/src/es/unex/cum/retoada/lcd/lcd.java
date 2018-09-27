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
		s.close();

	}

	public void mostrar (ArrayList <String> lista) {
		Iterator it = lista.iterator();
		ArrayList <booleanos> l = new ArrayList <booleanos>(); //Lista para guardar los booleanos que luego queremos mostrar
		while (it.hasNext()) {
			l.clear(); //Se borran todos los elementos de la lista para dibujar la nueva fila
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

}
