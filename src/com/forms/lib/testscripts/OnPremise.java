package com.forms.lib.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.forms.lib.General;

public class OnPremise {
	@Test
	public void tc005() throws Exception {
		 DOMConfigurator.configure("log4j.xml");
		General gen = new General();
		gen.onpremise();
		gen.close();
	}
}
