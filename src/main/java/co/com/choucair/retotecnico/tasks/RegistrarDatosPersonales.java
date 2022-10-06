package co.com.choucair.retotecnico.tasks;
import co.com.choucair.retotecnico.model.TDatos;
import static  co.com.choucair.retotecnico.userinterface.LocalizadoraDatospersonales.*;
import co.com.choucair.retotecnico.util.Metodos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegistrarDatosPersonales implements Task {
    private TDatos tdatos;
    private Metodos metodos;

    public RegistrarDatosPersonales(TDatos tdatos) {
        this.tdatos = tdatos;
    }


    public static RegistrarDatosPersonales datosPersonales(TDatos tdatos) {
        return Tasks.instrumented(RegistrarDatosPersonales.class,tdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tdatos.getNombre()).into(NOMBRE),
                Enter.theValue(tdatos.getApellido())
                        .into(APELLIDO),
                Enter.theValue(metodos.email(tdatos.getNombre(),tdatos.getApellido(),tdatos.getCorreo()))
                        .into(CORREO),
                SelectFromOptions.byVisibleText(tdatos.getMes()).from(MES),
                SelectFromOptions.byVisibleText(tdatos.getDia()).from(DIA),
                SelectFromOptions.byVisibleText(tdatos.getAnno()).from(ANNO),
                Enter.theValue(tdatos.getIdioma()).into(LENGUAJE),
                Click.on(PROXIMO)
        );


    }
}
