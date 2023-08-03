package Testscripts;

import org.testng.annotations.Test;

import java.io.IOException;

import genericLib.BaseClass;
import pomPages.HomePage;
import pomPages.loginpage;
public class Testcase extends BaseClass {

	@Test
	public void tc01() throws IOException, InterruptedException {
		
		
	loginpage p = new loginpage(driver);
	p.loginButton();
	p.emailField(pdata.getPropertyFileData("ename"));
	p.passwordField(pdata.getPropertyFileData("pname"));
	p.loginswitch();
	
	HomePage h = new HomePage(driver);
	Thread.sleep(5000);

	h.completeprofilrButton();
	Thread.sleep(10000);
	h.uploadButton();
	Thread.sleep(10000);

	//Runtime.getRuntime().exec("‪‪C:\\Users\\ADMIN\\Desktop\\uploadfile.exe");
	
	Runtime.getRuntime().exec("\"C:\\Users\\ADMIN\\Desktop\\uploadfile.exe\"");
	Process process = Runtime.getRuntime().exec("C:\\Users\\ADMIN\\Desktop\\uploadfile.exe");
	int exitCode = process.waitFor();
	if (exitCode != 0) {
	    // Some error occurred, handle it appropriately
	}

	Thread.sleep(10000);

	}
}
