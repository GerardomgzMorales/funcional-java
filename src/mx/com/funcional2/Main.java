package mx.com.funcional2;

import java.util.ArrayList;
import java.util.List;

import mx.com.funcional2.clases.SoloImpares;
import mx.com.funcional2.clases.SoloPares;

public class Main {

	public static void main(String[] args) {
		new Main();

	}

	public Main() {
		List<Integer> numerosIntegers = crearLista();
		System.out.println(numerosIntegers);
		List<Integer> paresNumerosIntegers = SuperFuncion.filtrar(numerosIntegers, new SoloPares());
		System.out.println(paresNumerosIntegers);
		/*
		 * List<Integer> cuadradosIntegers = elevarCuadrado(paresNumerosIntegers);
		 * System.out.println(cuadradosIntegers); List<Integer> imprimeNumeroIntegers =
		 * imprimeNumero(cuadradosIntegers); System.out.println("Imprime numero: " +
		 * imprimeNumeroIntegers); Long sumaNumerosCuadadosLong =
		 * sumaCuadados(cuadradosIntegers); System.out.println("La suma es: " +
		 * sumaNumerosCuadadosLong);
		 */
	}

	private Long sumaCuadados(List<Integer> cuadradosIntegers) {
		Long sumaLong = 0L;
		for (Integer integer : cuadradosIntegers) {
			sumaLong += Long.valueOf(integer.longValue());
		}
		return sumaLong;
	}

	private List<Integer> imprimeNumero(List<Integer> cuadradosIntegers) {
		for (Integer integer : cuadradosIntegers) {
			System.out.println(integer);
		}
		return cuadradosIntegers;
	}

	private List<Integer> elevarCuadrado(List<Integer> paresNumerosIntegers) {
		List<Integer> nuevoasParesIntegers = new ArrayList<>();
		for (Integer integer : paresNumerosIntegers) {
			nuevoasParesIntegers.add(integer * integer);
		}
		return nuevoasParesIntegers;
	}

	private List<Integer> filtrarPares(List<Integer> numerosIntegers) {
		List<Integer> nuevoasParesIntegers = new ArrayList<>();
		for (Integer integer : numerosIntegers) {
			if (integer % 2 == 0) {
				nuevoasParesIntegers.add(integer);
			}
		}
		return nuevoasParesIntegers;
	}

	private List<Integer> crearLista() {
		return List.of(0, 1, 2, 5, 7, 88, 5, 77, 3, 99, 2, 10, 77, 4, 6, 11, -88, -8);
	}

}
