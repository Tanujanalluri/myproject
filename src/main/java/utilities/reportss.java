package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basepackage.baseclass;

public class reportss {

	public static String screencap() throws Exception
	{
		String sspath=" ";
        TakesScreenshot scrShot =(TakesScreenshot) baseclass.driver;
         File source =scrShot.getScreenshotAs(OutputType.FILE);  
         File desti =new File("F:\\ssofres\\"+"ScreenCapture"+System.currentTimeMillis()+".png");
         FileUtils.copyFile(source, desti);
         sspath= desti.getAbsolutePath();
         return sspath;
    }
}
