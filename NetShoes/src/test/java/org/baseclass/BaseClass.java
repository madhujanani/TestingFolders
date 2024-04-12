package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Robot r;
	public static Actions a;
	public static Alert alert;
	public static Select select;

	public static void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void firfeoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public static void closeBrowser() {
		driver.close();

	}

	public static void windowMax() {
		driver.manage().window().maximize();
	}

	public static void currentUrl() {
		driver.getCurrentUrl();
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void filltextBox(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void btnclk(WebElement element) {
		element.click();

	}

	public static void robotCopy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void robotPaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}
	public static void robotTab(int num) throws AWTException {
		r = new Robot();
		for (int i = 0; i <  num; i++) {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
		}
	}
	public static void robotEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	public static void robotDown() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void movetoElement(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void dragAndDrop(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	public static void screenShot(String image) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\gowre\\eclipse-workspace\\NetShoes\\ScreenShots\\"+image+".png");
		FileUtils.copyFile(src, des);

	}

	public static void AlertAccept() {
		alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void AlertDismis() {
		alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static void scrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void selectByIndex(WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectByValue(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
	}

	public static void selectByText(WebElement element, String text) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void parentWindowId() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	public static void AllWindowId() {
		Set<String> windowHandle = driver.getWindowHandles();
		System.out.println(windowHandle);
	}

	@SuppressWarnings("deprecation")
	public static void implicitWait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}
	public static Object listLoop() {
		List<Object> li=new ArrayList<Object>();
		for (int i = 0; i < li.size(); i++) {
			Object object = li.get(i);
			return object;
			
		}
		return li;

	}

}
