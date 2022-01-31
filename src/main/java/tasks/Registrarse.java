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

    public static Registrarse usuario() {
        return Tasks.instrumented(Registrarse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(UtestHomePage.BOTON_JOIN_TODAY));
    actor.attemptsTo(Enter.theValue("Miguel Mariano").into(UtestHomePage.NOMBRES));
    actor.attemptsTo(Enter.theValue("Rubide Mosquera").into(UtestHomePage.APELLIDOS));
    actor.attemptsTo(Enter.theValue("mimarumo25@gmail.com").into(UtestHomePage.CORREO));
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("January").from(UtestHomePage.FECHA_NACIMIENTO_MES)
        );
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("30").from(UtestHomePage.FECHA_NACIMIENTO_DIA)
        );
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("1986").from(UtestHomePage.FECHA_NACIMIENTO_ANO)
        );
        actor.attemptsTo(Click.on(UtestHomePage.BOTON_NEXT_LOCATION));
        actor.attemptsTo(Enter.theValue("med").into(UtestHomePage.CIUDAD));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(UtestHomePage.CIUDAD),
              Hit.the(Keys.ENTER).into(UtestHomePage.CIUDAD));

        actor.attemptsTo(Enter.theValue("270001").into(UtestHomePage.CODIGO_POSTAL));
       /* actor.attemptsTo(Hit.the(Keys.ENTER).into(UtestHomePage.PAIS),
                Enter.theValue("Colombia").into(UtestHomePage.PAIS),
                Hit.the(Keys.ENTER).into(UtestHomePage.PAIS));*/

        actor.attemptsTo(Click.on(UtestHomePage.BOTON_NEXT_DEVICES));

        actor.attemptsTo(Click.on(UtestHomePage.BOTON_NEXT_LAST_STEP));
        actor.attemptsTo(Enter.theValue("MACACOm123").into(UtestHomePage.PASSWORD));
        actor.attemptsTo(Enter.theValue("MACACOm123").into(UtestHomePage.CONFIRMPASSWORD));
        actor.attemptsTo(Click.on(UtestHomePage.CONFIRMAR_TERMINOS));
        actor.attemptsTo(Click.on(UtestHomePage.CONFIRMAR_PRIVACIDAD));
        actor.attemptsTo(Click.on(UtestHomePage.BOTON_COMPLETE_SETUP));
    }
}
