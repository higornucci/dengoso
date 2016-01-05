package br.com.dengoso.aplicacao.foco;

import br.com.dengoso.modelo.coordenadas.Coordenadas;
import br.com.dengoso.modelo.foco.FocoDeDengue;
import br.com.dengoso.modelo.foco.FocoDeDengueRepository;

public class AdicionaAdicionaFocoDeDengue {

	private final FocoDeDengueRepository focoDeDengueRepository;

	public AdicionaAdicionaFocoDeDengue(FocoDeDengueRepository focoDeDengueRepository) {
		this.focoDeDengueRepository = focoDeDengueRepository;
	}

	public void adicionar(FocoDeDengueRequest focoDeDengueRequest) {
		Coordenadas coordenadas = new Coordenadas(focoDeDengueRequest.getLatitude(), focoDeDengueRequest.getLongitude());
		FocoDeDengue focoDeDengue = FocoDeDengue.criar(coordenadas);
		
		focoDeDengueRepository.salvar(focoDeDengue);
	}

}
