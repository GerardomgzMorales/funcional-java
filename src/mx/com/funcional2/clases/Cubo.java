package mx.com.funcional2.clases;

import mx.com.funcional2.interfaces.Funcion;

public class Cubo implements Funcion {

	@Override
	public Integer elevacion(Integer valorInteger) {
		return valorInteger * valorInteger * valorInteger;
	}

}
