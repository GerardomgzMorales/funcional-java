package mx.com.funcional2;

import java.util.ArrayList;
import java.util.List;

import mx.com.funcional2.interfaces.Predicado;

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

}
