package be.vdab;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import be.vdab.presentation.PersoonViewer;
import be.vdab.presentation.PresentationConfig;
import be.vdab.repositories.RepositoriesConfig;
import be.vdab.services.ServicesConfig;

public class Main {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(
						new Class[] {RepositoriesConfig.class, ServicesConfig.class, PresentationConfig.class})) {
			context.getBean(PersoonViewer.class).afbeelden();
		} catch (BeansException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
