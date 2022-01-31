package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AbrirUtest;
import tasks.Registrarse;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepdefinitions {

    /*@Managed(driver="Chrome")
    private WebDriver hisBrowser;*/
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        //theActorCalled("Usuario").whoCan(CallAnApi.at(BASE_URL.toString()));
    }



    @Dado("^que miguel quiere registrarse con un nuevo usuario en Utest\\.com$")
    public void queMiguelQuiereRegistrarseConUnNuevoUsuarioEnUtestCom() {
        theActorCalled("Usuario").wasAbleTo(AbrirUtest.LaPaginaDeUtest());

    }


    @Cuando("^el debe dar click en el boton Join y luego ingresa la informacion solicitada \\(datos personales\\) en el formulario y dar click en el boton$")
    public void elDebeDarClickEnElBotonJoinYLuegoIngresaLaInformacionSolicitadaDatosPersonalesEnElFormularioYDarClickEnElBoton() {
        theActorInTheSpotlight().attemptsTo(Registrarse.usuario());
    }

    @Entonces("^el deberia de recibir un mensaje de usuario registrado y tener acceso a la cuenta y las funcionalidades de la app$")
    public void elDeberiaDeRecibirUnMensajeDeUsuarioRegistradoYTenerAccesoALaCuentaYLasFuncionalidadesDeLaApp() {

    }

}
