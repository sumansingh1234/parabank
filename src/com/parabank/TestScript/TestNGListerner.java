 package com.parabank.TestScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestContext;
import org.testng.ITestListener ;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestNGListerner implements ITestListener {
	WebDriver driver;
	@Test(priority = 1)
	@Parameters("firefox")
	public void Crossbrowser(String browsername) {		
			if(browsername.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}
			else if(browsername.equalsIgnoreCase("chrome")){
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\name\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				driver=new ChromeDriver();
				
			}
			else if(browsername.equalsIgnoreCase("InternetExplorer")){
				driver=new InternetExplorerDriver();
			
		}
			driver.get("https://www.facebook.com");
		    String strtitle=driver.getTitle();
		   System.out.println(strtitle);
		

	}
	 @Test(priority = 2)
	    public void loginFB(){
	       
	        WebDriver driver=new FirefoxDriver();
	        driver.get("http://www.facebook.com");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("email")).sendKeys("mukesh@facebook.com");
	        driver.findElement(By.id("wronglocator")).sendKeys("dont-tell");
	        driver.findElement(By.id("loginbutton")).click();
	    }
	    
	    
	    
	    
	    @Override
	    public void onFinish(ITestContext result) {
	        System.out.println("test cases finishes "+result.getName());
	       
	    }
	 
	    @Override
	    public void onStart(ITestContext result) {
	    	System.out.println("onStart "+result.getName());
	       
	    }
	 
	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    	System.out.println("onTestFailedButWithinSuccessPercentage "+result.getName());
	    	
	    	
	       
	    }
	 
	    @Override
	    public void onTestFailure(ITestResult result) {
	    	System.out.println("onTestFailure "+result.getName());
	        System.out.println("Screen shot captured====="+result.toString());
	       
	    }
	 
	    @Override
	    public void onTestSkipped(ITestResult result) {
	    	System.out.println("onTestSkipped "+result.getName());
	       
	       
	    }
	 
	    @Override
	    public void onTestStart(ITestResult result) {
	       
	        System.out.println("TestCase started====" +result.toString());
	       
	    }
	 
	    @Override
	    public void onTestSuccess(ITestResult result) {
	       
	       
	        System.out.println("Congrates Testcase has been passed===="+ result.toString());
	       
	    }
	  
	}
	 
	
	


