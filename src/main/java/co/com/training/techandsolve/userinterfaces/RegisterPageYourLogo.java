package co.com.training.techandsolve.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPageYourLogo {

    private RegisterPageYourLogo () {}

    public final static Target USER_FIRST_NAME = Target.the("Field to enter the user first name").located(By.id("customer_firstname"));
    public final static Target ADDRESS = Target.the("Field to enter the address first name").located(By.id("address1"));
    public final static Target USER_LAST_NAME = Target.the("Field to enter the user last name").located(By.id("customer_lastname"));
    public final static Target PASSWORD = Target.the("Field to enter the user password").located(By.id("passwd"));
    public final static Target DAY_BIRTHDAY = Target.the("Field to select the day of the birthday").located(By.id("days"));
    public final static Target MONTH_BIRTHDAY = Target.the("Field to select the month of the birthday").located(By.id("months"));
    public final static Target YEAR_BIRTHDAY = Target.the("Field to select the year of the birthday").located(By.id("years"));
    public final static Target CITY = Target.the("Field to enter the user city").located(By.id("city"));
    public final static Target USER_STATE = Target.the("Field to select the user state").located(By.id("id_state"));
    public final static Target POSTAL_CODE = Target.the("Field to enter the user postal code").located(By.id("postcode"));
    public final static Target COUNTRY = Target.the("Field to select the user country").located(By.id("id_country"));
    public final static Target MOBILE_PHONE = Target.the("Field to enter the mobile phone").located(By.id("phone_mobile"));
    public final static Target MESSAGE_WELCOME = Target.the("The message of welcome tp the user").located(By.xpath("//p[@class='info-account']"));
    public final static Target REGISTER_BUTTON = Target.the("Button to register the user on the page").located(By.id("submitAccount"));


}
