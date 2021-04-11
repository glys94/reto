package com.reto.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarUsuario implements Question<String> {
    private Target validarUser;

    public ValidarUsuario(Target validarUser) {
        this.validarUser = validarUser;
    }

    @Override
    public String answeredBy(Actor actor) {
        return validarUser.resolveFor(actor).getText();
    }
    public static ValidarUsuario cuandoSeEncuentraLogueado(Target validarUser){
        return new ValidarUsuario(validarUser);
    }

}
