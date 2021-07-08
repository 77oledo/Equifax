package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Pages.advantage;


public class StepDefinition {
    advantage driver = new advantage();

    @Given("^I launch Chrome browser$")
    public void i_launch_Chrome_browser() {
        driver.launchBrowser();
    }

    @When("^I open advantage page$")
    public void i_open_advantage_page() {
        driver.openURL();
    }

    @Then("^I select items tablets$")
    public void select() {

        driver.select_items();
    }
    @Then("^I select item tablet HP$")
    public void detail() {
        driver.select_items_detail();
    }
    @Then("^I add HP Tablet to the shopping cart$")
    public void add() {
        driver.add_item();
    }
    @Then("^the item was added to the shopping cart Im feel lucky$")
    public void validate() {

        driver.validate_shopping_cart();
    }


    @Then ("^I checkout$")
    public void checkout() {

        driver.validate_shopping_cart();
    }

    @Then ("^I login$")
    public void login() {

        driver.login();
    }

    @Then ("^I Pay$")
    public void pay() {
        driver.pago();
    }
    @Then ("^the item was shopping feel lucky$")
    public void shopping() {
        driver.validar_commpra();
    }

    @Then("^the browser close$")
    public void the_browser_close() {
        driver.closeTheBrowser();
    }

}
