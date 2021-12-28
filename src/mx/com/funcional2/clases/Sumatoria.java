package mx.com.funcional2.clases;

import mx.com.funcional2.interfaces.Matematica;

public class Sumatoria implements Matematica {

	@Override
	public Long operacion(Integer integer, Long totaLong) {
		return integer + totaLong;
	}

}
