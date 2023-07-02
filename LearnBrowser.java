package week2.day;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.Select;

public class LearnBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement eleUsername = driver.findElement(By.id("username"));
		//nassary action
		eleUsername.sendKeys("DemosalesManager");
		//enter user name
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//clik link
		driver.findElement(By.linkText("SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kathiravan");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kathir");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA Automation");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing Engineer");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kathirgks@testleaf.com");
	    
	    WebElement stateGeo = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    
		Select secState = new Select(stateGeo); 
		secState.selectByVisibleText("New York");

		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("The Title is: "+ driver.getTitle());
		//driver.getTitle();
		driver.close();
	    
	    
		
		
		
		
		

	}

}
