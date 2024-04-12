package org.stepdefination;

import java.awt.AWTException;
import java.util.List;

import org.baseclass.BaseClass;
import org.pom.Pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination  extends BaseClass{
	Pom p = new Pom();
	


@Given("user have Enter netShoe Application using chrome browser")
public void user_have_Enter_netShoe_Application_using_chrome_browser() {


}

@When("change the language to english and close the alert")
public void change_the_language_to_english_and_close_the_alert() throws AWTException, InterruptedException {
   
//    robotTab(8);
//    robotEnter();
//    robotDown();
//    robotEnter();
//    robotTab(3);
//    robotEnter();
//    robotTab(3);
//    robotEnter();
}

@When("user needs to click on log in and need to give  valid email credentials")
public void user_needs_to_click_on_log_in_and_need_to_give_valid_email_credentials(io.cucumber.datatable.DataTable d) {
//   
//	List<String> allData = d.asList();
//	filltextBox(p.getSignupemail(), allData.get(0));
//	p.getProcced().click();
	
}

@Then("click on the procced button")
public void click_on_the_procced_button() {
//	  p.getProcced().click();
}

@When("user needs to click on log in and need to give invalid email credentials")
public void user_needs_to_click_on_log_in_and_need_to_give_invalid_email_credentials(io.cucumber.datatable.DataTable d) {
//	List<String> allData = d.asList();
//	filltextBox(p.getSignupemail(), allData.get(2));
//	p.getProcced().click();
}

@When("user needs to click on log in and need to give invalid email {string} and invalid password {string} credentials")
public void user_needs_to_click_on_log_in_and_need_to_give_invalid_email_and_invalid_password_credentials(String email, String pass) {
 
//    movetoElement(p.getLoginmovelem());
//    p.getLogin().click();
//    filltextBox(p.getEmailEnter(),email);
//    filltextBox(p.getPassword(), pass);
//    p.getPopupclose().click();
}

@Then("click on the Access account button")
public void click_on_the_Access_account_button() {
  
//    p.getClkLgn().click();
}





	}


//
//
//
//
//
//
//
//}
