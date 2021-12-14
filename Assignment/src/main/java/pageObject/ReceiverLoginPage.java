package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class ReceiverLoginPage extends Base{
public WebDriver driver;
    
    By MailId = By.id("login_id");
    By next= By.xpath("//*[@id=\'nextbtn\']");
    By password = By.xpath("//*[@id=\'password\']");
    By Login = By.xpath("//*[@id=\'nextbtn\']");
    By Inbox = By.className("zmLFcs");
    By View = By.className("zmDtl");
    By DocDownload = By.className("msi-download");
    public ReceiverLoginPage(WebDriver driver) {
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
	
	public WebElement clickInbox() {
		// TODO Auto-generated method stub
		return driver.findElement(Inbox);	
		
	}
	public WebElement clickView() {
		// TODO Auto-generated method stub
		return driver.findElement(View);
		
	}
	public WebElement clickDocDownload() {
		// TODO Auto-generated method stub
		return driver.findElement(DocDownload);
		
	}
	
}