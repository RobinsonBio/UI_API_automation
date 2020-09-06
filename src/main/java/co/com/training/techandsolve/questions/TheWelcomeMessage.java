package co.com.training.techandsolve.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.training.techandsolve.userinterfaces.RegisterPageYourLogo.MESSAGE_WELCOME;

public class TheWelcomeMessage implements Question  {
    @Override
    public Object answeredBy(Actor actor) {

       return MESSAGE_WELCOME.resolveFor(actor).getText().trim();

    }

    public static TheWelcomeMessage foundByActor(){
        return  new TheWelcomeMessage();
    }
}
