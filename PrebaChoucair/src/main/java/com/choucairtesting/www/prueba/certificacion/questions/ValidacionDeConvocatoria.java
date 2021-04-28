package com.choucairtesting.www.prueba.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.choucairtesting.www.prueba.certificacion.userinterfaces.BusquedaTrabajoUI.PRIMERA_CONVOCATORIA;

public class ValidacionDeConvocatoria implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return PRIMERA_CONVOCATORIA.resolveFor(actor).isPresent();
    }

    public static ValidacionDeConvocatoria enPantalla(){
        return new ValidacionDeConvocatoria();
    }
}
