package com.choucairtesting.www.prueba.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/busqueda_trabajo.feature",
        tags = {},
        glue = "com.choucairtesting.www.prueba.certificacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class BusquedaTrabajoRunner {
}
