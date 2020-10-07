package co.com.training.techandsolve.tasks;

import co.com.training.techandsolve.models.NewUser;
import co.com.training.techandsolve.userinterfaces.RegisterPageYourLogo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.training.techandsolve.userinterfaces.PrincipalPageYourLogo.CREATE_ACCOUNT_BUTTON;
import static co.com.training.techandsolve.userinterfaces.PrincipalPageYourLogo.EMAIL_INPUT;
import static co.com.training.techandsolve.userinterfaces.RegisterPageYourLogo.*;

public class EnterTheUserInformation implements Task {

    private String name;
    private String lastname;
    private String password;
    private String email;


    public EnterTheUserInformation(String name, String lastname, String password, String email) {
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.email = email;

    }

    @Step("{0} enters de user information to get registered")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(email).into(EMAIL_INPUT),
                Click.on(CREATE_ACCOUNT_BUTTON),
                Enter.theValue(name).into(RegisterPageYourLogo.USER_FIRST_NAME),
                Enter.theValue(lastname).into(RegisterPageYourLogo.USER_LAST_NAME),
                Enter.theValue(password).into(RegisterPageYourLogo.PASSWORD),
                SelectFromOptions.byVisibleText("February ").from(MONTH_BIRTHDAY),
                SelectFromOptions.byVisibleText("3  ").from(DAY_BIRTHDAY),
                WaitUntil.the(YEAR_BIRTHDAY, WebElementStateMatchers.isEnabled()),
                SelectFromOptions.byVisibleText("1995  ").from(YEAR_BIRTHDAY));

    }

    public static EnterTheUserInformation toYourLogo(NewUser user) {
        return Tasks.instrumented(EnterTheUserInformation.class, user.getName(), user.getLastname(), user.getPassword(), user.getEmail());
    }
}
