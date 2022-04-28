package com.forms.lib;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class General extends Global {

	// storing all reusable functions and methods related to whole application
		//public void openapplication() {
		//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\mohdi\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			//driver = new FirefoxDriver();
		//}
	public void loginform() throws Exception { 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohdi\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		    driver.navigate().to(url2);
		    Thread.sleep(5000);
			driver.findElement(By.xpath(loginemail)).sendKeys(loginemailtext);
			driver.findElement(By.xpath(loginpassword)).sendKeys(loginpasswordtext);
			driver.findElement(By.xpath(loginbutton)).click();
			
		}
		public void signupform() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohdi\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(url1);
			Select st = new Select(driver.findElement(By.xpath(signupselect)));
			st.selectByIndex(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath(signupemail)).sendKeys(signupemailtext);
			driver.findElement(By.xpath(websiteurl)).sendKeys(websiteurltext);
			driver.findElement(By.xpath(signuppassword)).sendKeys(signuppasswordtext);
			driver.findElement(By.xpath(termscond)).click();
			driver.findElement(By.xpath(signupbutton)).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(signupname)).sendKeys(signupnametext);
			driver.findElement(By.xpath(mobnum)).sendKeys(mobnumtext);
			Select st1 = new Select(driver.findElement(By.xpath(signupselect2)));
			st1.selectByIndex(1);
			driver.findElement(By.xpath(submitbutton)).click();
			
		}
		public void contactusform() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohdi\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(url3);
			Thread.sleep(10000);
			driver.findElement(By.id(contactusname)).sendKeys(contactusnametext);
			System.out.println("Entered Name");
				driver.findElement(By.id(contactusemail)).sendKeys(contactusemailtext);
			System.out.println("Entered Email");

			driver.findElement(By.id(contactusmobnum)).sendKeys(contactusmobnumtext);
			System.out.println("Entered Phone number");

			driver.findElement(By.id(contactusmsg)).sendKeys(contactusmsgtext);
			System.out.println("msg entered");
			
			driver.findElement(By.id(conatctussentbutton)).click();

			System.out.println("Msg sent");
		
		}
		public void getstarted() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohdi\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(url4);
			Thread.sleep(20000);
			driver.findElement(By.id("minimize")).click();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);

			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_9);
			r.keyRelease(KeyEvent.VK_9);
			r.keyPress(KeyEvent.VK_0);
			r.keyRelease(KeyEvent.VK_0);
			r.keyPress(KeyEvent.VK_5);
			r.keyRelease(KeyEvent.VK_5);
			r.keyPress(KeyEvent.VK_9);
			r.keyRelease(KeyEvent.VK_9);
			r.keyPress(KeyEvent.VK_0);
			r.keyRelease(KeyEvent.VK_0);
			r.keyPress(KeyEvent.VK_8);
			r.keyRelease(KeyEvent.VK_8);
			r.keyPress(KeyEvent.VK_2);
			r.keyRelease(KeyEvent.VK_2);
			r.keyPress(KeyEvent.VK_2);
			r.keyRelease(KeyEvent.VK_2);
			r.keyPress(KeyEvent.VK_2);
			r.keyRelease(KeyEvent.VK_2);
			r.keyPress(KeyEvent.VK_5);
			r.keyRelease(KeyEvent.VK_5);
			driver.findElement(By.name(tryfreebutton)).click();
			
			System.out.println("clicked on try free button");
			Thread.sleep(5000);
			Select st = new Select(driver.findElement(By.xpath(getstartedselect)));
			st.selectByIndex(1);
			System.out.println("Plan selected");
			driver.findElement(By.id(getstartedemail)).sendKeys(getstartedemailtext);
			driver.findElement(By.id(getstartedurl)).sendKeys(getstartedurltext);
			driver.findElement(By.id(getstartedpassword)).sendKeys(getstartedpasswordtext);
			driver.findElement(By.xpath(getstartedtermscond)).click();
			driver.findElement(By.xpath(getstartedsignupbutton)).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(getstartedname)).sendKeys(getstartednametext);
			Select st1 = new Select(driver.findElement(By.xpath(getstartedselect2)));
			st1.selectByIndex(2);
			driver.findElement(By.xpath(getstartedsubmitbutton)).click();
		}
		public void onpremise() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohdi\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(url5);
			Thread.sleep(20000);
			driver.findElement(By.name(onpremisename)).sendKeys(onpremisenametext);
			System.out.println("Entered name");
			Thread.sleep(2000);
			driver.findElement(By.name(onpremiseemail)).sendKeys(onpremiseemailtext);
			System.out.println("Entered Email");
			Thread.sleep(2000);
			driver.findElement(By.xpath(onpremisemobnum)).sendKeys(onpremisemobnumtext);
			System.out.println("Entered Phone number");
			Thread.sleep(2000);
			driver.findElement(By.id(onpremisemsg)).sendKeys(onpremisemsgtext);
			System.out.println("msg entered");
			Thread.sleep(2000);
			driver.findElement(By.xpath(onpremisesubmitbutton)).click();
			System.out.println("Clicked on submit button");
			Thread.sleep(5000);
		}
		public void partnersletstalk() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohdi\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(url6);
			//driver.findElement(By.linkText(letstalkbutton)).click();
			Thread.sleep(20000);
			driver.findElement(By.id(botminimize)).click();
			driver.findElement(By.xpath(letstalkname)).sendKeys(letstalknametext);
			System.out.println("Name Entered");
			
			driver.findElement(By.xpath(letstalkemail)).sendKeys(letstalkemailtext);
			System.out.println("Entered Email");
			Thread.sleep(2000);
			driver.findElement(By.xpath(letstalkmobnum)).sendKeys(letstalkmobnumtext);
			System.out.println("Entered Phone number");
			Thread.sleep(2000);
			driver.findElement(By.xpath(letstalkurl)).sendKeys(letstalkurltext);
			System.out.println("Website Entered");
			Thread.sleep(2000);
			driver.findElement(By.xpath(letstalkmsg)).sendKeys(letstalkmsgtext);
			System.out.println("Msg entered");
			Thread.sleep(7000);
			driver.findElement(By.xpath(letstalksendbutton)).click();
			System.out.println("clicked on Submit button");
			Thread.sleep(5000);
		}
		public void close() {
			driver.close();
		}
		
}
