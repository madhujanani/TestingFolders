package org.stepdefination;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClass extends BaseClass {

	
	@Before(order = 1)
	public void befSec1() {
	
		loadBrowser();
		

	}
	@Before(order = 3)
	public void befSec2() {
		launchUrl("https://www.netshoes.com.br/");
		
		
	}
	@Before(order = 5)
	public void befSec3(){
		windowMax();
		
	}
	@Before(order = 7)
	public void befSec4(){
		implicitWait(10);
		
	}
	@After(order = 7)
	public void aftSec1() throws IOException{
		screenShot("firstimagelogin");
	}
	
////	@After(order = 6)
////	public void aftSec2(){
////		// TODO Auto-generated method stub
////
////	}
	@After(order = 5)
	public void aftSec3(){
	     closeBrowser();
	}
////	@After(order = 4)
////	public void aftSec4(){
////		closeBrowser();
////
////	}
////	@After(order = 2)
////	public void aftSec5(){
////		// TODO Auto-generated method stub
////
////	}
		}
