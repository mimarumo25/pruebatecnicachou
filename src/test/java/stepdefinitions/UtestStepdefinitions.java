package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.UtestData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AbrirUtest;
import tasks.Registrarse;

import java.util.List;

public class UtestStepdefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que miguel quiere registrarse con un nuevo usuario en Utest\\.com$")
    public void queMiguelQuiereRegistrarseConUnNuevoUsuarioEnUtestCom() {
       OnStage.theActorCalled("miguel").wasAbleTo(AbrirUtest.LaPaginaDeUtest());

    }

    @Cuando("^el debe dar click en el boton Join y luego ingresa la informacion solicitada \\(datos personales\\) en el formulario y dar click en el boton$")
    public void elDebeDarClickEnElBotonJoinYLuegoIngresaLaInformacionSolicitadaDatosPersonalesEnElFormularioYDarClickEnElBoton(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Registrarse.usuario(
                utestData.get(0).getNombres(),
                utestData.get(0).getApellidos(),
                utestData.get(0).getEmail(),
                utestData.get(0).getFmes(),
                utestData.get(0).getFdia(),
                utestData.get(0).getFano(),
                utestData.get(0).getCiudad(),
                utestData.get(0).getCodpostal(),
                utestData.get(0).getContrasena(),
                utestData.get(0).getConfirmarcontrasena()
                ));
    }

    @Entonces("^el deberia de recibir un mensaje de usuario registrado y tener acceso a la cuenta y las funcionalidades de la app$")
    public void elDeberiaDeRecibirUnMensajeDeUsuarioRegistradoYTenerAccesoALaCuentaYLasFuncionalidadesDeLaApp() {

    }

}
