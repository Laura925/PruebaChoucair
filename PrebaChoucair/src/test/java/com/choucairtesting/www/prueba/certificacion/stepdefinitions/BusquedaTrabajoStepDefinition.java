package com.choucairtesting.www.prueba.certificacion.stepdefinitions;

import com.choucairtesting.www.prueba.certificacion.models.InformacionBusqueda;
import com.choucairtesting.www.prueba.certificacion.questions.BusquedaNoEncontrada;
import com.choucairtesting.www.prueba.certificacion.questions.ValidacionDeConvocatoria;
import com.choucairtesting.www.prueba.certificacion.tasks.BuscarConvocatoria;
import com.choucairtesting.www.prueba.certificacion.userinterfaces.BusquedaTrabajoUI;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BusquedaTrabajoStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario abre la aplicacion web de Choucair$")
    public void queElUsuarioAbreLaAplicacionWebDeChoucair() throws Exception {
        theActorCalled("usuario").attemptsTo(Open.browserOn().the(BusquedaTrabajoUI.class));
    }

    @Cuando("^ingresa la informacion correspondiente al empleo$")
    public void ingresaLaInformacionCorrespondienteAlEmpleo(List<InformacionBusqueda> informacionBusqueda) throws Exception {
        theActorInTheSpotlight().attemptsTo(BuscarConvocatoria.enChoucair(informacionBusqueda));
    }

    @Entonces("^el podra ver la primera convocatoria disponible$")
    public void elPodraLaPrimeraConvocatoriaDisponible() throws Exception {
        theActorInTheSpotlight().should(seeThat(ValidacionDeConvocatoria.enPantalla()));
    }

    @Entonces("^el no podra ver informacion referente a la convocatoria$")
    public void elNoPodraVerInformacionReferenteALaConvocatoria() throws Exception {
        theActorInTheSpotlight().should(seeThat(BusquedaNoEncontrada.enPantalla()));
    }
}
