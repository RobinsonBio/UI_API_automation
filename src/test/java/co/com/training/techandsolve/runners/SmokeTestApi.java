package co.com.training.techandsolve.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/testing_an_api.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.training.techandsolve.definitions"

)
public class SmokeTestApi {
}
