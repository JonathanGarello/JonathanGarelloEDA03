package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador {
	private String estilo;
	
	public Nadador(Integer codigo, String nombre, String estilo) {
		super(codigo, nombre);
		this.estilo=estilo;
	}

	@Override
	public String getEstiloPreferido() {
		// TODO Auto-generated method stub
		return estilo;
	}


	

}
