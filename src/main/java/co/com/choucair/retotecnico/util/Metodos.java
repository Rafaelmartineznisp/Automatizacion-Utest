package co.com.choucair.retotecnico.util;
import net.thucydides.core.pages.PageObject;
public class Metodos extends PageObject {

    public String email(String nombre, String apellido, String dominio){
      int aleatorio = (int) (Math.random()*1000);
      String emailCompleto = nombre + apellido + aleatorio + dominio;
      return emailCompleto;
    }





}
