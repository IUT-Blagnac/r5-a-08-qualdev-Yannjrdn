package dojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CocktailSteps {

    private Order order;
    @Given("{string} who wants to buy a drink")
    public void name_who_wants_to_buy_a_drink(String name ) {
        order = new Order();
        order.declareOwner(name);
   }

   @When("an order is declared for {string}")
           public void an_order_is_declared_for_name(String name) {
            order.declareTarget(name);
    }

    

    @Then("there is no cocktail in the order")
    public void there_is_no_cocktail_in_the_order() {
        List<String> cocktails =  order.getCocktails();
        assertEquals(0, cocktails.size());
    }

}
