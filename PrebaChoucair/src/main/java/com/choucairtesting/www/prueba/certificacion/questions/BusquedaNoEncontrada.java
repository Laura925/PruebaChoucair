package com.choucairtesting.www.prueba.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.choucairtesting.www.prueba.certificacion.userinterfaces.BusquedaTrabajoUI.BUSQUEDA_NO_ENCONTRADA;
import static com.choucairtesting.www.prueba.certificacion.userinterfaces.BusquedaTrabajoUI.PRIMERA_CONVOCATORIA;

public class BusquedaNoEncontrada implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return BUSQUEDA_NO_ENCONTRADA.resolveFor(actor).isPresent();
    }

    public static BusquedaNoEncontrada enPantalla(){
        return new BusquedaNoEncontrada();
    }
}
