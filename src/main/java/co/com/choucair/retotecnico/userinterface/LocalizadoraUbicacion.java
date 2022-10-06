package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class LocalizadoraUbicacion extends PageObject {
    public static final Target CUIDAD = Target.the("Ingrear cuidad").located(By.id("city"));
    public static final Target POSTAL = Target.the("Selecionar codigo postal").located(By.id("zip"));
    public static final Target PAIS = Target.the("Selecionar Pais").located(By.xpath("//input[@type='search' and @placeholder='Select a country']"));
    public static final Target PROXIMO =Target.the("Proximo paso").located(By.xpath("//div[@class='pull-right next-step']//a"));
    public static final Target CAMPO_PAIS = Target.the("CAMPO").located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div.form-group-box > div.row > div.col-xs-12.col-sm-12.col-md-6.col-lg-6.location > div:nth-child(4) > div.ui-select > div > div > div.ui-select-match > span"));
}
