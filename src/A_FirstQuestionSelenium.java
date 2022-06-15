import static org.testng.Assert.assertEquals;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.jodah.failsafe.internal.util.Assert;




public class A_FirstQuestionSelenium {
	
	public WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mharo\\eclipse-workspaceVersion2\\LabCorpAssesment\\resourses\\driver\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.labcorp.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a[@class='no-ext ext'])[1]")).click();
		
		//====================================================
		Set<String> handles = driver.getWindowHandles();
		java.util.Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		//=================================================
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("QA Test Automation Developer");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		//====================================================
		
		
		
		String expectedText = driver.findElement(By.xpath("(//span[@data-ph-id='ph-page-element-page11-Zk12Zp'])[1]")).getText();
		
		
		String requiredText = "QA Test Automation Developer";
		
		//softAssert.assertEquals(expectedText, "This is what we expect");
		
		assertEquals(expectedText, requiredText);
		
		//====================================================
		
	/*	String jobLocation = driver.findElement(By.xpath("(//span[@class='job-location'])[1]")).getText();
		
		System.out.println(driver.findElement(By.xpath("(//span[@class='job-location'])[1]")).getText());
		
		String requiredJobLocation = "Location\r\n"
				+ "Durham, North Carolina, United States of America";
		
		assertEquals(jobLocation, requiredJobLocation);
		
		*/
		//=======================================================
		
		String jobID = driver.findElement(By.xpath("(//span[@class='au-target'])[5]")).getText();
		
		System.out.println(driver.findElement(By.xpath("(//span[@class='au-target'])[5]")).getText());
		String requiredJobID = "Job Id: 21-90223_RM";
		
		assertEquals(jobID, requiredJobID);
		
		//===========================================================
		
		driver.findElement(By.xpath("(//span[@data-ph-id='ph-page-element-page11-Zk12Zp'])[1]")).click();
		
		//=================================
		String FirstText = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/p[7]")).getText();
		String requiredFtext = "Management Support:";
		
		assertEquals(FirstText, requiredFtext);
		
		//======================================================
		
		String secondText = driver.findElement(By.xpath("//p[contains(text(),'Prepare test plans, budgets, and schedules.')]")).getText();
		
		String requiredSecond = "Prepare test plans, budgets, and schedules.";
		
		assertEquals(secondText, requiredSecond);
		
		//=======================================================
		
		String thirdText = driver.findElement(By.xpath("//p[contains(text(),'5+ years of experience in QA automation developmen')]")).getText();
		String reqthirdtext = "5+ years of experience in QA automation development and scripting.";
		assertEquals(thirdText, reqthirdtext);
		
		
		//=============================================
		
		driver.findElement(By.xpath("//ppc-content[@data-ph-id='ph-page-element-page4-AWJsoH']")).click();
		
		
		driver.quit();
	}
	
}
