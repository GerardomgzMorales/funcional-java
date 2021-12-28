package mx.com.funcional2;

import java.util.List;
import java.util.Random;

import mx.com.funcional2.clases.Cuadrado;
import mx.com.funcional2.clases.Cubo;
import mx.com.funcional2.clases.Impresor;
import mx.com.funcional2.clases.SoloImpares;
import mx.com.funcional2.clases.SoloPares;
import mx.com.funcional2.clases.Sumatoria;
import mx.com.funcional2.interfaces.Predicado;
import mx.com.funcional2.interfaces.Proveedor;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		// List<Integer> numerosEnteros = SuperFuncion.proveer(8, new Aleatorio());
		List<Integer> numerosEnteros = SuperFuncion.proveer(8, new Proveedor() {
			@Override
			public Integer obtener() {
				return new Random().nextInt(6);
			}
		});

		System.out.println(numerosEnteros);

		/*
		 * List<Integer> numerosPares = SuperFuncion.filtrar(numerosEnteros, new
		 * SoloPares());
		 */
		List<Integer> numerosPares = SuperFuncion.filtrar(numerosEnteros, new Predicado() {

			@Override
			public boolean aplicar(Integer valor) {
				return valor % 2 != 0;
			}

		});
		System.out.println("\nNumeros Filtados pares: " + numerosPares);

		List<Integer> numerosImpares = SuperFuncion.filtrar(numerosEnteros, new SoloImpares());
		System.out.println("\nNumeros Filtados impares: " + numerosImpares);

		List<Integer> numerosElevadoCuadradoIntegers = SuperFuncion.transformar(numerosEnteros, new Cuadrado());
		System.out.println("\nNumeros cuadrados: " + numerosElevadoCuadradoIntegers);

		List<Integer> numeroElevadoCubo = SuperFuncion.transformar(numerosEnteros, new Cubo());
		System.out.println("\nNumeros al cubo: " + numeroElevadoCubo);

		SuperFuncion.actuar(numeroElevadoCubo, new Impresor());

		System.out.println(SuperFuncion.contar(numerosEnteros, 0L, new Sumatoria()));

	}
}
