package com.reto.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreacionDeCuenta {
    public static final Target NOMBRE = Target.the("CAMPO PARA  INGRESAR EL NOMBRE").located(By.id("customer_firstname"));
    public static final Target  APELLIDO= Target.the("CAMPO PARA  INGRESAR EL APELLIDO").located(By.id("customer_lastname"));
    public static final Target  CONTRASENA= Target.the("CAMPO PARA  INGRESAR EL APELLIDO").located(By.id("passwd"));
    public static final Target  DIA= Target.the("CAMPO PARA  INGRESAR EL DIA").located(By.id("days"));
    public static final Target  MES= Target.the("CAMPO PARA  INGRESAR EL MES").located(By.id("months"));
    public static final Target  ANO= Target.the("CAMPO PARA  INGRESAR EL AÑO").located(By.id("years"));
    public static final Target  RESERVA= Target.the("CAMPO PARA  INGRESAR SI DESO RECIBIR INFO").located(By.id("newsletter"));
    public static final Target  NOMBRE2= Target.the("CAMPO PARA  INGRESAR EL NOMBRE").located(By.id("firstname"));
    public static final Target  APELLIDO2= Target.the("CAMPO PARA  INGRESAR EL APELLIDO").located(By.id("lastname"));
    public static final Target  COMPANIA= Target.the("CAMPO PARA  INGRESAR LA COMPAÑIA").located(By.id("company"));
    public static final Target  DIRECCION= Target.the("CAMPO PARA  INGRESAR LA DIRECCIONA").located(By.id("address1"));
    public static final Target  CIUDAD= Target.the("CAMPO PARA  INGRESAR LA CIUDAD").located(By.id("city"));
    public static final Target  ESTADO= Target.the("CAMPO PARA  INGRESAR EL ESTADO").located(By.id("id_state"));
    public static final Target  CODIGO_POSTAL= Target.the("CAMPO PARA  INGRESAR EL CODIGO").located(By.id("postcode"));
    public static final Target  PAIS= Target.the("CAMPO PARA  INGRESAR EL PAIS").located(By.id("id_country"));
    public static final Target  DESCRIPCION= Target.the("CAMPO PARA  INGRESAR LA DESCRIPCION").located(By.id("other"));
    public static final Target  TELEFONO= Target.the("CAMPO PARA  INGRESAR EL TELEFONO").located(By.id("phone"));
    public static final Target  TELEFONO_MOVIL= Target.the("CAMPO PARA  INGRESAR EL TELEFONO MOVIL").located(By.id("phone_mobile"));
    public static final Target  ALIAS= Target.the("CAMPO PARA  INGRESAR ALIAS DE LA DIRECCION").located(By.id("alias"));
    public static final Target  BTN_GUARDAR= Target.the("BOTON  QUE  GUARDA  LA  INFO").located(By.id("submitAccount"));
    public static final Target  USUARIO= Target.the("MUERTA EL USUARIO").located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"));
}
