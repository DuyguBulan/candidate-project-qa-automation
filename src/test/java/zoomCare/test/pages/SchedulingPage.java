package zoomCare.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import zoomCare.test.utilities.Driver;

public class SchedulingPage {


    // this contains only the web elements
    public SchedulingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy( xpath = "(//div[@class='css-901oao css-vcwn7f'])[1]" )

    public WebElement schedulingCareOption;

    @FindBy(xpath = "//*[@id=\"react-mount-page-content\"]/div/div/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/span")
    public WebElement calendarButton;


    @FindBy (xpath = "//span[text()='Today']")
    public WebElement calendarDropdownMenu;

    @FindBy (xpath = "//div[text()='Illness/Injury']")

    public WebElement illnessDropDownButton;
    @FindBy (xpath = "//*[@data-testid='text-Illness/Injury']")

    public WebElement illnessInjuryDropDownDelection;

    @FindBy(xpath = "//button[@data-testid='virtualChatBox']")
    public WebElement videCareButton;


    @FindBy (xpath = "//*[@data-testid='text-scheduler.serviceLine.title-undefined']")
    public WebElement landingPageForDatePicker;

  @FindBy (xpath = "(//div[.=\"2\"])[4]")
    public  WebElement LocationOfNovSecond;


  @FindBy(xpath = "//*[@id=\"nav-locations\"]")
    public WebElement locationButton;

  @FindBy (xpath = "//a[@id=\"w-tabs-0-data-w-tab-0\"]//div[.=\"Portland Area\"]")
    public WebElement portlandArea;





}


