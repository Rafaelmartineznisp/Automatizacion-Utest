package co.com.choucair.retotecnico.tasks;
import co.com.choucair.retotecnico.model.TDatos;
import static co.com.choucair.retotecnico.userinterface.LocalizadoraContrasenna.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrarContrasenna implements Task{
    private TDatos tdatos;

    public RegistrarContrasenna(TDatos tdatos) {
        this.tdatos = tdatos;
    }

    public static RegistrarContrasenna autenticar(TDatos tdatos) {
        return Tasks.instrumented(RegistrarContrasenna.class,tdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(tdatos.getContrasenna()).into(CONTRASENNA),
                Enter.theValue(tdatos.getConfirmar()).into(CONFIRMMAR_CONTRASENNA),
                Click.on(TERMINOS),
                Click.on(POLITICA),
                Click.on(COMPLETAR)


        );

    }
}
