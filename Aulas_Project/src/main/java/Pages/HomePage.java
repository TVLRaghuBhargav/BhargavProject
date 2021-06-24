package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.TestBase;

public class HomePage extends TestBase
{
	Actions ac;
	@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Users']")
	WebElement UsersLink;
	@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Fee Management']")
	WebElement FeeManagementLink;
	@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Schedule']")
	WebElement ScheduleLink;
	@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Live Classes']")
	WebElement LiveClassLink;
	@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Classrooms']")
	WebElement ClassesLink;
	@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Announcements']")
	WebElement AnnouncementsLink;
	@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Attendance']")
	WebElement AttendLink;
	@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Digital Library']")
	WebElement digitalLink;
	@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Assignments']")
	WebElement AssignmentLink;
	@FindBy(xpath="//div[@class='side-menu']//following::span[text()='Test']")
	WebElement TestLink;
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public UserPage User()
		{
			ac=new Actions(driver);
			ac.moveToElement(UsersLink).click().build().perform();
			return new UserPage();
		}
		public void Feemanagement()
		{
			ac=new Actions(driver);
			ac.moveToElement(FeeManagementLink).click().build().perform();
		}
		public void schedule()
		{
			ac=new Actions(driver);
			ac.moveToElement(ScheduleLink).click().build().perform();
		}
		public void liveClasses()
		{
			ac=new Actions(driver);
			ac.moveToElement(LiveClassLink).click().build().perform();
		}
		public void classes()
		{
			ac=new Actions(driver);
			ac.moveToElement(ClassesLink).click().build().perform();
		}
		public void Announcement()
		{
			ac=new Actions(driver);
			ac.moveToElement(AnnouncementsLink).click().build().perform();
		}
		public void Attend()
		{
			ac=new Actions(driver);
			ac.moveToElement(AttendLink).click().build().perform();
		}
		public void Digital()
		{
			ac=new Actions(driver);
			ac.moveToElement(digitalLink).click().build().perform();
		}
		public void Assignment()
		{
			ac=new Actions(driver);
			ac.moveToElement(AssignmentLink).click().build().perform();
		}
		public void Test()
		{
			ac=new Actions(driver);
			ac.moveToElement(TestLink).click().build().perform();
		}
		
		
	
}
