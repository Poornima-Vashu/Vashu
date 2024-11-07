package Demo;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Genphoto {
	public static void get_photo(WebDriver driver) {
		String photos="./Photo/";
		Date d=new Date();
		String d1 = d.toString();
		String d2 = d1.replaceAll(":"," ");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);l
		File dst=new File(photos+d2+".jpeg");
		
		
		
		
		
	}

}
