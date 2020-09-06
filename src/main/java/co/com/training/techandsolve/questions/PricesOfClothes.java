package co.com.training.techandsolve.questions;

import co.com.training.techandsolve.userinterfaces.MenuClothesYourLogo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

public class PricesOfClothes implements Question<List<String>> {


    @Override
    public List<String> answeredBy(Actor actor) {

        ArrayList<String> prices = new ArrayList<>();

        prices.add(Text.of(MenuClothesYourLogo.PRODUCT1_PRICE).viewedBy(actor).resolve().substring(1, 6));
        prices.add(Text.of(MenuClothesYourLogo.PRODUCT2_PRICE).viewedBy(actor).resolve().substring(1, 6));
        prices.add(Text.of(MenuClothesYourLogo.PRODUCT3_PRICE).viewedBy(actor).resolve().substring(1, 6));
        prices.add(Text.of(MenuClothesYourLogo.PRODUCT4_PRICE).viewedBy(actor).resolve().substring(1, 6));

        return prices;

    }

    public static PricesOfClothes foundByUser() {
        return new PricesOfClothes();
    }


}
