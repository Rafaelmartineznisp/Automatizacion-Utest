package co.com.choucair.retotecnico.stepdefinitions;
import co.com.choucair.retotecnico.model.TDatos;
import co.com.choucair.retotecnico.questions.Verificar;
import co.com.choucair.retotecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepDefinicionsRegistro {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario ingresa a la pagina web utest$")
    public void queElUsuarioIngresaALaPaginaWebUtest() {
        OnStage.theActorCalled("Juan").wasAbleTo(AbrirPaginaUtest.pagina());
    }


    @Cuando("^diligencia los datos principales del paso uno$")
    public void diligenciaLosDatosPrincipalesDelPasoUno(List<TDatos> tdatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarDatosPersonales.datosPersonales(tdatos.get(0)));


    }

    @Y("^diligencia los datos de ubicacion en el paso dos$")
    public void diligenciaLosDatosDeUbicacionEnElPasoDos(List<TDatos> tdatos) {

        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarDatosUbicacion.datosUbicacion(tdatos.get(0)));
    }

    @Y("^diligencia los datos de dispositivos en el paso tres$")
    public void diligenciaLosDatosDeDispositivosEnElPasoTres(List<TDatos> tdatos) {

        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarDatosDispositivos.datosDispoditivo(tdatos.get(0)));
    }

    @Y("^asigna los datos de contrasenna, aceptando terminos y politicas en el paso cuatro$")
    public void asignaLosDatosDeContrasennaAceptandoTerminosYPoliticasEnElPasoCuatro(List<TDatos> tdatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarContrasenna.autenticar(tdatos.get(0)));
    }

    @Entonces("^verifica que el registro fue satisfactorio$")
    public void verificaQueElRegistroFueSatisfactorio(List<TDatos> tdatos)  {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.registro(tdatos.get(0))));
    }
}
