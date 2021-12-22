package mx.com.funcional2;

import java.util.List;

import mx.com.funcional2.clases.Aleatorio;
import mx.com.funcional2.clases.SoloPares;

public class Main {

	public static void main(String[] args) {
		new Main();

	}

	public Main() {
		List<Integer> numerosEnteros = SuperFuncion.proveer(5, new Aleatorio());
		System.out.println(numerosEnteros);

		List<Integer> numerosFiltrados = SuperFuncion.filtrar(numerosEnteros, new SoloPares());
		System.out.println("\nNumeros Filtados: " + numerosFiltrados);
		/*
		 * List<Integer> cuadradosIntegers = elevarCuadrado(paresNumerosIntegers);
		 * System.out.println(cuadradosIntegers); List<Integer> imprimeNumeroIntegers =
		 * imprimeNumero(cuadradosIntegers); System.out.println("Imprime numero: " +
		 * imprimeNumeroIntegers); Long sumaNumerosCuadadosLong =
		 * sumaCuadados(cuadradosIntegers); System.out.println("La suma es: " +
		 * sumaNumerosCuadadosLong);
		 */
	}
}
