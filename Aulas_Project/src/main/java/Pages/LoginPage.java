package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.TestBase;

public class LoginPage extends TestBase
{
        @FindBy(xpath="//div[@class='m-t-5']/input")
        WebElement Eamil;
        @FindBy(xpath="//div[@class='m-t-20']/span/input")
        WebElement Password;
        @FindBy(xpath="//button[contains(@class,'primary')]/span[text()='Login']")
        WebElement LoginButton;
        @FindBy(xpath="(//div[contains(@class,'ant-col')]/img)[1]")
        WebElement Aulaslogo;
        @FindBy(xpath="//div[contains(@class,'ant')]//following::h2[text()='Sign in to your account']")
        WebElement testSigninyouraccount;
        @FindBy(xpath="(//a[text()='Privacy Policy'])[1]")
        WebElement PrivacyPage;
        @FindBy(xpath="(//a[text()='Terms & Conditions'])[1]")
        WebElement TermsAndConditions;
        @FindBy(xpath="//div[@class='ant-tabs-tab']")
        WebElement Mobilebutton;
        @FindBy(xpath="//button[contains(@class,'ant-btn')]/span[text()='Forgot Password ?']")
        WebElement PasswordButton;
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	public boolean validateAulasImage()
	{
		return Aulaslogo.isDisplayed();
	}
	public void validatePrivacyPage()
	{
		PrivacyPage.click();
	}
	public void validateTermsadnConditions()
	{
		TermsAndConditions.click();
	}
	public String validateSigninyouraccount()
	{
		return testSigninyouraccount.getText();
	}
	public MobilePage validatePhoneButton()
	{
		Mobilebutton.click();
		return new MobilePage();
	}
	public PasswordPage validateforgetpassword()
	{
		PasswordButton.click();
		return new PasswordPage();
	}
	public HomePage login(String email,String Pd)
	{
		Eamil.sendKeys(email);
		Password.sendKeys(Pd);
		LoginButton.click();
		
		return new HomePage();
	}
	
	
	
	public void NewLogin() {
	}
	
	
}
