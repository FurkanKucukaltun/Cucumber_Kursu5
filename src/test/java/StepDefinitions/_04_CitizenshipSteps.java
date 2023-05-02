package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _04_CitizenshipSteps {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @And("Navigate to Citizenship page")
    public void navigateToCitizenshipPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.citizenship);
    }

    @When("User a CitizenShip name as {string} short name as {string}")
    public void userACitizenShipNameAsNameAs(String name, String shortname) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.shortName, shortname);
        dc.clickFunction(dc.saveButton);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyExist, "already");
    }

    @When("User delete the {string}")
    public void userDeleteThe(String searchText) {
        dc.deleteItem(searchText);

    }
    //* Benim yaptığım çözüm
    //    @When("User delete the {string}")
//    public void userDeleteThe(String name) {
//        if(dc.closeDialogBtn.isEnabled()){
//            dc.clickFunction(dc.closeDialogBtn);}
//        dc.waitUntilClickable(dc.searchButton);
//        dc.scrollToElement(dc.nameInputMainPage);
//        dc.sendKeysFunction(dc.nameInputMainPage,name);
//        dc.clickFunction(dc.searchButton);
//        dc.waitUntilClickable(dc.deleteButton);
//        dc.clickFunction(dc.deleteButton);
//        dc.waitUntilClickable(dc.deleteConfBtn);
//        dc.clickFunction(dc.deleteConfBtn);
//        dc.verifyContainsTextFunction(dc.successMessage,"successfully");
//
//
//    }
}
