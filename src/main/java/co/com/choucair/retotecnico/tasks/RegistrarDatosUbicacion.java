package co.com.choucair.retotecnico.tasks;
import co.com.choucair.retotecnico.model.TDatos;
import co.com.choucair.retotecnico.userinterface.LocalizadoraUbicacion;
import co.com.choucair.retotecnico.util.Metodos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class RegistrarDatosUbicacion implements Task {
    private TDatos tdatos;
    Metodos metodos;

    public RegistrarDatosUbicacion(TDatos tdatos) {
        this.tdatos = tdatos;
    }

    public static RegistrarDatosUbicacion datosUbicacion(TDatos tdatos) {
        return Tasks.instrumented(RegistrarDatosUbicacion.class,tdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(Hit.the(Keys.CLEAR).into(LocalizadoraUbicacion.CUIDAD),
                    Enter.theValue(tdatos.getCuidad()).into(LocalizadoraUbicacion.CUIDAD),
                    Hit.the(Keys.ARROW_DOWN).into(LocalizadoraUbicacion.CUIDAD),
                    Hit.the(Keys.ENTER).into(LocalizadoraUbicacion.CUIDAD),
                    Click.on(LocalizadoraUbicacion.POSTAL),
                    Enter.theValue(tdatos.getCodigo_postal()).into(LocalizadoraUbicacion.POSTAL),
                    Hit.the(Keys.ENTER).into(LocalizadoraUbicacion.POSTAL),
                    Click.on(LocalizadoraUbicacion.CAMPO_PAIS),
                    Enter.theValue(tdatos.getPais()).into(LocalizadoraUbicacion.PAIS),
                    Hit.the(Keys.ENTER).into(LocalizadoraUbicacion.PAIS),
                    Click.on(LocalizadoraUbicacion.PROXIMO)

            );

    }
}
