package br.com.dengoso.aplicacao.foco;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Matchers.any;

import org.junit.Test;

import br.com.dengoso.modelo.foco.FocoDeDengue;
import br.com.dengoso.modelo.foco.FocoDeDengueRepository;

public class AdicionaFocoDeDengueTeste {

	@Test
	public void deve_ser_possivel_adicionar_um_foco_de_dengue() throws Exception {
		FocoDeDengueRepository focoDeDengueRepository = mock(FocoDeDengueRepository.class);
		double latitudeEsperada =  -20.496323d;
		double longitudeEsperada =  -20.496323d;
		FocoDeDengueRequest focoDeDengueRequest = new FocoDeDengueRequest(latitudeEsperada, longitudeEsperada);
		
		new AdicionaAdicionaFocoDeDengue(focoDeDengueRepository).adicionar(focoDeDengueRequest);
		
		verify(focoDeDengueRepository).salvar(any(FocoDeDengue.class));
	}
}