package mx.com.funcional2;

import java.util.List;

import mx.com.funcional2.clases.Aleatorio;
import mx.com.funcional2.clases.Cuadrado;
import mx.com.funcional2.clases.Cubo;
import mx.com.funcional2.clases.SoloImpares;
import mx.com.funcional2.clases.SoloPares;

public class Main {

	public static void main(String[] args) {
		new Main();

	}

	public Main() {
		List<Integer> numerosEnteros = SuperFuncion.proveer(9, new Aleatorio());
		System.out.println(numerosEnteros);

		List<Integer> numerosPares = SuperFuncion.filtrar(numerosEnteros, new SoloPares());
		System.out.println("\nNumeros Filtados pares: " + numerosPares);

		List<Integer> numerosImpares = SuperFuncion.filtrar(numerosEnteros, new SoloImpares());
		System.out.println("\nNumeros Filtados impares: " + numerosImpares);

		List<Integer> numerosElevadoCuadradoIntegers = SuperFuncion.transformar(numerosEnteros, new Cuadrado());
		System.out.println("\nNumeros cuadrados: " + numerosElevadoCuadradoIntegers);
		
		List<Integer> numeroElevadoCubo = SuperFuncion.transformar(numerosEnteros, new Cubo());
		System.out.println("\nNumeros cuadrados: " + numeroElevadoCubo);

	}
}
