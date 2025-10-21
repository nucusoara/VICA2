package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static Actions.Action.navigate;
import static stepDefinition.AbstractStepDef.driver;
import static stepDefinition.AbstractStepDef.loginPageUrl;

public class LoginFunctionality {

    @Given("user insert username")
    public void insertUserName() throws InterruptedException {
        navigate(loginPageUrl, driver);
    }

    @And("user insert password")
    public void insertPassword(){

    }

    @When("user cliks on loghin button")
    public void cliksOnLoghinButton(){

    }

    @Then("user is redirect to homepage")
    public void redirectToHomepage(){

    }

    @And("user clicks on LogOut button")
    public void clicksOnLogOutButton(){

    }

    @And("insert valid username")
    public void insertValidUsername(){

    }

    @And("insert valid password")
    public void inserValidtPassword(){

    }
}
