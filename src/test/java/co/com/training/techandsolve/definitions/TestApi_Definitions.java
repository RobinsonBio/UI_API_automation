package co.com.training.techandsolve.definitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static co.com.training.techandsolve.utils.ApiConstants.URL_RICKANDMORTYAPI;
import static org.hamcrest.CoreMatchers.notNullValue;


public class TestApi_Definitions {


    @Before
    public void setUpApi() {
       SerenityRest.clear();
    }

    private Response response;

    @Given("^There are (.*) to try the API$")
    public void thereAreCharacterToTryTheAPI(String resource) {
        response = SerenityRest.when().get(URL_RICKANDMORTYAPI + resource);
        System.out.println(URL_RICKANDMORTYAPI + resource);
    }

    @When("^I execute the endpoint code API$")
    public void iExecuteTheEndpointCodeAPI() {
        response.statusCode();
        response.then().log().all().and().header("Server", response -> notNullValue());
    }

    @Then("^I should have the  (.*) code response from the API$")
    public void iShouldHaveTheCodeResponseFromTheAPI(int code_response) {
        response.then().assertThat().statusCode(code_response);
    }

    @Then("^I should see the (.*)$")
    public void iShouldSeeTheApplicationJsonCharsetUtf(String content_type) {
        response.then().assertThat().contentType(content_type);
    }

    @Then("^I will see the (.*) response from the API$")
    public void iShouldSeeTheResponseFromTheAPI(String response_api) {
        String final_response = response_api.replaceAll(" ","");
        response.then().assertThat().content("info.next", Matchers.is(Matchers.equalTo(final_response)));
    }

}
