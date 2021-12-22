package mx.com.funcional2.clases;

import mx.com.funcional2.interfaces.Predicado;

public class SoloPares implements Predicado {

	@Override
	public boolean aplicar(Integer valor) {
		return valor % 2 == 0;
	}

}
