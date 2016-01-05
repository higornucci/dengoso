package br.com.dengoso.modelo.coordenadas;

import javax.persistence.Embeddable;

@Embeddable
public class Latitude {

	private double latitude;
	
	Latitude() {
	}

	Latitude(double valor) {
		this.latitude = valor;
	}
	
	public double getValor() {
		return latitude;
	}
}
