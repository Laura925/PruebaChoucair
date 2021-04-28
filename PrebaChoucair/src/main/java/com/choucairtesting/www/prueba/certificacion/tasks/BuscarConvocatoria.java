package com.choucairtesting.www.prueba.certificacion.tasks;

import com.choucairtesting.www.prueba.certificacion.models.InformacionBusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.choucairtesting.www.prueba.certificacion.userinterfaces.BusquedaTrabajoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarConvocatoria implements Task {

    List<InformacionBusqueda> informacionBusqueda;

    public BuscarConvocatoria(List<InformacionBusqueda> informacionBusqueda) {
        this.informacionBusqueda = informacionBusqueda;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(informacionBusqueda.get(0).getKeyword()).into(CAMPO_KEYWORDS),
                Enter.theValue(informacionBusqueda.get(0).getLocation()).into(CAMPO_LOCATION),
                Click.on(BTN_SEARCH_JOBS));
    }

    public static BuscarConvocatoria enChoucair(List<InformacionBusqueda> informacionBusqueda){
        return instrumented(BuscarConvocatoria.class, informacionBusqueda);
    }
}
