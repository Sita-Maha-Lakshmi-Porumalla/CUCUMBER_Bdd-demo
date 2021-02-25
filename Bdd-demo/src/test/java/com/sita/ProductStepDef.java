package com.sita;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductStepDef extends BddDemoApplicationTests {

    @Autowired
    private Product product;

    private int total;

    @Given("the price of {string} is {int}")
    public void the_price_of_is(String product, Integer price) {
        this.product.givePrices(product, price);

    }

    @When("I check {int} of {string}")
    public void i_check_of(Integer count, String product) {
        this.total = this.product.calculate(product, count);

    }

    @Then("the total price of {string} should be {int}")
    public void the_total_price_of_should_be(String product, Integer expectedTotal) {
        Assert.assertEquals((int) expectedTotal, this.total);

    }


}
