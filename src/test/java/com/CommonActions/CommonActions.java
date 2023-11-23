package com.CommonActions;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonActions {

	private WebDriver driver;
	
	
	public void CommonActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getScreenshot() {
		Date currentdate = new Date();
		DateFormat ft = new SimpleDateFormat("ddMMyyyyhhmmss");
		String fileName = ft.format(currentdate);
		String path = System.getProperty("user.dir") + "/screenshot/" + fileName + ".png";
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File SrcFile = ts.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(path);
		// Copy file at destination
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}
}
