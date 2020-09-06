package co.com.training.techandsolve.tasks;

import co.com.training.techandsolve.models.User;
import co.com.training.techandsolve.userinterfaces.PrincipalPageYourLogo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.matchers.statematchers.IsVisibleMatcher;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matchers;

import static co.com.training.techandsolve.userinterfaces.PrincipalPageYourLogo.SIGN_IN_BUTTON;

public class LogIn implements Task {

    private String password_login;
    private String email_login;

    public LogIn(String password_login, String email_login) {
        this.password_login = password_login;
        this.email_login = email_login;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SIGN_IN_BUTTON, WebElementStateMatchers.isVisible()),
                Click.on(SIGN_IN_BUTTON),
                Enter.theValue(email_login).into(PrincipalPageYourLogo.LOG_IN_EMAIL),
                Enter.theValue(password_login).into(PrincipalPageYourLogo.LOG_IN_PASSWORD),
                Click.on(PrincipalPageYourLogo.LOG_IN_BUTTON));

    }


    public static LogIn toYourLogoPage(User user) {
        return new LogIn(user.getPassword_login(), user.getEmail_login());
    }
}
