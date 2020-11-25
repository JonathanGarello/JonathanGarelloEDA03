package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String string) {
		// TODO Auto-generated constructor stub
		this.nombre=string;
		socios = new HashSet<Deportista>();
		competencias = new HashMap<String, Evento>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarDeportista(Deportista nuevo) {
		// TODO Auto-generated method stub
		if(!nuevo.equals(null)) {
			socios.add(nuevo);
		}
	}

	public Object getCantidadSocios() {
		// TODO Auto-generated method stub
		return socios.size();
	}

	public void crearEvento(TipoDeEvento carreraNatacionEnAguasAbiertas, String string) {
		// TODO Auto-generated method stub
		if(!string.equals(null)) {
		competencias.put(string, new Evento(carreraNatacionEnAguasAbiertas));
		}
	}

	public Integer inscribirEnEvento(String string, Deportista celeste) throws NoEstaPreparado {
		// TODO Auto-generated method stub
		switch (competencias.get(string).getTipo()) {
		case CARRERA_NATACION_EN_PICINA:
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			if(celeste instanceof INadador) {
			competencias.get(string).inscribirParticipante(celeste);
			return competencias.get(string).getNumeroDeInscripcion();
			}else {
				throw new NoEstaPreparado("no pertenece");
			}
		case CARRERA_5K:
		case CARRERA_10K:
		case CARRERA_21K:
		case CARRERA_42K:
			if(celeste instanceof ICorredor) {
				competencias.get(string).inscribirParticipante(celeste);
				return competencias.get(string).getNumeroDeInscripcion();
		}else {
			throw new NoEstaPreparado("no pertenece");
			}
		
		case TRIATLON_SHORT:
		case TRIATLON_OLIMPICO:
		case TRIATLON_MEDIO:
		case TRIATLON_IRONMAN:
			if(celeste instanceof ICorredor) {
			if(celeste instanceof INadador)
				competencias.get(string).inscribirParticipante(celeste);
				return competencias.get(string).getNumeroDeInscripcion();
			}else {
				throw new NoEstaPreparado("no pertenece");
			}
		case DUATLON:
			if(celeste instanceof ICiclista) {
				competencias.get(string).inscribirParticipante(celeste);
				return competencias.get(string).getNumeroDeInscripcion();
			}else {
				throw new NoEstaPreparado("no pertenece");
			}
			
		default:
			return 0;
	}

}
	

	
	
}
