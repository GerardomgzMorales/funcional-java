package mx.com.funcional2;

import java.util.ArrayList;
import java.util.List;

import mx.com.funcional2.interfaces.Consumidor;
import mx.com.funcional2.interfaces.Funcion;
import mx.com.funcional2.interfaces.Matematica;
import mx.com.funcional2.interfaces.Predicado;
import mx.com.funcional2.interfaces.Proveedor;

public class SuperFuncion {

	public static List<Integer> filtrar(List<Integer> valores, Predicado predicado) {
		List<Integer> resultadoIntegers = new ArrayList<>();
		for (Integer integer : valores) {
			if (predicado.aplicar(integer)) {
				resultadoIntegers.add(integer);
			}
		}
		return resultadoIntegers;
	}

	public static List<Integer> proveer(Integer sInteger, Proveedor provedor) {
		List<Integer> resultadoIntegers = new ArrayList<>();
		for (int i = 0; i < sInteger; i++) {
			resultadoIntegers.add(provedor.obtener());
		}
		return resultadoIntegers;
	}

	public static List<Integer> transformar(List<Integer> numeros, Funcion funcion) {
		List<Integer> resultadoIntegers = new ArrayList<>();
		for (Integer integer : numeros) {
			resultadoIntegers.add(funcion.elevacion(integer));
		}
		return resultadoIntegers;
	}

	public static List<Integer> actuar(List<Integer> valores, Consumidor consumidor) {
		for (Integer integer : valores) {
			consumidor.consumir(integer);
		}
		return valores;
	}

	public static Long contar(List<Integer> numero, Long identidad, Matematica matematica) {
		Long totaLong = identidad;
		for (Integer integer : numero) {
			totaLong = matematica.operacion(integer, totaLong);
		}
		return totaLong;
	}

}
