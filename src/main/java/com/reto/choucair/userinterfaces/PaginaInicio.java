package com.reto.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicio {
    public static final Target SIGIN_IN = Target.the("boton formulario de registro").located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

}
