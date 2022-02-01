package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class Answer implements Question {

    public static Answer toThe() {
        return  new Answer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return null;
    }

    @Override
    public String getSubject() {
        return null;
    }

}
