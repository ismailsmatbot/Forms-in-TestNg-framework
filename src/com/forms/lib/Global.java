package com.forms.lib;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;

public class Global {

	public WebDriver driver;
	public Robot r;
	//test data
	// signup link
	public String url1 = "https://www.feltso.com/signup" ;
	//login link
	public String url2 = "https://www.feltso.com/login";
	//Contact us form link
	public String url3 = "https://www.feltso.com/contact-us?user=test_project";
	//Get started link
	public String url4 = "https://www.feltso.com/";
	//On premise link
	public String url5 = "https://www.feltso.com/on-premise-chatbot#contact";
	//partners lets talk link
	public String url6 = "https://www.feltso.com/partners#contact-section";
	//login email
	public String loginemail = "//*[@id=\"email\"]";
	//login password
	public String loginpassword = "//*[@id=\"password\"]";
	// sign in button
	public String loginbutton = "//*[@id=\"verify-captcha-second\"]";
	//loginemailtext
	public String loginemailtext = "testsignup@gmail.com";
	//loginpasswordtext
	public String loginpasswordtext = "Ismail786$";
	//signup select
	public String signupselect = "//*[@id=\"body\"]/div[3]/div/form/div[3]/div[1]/select";
	//signup email
	public String signupemail = "//*[@id=\"email\"]";
	//signupemailtext
	public String signupemailtext = "testsignup2@gmail.com";
	//websiteurl
	public String websiteurl = "//*[@id=\"url\"]";
	//websiteurltext
	public String websiteurltext = "www.smatbot.com";
	//signup password
	public String signuppassword = "//*[@id=\"password-other\"]";
	//sign up password text
	public String signuppasswordtext = "Ismail786$";
	// terms & conditions
	public String termscond = "//*[@id=\"body\"]/div[3]/div/form/div[3]/div[5]/div/input";
	//signup button
	public String signupbutton ="//*[@id=\"signup-button\"]/span/span";
	//signup name
	public String signupname = "//*[@id=\"body\"]/div[3]/div/form/div[3]/div[1]/input";
	//signupname text
	public String signupnametext = "Mohd Ismail Ali";
	//signup mobile number
	public String mobnum = "//*[@id=\"body\"]/div[3]/div/form/div[3]/div[2]/input";
	//mobnum text
	public String mobnumtext = "9852456567";
	//signup select-2
	public String signupselect2 = "//*[@id=\"body\"]/div[3]/div/form/div[3]/div[4]/select";
	//submit button
	public String submitbutton = "//*[@id=\"body\"]/div[3]/div/form/div[3]/div[5]/button/span";
	//contactus name
	public String contactusname = "contact-name";
	//contactus name text
	public String contactusnametext = "Mohd Ismail Ali";
	//contact us email
	public String contactusemail = "contact-email";
	//contactusemailtext
	public String contactusemailtext = "testsignup@gmail.com";
	//contact us mob num
	public String contactusmobnum = "contact-phone";
	//contact us mob num text
	public String contactusmobnumtext = "9850985680";
	//contact us message
	public String contactusmsg = "contact-message";
	//contact us msg text
	public String contactusmsgtext = "This is a testing msg";
	//send msg button
	public String conatctussentbutton = "send_message";
	//try free button
	public String tryfreebutton = "button";
	//getstartedselect
	public String getstartedselect = "//*[@id=\\\"body\\\"]/div[3]/div/form/div[3]/div[1]/select";
	//get started email
	public String getstartedemail = "email";
	//get started email text
	public String getstartedemailtext = "testsignup@gmail.com";
	//get start url
	public String getstartedurl = "url";
	//get started url text
	public String getstartedurltext = "www.smatbot.com";
	//get started passowrd
	public String getstartedpassword = "password-other";
	//get started password text
	public String getstartedpasswordtext = "Ismail786$";
	//get started terms & cond
	public String getstartedtermscond = "//*[@id=\\\"body\\\"]/div[3]/div/form/div[3]/div[5]/div/input";
	//get started signup button
	public String getstartedsignupbutton = "//*[@id=\\\"signup-button\\\"]/span/span";
	//getstartedname
	public String getstartedname = "/html/body/div[3]/div/form/div[3]/div[1]/input";
	//get started name text
	public String getstartednametext = "mohd";
	//get started select 2
	public String getstartedselect2 = "//*[@id=\\\"body\\\"]/div[3]/div/form/div[3]/div[4]/select";
	//get started submit button
	public String getstartedsubmitbutton = "//*[@id=\\\"body\\\"]/div[3]/div/form/div[3]/div[5]/button/span";
	// on premise name
	public String onpremisename = "name";
	//on premise name text
	public String onpremisenametext = "mohd";
	// on premise email
	public String onpremiseemail = "email";
	// on premise email text
	public String onpremiseemailtext = "testsignup@gmail.com";
	//on premise mob num
	public String onpremisemobnum = "//*[@id=\"partner-phone\"]";
	//on premise mob num text
	public String onpremisemobnumtext = "9854457878";
	//on premise msg
	public String onpremisemsg = "message";
	//on premise msg text
	public String onpremisemsgtext = "This is a testing msg";
	// on premise submit button
	public String onpremisesubmitbutton = "//*[@id=\"main_contact_form\"]/div/div[6]/button";
	//partners lets talk
	//public String letstalkbutton = "#contact-section";
	//bot minimize
	public String botminimize = "minimise";
	//lets talk name
	public String letstalkname = "//*[@id=\"referral-name\"]";
	//lets talk name text
	public String letstalknametext = "Mohd";
	//lets talk email
	public String letstalkemail = "//*[@id=\"referral-email\"]";
	//lets talk email text
	public String letstalkemailtext = "testsignup@gmail.com";
	//lets talk mob num
	public String letstalkmobnum = "//*[@id=\"get-started-below-phone-referral\"]";
	// lets talk mob num text
	public String letstalkmobnumtext = "9855456587";
	//lets talk website
	public String letstalkurl = "//*[@id=\"referral-website\"]";
	// lets talk url text 
	public String letstalkurltext  = "www.smatbot.com";
	// lets talk msg
	public String letstalkmsg = "//*[@id=\"referral-message\"]";
	// lets talk msg text
	public String letstalkmsgtext = "This is a testing msg";
	// lets talk send button
	public String letstalksendbutton = "/html/body/div[3]/div[2]/section[4]/div/div[4]/div/div/div/div/form/div[3]/div/button/span";
	
	
	
}
