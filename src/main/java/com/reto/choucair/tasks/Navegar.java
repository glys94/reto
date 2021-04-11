package com.reto.choucair.tasks;

import com.reto.choucair.userinterfaces.PaginaInicio;
import com.reto.choucair.userinterfaces.RegistroCorreo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Navegar implements Task {
    private String correo;

    public Navegar(String correo) {
        this.correo = correo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(PaginaInicio.SIGIN_IN),
                Enter.theValue(correo).into(RegistroCorreo.REGISTRO_CORREO),
                Click.on(RegistroCorreo.BTN_REGISTRAR)

        );
    }

    public static Navegar alFormularioDeRegostro(String correo) {
        return Tasks.instrumented(Navegar.class, correo);
    }
}
