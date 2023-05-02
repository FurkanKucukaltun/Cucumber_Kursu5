package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    // sol taraftaki menuler burada

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "(//span[text()='Citizenships'])[1]")
    public WebElement citizenship;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement examsetup;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement enteranceExamsTwo;

    @FindBy(xpath = "//span[text()='States']")
    private WebElement states;


    public WebElement getWebElement(String strButton){

        switch (strButton){

            case "setup": return setup;
            case "parameters": return parameters;
            case "countries": return countries;
            case "citizenship": return citizenship;
            case "nationalities" : return nationalities;
            case "fees" : return fees;
            case "entranceExamsOne" : return entranceExamsOne;
            case "examsetup" : return examsetup;
            case "enteranceExamsTwo" : return enteranceExamsTwo;
            case "states" : return states;
        }

        return null;
    }


}