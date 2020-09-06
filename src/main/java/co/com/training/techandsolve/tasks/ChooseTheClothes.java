package co.com.training.techandsolve.tasks;

import co.com.training.techandsolve.questions.PricesOfClothes;
import co.com.training.techandsolve.utils.SavingToTxt;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.training.techandsolve.userinterfaces.MenuClothesYourLogo.*;

public class ChooseTheClothes implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        SavingToTxt.prices(OnStage.theActorInTheSpotlight().asksFor(PricesOfClothes.foundByUser()));
        OnStage.theActorInTheSpotlight().remember("value", OnStage.theActorInTheSpotlight().asksFor(PricesOfClothes.foundByUser()).size());
        actor.attemptsTo(
                Click.on(ADD_TO_CART1),
                Click.on(CONTINUE_SHOOPING),
                Click.on(ADD_TO_CART2),
                Click.on(CONTINUE_SHOOPING),
                Click.on(ADD_TO_CART3),
                Click.on(CONTINUE_SHOOPING),
                Click.on(ADD_TO_CART4),
                Click.on(CHECKOUT_BUTTON));
   }


    public static ChooseTheClothes toBuyDresses(){
        return new ChooseTheClothes();
    }
}
