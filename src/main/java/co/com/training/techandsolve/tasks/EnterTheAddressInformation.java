package co.com.training.techandsolve.tasks;

import co.com.training.techandsolve.models.NewAddress;
import co.com.training.techandsolve.userinterfaces.RegisterPageYourLogo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.training.techandsolve.userinterfaces.RegisterPageYourLogo.REGISTER_BUTTON;

public class EnterTheAddressInformation implements Task {


    private String address;
    private String city;
    private String postalCode;
    private String mobilePhone;

    public EnterTheAddressInformation(
            String address, String city, String postalCode,
            String mobilePhone) {

        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.mobilePhone = mobilePhone;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(address).into(RegisterPageYourLogo.ADDRESS),
                Enter.theValue(city).into(RegisterPageYourLogo.CITY),
                SelectFromOptions.byVisibleText("California").from(RegisterPageYourLogo.USER_STATE),
                Enter.theValue(postalCode).into(RegisterPageYourLogo.POSTAL_CODE),
                SelectFromOptions.byVisibleText("United States").from(RegisterPageYourLogo.COUNTRY),
                Enter.theValue(mobilePhone).into(RegisterPageYourLogo.MOBILE_PHONE),
                Click.on(REGISTER_BUTTON));

    }

    public static EnterTheAddressInformation toYourLogoPage(NewAddress user) {
        return new EnterTheAddressInformation(user.getAddress(), user.getCity(),
                user.getPostalCode(), user.getMobilePhone());
    }

}