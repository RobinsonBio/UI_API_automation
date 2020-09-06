package co.com.training.techandsolve.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuClothesYourLogo {

    public final static Target WOMEN_BUTTON = Target.the("Button to choose women menu").located(By.xpath("//a[@class='sf-with-ul']"));
    public final static Target BACK_BUTTON_HOME = Target.the("Button to back home").located(By.xpath("//a[@class='home']"));
    public final static Target LISTS_OF_DRESSES = Target.the("Button to choose a list view of dress").locatedBy("//i[@class='icon-th-list']");
    public final static Target CHECKOUT_BUTTON = Target.the("Button to checkout the chooses dresses").locatedBy("//a[@class='btn btn-default button button-medium']");
    public final static Target ADD_TO_CART1 = Target.the("Button to choose to add to cart1").locatedBy("(//a[@class='button ajax_add_to_cart_button btn btn-default'])[1]");
    public final static Target ADD_TO_CART2 = Target.the("Button to choose to add to cart2").locatedBy("(//a[@class='button ajax_add_to_cart_button btn btn-default'])[2]");
    public final static Target ADD_TO_CART3 = Target.the("Button to choose to add to cart3").locatedBy("(//a[@class='button ajax_add_to_cart_button btn btn-default'])[3]");
    public final static Target ADD_TO_CART4 = Target.the("Button to choose to add to cart4").locatedBy("(//a[@class='button ajax_add_to_cart_button btn btn-default'])[4]");
    public final static Target CONTINUE_SHOOPING = Target.the("Button to choose to add to continue shooping").located(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']"));
    public final static Target PRODUCT1_PRICE = Target.the("text of Product1 price").located(By.xpath("(//span[@class='price product-price'])[2]"));
    public final static Target PRODUCT2_PRICE = Target.the("text of Product2 price").located(By.xpath("(//span[@class='price product-price'])[4]"));
    public final static Target PRODUCT3_PRICE = Target.the("text of Product3 price").located(By.xpath("(//span[@class='price product-price'])[6]"));
    public final static Target PRODUCT4_PRICE = Target.the("text of Product4 price").located(By.xpath("(//span[@class='price product-price'])[8]"));
    public final static Target PRICES_PRODUCTS = Target.the("text of Total producs that were selling").located(By.xpath("//span[@id='summary_products_quantity']"));

}
