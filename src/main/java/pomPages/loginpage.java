package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	
	@FindBy(xpath="(//a[@title='Jobseeker Login'])[1]")
    private WebElement loginBtn;
    
    @FindBy(xpath="(//input[@placeholder='Enter your active Email ID / Username'])[1]")
    private WebElement emailfield;
    
    @FindBy(xpath="(//input[@placeholder='Enter your password'])[1]")
    private WebElement pwdbtn;
    
    @FindBy(xpath="(//button[@type='submit'])[1]")
    private WebElement login;
    
    
    public loginpage(WebDriver driver) {
 	PageFactory.initElements(driver, this);   
 	   
    }
    
    
   
    public void loginButton() {
    	loginBtn.click();
    }
	
    public void emailField(String name) {
    	emailfield.sendKeys(name);
    }
    public void passwordField(String name) {
    	pwdbtn.sendKeys(name);
    }
    public void loginswitch() {
    	login.click();
    }	
	
	
	
	
	
	
	
	
	
	
	
}