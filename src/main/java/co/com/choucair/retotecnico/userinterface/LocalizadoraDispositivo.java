package co.com.choucair.retotecnico.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizadoraDispositivo {
    public static final Target DISPODITIVOS = Target.the("Proximo paso")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
    public static final Target CONTENEDOR_SISTEMA_OPERATIVO_COMPUTADOR = Target.the("Selecionar contenedor Sistema operativo")
            .located(By.xpath("//div[@class='ui-select-match']//span[@aria-label='Select OS']"));
    public static final Target SISTEMA_OPERATIVO_COMPUTADOR = Target.the("Seleccionar Sistema operativo")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_VERSION_COMPUTADOR = Target.the("Seleccionar contenedor de version")
            .located(By.xpath("//div[@class=\"ui-select-match\"]//span[@aria-label=\"Select a Version\"]"));
    public static final Target VERSION_COMPUTADOR = Target.the("Seleccionar version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_LENGUAJE_COMPUTADOR = Target.the("Seleccionar contenedor lenguaje de sistema operativo")
            .located(By.xpath("//div[@placeholder=\"Select OS language\"]//span[@aria-label=\"Select OS language\"]"));
    public static final Target LENGUAJE_COMPUTADOR = Target.the("Seleccionar lenguaje de Sistema operativo")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_EQUIPO_MOVIL = Target.the("Seleccionar contenedor equipo movil")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target EQUIPO_MOVIL  = Target.the("Seleccionar equipo movil")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_MODELO= Target.the("Seleccionar contenedor modelo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target MODELO  = Target.the("Seleccionar modelo")
            .located(By.xpath("//input[@type=\"search\" and @placeholder=\"Select a Model\"]"));
    public static final Target CONTENEDOR_OS_MOVIL = Target.the("Seleccionar contenedor de sistema operativo movil")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target OS_MOVIL = Target.the("Seleccionar Sistema operativo movil")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target PROXIMO = Target.the("sIGIENTE PASO")
            .located(By.xpath(" //div[@class=\"pull-right next-step\"]//a"));


}
