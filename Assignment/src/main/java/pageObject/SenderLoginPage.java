package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class SenderLoginPage extends Base{
public WebDriver driver;
    
    By MailId = By.id("login_id");
    By next= By.xpath("//*[@id=\'nextbtn\']");
    By password = By.xpath("//*[@id=\'password\']");
    By Login = By.xpath("//*[@id=\'nextbtn\']");
    By NewMail = By.xpath("//*[@id=\"zm_lftree\"]/div[1]/span");
    
    		
    public SenderLoginPage(WebDriver driver) {
		this.driver=driver;
	}
    
   

	public WebElement getMailId() {
		// TODO Auto-generated method stub
		return driver.findElement(MailId);
	}

	public WebElement clickNext() {
		//TODO Auto-generated method stub
		return driver.findElement(next);
	}
	public WebElement getPassword() {
		// TODO Auto-generated method stub
		return driver.findElement(password);
	}

	public WebElement clickLogin() {
		// TODO Auto-generated method stub
		return  driver.findElement(Login);
	}
	
	
}
	
