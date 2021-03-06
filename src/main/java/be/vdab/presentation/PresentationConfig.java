package be.vdab.presentation;

import org.springframework.context.annotation.Bean;

import be.vdab.enums.PersoonEigenschap;
import be.vdab.services.PersoonService;

public class PresentationConfig {
	@Bean
	PersoonViewer persoonViewer(PersoonService persoonService) {
		return new PersoonViewer(new PersoonEigenschap[] {
			PersoonEigenschap.VOORNAAM, PersoonEigenschap.FAMILIENAAM, 
			PersoonEigenschap.AANTAL_KINDEREN}, persoonService);
	}
}
