package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import ui.UtestHomePage;

public class AbrirUtest implements Task {

    private UtestHomePage utestHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestHomePage));
    }

    public static AbrirUtest LaPaginaDeUtest() {
        return Tasks.instrumented(AbrirUtest.class);
    }


}
