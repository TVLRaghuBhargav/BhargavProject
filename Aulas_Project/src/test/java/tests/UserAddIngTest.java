package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserAddInfPage;
import Pages.UserPage;
import Util.TestUTil;

public class UserAddIngTest extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	UserPage userpage;
	TestUTil testUtil;
	UserAddInfPage useraddinfpage;
	
	
	public UserAddIngTest()
	{
		super();
	}
	
	 @BeforeMethod
     public void setUp() throws InterruptedException
     {
   	  initilization();
   	  testUtil = new TestUTil();
   	  loginpage=new LoginPage();
   	  homePage=new HomePage();
   	  userpage=new UserPage();
   	  homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
   	  userpage=homePage.User();
   	useraddinfpage=userpage.operdropdown();
   	
     }
	 @Test
	 public void ValidateAddInfoPage() throws InterruptedException
	 {
		 useraddinfpage.AddInfoPage();
	 }
	 @AfterMethod
	 public void tearDown()
	 {
		 driver.quit();
	 }

}
