package ar.edu.unlam.pb2.eva03;


import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, INadador, ICorredor{
	private String usada;
	private Integer km;
	private String kmPref;
	
	public Triatleta(int codigo, String string, String string2, String tria) {
		// TODO Auto-generated constructor stub
		super(codigo, string);
		this.kmPref = string2;
		this.usada = tria;
	}

	@Override
	public String getEstiloPreferido() {
		// TODO Auto-generated method stub
		return kmPref;
	}

	@Override
	public String getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return usada;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		// TODO Auto-generated method stub
		this.km=km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return km;
	}

	
	public String getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return kmPref;
	}


	

	
	
	
	
	
}
