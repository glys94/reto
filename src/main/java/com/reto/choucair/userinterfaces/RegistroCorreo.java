package com.reto.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroCorreo {
    public static final Target REGISTRO_CORREO = Target.the("campo registar correo").located(By.id("email_create"));
    public static final Target BTN_REGISTRAR = Target.the("boton para registrar el correo").located(By.id("SubmitCreate"));

}
