package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista {
	private String usada;

	public Ciclista(Integer codigo, String nombre, String usada) {
		super(codigo, nombre);
		this.usada = usada;
	}

	@Override
	public String getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return usada;
	}
	
	
	
	

}
