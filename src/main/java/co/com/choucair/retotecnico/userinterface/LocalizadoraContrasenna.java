package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizadoraContrasenna {
    public static final Target CONTRASENNA =Target.the("Digitar contraseña").located(By.id("password"));
    public static final Target CONFIRMMAR_CONTRASENNA =Target.the("Confirmar contraseña").located(By.id("confirmPassword"));
    public static final Target TERMINOS = Target.the("aceptar terminos").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target POLITICA = Target.the("Aceptar Politicas").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETAR =Target.the("Completar formulario").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div/div"));
}
