package mx.com.funcional2.clases;

import mx.com.funcional2.interfaces.Consumidor;

public class Impresor implements Consumidor {

	@Override
	public void consumir(Integer integer) {
		System.out.println("\n" + integer);
	}

}
