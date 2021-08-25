package com.vytrack.step_definitions;

import io.cucumber.java.en.*;

public class LoginStepDefs {

    @Given("The user is on the login Page")
    public void the_user_is_on_the_login_Page() {
        System.out.println("Open the browser and navigate the page,Browseri ac ve login sayfasına git");


    }

    @When("The user enters username and password and login button")
    public void the_user_enters_username_and_password_and_login_button() {
        System.out.println("Enter username and password");
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("Verify that title is Dashboard");
    }


    @When("The user enters sales manager username and password and login button")
    public void theUserEntersSalesManagerUsernameAndPasswordAndLoginButton() {
        System.out.println("Enter sales manager username and password");
    }

    @When("The user enters store manager username and password and login button")
    public void theUserEntersStoreManagerUsernameAndPasswordAndLoginButton() {
        System.out.println("Enter sales manager username and password");
    }
}
