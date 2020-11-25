package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor {
	private Integer kilometros;
	private Integer distancia;
	
	public Corredor(Integer codigo, String nombre, Integer km) {
		super(codigo, nombre);
		// TODO Auto-generated constructor stub
		this.distancia = km;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		// TODO Auto-generated method stub
		this.kilometros = km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return kilometros;
	}

	
	public Integer getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return distancia;
	}


	
	
	
	
	

}
