package br.com.dengoso.modelo.foco;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import br.com.dengoso.modelo.EntidadeBase;
import br.com.dengoso.modelo.coordenadas.Coordenadas;

@Entity
public final class FocoDeDengue extends EntidadeBase {

	@Embedded
	private Coordenadas coordenadas;
	
	private FocoDeDengue(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}

	public static FocoDeDengue criar(Coordenadas coordenadas) {
		return new FocoDeDengue(coordenadas);
	}

	public double getLatitude() {
		return coordenadas.getLatitude();
	}

	public double getLongitude() {
		return coordenadas.getLongitude();
	}
}
