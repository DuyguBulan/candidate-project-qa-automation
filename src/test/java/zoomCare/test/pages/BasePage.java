package zoomCare.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import zoomCare.test.utilities.Driver;

public class BasePage {

    // this contains only the web elements
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy( xpath = "//a[@id=\"nav-schedule\"]" )

    public WebElement schedulingButton;

}



