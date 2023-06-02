package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    private WebDriver driver;

    @FindBy(how = How.CSS,using = "#email")
    WebElement emailField;
    @FindBy(how = How.CSS,using = "#pass")
    WebElement passwordField;
    @FindBy(how = How.CSS,using = "#pass_ver")
    WebElement passwordVerificationField;




    @FindBy(how = How.CSS,using = "#name")
    WebElement nameField;

    @FindBy(how = How.CSS,using = "#surname")
    WebElement surnameField;


    @FindBy(how = How.CSS,using = "#phone")
    WebElement phoneField;




    @FindBy(how = How.CSS,using = "#street")
    WebElement streetField;
    @FindBy(how = How.CSS,using = "#city")
    WebElement cityField;
    @FindBy(how = How.CSS,using = "#zip_code")
    WebElement zipField;



    @FindBy(how = How.CSS,using = "a[href='/logout']")
    WebElement logoutButton;




    @FindBy(how = How.CSS,using = "#pkms")
    WebElement wantToRecieveNewsletterCB;




    @FindBy(how = How.CSS,using = "#f_name")
    WebElement firmName;
    @FindBy(how = How.CSS,using = "#f_street")
    WebElement firmStreet;
    @FindBy(how = How.CSS,using = "#f_dic")
    WebElement firmDIC;
    @FindBy(how = How.CSS,using = "#f_zip_code")
    WebElement firmZIP;
    @FindBy(how = How.CSS,using = "#f_ico")
    WebElement firmICO;
    @FindBy(how = How.CSS,using = "#f_city")
    WebElement firmCity;

    public WebElement getWantToRecieveNewsletterCB() {
        return wantToRecieveNewsletterCB;
    }

    public WebElement getFirmName() {
        return firmName;
    }

    public WebElement getFirmStreet() {
        return firmStreet;
    }

    public WebElement getFirmDIC() {
        return firmDIC;
    }

    public WebElement getFirmZIP() {
        return firmZIP;
    }

    public WebElement getFirmICO() {
        return firmICO;
    }

    public WebElement getFirmCity() {
        return firmCity;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getPasswordVerificationField() {
        return passwordVerificationField;
    }

    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getSurnameField() {
        return surnameField;
    }

    public WebElement getPhoneField() {
        return phoneField;
    }

    public WebElement getStreetField() {
        return streetField;
    }

    public WebElement getCityField() {
        return cityField;
    }

    public WebElement getZipField() {
        return zipField;
    }

    @FindBy(how = How.CSS,using = "input[value='Odešlete informace']")
    WebElement firmSubmit;




    @FindBy(how = How.CSS,using = "li[class='active'] a span")
    WebElement activeTabButton;



    @FindBy(how = How.CSS,using = "#page-account > section > div > section > div.panel-heading > ul > li:nth-child(1) > a")
    WebElement profileInfoButton;

    @FindBy(how = How.CSS,using = "#page-account > section > div > section > div.panel-heading > ul > li:nth-child(2) > a")
    WebElement ordersButton;


    @FindBy(how = How.CSS,using = "#page-account > section > div > section > div.panel-heading > ul > li:nth-child(3) > a")
    WebElement creditsButton;
    @FindBy(how = How.CSS,using = "#page-account > section > div > section > div.panel-heading > ul > li:nth-child(4) > a")
    WebElement profilePhotosButton;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;






        emailField = $("#email");
        passwordField = $("#pass");
        passwordVerificationField = $("#pass_ver");
        nameField = $("#name");
        surnameField = $("#surname");
        phoneField = $("#phone");
        streetField = $("#street");
        cityField = $("#city");
        zipField = $("#zip_code");
        logoutButton = $("a[href='/logout']");
        wantToRecieveNewsletterCB = $("#pkms");
        firmName = $("#f_name");
        firmStreet = $("#f_street");
        firmDIC = $("#f_dic");
        firmZIP = $("#f_zip_code");
        firmICO = $("#f_ico");
        firmCity = $("#f_city");
        firmSubmit = $("input[value='Odešlete informace']");
        activeTabButton = $("li[class='active'] a span");
        profileInfoButton = $("#page-account > section > div > section > div.panel-heading > ul > li:nth-child(1) > a");
        ordersButton = $("#page-account > section > div > section > div.panel-heading > ul > li:nth-child(2) > a");
        creditsButton = $("#page-account > section > div > section > div.panel-heading > ul > li:nth-child(3) > a");
        profilePhotosButton = $("#page-account > section > div > section > div.panel-heading > ul > li:nth-child(4) > a");


    }



    public void goToProfilePhotosTab(){

        profilePhotosButton.click();
    }
    public void goToCreditsTab(){
        creditsButton.click();
    }
    public void goToProfileTab(){

        profileInfoButton.click();
    }
    public void goToOrdersTab(){

        ordersButton.click();
    }
    public HomePage logOut(){
        logoutButton = $("a[href='/logout']");
        logoutButton.click();

        return new HomePage(driver);
    }
    public void clickActiveTabButton(){

        //SHOULD do nothing
        activeTabButton.click();
    }
    public void fillOutFirmAndSubmit(String name, String street, String ico, String city,
                                     String dic, String zip){

        firmName.sendKeys(name);
        firmStreet.sendKeys(street);
        firmICO.sendKeys(ico);
        firmCity.sendKeys(city);
        firmDIC.sendKeys(dic);
        firmZIP.sendKeys(zip);


        firmSubmit.click();
    }
    public void clickNewsletterCB(){
        wantToRecieveNewsletterCB.click();
    }
    public void changeName(String name){

        nameField.sendKeys(name);
    }
    public void changeSurname(String surname){

        surnameField.sendKeys(surname);
    }
    public void changeEmail(String email){

        emailField.sendKeys(email);
    }
    public void changePassword(String pw){

        passwordField.sendKeys(pw);
        passwordVerificationField.sendKeys(pw);
    }
    public void changeStreetAndHouseNum(String streetAndHouseNum){

        streetField.sendKeys(streetAndHouseNum);
    }
    public void changeCity(String city){
        cityField.sendKeys(city);

    }
    public void changeZIP(String zip){

        zipField.sendKeys(zip);
    }
    public void changePhone(String phone){

        phoneField.sendKeys(phone);
    }



}
