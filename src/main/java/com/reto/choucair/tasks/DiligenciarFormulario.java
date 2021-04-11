package com.reto.choucair.tasks;

import com.reto.choucair.models.InformacionDeRegistro;
import com.reto.choucair.userinterfaces.CreacionDeCuenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class DiligenciarFormulario implements Task {
private InformacionDeRegistro inforegistro;

    public DiligenciarFormulario(InformacionDeRegistro inforegistro) {
        this.inforegistro = inforegistro;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(inforegistro.getNombre()).into(CreacionDeCuenta.NOMBRE),
                Enter.theValue(inforegistro.getApellido()).into(CreacionDeCuenta.APELLIDO),
                Enter.theValue(inforegistro.getContrasena()).into(CreacionDeCuenta.CONTRASENA),
                SelectFromOptions.byIndex(Integer.parseInt(inforegistro.getDia())).from(CreacionDeCuenta.DIA),
                SelectFromOptions.byValue(inforegistro.getMes()).from(CreacionDeCuenta.MES),
                SelectFromOptions.byValue(inforegistro.getAno()).from(CreacionDeCuenta.ANO),
                Click.on(CreacionDeCuenta.RESERVA),
                Enter.theValue(inforegistro.getNombre()).into(CreacionDeCuenta.NOMBRE2),
                Enter.theValue(inforegistro.getApellido()).into(CreacionDeCuenta.APELLIDO2),
                Enter.theValue(inforegistro.getCompania()).into(CreacionDeCuenta.COMPANIA),
                Enter.theValue(inforegistro.getDireccion()).into(CreacionDeCuenta.DIRECCION),
                Enter.theValue(inforegistro.getCiudad()).into(CreacionDeCuenta.CIUDAD),
                SelectFromOptions.byIndex(Integer.parseInt(inforegistro.getEstado())).from(CreacionDeCuenta.ESTADO),
                Enter.theValue(inforegistro.getCodigoPostal()).into(CreacionDeCuenta.CODIGO_POSTAL),
                SelectFromOptions.byVisibleText(inforegistro.getPis()).from(CreacionDeCuenta.PAIS),
                Enter.theValue(inforegistro.getAdicional()).into(CreacionDeCuenta.DESCRIPCION),
                Enter.theValue(inforegistro.getTefono()).into(CreacionDeCuenta.TELEFONO),
                Enter.theValue(inforegistro.getMovil()).into(CreacionDeCuenta.TELEFONO_MOVIL),
                Enter.theValue(inforegistro.getCorreoReferencia()).into(CreacionDeCuenta.ALIAS),
                Click.on(CreacionDeCuenta.BTN_GUARDAR)
        );
    }
    public static DiligenciarFormulario conTodosLosDatosDelUsuario(InformacionDeRegistro info){
        return Tasks.instrumented(DiligenciarFormulario.class, info);

    }
}
