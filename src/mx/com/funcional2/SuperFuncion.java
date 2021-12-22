package mx.com.funcional2;

import java.util.ArrayList;
import java.util.List;

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

}
