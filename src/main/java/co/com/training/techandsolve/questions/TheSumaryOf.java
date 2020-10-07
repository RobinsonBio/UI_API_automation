package co.com.training.techandsolve.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.training.techandsolve.userinterfaces.MenuClothesYourLogo.PRICES_PRODUCTS;

public class TheSumaryOf implements Question  {
    @Override
    public Object answeredBy(Actor actor) {

         String value=  PRICES_PRODUCTS.resolveFor(actor).getText().trim().substring(0,1);

        return value;

    }
    public static TheSumaryOf dresses(){
        return new TheSumaryOf();
    }
}
