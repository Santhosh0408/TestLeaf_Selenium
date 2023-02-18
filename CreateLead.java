package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SAPIENT");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Santhosh");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Santhosh");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tester");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("null");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("santhoshsmart093@gmail.com");
			WebElement stateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		    Select dd = new Select(stateDropDown);
		    dd.selectByVisibleText("New York");
		    Thread.sleep(2000);
		    driver.findElement(By.className("smallSubmit")).click();
		    String title = driver.getTitle();
		    System.out.println(title);	
	}

}
