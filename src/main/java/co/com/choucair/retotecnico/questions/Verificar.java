package co.com.choucair.retotecnico.questions;

import co.com.choucair.retotecnico.model.TDatos;
import co.com.choucair.retotecnico.userinterface.LocalizadoraValidar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question<Boolean>  {
 private TDatos tdatos;

    public Verificar(TDatos tdatos) {
        this.tdatos = tdatos;
    }
    public static Verificar registro(TDatos tdatos) {
        return new Verificar(tdatos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String comprobar= Text.of(LocalizadoraValidar.REGISTRO).viewedBy(actor).asString();
        String dato=tdatos.getMensaje();
        if(dato.equals(comprobar)){
            resultado=true;

        }else{
            resultado=false;
        }

        return resultado;
    }
}
