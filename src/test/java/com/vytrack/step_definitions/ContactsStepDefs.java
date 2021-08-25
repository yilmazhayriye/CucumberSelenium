package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ContactsStepDefs {


    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedNumber) {
        ContactsPage contactsPage=new ContactsPage();
        System.out.println("contactsPage.pagenumber_1.getAttribute(\"value\") = " + contactsPage.pagenumber_1.getAttribute("value"));
        Integer actualNumber=Integer.parseInt(contactsPage.pagenumber_1.getAttribute("value"));
        Assert.assertEquals(expectedNumber,actualNumber);
    }

}
