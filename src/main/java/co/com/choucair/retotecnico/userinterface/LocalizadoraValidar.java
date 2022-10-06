package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizadoraValidar {
    public static final Target REGISTRO = Target.the("Texto de confirmacion").located(By.xpath("//div[@class='image-box-header']//h1"));

    public static final Target REGISTROFALLIDO = Target.the("Texto de caontrasenna insegura").located(By.xpath("//li[contains(text(),'Use 10 to 64 characters.')]"));
}
