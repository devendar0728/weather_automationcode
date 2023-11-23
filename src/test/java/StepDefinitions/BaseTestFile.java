package StepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class BaseTestFile {

	public static WebDriver driver;
	public static Properties prop;
	public static String vTCName;
	public static Map<String,Map<String,String>> alldata;

	public static  String readproperties(String KEY) 
	{
		
		Properties prop = new Properties();
		try {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/settings.properties");
		prop.load(fis);
		System.out.println("this is form the settings.propertiers");
		System.out.println(prop.getProperty("USERNAME"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//return prop;
		String extract_Value= (prop.getProperty(KEY));;
		return extract_Value;
	}


	public void launchBrowser(String BrowserName)
	{
	
			
		if(BrowserName=="firefox") {
			System.out.println("Firefox browser opens");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\yDevendar\\src\\test\\resources\\drivers\\geckodriver.exe");

			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		else if(BrowserName=="chrome"){
			System.out.println("Chrome browser opens");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\yDevendar\\src\\test\\resources\\drivers\\chromedriver.exe");

			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
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
	
	public void mydata() {
		
		alldata = readdata(System.getProperty("user.dir")+"/src/test/resources/TestData/data.xlsx", "Sheet1");
		System.out.println(alldata);
	}
	
	public Map<String,Map<String,String>> readdata(String file, String sheet)
	{
	//	 Map<String,Map<String,String>> alldata = null;
		try
		{
			Fillo fillo=new Fillo();
			Connection connection=fillo.getConnection(file);
			String strQuery="Select * from "+sheet;
			Recordset recordset=connection.executeQuery(strQuery);
			 List<String> clms = recordset.getFieldNames();
			alldata = new HashMap<String,Map<String,String>>();
			while(recordset.next()){
			String TCName = recordset.getField("TCName");
			Map<String,String> rowdata = new HashMap<String,String>();

		for(int i=0;i<clms.size();i++)
		{			
			rowdata.put(clms.get(i), recordset.getField(clms.get(i)));
		}
		alldata.put(TCName, rowdata);
		}
		 
		recordset.close();
		connection.close();
		return alldata;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return alldata;
		
	}
	

}
