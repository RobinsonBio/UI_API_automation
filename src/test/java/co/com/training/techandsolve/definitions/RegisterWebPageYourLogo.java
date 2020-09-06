package co.com.training.techandsolve.definitions;


import co.com.training.techandsolve.models.NewAddress;
import co.com.training.techandsolve.models.NewUser;
import co.com.training.techandsolve.models.User;
import co.com.training.techandsolve.questions.TheSumaryOf;
import co.com.training.techandsolve.questions.TheWelcomeMessage;
import co.com.training.techandsolve.tasks.ChooseTheClothes;
import co.com.training.techandsolve.tasks.EnterTheAddressInformation;
import co.com.training.techandsolve.tasks.EnterTheUserInformation;
import co.com.training.techandsolve.tasks.LogIn;
import co.com.training.techandsolve.userinterfaces.MenuClothesYourLogo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static co.com.training.techandsolve.userinterfaces.MenuClothesYourLogo.BACK_BUTTON_HOME;
import static co.com.training.techandsolve.userinterfaces.MenuClothesYourLogo.LISTS_OF_DRESSES;
import static co.com.training.techandsolve.userinterfaces.PrincipalPageYourLogo.SIGN_IN_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class RegisterWebPageYourLogo {

    @Before
    public void setUpOnStage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(browser)));
        OnStage.theActorCalled("Robinson");
    }

    @Managed
    private final WebDriver browser = null;

    @Given("^The user clicks the sign in options$")
    public void theUserClicksTheSigInOptions() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("http://automationpractice.com/"));
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Click.on(SIGN_IN_BUTTON));
    }

    @When("^he enters all the personal information to register$")
    public void heClicksInCreateAAcountButton(List<NewUser> lstUser) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EnterTheUserInformation.toYourLogo(lstUser.get(0)));
    }

    @When("^he enters the Address information in the register form$")
    public void heEntersTheEmailInTheSigInOption(List<NewAddress> lstAddress) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EnterTheAddressInformation.toYourLogoPage(lstAddress.get(0)));
    }


    @Then("^he will find the message (.*)$")
    public void heFindsIsThisLove(String message) {
        OnStage.theActorInTheSpotlight().
                should(seeThat(TheWelcomeMessage.foundByActor(), Matchers.is(Matchers.equalTo(message))));
    }


    @Given("^the user is in the principal menu of your logo page$")
    public void theUserIsInThePrincipalMenuOfYourLogoPage(List<User> lstUser) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                LogIn.toYourLogoPage(lstUser.get(0)),
                Click.on(BACK_BUTTON_HOME),
                Click.on(MenuClothesYourLogo.WOMEN_BUTTON),
                Click.on(LISTS_OF_DRESSES));
    }

    @When("^he chooses the dresses to buy$")
    public void heChoosesTheDressesToBuy() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChooseTheClothes.toBuyDresses());
    }

    @Then("^he will see the number of product he chose (.*)$")
    public void heWillSeeTheNumberOfProductHeChose(String strProducts) {

        Integer Value_remember = OnStage.theActorInTheSpotlight().recall("value");
        String sumary = String.valueOf(Value_remember);

        OnStage.theActorInTheSpotlight().
                should(seeThat(TheSumaryOf.dresses(), Matchers.is(Matchers.equalTo(sumary))));
    }

}
