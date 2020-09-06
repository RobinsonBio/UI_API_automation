package co.com.training.techandsolve.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrincipalPageYourLogo {

    public final static Target SIGN_IN_BUTTON = Target.the("Button of sign in to your logo page").locatedBy("//a[@class='login']");
    public final static Target EMAIL_INPUT = Target.the("Enter the email to register to your logo page").located(By.id("email_create"));
    public final static Target CREATE_ACCOUNT_BUTTON = Target.the("Button of create an account to your logo page").located(By.id("SubmitCreate"));
    public final static Target LOG_IN_EMAIL = Target.the("Enter the email to log in to you logo page").located(By.id("email"));
    public final static Target LOG_IN_PASSWORD = Target.the("Enter the password to log in to you logo page").located(By.id("passwd"));
    public final static Target LOG_IN_BUTTON = Target.the("Button of log into you logo page").located(By.id("SubmitLogin"));


}
