package com.forms.lib.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.forms.lib.General;

public class Signup extends General {
	@Test
	public void tc002() throws Exception {
		 DOMConfigurator.configure("log4j.xml");
		General gen = new General();
		gen.signupform();
		gen.close();
}
}