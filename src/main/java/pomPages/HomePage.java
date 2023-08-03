package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(xpath="(//a[normalize-space()='Complete profile'])[1]")
    private WebElement profilebtn;
	@FindBy(xpath="(//a[normalize-space()='Update'])[1]")
    private WebElement uploadbtn;
     
	public HomePage(WebDriver driver) {
	 	PageFactory.initElements(driver, this);   
	 	   
	    }
	    
	public void completeprofilrButton() {
		profilebtn.click();
		
	}
	public void uploadButton() {
		uploadbtn.click();
		
	}
}
