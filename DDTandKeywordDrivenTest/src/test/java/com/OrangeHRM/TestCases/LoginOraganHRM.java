package com.OrangeHRM.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.OrangeHRM.Pages.BaseClass;
import com.OrangeHRM.Pages.LoginPage;

import Utility.ExcelDataReader;

public class LoginOraganHRM extends BaseClass {
	@Test
	public void loginApp() throws Exception {
		ExcelDataReader excel = new ExcelDataReader();
		excel.getStringData("LoginHRM", 0, 0);
		LoginPage loginHRM = PageFactory.initElements(driver, LoginPage.class);
		loginHRM.LoginHRM(excel.getStringData("LoginHRM", 0, 0), excel.getStringData("LoginHRM", 0, 1));
		Thread.sleep(10000);
	}
}