package mx.com.funcional2.clases;

import java.util.Random;

import mx.com.funcional2.interfaces.Proveedor;

public class Aleatorio implements Proveedor {

	@Override
	public Integer obtener() {
		return new Random().nextInt(1000);
	}

}
