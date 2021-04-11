package com.reto.choucair.stepdefinitions;


import com.reto.choucair.models.InformacionDeRegistro;
import com.reto.choucair.questions.ValidarUsuario;
import com.reto.choucair.tasks.DiligenciarFormulario;
import com.reto.choucair.tasks.Navegar;
import com.reto.choucair.userinterfaces.CreacionDeCuenta;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.pt.Dado;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CrearCuentaStepDefinitions {
    @Managed
    private WebDriver driver;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
    }
    @Dado("^que el usurio se encuentra en el formulario de registro con el correo (.*)$")
    public void queElUsurioNoSeEncuentraEnElFormularioDeRegistro(String correo) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url("http://automationpractice.com/index.php"),
                Navegar.alFormularioDeRegostro(correo)
        );
    }

    @Cuando("^el usurio completa los campos de registro$")
    public void elUsurioCompletaLosCamposDeRegistro(List <InformacionDeRegistro> registrodatos) {
       OnStage.theActorInTheSpotlight().attemptsTo(
               DiligenciarFormulario.conTodosLosDatosDelUsuario(registrodatos.get(0))
       );
    }
    @Entonces("^el visualiza el nombre del usurio (.*) en la pagina$")
    public void elVisualizaElNombreDelUsurioEnLaPagina(String usuarioLogueado) {
OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarUsuario.cuandoSeEncuentraLogueado(CreacionDeCuenta.USUARIO),Matchers.is(Matchers.equalTo(usuarioLogueado))));

    }
}
