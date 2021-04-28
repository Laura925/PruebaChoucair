package com.choucairtesting.www.prueba.certificacion.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.choucairtesting.com/empleos-testing/")
public class BusquedaTrabajoUI extends PageObject {

    public static final Target CAMPO_KEYWORDS = Target.the("Es el campo de keywords").located(By.id("search_keywords"));
    public static final Target CAMPO_LOCATION = Target.the("Es el campo de location").located(By.id("search_location"));
    public static final Target BTN_SEARCH_JOBS = Target.the("Boton de search jobs").located(By.xpath("//*[@value='Search Jobs']"));
    public static final Target PRIMERA_CONVOCATORIA = Target.the("Primera convocatoria de la busqueda").located(By.xpath("(//*[@class='job_listings'])[2]/li[1]"));
    public static final Target BUSQUEDA_NO_ENCONTRADA = Target.the("Busqueda no encontrada").located(By.xpath("//*[@class='no_job_listings_found']"));
}
