package com.reto.choucair.runnners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\crear_cuenta.feature",
        glue = "com.reto.choucair.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)
public class CrearCuenta {
}
