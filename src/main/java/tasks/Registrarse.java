package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import ui.UtestHomePage;


public class Registrarse implements Task {
    private String nombres;
    private String apellidos;
    private String email;
    private String fmes;
    private String fdia;
    private String fano;
    private String ciudad;
    private String codpostal;
    private String contrasena;
    private String confirmarcontrasena;

    public Registrarse(String nombres, String apellidos, String email, String fmes, String fdia, String fano, String ciudad, String codpostal, String contrasena, String confirmarcontrasena) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.fmes = fmes;
        this.fdia = fdia;
        this.fano = fano;
        this.ciudad = ciudad;
        this.codpostal = codpostal;
        this.contrasena = contrasena;
        this.confirmarcontrasena = confirmarcontrasena;
    }

    public static Registrarse usuario(String nombres, String apellidos, String email, String fmes, String fdia, String fano, String ciudad, String codpostal, String contrasena, String confirmarcontrasena) {
        return Tasks.instrumented(Registrarse.class,nombres,apellidos,email,fmes,fdia,fano,ciudad,codpostal,contrasena,confirmarcontrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(UtestHomePage.BOTON_JOIN_TODAY));
    actor.attemptsTo(Enter.theValue(nombres).into(UtestHomePage.NOMBRES));
    actor.attemptsTo(Enter.theValue(apellidos).into(UtestHomePage.APELLIDOS));
    actor.attemptsTo(Enter.theValue(email).into(UtestHomePage.CORREO));
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(fmes).from(UtestHomePage.FECHA_NACIMIENTO_MES)
        );
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(fdia).from(UtestHomePage.FECHA_NACIMIENTO_DIA)
        );
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(fano).from(UtestHomePage.FECHA_NACIMIENTO_ANO)
        );
        actor.attemptsTo(Click.on(UtestHomePage.BOTON_NEXT_LOCATION));
        actor.attemptsTo(Enter.theValue(ciudad).into(UtestHomePage.CIUDAD));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(UtestHomePage.CIUDAD),
              Hit.the(Keys.ENTER).into(UtestHomePage.CIUDAD));

        actor.attemptsTo(Enter.theValue(codpostal).into(UtestHomePage.CODIGO_POSTAL));

        actor.attemptsTo(Click.on(UtestHomePage.BOTON_NEXT_DEVICES));

        actor.attemptsTo(Click.on(UtestHomePage.BOTON_NEXT_LAST_STEP));
        actor.attemptsTo(Enter.theValue(contrasena).into(UtestHomePage.PASSWORD));
        actor.attemptsTo(Enter.theValue(confirmarcontrasena).into(UtestHomePage.CONFIRMPASSWORD));
        actor.attemptsTo(Click.on(UtestHomePage.CONFIRMAR_TERMINOS));
        actor.attemptsTo(Click.on(UtestHomePage.CONFIRMAR_PRIVACIDAD));
        actor.attemptsTo(Click.on(UtestHomePage.BOTON_COMPLETE_SETUP));

    }
}
