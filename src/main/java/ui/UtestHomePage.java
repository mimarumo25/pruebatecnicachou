package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;



@DefaultUrl("https://utest.com/")
public class UtestHomePage extends PageObject {
    public static final Target BOTON_JOIN_TODAY = Target.the("El boton que lleva al formulario de registro")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target BOTON_NEXT_LOCATION= Target.the("Boton que lleva al el formulario para cargar la localizacion")
            .located(By.className("btn-blue"));

    public static final Target BOTON_NEXT_DEVICES = Target.the("Boton que lleva al el formulario para cargar el Dispositivo")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target BOTON_NEXT_LAST_STEP = Target.the("Boton que lleva al el formulario para cargar las credenciales del usuario")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target BOTON_COMPLETE_SETUP= Target.the("Boton que completa el registro del nuevo usuario")
            .located(By.id("laddaBtn"));


    //campos de textos
    public static final Target NOMBRES= Target.the("Campo de texto para los nombres")
            .located(By.id("firstName"));
    public static final Target APELLIDOS= Target.the("Campo de texto para los apellidos")
            .located(By.id("lastName"));
    public static final Target CORREO= Target.the("Campo de texto para el correo")
            .located(By.id("email"));

    public static final Target FECHA_NACIMIENTO_MES= Target.the("Campo de texto para la fecha de nacimiento Mes")
            .located(By.id("birthMonth"));
    public static final Target FECHA_NACIMIENTO_DIA= Target.the("Campo de texto para la fecha de nacimiento dia")
            .located(By.id("birthDay"));
    public static final Target FECHA_NACIMIENTO_ANO= Target.the("Campo de texto para la fecha de nacimiento año")
            .located(By.id("birthYear"));
    public static final Target IDIOMAS_HABLADOS= Target.the("Campo de texto para la fecha el idiomas hablados")
            .located(By.id("languages"));

    //campos

    public static final Target CIUDAD = Target.the("Campo de texto para la Ciudad")
            .located(By.id("city"));
    public static final Target CODIGO_POSTAL = Target.the("Campo de texto para el codigo postal")
            .located(By.id("zip"));
    public static final Target PAIS = Target.the("Campo de texto para el pais")
            .located(By.className("ui-select-toggle"));


    public static final Target PASSWORD = Target.the("Campo de texto para la contraseña")
            .located(By.id("password"));
    public static final Target CONFIRMPASSWORD = Target.the("Campo de texto para confirmar de la contraseña")
            .located(By.id("confirmPassword"));
    public static final Target CONFIRMAR_TERMINOS = Target.the("Check para confirmar los terminos")
            .located(By.id("termOfUse"));
    public static final Target CONFIRMAR_PRIVACIDAD = Target.the("Check para confirmar la privacidad")
            .located(By.id("privacySetting"));


}


