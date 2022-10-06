package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizadoraDatospersonales {

    public static final Target NOMBRE = Target.the("Ingresar Nombre").located(By.id("firstName"));
    public static final Target APELLIDO = Target.the("Ingresar Apellido").located(By.id("lastName"));
    public static final Target CORREO = Target.the("INgresar correo ").located(By.id("email"));
    public static final Target MES = Target.the("Selecionar el Mes").located(By.id("birthMonth"));
    public static final Target DIA = Target.the("Seleccionar el dia").located(By.id("birthDay"));
    public static final Target ANNO = Target.the("Seleccionar el año").located(By.id("birthYear"));
    public static final Target LENGUAJE = Target.the("Ingresar Lenguaje").located(By.xpath("//input[@type='search']"));
    public static final Target PROXIMO =Target.the("Proximo paso").located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a"));

}
