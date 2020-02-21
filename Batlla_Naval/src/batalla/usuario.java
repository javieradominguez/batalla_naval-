package batalla;

import java.util.*;

public class usuario {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Scanner entrada = new Scanner(System.in);

		int cord1;
		String letra;

		String[][] matriz = { { "~", "~", "~", "~", "~" }, { "~", "~", "~", "~", "~" }, { "~", "~", "~", "~", "~" },
				{ "~", "~", "~", "~", "~" }, { "~", "~", "~", "~", "~" } };

		String[][] matrizeje = { { ".", "1", "2", "3", "4", "5" }, { "A", "~", "~", "~", "~", "~" },
				{ "B", "~", "~", "~", "~", "~" }, { "C", "~", "~", "~", "~", "~" }, { "D", "~", "~", "~", "~", "~" },
				{ "E", "~", "~", "~", "~", "~" } };

		System.out.print(matriz);

		System.out.print("Ingrese posicion posicion de letra matriz");
		letra = entrada.next();

		letra = letra.toUpperCase();

		switch (letra) {

		case "A":
			cord1 = 0;
			break;
		case "B":
			cord1 = 1;
			break;
		case "C":
			cord1 = 1;
			break;
		case "D":
			cord1 = 1;
			break;
		case "E":
			cord1 = 1;
			break;

		}
		
		
		System.out.print("Ingrese posicion posicion de numero matriz");
		numero = entrada.nextInt();

		// llenar la matriz {{~,~,~,~,~},

		// {~,~,~,~,~}...
		// mostrar la matriz y solicitar el ingreso de las 5 lanchas
		// guardar lanchas en matriz de jugador 1 o 2
		// se repite para el otro jugador
		// inicio del juego
		//
		// ************* player 1 *****************//
		// mostrar el tablero del primer jugador con las lanchas
		// se solicita al primer jugador las coordenadas de ataque
		// mostras resultado de ataque en las matrices
		//
		// ************* player 2 *****************//
		// mostrar el tablero del psegundo jugador jugador con las lanchas
		// se solicita al primer jugador las coordenadas de ataque
		// mostras resultado de ataque en las matrices
		//
	}
}
