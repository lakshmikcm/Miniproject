package org.maincode;

import org.login.Registration;
import org.login.login;

public class Mainmaven extends Registration{
	
	public static void main(String[] args) {
		
		browserLaunch("chrome");
		implicitWait(20);
		urlLaunch("https://adactinhotelapp.com/");
		
		//create object for login page
		login l=new login();
		sendKeys(l.getUser(),"Kalai");
		sendKeys(l.getPass(),"1234567");
		click(l.getLoginbtn());
		
		//create object for registration page
		Registration r=new Registration();
		
		click(r.getCreateAct());
		sendKeys(r.getUsername(),"Kalaiarasi");
		sendKeys(r.getPassword(),"123456");
		sendKeys(r.getRepass(),"123456");
		sendKeys(r.getFullname(),"Kalaivani");
		sendKeys(r.getEmail(),"kalai@gmail.com");
		click(r.getCheck());
		
		click(r.getSubmit());
		
	
		
		
	}

}
