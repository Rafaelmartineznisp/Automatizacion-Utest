package co.com.choucair.retotecnico.tasks;
import co.com.choucair.retotecnico.model.TDatos;
import static  co.com.choucair.retotecnico.userinterface.LocalizadoraDispositivo.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class RegistrarDatosDispositivos implements Task {
    private TDatos tdatos;
    public RegistrarDatosDispositivos(TDatos tdatos) {
        this.tdatos = tdatos;
    }

    public static RegistrarDatosDispositivos datosDispoditivo(TDatos tdatos) {
        return Tasks.instrumented(RegistrarDatosDispositivos.class,tdatos);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTENEDOR_SISTEMA_OPERATIVO_COMPUTADOR),
                Enter.theValue(tdatos.getComputador()).into(SISTEMA_OPERATIVO_COMPUTADOR)
                        .thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_VERSION_COMPUTADOR),
                Enter.theValue(tdatos.getVersion()).into(VERSION_COMPUTADOR)
                        .thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_LENGUAJE_COMPUTADOR),
                Enter.theValue(tdatos.getLengua()).into(LENGUAJE_COMPUTADOR)
                        .thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_EQUIPO_MOVIL),
                Enter.theValue(tdatos.getCelular()).into(EQUIPO_MOVIL)
                        .thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_MODELO),
                Enter.theValue(tdatos.getModelo()).into(MODELO)
                        .thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTENEDOR_OS_MOVIL),
                Enter.theValue(tdatos.getSistema()).into(OS_MOVIL)
                        .thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(PROXIMO)


        );
    }
}
